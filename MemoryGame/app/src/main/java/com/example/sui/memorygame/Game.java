package com.example.sui.memorygame;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

public class Game extends AppCompatImageView {

    private Drawable backImages;
    private List<Drawable> images;



    public Game(Context context) {
        super(context);
        init();
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

        backImages = getResources().getDrawable(R.drawable.pinkbackcard);
    }


    public void loadImages() {

        images = new ArrayList<Drawable>();
        images.add(getResources().getDrawable(R.drawable.starfish));
        images.add(getResources().getDrawable(R.drawable.fish));
        images.add(getResources().getDrawable(R.drawable.starfish));
        images.add(getResources().getDrawable(R.drawable.fish));


    }

    public void putCards(){

    }

}


