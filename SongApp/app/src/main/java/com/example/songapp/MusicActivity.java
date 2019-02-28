package com.example.songapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ImageView imageView1 = findViewById(R.id.littleStar);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("video1","is clicked");
                Intent intent1 = new Intent(MusicActivity.this, FullScreenActivity.class);

                intent1.putExtra("key", "video1");
                startActivity(intent1);
            }
        });

        ImageView imageView2 = findViewById(R.id.bake);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MusicActivity.this, FullScreenActivity.class);

                intent2.putExtra("key", "video2");
                startActivity(intent2);
            }
        });


    }
}
