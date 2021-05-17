package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void open(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://intweb.bucks.ac.uk/~21905385/Website/ContactUs.html"));
        startActivity(browserIntent);
    }
}