package com.example.sui.memorygame;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class GameSea1 extends AppCompatImageView {


    private ImageView showImage1, showImage2, showImage3, showImage4;

    int firstCard;
    int secondCard;

    int clickedFirstPos;
    int clickedSecondPos;

    int number = 1;
    boolean allImagesDisappear = false;


    CardsSea1 card = new CardsSea1();

    ImageSea1 image = new ImageSea1();


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

        showImage1.setTag("0");
        showImage2.setTag("1");
        showImage3.setTag("2");
        showImage4.setTag("3");

        image.setImageToCards();
        card.shuffle();

        image.getImageArray();

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

    public void doStuff(ImageView showImage, int clickedCardPos) {

        int whichCard = card.getCardsArray()[clickedCardPos];

        if (whichCard == 1) {
            showImage.setImageResource(image.getImageArray()[0]);
        } else if (whichCard == 2) {
            showImage.setImageResource(image.getImageArray()[1]);
        } else if (whichCard == 3) {
            showImage.setImageResource(image.getImageArray()[2]);
        } else if (whichCard == 4) {
            showImage.setImageResource(image.getImageArray()[3]);
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
        if (image.getImageArray()[firstCard - 1] == image.getImageArray()[secondCard - 1]) {
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

        //allImagesDisappear();
    }

    /*public void allImagesDisappear() {
        if (showImage1.getVisibility() == View.INVISIBLE
                && showImage2.getVisibility() == View.INVISIBLE
                && showImage3.getVisibility() == View.INVISIBLE
                && showImage4.getVisibility() == View.INVISIBLE) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(Activity4.this);
            //alertDialog.setIcon(R.id.congratuation)
            alertDialog
                    .setCancelable(false)
                    .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), Activity3.class);
                            startActivity(intent);

                        }
                    })
                    .setNegativeButton("Retry", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), Activity4.class);
                            startActivity(intent);
                        }
                    });
        }
    }*/


}





