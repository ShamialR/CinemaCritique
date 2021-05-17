package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MovieNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_news);
    }

    public void opengijoe(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://screenrant.com/gi-joe-snake-eyes-movie-henry-golding-interview/"));
        startActivity(browserIntent);
    }

    public void openbw(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://screenrant.com/black-widow-tv-spot-shows-off-intense-motorcycle-chase-scene/"));
        startActivity(browserIntent);
    }

    public void opentlat(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://screenrant.com/thor-4-guardians-galaxy-role-dave-bautista-tease/"));
        startActivity(browserIntent);
    }

    public void openwebsite(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intweb.bucks.ac.uk/~21905385/Website/RecentNews.html"));
        startActivity(browserIntent);
    }
}