package com.example.sui.memorygame;

import java.util.ArrayList;
import java.util.Random;

public class Cards {

    private static int Row = -1;
    private static int Col = -1;

    private int [][] cards = new int[2][2];
    ArrayList<Integer> list = new ArrayList<Integer>();




    private void loadCards(){

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
        }
}
