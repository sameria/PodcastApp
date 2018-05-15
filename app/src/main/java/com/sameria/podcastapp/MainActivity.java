package com.sameria.podcastapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


     // Find the View that shows the Politics category
        TextView politics = findViewById(R.id.politics);
        politics.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Politics category is clicked on.
     @Override
     public void onClick(View view) {
        // Create a new intent to open the {@link PoliticsActivity}
        Intent politicsIntent = new Intent(MainActivity.this, PoliticsActivity.class);
        // Start the new activity
        startActivity(politicsIntent);
            }
        });

    // Find the View that shows the Culture category
        TextView culture = findViewById(R.id.culture);
        culture.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Politics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PoliticsActivity}
                Intent cultureIntent = new Intent(MainActivity.this, CultureActivity.class);
                // Start the new activity
                startActivity(cultureIntent);
            }
        });
        // Find the View that shows the Family category
        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Politics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PoliticsActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the Music category
        TextView music = findViewById(R.id.music);
        music.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Politics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PoliticsActivity}
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                // Start the new activity
                startActivity(musicIntent);
            }
        });
        // Find the View that shows the Music category
        TextView style = findViewById(R.id.style);
        style.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Politics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PoliticsActivity}
                Intent styleIntent = new Intent(MainActivity.this, StyleActivity.class);
                // Start the new activity
                startActivity(styleIntent);
            }
        });
    }}
