package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname, sname, date, email, password1;
    Button register;
    RadioButton male, female, other1;
    boolean isAllFieldChecked = false;
    RadioGroup rp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.first);
        sname = findViewById(R.id.sec);
        date = findViewById(R.id.date);
        email = findViewById(R.id.email);
        password1 = findViewById(R.id.password);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other1 = findViewById(R.id.other);
        rp = findViewById(R.id.rph);
    }

    public void submit(View view) {
        isAllFieldChecked = ChekcAllFields();
        Toast.makeText(this, "register ayada kutaa", Toast.LENGTH_LONG).show();
    }

private boolean ChekcAllFields(){
   if (fname.length()==0){
       fname.setError("fname req");
       return false;
    }
   if (sname.length()==0){
       sname.setError("sname req");
       return false;
   }
   if (email.length()==0) {
       email.setError("email req");
       return false;
   }
   else{
       String s_mail=email.getText().toString();
       String checkEmail="[a-zA-Z0-9._-]+@[a-z]+[.]+[a-z]+";
       if (!s_mail.matches(checkEmail)){
           email.setError("invaild");
           return false;
       }
   }
    if (date.length()==0){
        date.setError("data req");
        return false;
    }
    if (password1.length()==0){
    password1.setError("paswrd req");
    return false;
    }
    if(rp.getCheckedRadioButtonId()==-1) {
        other1.setError("select gender");
        other1.requestFocus();
        return false;
    }
    return true;
    }
}