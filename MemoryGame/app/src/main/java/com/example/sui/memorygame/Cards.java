package com.example.sui.memorygame;

import android.media.Image;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Cards {

    private ImageView backImage;
    private ImageView frontImage;

    public ImageView getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(ImageView frontImage) {
        this.frontImage = frontImage;
    }

    /*private void loadCards(){

            int size = Row*Col;

            for(int i=0;i<size;i++){
                list.add(new Integer(i));
            }


            Random r = new Random();

            for(int i=size-1;i>=0;i--){
                int t=0;

                if(i>0){
                    t = r.nextInt(i);
                }

                t=list.remove(t).intValue();
                cards[i%Col][i/Col]=t%(size/2);


            }
        }*/


}
