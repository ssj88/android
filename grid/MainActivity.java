package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText number;
    double num1 = 0;
    double num2 = 0;
    String op = "";
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, mul, div, eqt, clear, sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.dis);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        add = findViewById(R.id.sum);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        eqt = findViewById(R.id.eqt);
        sub = findViewById(R.id.sub);
        clear = findViewById(R.id.clear);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        mul.setOnClickListener(this);
        add.setOnClickListener(this);
        div.setOnClickListener(this);
        sub.setOnClickListener(this);
        eqt.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        if (view == clear) {
            number.setText("");
        } else if(view == sub || view == add || view == mul || view = div) {
            num1 = Integer.parseInt(number.getText().toString());
            op = b.getText().toString();
            number.setText("");

        } else if (view == eqt) {
            num2 = Integer.parseInt(number.getText().toString());
            if (op.equals("+")) {
                number.setText(num1 + num2 + "");
            } else if (op.equals("-")) {
                number.setText(num1 - num2 + "");
            } else if (op.equals("*")) {
                number.setText(num1 * num2 + "");
            } else if (op.equals("/")) {
                number.setText(num1 / num2 + "");
            }
        } else {
            String s = number.getText().toString();
            number.setText(s + b.getText().toString());
        }
    }
}