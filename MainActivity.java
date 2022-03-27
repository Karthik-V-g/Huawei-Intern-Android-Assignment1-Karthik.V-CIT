package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class MainActivity extends AppCompatActivity {
    Button b;
    EditText oname,oage,obio,omobile,oloc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b=(Button)findViewById(R.id.btnsign);
        oname=(EditText)findViewById(R.id.name);
        oage=(EditText)findViewById(R.id.age);
        obio=(EditText)findViewById(R.id.bio);
        omobile=(EditText)findViewById(R.id.phno);
        oloc=(EditText)findViewById(R.id.loc);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_LONG);

                final String vname=oname.getText().toString();
                final String vage=oage.getText().toString();
                final String vbio=obio.getText().toString();
                final String vphno=omobile.getText().toString();
                final String vloc=oloc.getText().toString();

                if(vname.isEmpty() || vage.isEmpty() || vbio.isEmpty() || vphno.isEmpty() || vloc.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Error! Please fill all details",Toast.LENGTH_LONG).show();
                    System.out.println("error");
                }
                else{


                System.out.println(vname);
                System.out.println(vage);
                System.out.println(vbio);
                System.out.println(vphno);
                System.out.println(vloc);
                Intent i=new Intent(MainActivity.this,MainActivity2_profile.class);
                i.putExtra("name",vname);
                i.putExtra("age",vage);
                i.putExtra("bio",vbio);
                i.putExtra("phno",vphno);
                i.putExtra("loc",vloc);
                startActivity(i);
                }
            }
        });
    }
}