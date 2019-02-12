package com.example.sui.memorygame;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class ImageSea1 extends AppCompatImageView {




    private int image1, image2, image3, image4;
    private int[] imageArray = null;             // picture library



    public ImageSea1(Context context) {
        super(context);
    }

    public ImageSea1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageSea1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int[] getImageArray() {
        this.imageArray = new int[]{image1,image2,image3,image4};
        return imageArray;
    }

    public void setImageToCards() {
        image1 = R.drawable.fish;
        image2 = R.drawable.fish;
        image3 = R.drawable.starfish;
        image4 = R.drawable.starfish;

    }



}
