package com.example.day4act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText name;
    EditText loc;
    String s1;
    String s2;
    Dbhelper dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        loc=findViewById(R.id.editTextTextPersonName2);

        dbhelper=new Dbhelper(MainActivity.this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= name.getText().toString();
                s2= loc.getText().toString();
                Toast.makeText(MainActivity.this, "Data saved successfully"+ "\t"+s1 + "\t"+s2, Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void savedetails(View view){
        name=findViewById(R.id.editTextTextPersonName);
        loc=findViewById(R.id.editTextTextPersonName2);
        dbhelper.savdetails(s1, s2);

    }


}

