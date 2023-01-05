package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Check extends AppCompatActivity {
    public int a;
    public int b;
    EditText et;
    public static int somme=890;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        a=TroisActivites.ec1r;
        b=TroisActivites.ec2r;
        et=(EditText)findViewById(R.id.edittextcheck);
    }

    public void onCancelButton(){
        finish();
    }

    public void onOkButton(){
        somme=Integer.parseInt(et.getText().toString());
        finish();


    }
}