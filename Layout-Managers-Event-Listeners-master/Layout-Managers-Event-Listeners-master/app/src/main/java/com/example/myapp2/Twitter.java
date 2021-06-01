package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class Twitter extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter2);

        //IMAGE BUTTON
        imageButton = (ImageButton) findViewById(R.id.whatsAppImageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(Twitter.this,"This is an ImageButton..",R.style.exampleToast).show();


            }
        });
    }
}