package com.example.readysetgrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class MyPlant extends AppCompatActivity {
    private ImageButton back_button;
    private Button water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plant);

        water = (Button) findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPlant();
            }
        });

        back_button = (ImageButton) findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });
    }
    public void openNewPlant(){
        Intent intent = new Intent(this, MyPlant2.class);
        startActivity(intent);
    }

    public void openBack(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}