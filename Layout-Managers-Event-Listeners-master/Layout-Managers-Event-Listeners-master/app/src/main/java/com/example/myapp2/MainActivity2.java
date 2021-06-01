package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.*;
import android.view.*;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String planet[];
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    Button submitBtn;
    TextView txtview8;
    ArrayList<String> cbresult;
    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // SWITCH
        aSwitch = (Switch) findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    StyleableToast.makeText(getBaseContext(),"Switch On",R.style.exampleToast).show();
                }
                else{
                    StyleableToast.makeText(getBaseContext(),"Switch Off",R.style.exampleToast).show();
                }
            }
        });


        //RADIO BUTTON
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // SPINNER

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.country, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        //CHECK BOX
        cb1 = findViewById(R.id.chkbox1);
        cb2 = findViewById(R.id.chkbox2);
        cb3 = findViewById(R.id.chkbox3);
        cb4 = findViewById(R.id.chkbox4);
        cb5 = findViewById(R.id.chkbox5);
        cb6 = findViewById(R.id.chkbox6);

        submitBtn = findViewById(R.id.submitBtn);
        txtview8 = findViewById(R.id.txtview8);
        cbresult = new ArrayList<>();
        txtview8.setEnabled(false);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked())
                    cbresult.add("Melbourne");
                else
                    cbresult.remove("Melbourne");

            }

        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked())
                    cbresult.add("Los Angeles");
                else
                    cbresult.remove("Los Angeles");
            }
        });

        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb3.isChecked())
                    cbresult.add("Pune");
                else
                    cbresult.remove("Pune");
            }
        });

        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb4.isChecked())
                    cbresult.add("Oakland");
                else
                    cbresult.remove("Oakland");

            }
        });

        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb5.isChecked())
                    cbresult.add("Mumbai");
                else
                    cbresult.remove("Mumbai");
            }
        });

        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb6.isChecked())
                    cbresult.add("Portland");
                else
                    cbresult.remove("Portland");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s: cbresult)
                    stringBuilder.append(s).append("  ");
                //    stringBuilder.toString();
                //    StyleableToast.makeText(getBaseContext(), String.valueOf(stringBuilder),R.style.exampleToast).show();
                    StyleableToast.makeText(getBaseContext(), String.valueOf(stringBuilder),R.style.exampleToast).show();

                //txtview8.setText(stringBuilder.toString());
                //txtview8.setEnabled(true);
            }
        });

        //MOVE TO NEXT ACTIVITY
        Button btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(in);
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        //StyleableToast.makeText(parent.getContext(), text, R.style.exampleToast).show();
        if (text == "Choose Country") {
            //do nothing
        }
        else
        {
            StyleableToast.makeText(parent.getContext(), text, R.style.exampleToast).show();
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        StyleableToast.makeText(this, (String) radioButton.getText(), R.style.exampleToast).show();

    }

}