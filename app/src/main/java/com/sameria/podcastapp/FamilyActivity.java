package com.sameria.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_lists);
        this.setTitle("Family Related Podcasts");

        //Create an ArrayList of Family related podcasts topics and descriptions.

        ArrayList<Topic> listOfTopics = new ArrayList<>();
        listOfTopics.add(new Topic("Daycare", "Challenges finding daycare"));
        listOfTopics.add(new Topic("Summer Camp", "Summer camp recommendations"));
        listOfTopics.add(new Topic("New Middle School", "Transition period"));
        listOfTopics.add(new Topic("Applying for college", "Tips and Tricks"));
        listOfTopics.add(new Topic("Scholarships", "Too soon to look?"));
        listOfTopics.add(new Topic("Vegetarian Teens", "Medical advice"));
        listOfTopics.add(new Topic("Vacations", "Travelling with kids"));
        listOfTopics.add(new Topic("Tax Free Week", "Best deals"));
        listOfTopics.add(new Topic("Local Allergies", "Dealing with high pollen days"));

        // This list item layout contains a single {@link TextView}, which the adapter will set to display a phrase.
        TopicsAdapter adapter=
                new TopicsAdapter (this, listOfTopics);

        GridView gridView = findViewById(R.id.list);
        gridView.setAdapter(adapter);
    }
}