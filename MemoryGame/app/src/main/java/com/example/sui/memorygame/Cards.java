package com.example.sui.memorygame;

import java.util.Arrays;
import java.util.Collections;

public class Cards {

    Integer[] cardsArray = null;   // cards on the board


    public Cards(Integer[] cardsArray) {
        this.cardsArray = cardsArray;
    }



    public void shuffle() {
        Collections.shuffle(Arrays.asList(cardsArray));
    }

}
