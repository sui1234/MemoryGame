package com.example.sui.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {
    private Button buttonLevel1;
    private Button buttonLevel2;
    private Button buttonLevel3;
    private Button buttonLevel4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

//level button onclicklistener

        buttonLevel1 = (Button) findViewById(R.id.button_level_1);
        buttonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level1ButtonPressed();
            }
        });

        buttonLevel2 = (Button) findViewById(R.id.button_level_2);
        buttonLevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level2ButtonPressed();
            }
        });

        buttonLevel1 = (Button) findViewById(R.id.button_level_3);
        buttonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level3ButtonPressed();
            }
        });

        buttonLevel1 = (Button) findViewById(R.id.button_level_4);
        buttonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level4ButtonPressed();
            }
        });
    }

    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void level1ButtonPressed() {
        Intent intent = new Intent(this, FourCardsActivity.class);
        startActivity(intent);
    }

    public void level2ButtonPressed() {
        Intent intent = new Intent(this, SixCardsActivity.class);
        startActivity(intent);
    }
    public void level3ButtonPressed() {
        Intent intent = new Intent(this, EightCardsActivity.class);
        startActivity(intent);
    }
    public void level4ButtonPressed() {
        Intent intent = new Intent(this, TwelveCardsActivity.class);
        startActivity(intent);
    }


}