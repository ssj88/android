package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText first,second,result;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        sum=findViewById(R.id.sum);
        result=findViewById(R.id.result);
    }
    public void sum(View view){
        int num1=Integer.parseInt(first.getText().toString());
        int num2=Integer.parseInt(second.getText().toString());
        int sum=num1+num2;
        result.setText(sum+"");
    }
}