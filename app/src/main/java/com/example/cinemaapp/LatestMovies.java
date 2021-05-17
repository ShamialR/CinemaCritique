package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LatestMovies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_movies);
    }

    public void openfg(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cinemablend.com/title/2550097/free-guy"));
        startActivity(browserIntent);
    }

    public void openaotd(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cinemablend.com/title/2563526/army-of-the-dead"));
        startActivity(browserIntent);
    }

    public void openaqpp2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cinemablend.com/title/2549840/a-quiet-place-part-ii"));
        startActivity(browserIntent);
    }

    public void openupcoming(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intweb.bucks.ac.uk/~21905385/Website/UpcomingMovies.html"));
        startActivity(browserIntent);
    }
}