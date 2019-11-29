package com.example.layoutsexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ScrollViewExample extends AppCompatActivity {
    private Button bikeButton;
    private Switch sw;
    private Button ac1;
    private Button ac2;
    private Button ac3;
    private Button ac4;
    private Button ac5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_example);
         bikeButton = findViewById(R.id.bikeBtn);
         sw = findViewById(R.id.swAction);
         ac1= findViewById(R.id.actionBtn1);
        ac2= findViewById(R.id.actionBtn2);
        ac3= findViewById(R.id.actionBtn3);
        ac4= findViewById(R.id.actionBtn4);
        ac5= findViewById(R.id.actionBtn5);
        ac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "ActionButton1 Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

          ac2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(getApplicationContext(),
                          "ActionButton2 Clicked",
                          Toast.LENGTH_SHORT).show();
              }
          });
        ac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "ActionButton3 Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
        ac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "ActionButton4 Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
        ac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "ActionButton5 Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
        bikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),
                        "Kawasaki Black",
                        Toast.LENGTH_SHORT).show();

            }
        });
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(sw.isChecked())
                {
                    Snackbar.make(buttonView,"Action By SwitchOn",Snackbar.LENGTH_SHORT).show();

                }
                else {
                    Snackbar.make(buttonView, "Action By SwitchOff", Snackbar.LENGTH_SHORT).show();
//                    Toast.makeText(getApplicationContext(),
//                            "ACTION BAR OFF",
//                            Toast.LENGTH_SHORT).show();
//                }
                }
            }
        });




        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    }

