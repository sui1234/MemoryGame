package com.example.sui.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Activity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        ImageView[] showImageArray = {findViewById(R.id.image_piece1), findViewById(R.id.image_piece2),
                findViewById(R.id.image_piece3), findViewById(R.id.image_piece4)};

        GameSea1 game = new GameSea1(getApplicationContext(), showImageArray);

        game.play();

        game.allImagesDisappear();

        if (game.allImagesDisappear == true) {

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

        Log.d("this","wrong");
    }


    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        //Activity2.this.finish();
    }


}