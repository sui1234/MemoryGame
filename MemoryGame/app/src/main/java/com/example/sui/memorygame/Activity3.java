package com.example.sui.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button = (Button) findViewById(R.id.button_level_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelButtonPressed();
            }
        });
    }

    public void backButtonPressed(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        //Activity2.this.finish();
    }

    public void levelButtonPressed() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }


}
