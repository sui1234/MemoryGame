package com.example.songapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class FullScreenActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        Intent intent3 = getIntent();
        String getData = intent3.getStringExtra("key");

        Log.d("key","is passing");
        videoView = findViewById(R.id.fullScreen);

        String videoPath;

        if ("video1".equalsIgnoreCase(getData) ) {


            videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;

            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);


            MediaController m = new MediaController(this);
            videoView.setMediaController(m);

            m.setAnchorView(videoView);
        }
        else if ("video2".equalsIgnoreCase(getData)) {
            videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bakabaka;

            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);


            MediaController m = new MediaController(this);
            videoView.setMediaController(m);

            m.setAnchorView(videoView);
        }


    }
}
