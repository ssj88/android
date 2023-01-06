package com.example.laintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void click(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(i);
    }
    public void click2(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }
    public void click3(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }
}