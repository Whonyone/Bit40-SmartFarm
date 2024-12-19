package com.ffarm.myapplication;

public class PageItem {
    private int imageResId;
    private String title;

    private String datetime;
    private String description;

    public PageItem(int imageResId, String title, String datetime, String description) {
        this.imageResId = imageResId;
        this.title = title;
        this.datetime = datetime;
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getDescription() {
        return description;
    }
}

