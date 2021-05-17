package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_about_us);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAboutUs();
            }
        });

        button = (Button) findViewById(R.id.button_contact_us);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityContactUs();
            }
        });

        button = (Button) findViewById(R.id.button_movie_news);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMovieNews();
            }
        });

        button = (Button) findViewById(R.id.button_upcoming_movies);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUpcomingMovies();
            }
        });
        button = (Button) findViewById(R.id.button_movie_reviews);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMovieReviews();
            }
        });
    }
    public void openActivityAboutUs()
    {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void openActivityContactUs()
    {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }
    public void openActivityMovieNews()
    {
        Intent intent = new Intent(this, MovieNews.class);
        startActivity(intent);
    }

    public void openActivityUpcomingMovies()
    {
        Intent intent = new Intent(this, LatestMovies.class);
        startActivity(intent);
    }

    public void openActivityMovieReviews()
    {
        Intent intent = new Intent(this, MovieReviews.class);
        startActivity(intent);
    }

    public void openhomepage(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intweb.bucks.ac.uk/~21905385/Website/Homepage.html"));
        startActivity(browserIntent);
    }
}