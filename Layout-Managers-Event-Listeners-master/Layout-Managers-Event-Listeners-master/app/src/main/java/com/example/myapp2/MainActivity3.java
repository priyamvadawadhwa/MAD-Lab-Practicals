package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    GridLayout mainGridLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mainGridLayout = (GridLayout) findViewById(R.id.mainGridLayout);

        setSingleEvent(mainGridLayout);
/*
        //IMAGE BUTTON
        imageButton = (ImageButton) findViewById(R.id.mainGridLayout);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, WhatsApp.class);
                startActivity(intent);

            }
        });
*/
    }

    private void setSingleEvent(GridLayout mainGridLayout) {
        for (int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardView = (CardView) mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0) {
                        Intent intent = new Intent(MainActivity3.this, WhatsApp.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1) {
                        Intent intent = new Intent(MainActivity3.this, Twitter.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2) {
                        Intent intent = new Intent(MainActivity3.this, Instagram.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3) {
                        Intent intent = new Intent(MainActivity3.this, Snapchat.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4) {
                        Intent intent = new Intent(MainActivity3.this, Facebook.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}