package com.example.sui.memorygame;

import android.app.AlertDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.sui.memorygame.R;


public class MyAlertDialog extends AlertDialog implements
        android.view.View.OnClickListener {
    private ImageView imageView;
    private Button buttonOn, buttonOff;
    private Context context;
    private MusicService backgroundMusic;

    public MyAlertDialog(Context context) {
        super(context);
        this.context = context;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        imageView = (ImageView) findViewById(R.id.imageView);
        buttonOn = (Button) findViewById(R.id.buttonOn);
        buttonOff = (Button) findViewById(R.id.buttonOff);
        buttonOn.setOnClickListener(this);
        buttonOff.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == imageView) {
            dismiss();
        }
        if (v == buttonOn) {

        }
        if (v == buttonOff) {

        }
    }
}
