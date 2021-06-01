package com.example.sign_inpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edUsername;
    private EditText edPassword;
    private Button btnLogin;
    private Button btnSignUp;

    private final String CREDENTIAL_SHARED_PREF="our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Sign In");
        edUsername=findViewById(R.id.ed_username);
        edPassword=findViewById(R.id.ed_password);
        btnLogin=findViewById(R.id.btn_login);
        btnSignUp=findViewById(R.id.btn_signup);
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this ,SignUpActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences credentials =getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                String strUsername=credentials.getString("Username",null);
                String strPassword=credentials.getString("Password",null);
                String username_from_ed=edUsername.getText().toString();
                String password_from_ed=edPassword.getText().toString();
                if(strUsername !=null && username_from_ed!=null && strUsername.equalsIgnoreCase(username_from_ed)){
                    if(strPassword!=null && password_from_ed !=null && strPassword.equalsIgnoreCase(password_from_ed)){
                        Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    } else{
                        Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}