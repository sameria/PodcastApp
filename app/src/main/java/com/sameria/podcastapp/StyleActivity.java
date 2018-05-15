package com.sameria.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class StyleActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_lists);
        this.setTitle("Style Related Podcasts");

        //Create an ArrayList of Style related podcasts topics and descriptions.

        ArrayList<Topic> listOfTopics = new ArrayList<>();
        listOfTopics.add(new Topic("Fall Fashions", "Best ways to stay warm"));
        listOfTopics.add(new Topic("Abrupt Season Change", "Winter and summer week"));
        listOfTopics.add(new Topic("Long Winter", "Tired of boots and sweaters?"));
        listOfTopics.add(new Topic("Men's Suits", "Creative trends for men"));
        listOfTopics.add(new Topic("Makeup for Work", "trends for all sexes"));
        listOfTopics.add(new Topic("Metro Shoes", "Travelling comfortably on the train"));
        listOfTopics.add(new Topic("Conservative Workplace", "Is DC conservative?"));
        listOfTopics.add(new Topic("Tattoos and Piercings", "What is professional"));
        listOfTopics.add(new Topic("Hair Trends", "Man-buns and natural hair?"));

        // This list item layout contains a single {@link TextView}, which the adapter will set to display a phrase.
        TopicsAdapter adapter=
                new TopicsAdapter (this, listOfTopics);

        GridView gridView = findViewById(R.id.list);
        gridView.setAdapter(adapter);
    }
}