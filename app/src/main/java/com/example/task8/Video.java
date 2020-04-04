package com.example.task8;


import android.widget.VideoView;

public class Video {

    private String name;
    private int video;

    public Video(String name, int video) {
        this.name = name;
        this.video = video;

    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
