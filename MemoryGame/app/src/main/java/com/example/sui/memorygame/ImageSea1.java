package com.example.sui.memorygame;

public class ImageSea1{

    private int image1, image2, image3, image4;
    private int[] imageArray = null;             // picture library


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
