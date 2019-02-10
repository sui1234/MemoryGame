package com.example.sui.memorygame;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game extends AppCompatImageView {


    private ImageView showImage1, showImage2, showImage3, showImage4;

    int image1, image2, image3, image4;
    int[] imageArray = null;             // picture library

    int firstCard;
    int secondCard;

    int clickedFirstPos;
    int clickedSecondPos;

    int number = 1;

    Cards card = new Cards();


    public Game(Context context, ImageView[] showImage) {
        super(context);
        this.showImage1 = showImage[0];
        this.showImage2 = showImage[1];
        this.showImage3 = showImage[2];
        this.showImage4 = showImage[3];
    }


    public Game(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Game(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    public void play() {

        showImage1.setTag("0");
        showImage2.setTag("1");
        showImage3.setTag("2");
        showImage4.setTag("3");

        frontOfCardsResources();
        card.shuffle();

        imageArray = new int[]{image1,image2,image3,image4};

        showImage1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage1, whichCardIsClicked);
            }
        });
        showImage2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage2, whichCardIsClicked);
            }
        });
        showImage3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage3, whichCardIsClicked);
            }
        });
        showImage4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage4, whichCardIsClicked);
            }
        });


    }

    private void doStuff(ImageView showImage, int clickedCardPos) {

        int whichCard = card.getCardsArray()[clickedCardPos];

        if (whichCard == 1) {
            showImage.setImageResource(imageArray[0]);
        } else if (whichCard == 2) {
            showImage.setImageResource(imageArray[1]);
        } else if (whichCard == 3) {
            showImage.setImageResource(imageArray[2]);
        } else if (whichCard == 4) {
            showImage.setImageResource(imageArray[3]);
        }

        if (number == 1) {
            firstCard = whichCard ;
            clickedFirstPos = clickedCardPos;
            showImage.setEnabled(false);
            number = 2;

        } else if (number == 2) {
            secondCard = whichCard ;

            clickedSecondPos = clickedCardPos;
            showImage1.setEnabled(false);
            showImage2.setEnabled(false);
            showImage3.setEnabled(false);
            showImage4.setEnabled(false);
            number = 1;

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    checkCard();
                }
            }, 1000);
        }
    }

    public void frontOfCardsResources() {
        image1 = R.drawable.fish;
        image2 = R.drawable.fish;
        image3 = R.drawable.starfish;
        image4 = R.drawable.starfish;

    }
    private void checkCard() {
        if (imageArray[firstCard - 1] == imageArray[secondCard - 1]) {
            if (clickedFirstPos == 0)
                showImage1.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 1)
                showImage2.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 2)
                showImage3.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 3)
                showImage4.setVisibility(View.INVISIBLE);

            if (clickedSecondPos == 0)
                showImage1.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 1)
                showImage2.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 2)
                showImage3.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 3)
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


}


   /* public void loadImages() {

        images = new ArrayList<Drawable>();
        images.add(getResources().getDrawable(R.drawable.starfish));
        images.add(getResources().getDrawable(R.drawable.fish));
        images.add(getResources().getDrawable(R.drawable.starfish));
        images.add(getResources().getDrawable(R.drawable.fish));


    }*/





