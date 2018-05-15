package com.sameria.podcastapp;

/**
 * {@link Topic} Information about podcast
 */

public class Topic {
    /**
     * Topic Name for each podcast
     */
    private String mDefaultListofPocasts;
    /**
     * Description of each podcast
     */
    private String mPodcastInfo;

    /**
     * Create a new Topic object.
     *
     * @param defaultListofPocasts Topic Name for each podcast
     * @param podcastInfo          Description of each podcast
     *
     */
    public Topic(String defaultListofPocasts, String podcastInfo) {
        mDefaultListofPocasts = defaultListofPocasts;
        mPodcastInfo = podcastInfo;

    }
    public String getDefaultListofPocasts() {
        return mDefaultListofPocasts;
    }

    public String getPodcastInfo() {
        return mPodcastInfo;
        }}

