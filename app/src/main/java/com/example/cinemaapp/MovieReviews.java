package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MovieReviews extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_reviews);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMovie2();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMovie5();
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMovie6();
            }
        });
    }

    public void openActivityMovie2()
    {
        Intent intent = new Intent(this, Movie2.class);
        startActivity(intent);
    }

    public void openActivityMovie5()
    {
        Intent intent = new Intent(this, Movie5.class);
        startActivity(intent);
    }

    public void openActivityMovie6()
    {
        Intent intent = new Intent(this, Movie6.class);
        startActivity(intent);
    }
}