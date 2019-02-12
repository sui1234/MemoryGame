package com.example.sui.memorygame;

import android.media.Image;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CardsSea1 {

    Integer[] cardsArray = {1, 2, 3, 4};   // cards on the board


    public Integer[] getCardsArray() {
        return cardsArray;
    }


    public void shuffle() {
        Collections.shuffle(Arrays.asList(cardsArray));
    }

}
