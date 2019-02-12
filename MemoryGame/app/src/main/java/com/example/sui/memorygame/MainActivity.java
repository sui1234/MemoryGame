package com.example.sui.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playButtonPressed();
            }
        });



    }

    public void playButtonPressed(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }


}