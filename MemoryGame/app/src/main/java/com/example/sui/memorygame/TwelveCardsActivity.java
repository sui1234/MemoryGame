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

public class TwelveCardsActivity extends AppCompatActivity {

    private ImageView showImage1, showImage2, showImage3, showImage4,showImage5,showImage6,
            showImage7,showImage8,showImage9,showImage10,showImage11,showImage12;
    private int image1, image2, image3, image4,image5,image6,
            image7,image8,image9,image10,image11,image12;
    int firstCard;
    int secondCard;

    int clickedFirstPos;
    int clickedSecondPos;

    int number = 1;

    Integer[] cardsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int[] imageArray = null;

    Cards card = new Cards(cardsArray);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve_cards);

        showImage1 = findViewById(R.id.image_piece1);
        showImage2 = findViewById(R.id.image_piece2);
        showImage3 = findViewById(R.id.image_piece3);
        showImage4 = findViewById(R.id.image_piece4);
        showImage5 = findViewById(R.id.image_piece5);
        showImage6 = findViewById(R.id.image_piece6);
        showImage7 = findViewById(R.id.image_piece7);
        showImage8 = findViewById(R.id.image_piece8);
        showImage9 = findViewById(R.id.image_piece9);
        showImage10 = findViewById(R.id.image_piece10);
        showImage11 = findViewById(R.id.image_piece11);
        showImage12 = findViewById(R.id.image_piece12);

        showImage1.setTag("0");
        showImage2.setTag("1");
        showImage3.setTag("2");
        showImage4.setTag("3");
        showImage5.setTag("4");
        showImage6.setTag("5");
        showImage7.setTag("6");
        showImage8.setTag("7");
        showImage9.setTag("8");
        showImage10.setTag("9");
        showImage11.setTag("10");
        showImage12.setTag("11");

        setImageToCards();
        card.shuffle();

        imageArray = new int[]{image1, image2, image3, image4,image5,image6,
                image7,image8,image9,image10,image11,image12};

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
        showImage5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage5, whichCardIsClicked);
            }
        });
        showImage6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage6, whichCardIsClicked);
            }
        });

        showImage7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage7, whichCardIsClicked);
            }
        });

        showImage8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage8, whichCardIsClicked);
            }
        });
        showImage9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage9, whichCardIsClicked);
            }
        });
        showImage10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage10, whichCardIsClicked);
            }
        });
        showImage11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage11, whichCardIsClicked);
            }
        });
        showImage12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int whichCardIsClicked = Integer.parseInt((String) v.getTag());
                doStuff(showImage12, whichCardIsClicked);
            }
        });
    }

    public void setImageToCards() {
        image1 = R.drawable.gulfisk;
        image2 = R.drawable.gulfisk;
        image3 = R.drawable.starfisk;
        image4 = R.drawable.starfisk;
        image5 = R.drawable.dolphin;
        image6 = R.drawable.dolphin;
        image7 = R.drawable.redfish;
        image8 = R.drawable.redfish;
        image9 = R.drawable.flatfisk;
        image10 = R.drawable.flatfisk;
        image11 = R.drawable.totorise;
        image12 = R.drawable.totorise;
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
        } else if (whichCard == 5) {
            showImage.setImageResource(imageArray[4]);
        } else if (whichCard == 6) {
            showImage.setImageResource(imageArray[5]);
        }else if (whichCard == 7) {
            showImage.setImageResource(imageArray[6]);
        } else if (whichCard == 8) {
            showImage.setImageResource(imageArray[7]);
        }else if (whichCard == 9) {
            showImage.setImageResource(imageArray[8]);
        } else if (whichCard == 10) {
            showImage.setImageResource(imageArray[9]);
        }else if (whichCard == 11) {
            showImage.setImageResource(imageArray[10]);
        } else if (whichCard == 12) {
            showImage.setImageResource(imageArray[11]);
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
            showImage5.setEnabled(false);
            showImage6.setEnabled(false);
            showImage7.setEnabled(false);
            showImage8.setEnabled(false);
            showImage9.setEnabled(false);
            showImage10.setEnabled(false);
            showImage11.setEnabled(false);
            showImage12.setEnabled(false);
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
            else if (clickedFirstPos == 4)
                showImage5.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 5)
                showImage6.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 6)
                showImage7.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 7)
                showImage8.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 8)
                showImage9.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 9)
                showImage10.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 10)
                showImage11.setVisibility(View.INVISIBLE);
            else if (clickedFirstPos == 11)
                showImage12.setVisibility(View.INVISIBLE);

            if (clickedSecondPos == 0)
                showImage1.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 1)
                showImage2.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 2)
                showImage3.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 3)
                showImage4.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 4)
                showImage5.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 5)
                showImage6.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 6)
                showImage7.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 7)
                showImage8.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 8)
                showImage9.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 9)
                showImage10.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 10)
                showImage11.setVisibility(View.INVISIBLE);
            else if (clickedSecondPos == 11)
                showImage12.setVisibility(View.INVISIBLE);
        } else {
            showImage1.setImageResource(R.drawable.circle_button);
            showImage2.setImageResource(R.drawable.circle_button);
            showImage3.setImageResource(R.drawable.circle_button);
            showImage4.setImageResource(R.drawable.circle_button);
            showImage5.setImageResource(R.drawable.circle_button);
            showImage6.setImageResource(R.drawable.circle_button);
            showImage7.setImageResource(R.drawable.circle_button);
            showImage8.setImageResource(R.drawable.circle_button);
            showImage9.setImageResource(R.drawable.circle_button);
            showImage10.setImageResource(R.drawable.circle_button);
            showImage11.setImageResource(R.drawable.circle_button);
            showImage12.setImageResource(R.drawable.circle_button);
        }

        showImage1.setEnabled(true);
        showImage2.setEnabled(true);
        showImage3.setEnabled(true);
        showImage4.setEnabled(true);
        showImage5.setEnabled(true);
        showImage6.setEnabled(true);
        showImage7.setEnabled(true);
        showImage8.setEnabled(true);
        showImage9.setEnabled(true);
        showImage10.setEnabled(true);
        showImage11.setEnabled(true);
        showImage12.setEnabled(true);

        if (showImage1.getVisibility() == View.INVISIBLE
                && showImage2.getVisibility() == View.INVISIBLE
                && showImage3.getVisibility() == View.INVISIBLE
                && showImage4.getVisibility() == View.INVISIBLE
                && showImage5.getVisibility() == View.INVISIBLE
                && showImage6.getVisibility() == View.INVISIBLE
                && showImage7.getVisibility() == View.INVISIBLE
                && showImage8.getVisibility() == View.INVISIBLE
                && showImage9.getVisibility() == View.INVISIBLE
                && showImage10.getVisibility() == View.INVISIBLE
                && showImage11.getVisibility() == View.INVISIBLE
                && showImage12.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TwelveCardsActivity.this);

            LayoutInflater factory = LayoutInflater.from(TwelveCardsActivity.this);

            final View view = factory.inflate(R.layout.dialog2, null);

            alertDialogBuilder.setView(view);
            setContentView(R.layout.dialog2);
            Button button1 = (Button) findViewById(R.id.buttonMenu);



            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TwelveCardsActivity.this, LevelActivity.class);
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