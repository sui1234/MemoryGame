package com.example.sui.memorygame;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class GameSea1 extends AppCompatImageView {


    private ImageView showImage1, showImage2, showImage3, showImage4;
    private int image1, image2, image3, image4;

    int firstCard;
    int secondCard;

    int clickedFirstPos;
    int clickedSecondPos;

    int number = 1;

    Integer[] cardsArray = {1, 2, 3, 4};
    int[] imageArray = null;
    boolean allImagesDisappear = false;

    Cards card = new Cards(cardsArray);

    public GameSea1(Context context, ImageView[] showImage) {
        super(context);
        this.showImage1 = showImage[0];
        this.showImage2 = showImage[1];
        this.showImage3 = showImage[2];
        this.showImage4 = showImage[3];
    }

    public GameSea1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GameSea1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void play() {

        showImage1 = findViewById(R.id.image_piece1);
        showImage2 = findViewById(R.id.image_piece2);
        showImage3 = findViewById(R.id.image_piece3);
        showImage4 = findViewById(R.id.image_piece4);


        showImage1.setTag("0");
        showImage2.setTag("1");
        showImage3.setTag("2");
        showImage4.setTag("3");

        setImageToCards();
        card.shuffle();
        imageArray = new int[]{image1, image2, image3, image4};


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

    public void setImageToCards() {
        imageArray[0] = R.drawable.fish;
        imageArray[1] = R.drawable.fish;
        imageArray[2] = R.drawable.starfish;
        imageArray[3] = R.drawable.starfish;

    }

    public void doStuff(ImageView showImage, int clickedCardPos) {

        int whichCard = cardsArray[clickedCardPos];

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
            firstCard = whichCard;
            clickedFirstPos = clickedCardPos;
            showImage.setEnabled(false);
            number = 2;

        } else if (number == 2) {
            secondCard = whichCard;

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


    public void checkCard() {
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


    public boolean allImagesDisappear() {
        if (showImage1.getVisibility() == View.INVISIBLE
                && showImage2.getVisibility() == View.INVISIBLE
                && showImage3.getVisibility() == View.INVISIBLE
                && showImage4.getVisibility() == View.INVISIBLE) {

            allImagesDisappear = true;
        }
        return allImagesDisappear;


    }


}





