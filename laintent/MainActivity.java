package com.example.laintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn);
    }
    public void click(View view){
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
    public void click2(View view){
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
    public void click3(View view){
        Intent i=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(i);
    }

}