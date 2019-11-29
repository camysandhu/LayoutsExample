package com.example.layoutsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button scrollViewBtn;
private Button nesBtn;
private Button coodBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollViewBtn = findViewById(R.id.scrollBtn);
        nesBtn = findViewById(R.id.nestedScrollBtn);
        coodBtn = findViewById(R.id.coordinatorBtn);


        scrollViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mIntent = new Intent(MainActivity.this, ScrollViewExample.class);
                startActivity(mIntent);
                //finish();
            }
        });



        nesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, NestedScrollViewExample.class);
                startActivity(mIntent);

            }
        });

        coodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, CoordinatorExample.class);
                startActivity(mIntent);

            }
        });
    }
}
