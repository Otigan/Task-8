package com.example.task8;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    public static final String EXTRA_VIDEO = "VIDEO";

    private MediaPlayer mediaPlayer;
    private ListView listView;
    private ArrayList<Video> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.videoList);

        arrayList = new ArrayList<>();



        arrayList.add(new Video("Video 1", R.raw.video));
        arrayList.add(new Video("Video 2", R.raw.video2));
        arrayList.add(new Video("Video 3", R.raw.video3));


        adapter = new Adapter(this, R.layout.item_layout, arrayList);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startVideo(arrayList.get(position).getVideo());
            }
        });

    }
    private void startVideo(int id) {

        Intent intent = new Intent(this, VideoActivity.class);
        intent.putExtra(EXTRA_VIDEO, id);
        startActivity(intent);

    }
}
