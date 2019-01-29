package com.example.sui.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {

    private ImageButton imgButton2;
    private ImageButton imgButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        imgButton2 = (ImageButton) findViewById(R.id.image_animal);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


    }

    public void openActivity3() {
        Intent intent2 = new Intent(this, Activity3.class);
        startActivity(intent2);
    }

    /*public void openActivity4(){
        Intent intent3 = new Intent(this,Activity4.class);
        startActivity(intent3);
    }*/

    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //Activity2.this.finish();
    }


}

