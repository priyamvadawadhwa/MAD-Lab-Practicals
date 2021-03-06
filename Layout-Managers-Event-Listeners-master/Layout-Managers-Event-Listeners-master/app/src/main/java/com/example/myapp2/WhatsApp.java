package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class WhatsApp extends AppCompatActivity {
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        //IMAGE BUTTON
        imageButton = (ImageButton) findViewById(R.id.whatsAppImageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(WhatsApp.this,"This is an ImageButton..",R.style.exampleToast).show();


            }
        });
    }
}