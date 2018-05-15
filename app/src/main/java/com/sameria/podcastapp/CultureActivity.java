package com.sameria.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class CultureActivity extends AppCompatActivity  {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.podcast_lists);
            this.setTitle("Culture Related Podcasts");

            //Create an ArrayList of Cultural podcasts topics and descriptions.

            ArrayList<Topic> listOfTopics = new ArrayList<>();
            listOfTopics.add(new Topic("Cherry Blossom Festival", "DC Cherry Blossom Events"));
            listOfTopics.add(new Topic("Octoberfest 2018", "The best Oktoberfest"));
            listOfTopics.add(new Topic("Octoberfest History", "How Octoberfest Began"));
            listOfTopics.add(new Topic("Smithsonian History", "The beginnings of the Smithsonian Institution"));
            listOfTopics.add(new Topic("Textile Museum", "Best days and times to visit this museum"));
            listOfTopics.add(new Topic("Virgina Cuisine", "Distinctly Virginian dishes and drinks"));
            listOfTopics.add(new Topic("Apple Blossom Festival", "Shenandoahs 6 day festival"));
            listOfTopics.add(new Topic("BOTB 2018", "Battle of the Bands!"));
            listOfTopics.add(new Topic("MD Traditional Heritage", "UMBC Award and festival ceremony"));

            // This list item layout contains a single {@link TextView}, which the adapter will set to display a phrase.
            TopicsAdapter adapter=
                    new TopicsAdapter (this, listOfTopics);

            GridView gridView = findViewById(R.id.list);
            gridView.setAdapter(adapter);

            //Button menuButton = findViewById(R.id.main_menu_Button);
           // menuButton.setOnClickListener(new View.OnClickListener() {
             //   @Override
              //  public void onClick(View v) {
                 //   startActivity(new Intent(CultureActivity.this, MainActivity.class));
                                    }
           // });

       // }
    }