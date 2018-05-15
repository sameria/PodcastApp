package com.sameria.podcastapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class TopicsAdapter extends ArrayAdapter<Topic> {
    public TopicsAdapter(Activity context, ArrayList<Topic> topic) {
        super(context, 0, topic);    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //return super.getView(position, convertView, parent);
        //Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Topic currentTopics = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView podcastTextView = gridItemView.findViewById(R.id.podcasts_textList1);
        podcastTextView.setText(currentTopics.getDefaultListofPocasts());

        TextView defaultTextView = gridItemView.findViewById(R.id.info_textList2);
        defaultTextView.setText(currentTopics.getPodcastInfo());
        return gridItemView;
    }}