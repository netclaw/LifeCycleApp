package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Check extends AppCompatActivity {
    public int a;
    public int b;
    EditText et;
    TextView tc1;
    TextView tc2;
    public static int somme=890;
    public static boolean v=false;
    public static int state=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        a=TroisActivites.ec1r;
        b=TroisActivites.ec2r;
        et=(EditText)findViewById(R.id.edittextcheck);
        tc1=(TextView) findViewById(R.id.textView3);
        tc1.setText(new Integer(a).toString() );
        tc2=(TextView) findViewById(R.id.textView4);
        tc2.setText(new Integer(b).toString());


    }

    public void onCancelButton(View view){
        finish();
    }

    public void onOkButton(View view){
        state+=1;
        somme=Integer.parseInt(et.getText().toString());
        Intent i=new Intent(Check.this,TroisActivites.class);
        i.putExtra("state",state);
        startActivity(i);
        //v=true;
        //finish();


    }
}