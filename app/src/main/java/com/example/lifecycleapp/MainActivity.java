package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onStartDialog(View view){
        Intent intent=new Intent(MainActivity.this,Dialog.class);
        startActivity(intent);
    }

    public void onClickQuitter(View view){
        finish();

    }

    public void startFakeActivity(View view){
        Intent intent=new Intent(MainActivity.this,fakeActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onDestroy");
        System.exit(0); //question 5! what's the point ?!
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onRestart");
    }

}