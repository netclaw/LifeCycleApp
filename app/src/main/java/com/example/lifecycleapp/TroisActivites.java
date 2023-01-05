package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TroisActivites extends AppCompatActivity {
    EditText ec1;
    public static int ec1r;
    EditText ec2;
    public static int ec2r;

    EditText et1;
    EditText et2;
    int CALL_Perm=1;
    public static String phoneNumber="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trois_activites);

        et1=(EditText)findViewById(R.id.callbutton);
        et2=(EditText)findViewById(R.id.navigate);

        ec1=(EditText)findViewById(R.id.editchallenge1);
        ec2=(EditText)findViewById(R.id.editchallenge2);

        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, CALL_Perm);



    }

    public void onCall(View view){

        phoneNumber=et1.getText().toString();

        Intent intent1=new Intent(TroisActivites.this,Login.class);
        startActivity(intent1);



    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//check the permission type using the requestCode
        if (requestCode == CALL_Perm) { //the array is empty if not granted
            if (grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED)
                Toast.makeText(this, "GRANTED CALL", Toast.LENGTH_SHORT).show();
        } }

    public void onNavigate(View view){
        ec1r=Integer.parseInt(ec1.getText().toString());
        ec2r=Integer.parseInt(ec2.getText().toString());

        int somme=ec1r+ec2r;

        Intent intent=new Intent(TroisActivites.this,Check.class);
        startActivity(intent);

        /*
        String url = et2.getText().toString();
        if(url.compareTo("")==0){
            url="https://www.emi.ac.ma";
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
        */



    }
}