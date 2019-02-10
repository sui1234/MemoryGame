package com.example.sui.memorygame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Activity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        ImageView [] showImageArray = {findViewById(R.id.image_piece1),findViewById(R.id.image_piece2),
                findViewById(R.id.image_piece3),findViewById(R.id.image_piece4)};

        Game game = new Game(getApplicationContext(), showImageArray);

        game.play();

    }

    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        //Activity2.this.finish();
    }


}
