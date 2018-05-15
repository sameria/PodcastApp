package com.sameria.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_lists);
        this.setTitle("Music Related Podcasts");

        //Create an ArrayList of Music related podcasts topics and descriptions.

        ArrayList<Topic> listOfTopics = new ArrayList<>();
        listOfTopics.add(new Topic("Smooth Jazz", "Development over the years"));
        listOfTopics.add(new Topic("Outdoor Concerts", "Various recommendations"));
        listOfTopics.add(new Topic("Historical Influence", "How MD influenced music"));
        listOfTopics.add(new Topic("Bluegrass", "Surprising History of VA bluegrass"));
        listOfTopics.add(new Topic("Popular Venues", "Rediscover music"));
        listOfTopics.add(new Topic("Jazzfest 2018", "Music and Controversy"));
        listOfTopics.add(new Topic("Holiday Concerts", "Year round holiday concerts"));
        listOfTopics.add(new Topic("Go-Go Music", "History of DC's own Go-Go"));
        listOfTopics.add(new Topic("Local Stations", "State to state commute tips"));

        // This list item layout contains a single {@link TextView}, which the adapter will set to display a phrase.
        TopicsAdapter adapter=
                new TopicsAdapter (this, listOfTopics);

        GridView gridView = findViewById(R.id.list);
        gridView.setAdapter(adapter);
    }
}