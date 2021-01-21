package com.example.day4act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    String s1;
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.textView3);
        s1 = getIntent().getStringExtra("xyz");
        textView1.setText(s1);
        textView2 = findViewById(R.id.textView4);
        s2 = getIntent().getStringExtra("abc");
        textView2.setText(s2);
    }
}