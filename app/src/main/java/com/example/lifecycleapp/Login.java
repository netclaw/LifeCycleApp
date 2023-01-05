package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText etu;
    EditText etp;
    String username="TPandINFO";
    String password="secret";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etu=(EditText) findViewById(R.id.username);
        etp=(EditText) findViewById(R.id.password);
    }

    public void onLogin(View view){
        boolean v;
        if(username.compareTo(etu.getText().toString())==0 && password.compareTo(etp.getText().toString())==0){
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", TroisActivites.phoneNumber, null));
            startActivity(intent);
            finish();
        }




    }

    public void onCancel(View view){
        finish();
        //Intent intent=new Intent(Login.this,TroisActivites.class);


    }
}