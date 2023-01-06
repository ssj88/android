package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EditUser,EditPass;
    Button Btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditUser=findViewById(R.id.name);
        EditPass=findViewById(R.id.password);
        Btnlogin=findViewById(R.id.button);
    }
    public void loginuser(View samview){
        String s1=EditUser.getText().toString();
        String s2=EditPass.getText().toString();
        if (s1.equals("sam")&&s2.equals("123"))
        {
            Toast.makeText(this, "login success", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "nee shupperanuu", Toast.LENGTH_LONG).show();
        }
    }
}