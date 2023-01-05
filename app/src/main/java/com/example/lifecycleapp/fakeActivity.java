package com.example.lifecycleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class fakeActivity extends AppCompatActivity {

    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake);

        et=(EditText)findViewById(R.id.edtxt);
        tv=(TextView)findViewById(R.id.txtv);

        if(savedInstanceState!=null){
            tv.setText(savedInstanceState.getString("copiedtext"));
        }
        else{
            tv.setText("Hello Info");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("copiedtext",tv.getText().toString());
        super.onSaveInstanceState(outState);
    }

    public void onClickStartsfa(View view){
        Intent intent=new Intent(fakeActivity.this,fakeActivity2.class);
        startActivity(intent);

    }

    public void onClickCopier(View view){
        tv.setText(et.getText());

    }

    public void onClickQuitter(View view){
        finish();
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
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LIFECYCLE:",getLocalClassName() + "ici onRestart");
    }
}