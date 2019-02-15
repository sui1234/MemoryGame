package com.example.sui.memorygame;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView settingImage;
    MediaPlayer backgroundMusic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //music
        backgroundMusic = MediaPlayer.create( MainActivity.this, R.raw.ocean_music);
        backgroundMusic.setLooping(true);
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
                Button button1 = (Button) findViewById(R.id.buttonOn);
                Button button2 = (Button) findViewById(R.id.buttonOff);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        backgroundMusic = MediaPlayer.create( MainActivity.this, R.raw.ocean_music);
                        backgroundMusic.setLooping(true);
                        backgroundMusic.start();
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            backgroundMusic.release();
                    }
                });

            }

        });


        button = (Button) findViewById(R.id.button_play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backgroundMusic = MediaPlayer.create( MainActivity.this, R.raw.ocean_music);
                backgroundMusic.setLooping(true);
                playButtonPressed();
            }
        });
    }

    public void playButtonPressed() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}