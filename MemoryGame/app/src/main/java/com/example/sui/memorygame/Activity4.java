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

    private ImageView showImage1, showImage2, showImage3, showImage4;

    Integer[] cardsArray = {1, 2, 3, 4};
    int image1, image2, image3, image4;
    int firstCard;
    int secondCard;
    int clickedFirst;
    int clickedSecond;
    int number = 1;
    int[] imageArray = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        showImage1 = (ImageView) findViewById(R.id.image_piece1);

        showImage2 = (ImageView) findViewById(R.id.image_piece2);

        showImage3 = (ImageView) findViewById(R.id.image_piece3);

        showImage4 = (ImageView) findViewById(R.id.image_piece4);


        showImage1.setTag("1");
        showImage2.setTag("2");
        showImage3.setTag("3");
        showImage4.setTag("4");

        frontOfCardsResources();
        Collections.shuffle(Arrays.asList(cardsArray));
        imageArray = new int[]{image1, image2, image3, image4};
        showImage1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage1, whichCardIsClicked - 1);
            }
        });
        showImage2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage2, whichCardIsClicked - 1);
            }
        });
        showImage3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage3, whichCardIsClicked - 1);
            }
        });
        showImage4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage4, whichCardIsClicked - 1);
            }
        });
    }

    private void doStuff(ImageView showImage, int clickedCardPos) {

        if (cardsArray[clickedCardPos] == 1) {
            showImage.setImageResource(imageArray[0]);
        } else if (cardsArray[clickedCardPos] == 2) {
            showImage.setImageResource(imageArray[1]);
        } else if (cardsArray[clickedCardPos] == 3) {
            showImage.setImageResource(imageArray[2]);
        } else if (cardsArray[clickedCardPos] == 4) {
            showImage.setImageResource(imageArray[3]);
        }

        if (number == 1) {
            firstCard = cardsArray[clickedCardPos];
            number = 2;
            clickedFirst = clickedCardPos;
            showImage.setEnabled(false);

        } else if (number == 2) {
            secondCard = cardsArray[clickedCardPos];
            number = 1;
            clickedSecond = clickedCardPos;
            showImage1.setEnabled(false);
            showImage2.setEnabled(false);
            showImage3.setEnabled(false);
            showImage4.setEnabled(false);
        }

        Handler hander = new Handler();
        hander.postDelayed(new Runnable() {
            @Override
            public void run() {
                checkCard();
            }
        }, 1500);
    }

    private void frontOfCardsResources() {
        image1 = R.drawable.fish;
        image2 = R.drawable.fish;
        image3 = R.drawable.starfish;
        image4 = R.drawable.starfish;

    }

    private void checkCard() {
        if (imageArray[firstCard - 1] == imageArray[secondCard - 1]) {
            if (clickedFirst == 0)
                showImage1.setVisibility(View.INVISIBLE);
            else if (clickedFirst == 1)
                showImage2.setVisibility(View.INVISIBLE);
            else if (clickedFirst == 2)
                showImage3.setVisibility(View.INVISIBLE);
            else if (clickedFirst == 3)
                showImage4.setVisibility(View.INVISIBLE);

            if (clickedSecond == 0)
                showImage1.setVisibility(View.INVISIBLE);
            else if (clickedSecond == 1)
                showImage2.setVisibility(View.INVISIBLE);
            else if (clickedSecond == 2)
                showImage3.setVisibility(View.INVISIBLE);
            else if (clickedSecond == 3)
                showImage4.setVisibility(View.INVISIBLE);
        } else {
            showImage1.setImageResource(R.drawable.circle_button);
            showImage2.setImageResource(R.drawable.circle_button);
            showImage3.setImageResource(R.drawable.circle_button);
            showImage4.setImageResource(R.drawable.circle_button);
        }

        showImage1.setEnabled(true);
        showImage2.setEnabled(true);
        showImage3.setEnabled(true);
        showImage4.setEnabled(true);
    }


    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        //Activity2.this.finish();
    }


}
