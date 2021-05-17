package com.example.cinemaapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Movie6 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button saveButton;

    public static final String SHARED_PREFS = "sharedPrefs3";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "switch1";

    private String text;

    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie6);

        final RatingBar ratingRatingBar = (RatingBar) findViewById(R.id.rating_rating_bar);
        Button submitButton = (Button) findViewById(R.id.submit_button);
        final TextView ratingDisplayTextView = (TextView) findViewById(R.id.rating_display_text_View);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingDisplayTextView.setText("Your rating is: " + ratingRatingBar.getRating());
            }
        });
        textView = (TextView) findViewById(R.id.textview3);
        editText = (EditText) findViewById(R.id.edittext3);
        saveButton = (Button) findViewById(R.id.save_button3);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
                saveData();
            }
        });

        loadData();
        updateViews();

        youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);
        getLifecycle().addObserver(youTubePlayerView);
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, textView.getText().toString());

        editor.apply();

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }

    public void updateViews() {
        textView.setText(text);
    }
}