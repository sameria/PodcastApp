package com.sameria.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

import android.view.View;
import android.widget.GridView;
import android.widget.ListView;


public class PoliticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_lists);
        this.setTitle("Political Related Podcasts");

        //Create an ArrayList of Music related podcasts topics and descriptions.

        ArrayList<Topic> listOfTopics = new ArrayList<>();
        listOfTopics.add(new Topic("Mid-Term Predictions", "Who will win?"));
        listOfTopics.add(new Topic("State of DNC", "Best and worst of 2017"));
        listOfTopics.add(new Topic("Tea Party Blues", "Is the Tea Party Relevant?"));
        listOfTopics.add(new Topic("Obamacare in review", "In-depth review of healthcare"));
        listOfTopics.add(new Topic("Scandals", "How they impact careers "));
        listOfTopics.add(new Topic("Register To Vote", "Ways to encourage registration"));
        listOfTopics.add(new Topic("Republican 2017 Achievements", "Kudos for these acts"));
        listOfTopics.add(new Topic("Young Voters", "Motivating Gen X and younger"));
        listOfTopics.add(new Topic("Grass-root Campaigns", "The growth in popularity"));

        // This list item layout contains a single {@link TextView}, which the adapter will set to display a phrase.
        TopicsAdapter adapter=
                new TopicsAdapter (this, listOfTopics);

        GridView gridView = findViewById(R.id.list);
        gridView.setAdapter(adapter);
    }
}