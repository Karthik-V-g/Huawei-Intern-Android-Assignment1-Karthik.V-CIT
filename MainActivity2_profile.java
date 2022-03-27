package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.*;
import android.widget.*;
public class MainActivity2_profile extends AppCompatActivity {
private TextView oname,oage,obio,ophno,oloc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_profile);

        Intent i=getIntent();

        String vname=i.getStringExtra("name");
        String vage=i.getStringExtra("age");
        String vbio=i.getStringExtra("bio");
        String vphno=i.getStringExtra("phno");
        String vloc=i.getStringExtra("loc");

        oname=(TextView) findViewById(R.id.name);
        oage=(TextView) findViewById(R.id.age);
        obio=(TextView) findViewById(R.id.bio);
        ophno=(TextView) findViewById(R.id.mno);
        oloc=(TextView) findViewById(R.id.loc);

        oname.setText(vname);
        oage.setText(vage);
        obio.setText(vbio);
        ophno.setText(vphno);
        oloc.setText(vloc);
    }
}