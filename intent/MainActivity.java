package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, loaction;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        loaction = findViewById(R.id.location);
        sp = getSharedPreferences("register", MODE_PRIVATE);
    }

    public void reg(View view) {
        Toast.makeText(this, "reg ayada kutaa", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        String val1 = name.getText().toString();
        String val2 = email.getText().toString();
        i.putExtra("name", val1);
        i.putExtra("email", val2);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString("location", loaction.getText().toString());
        ed.commit();
        startActivity(i);
    }
}