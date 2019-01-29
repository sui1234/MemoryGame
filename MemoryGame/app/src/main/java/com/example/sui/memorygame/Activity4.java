package com.example.sui.memorygame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.List;

public class Activity4 extends AppCompatActivity {

    private GridView gridView;
    private ImageView defaultImage;
    private ImageView imageShowing;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        //int[] images = new int[]{
          //      R.drawable.fish,R.drawable.fish,R.drawable.starfish,R.drawable.starfish
        //};

        //gridView = (GridView) findViewById(R.id.gridView);




        //backImage = getResources().getDrawable(R.drawable.pinkbackcard);


        //piece = (ImageView)findViewById(R.id.image_piece1);




    }

    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        //Activity2.this.finish();
    }


}
