package com.example.sui.memorygame;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FourCardsActivity extends AppCompatActivity {

    private ImageView showImage1, showImage2, showImage3, showImage4;
    private int cardImage1, cardImage2, cardImage3, cardImage4;

    int firstCard;
    int secondCard;

    int clickedFirstPos;
    int clickedSecondPos;

    int number = 1;

    Integer[] cardsArray = {1, 2, 3, 4};
    int[] cardImageArray = null;
    Cards card = new Cards(cardsArray);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_cards);

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

        cardImageArray = new int[]{cardImage1, cardImage2, cardImage3, cardImage4};

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

    // function -- to set pictures to cardImages.

    public void setImageToCards() {
        cardImage1 = R.drawable.starfisk;
        cardImage2 = R.drawable.starfisk;
        cardImage3 = R.drawable.gulfisk;
        cardImage4 = R.drawable.gulfisk;

    }

   // function -- to give picture to the card which is clicked.

    public void doStuff(ImageView showImage, int clickedCardPos) {

        int whichCard = cardsArray[clickedCardPos];

        if (whichCard == 1) {
            showImage.setImageResource(cardImageArray[0]);
        } else if (whichCard == 2) {
            showImage.setImageResource(cardImageArray[1]);
        } else if (whichCard == 3) {
            showImage.setImageResource(cardImageArray[2]);
        } else if (whichCard == 4) {
            showImage.setImageResource(cardImageArray[3]);
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


    // function -- to check if two cards have same picture.

    public void checkCard() {

        // if two pictures are same, set showImage invisible, else, showImages become the back image.
        if (cardImageArray[firstCard - 1] == cardImageArray[secondCard - 1]) {
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



// if all showImages are invisible, then show a dialog that a xml file that I create.
        if (showImage1.getVisibility() == View.INVISIBLE
                && showImage2.getVisibility() == View.INVISIBLE
                && showImage3.getVisibility() == View.INVISIBLE
                && showImage4.getVisibility() == View.INVISIBLE) {

//Alertdiaglog

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FourCardsActivity.this);

            LayoutInflater factory = LayoutInflater.from(FourCardsActivity.this);

            final View view = factory.inflate(R.layout.dialog, null);

            alertDialogBuilder.setView(view);
            setContentView(R.layout.dialog);
            Button button1 = (Button) findViewById(R.id.buttonMenu);
            Button button2 = (Button) findViewById(R.id.buttonNext);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FourCardsActivity.this, LevelActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FourCardsActivity.this, SixCardsActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
    }
}