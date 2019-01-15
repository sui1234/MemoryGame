package com.example.sui.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {

    private ImageButton imgButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /*imgButton2 =(ImageButton)findViewById(R.id.imageButton);
       imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });*/


    }
    /*public void openActivity3(){
        Intent intent2 = new Intent(this,Activity3.class);
        startActivity(intent2);
    }*/

     public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
     }


}
