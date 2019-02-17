package com.example.sui.memorygame;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView settingImage;
    private static String TAG = "MusicService";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//setting Image
        setContentView(R.layout.activity_main);
        settingImage = (ImageView) findViewById(R.id.setting_button);

        settingImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater factory = LayoutInflater.from(MainActivity.this);
                final View view = factory.inflate(R.layout.setting, null);

                alertDialogBuilder.setView(view);
                setContentView(R.layout.setting);


                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

                initlizeViews();
            }


        });

        button = (Button) findViewById(R.id.button_play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playButtonPressed();
            }
        });


    }

    public void playButtonPressed() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void initlizeViews() {

        Button btnStart = (Button) findViewById(R.id.buttonOn);
        Button btnStop = (Button) findViewById(R.id.buttonOff);
        View.OnClickListener ocl = new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MusicService.class);
                switch (v.getId()) {
                    case R.id.buttonOn:

                        startService(intent);
                        break;
                    case R.id.buttonOff:

                        stopService(intent);
                        break;
                }
            }
        };

        btnStart.setOnClickListener(ocl);
        btnStop.setOnClickListener(ocl);

    }


}