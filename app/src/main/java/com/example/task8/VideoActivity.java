package com.example.task8;



import android.content.Intent;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.video_activity);

        VideoView videoView = findViewById(R.id.videoView);


        Intent intent = getIntent();


        int video = intent.getIntExtra(MainActivity.EXTRA_VIDEO, 0);


        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + video);

        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);

        mediaController.setAnchorView(videoView);


        videoView.start();


    }
}
