package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())

        {
            case R.id.fi:
                Toast.makeText(this, "main sadhanam", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.ass:
                Toast.makeText(this, "ass anu monaa", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.code:
                Toast.makeText(this, "code anu monaa", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.program:
                Toast.makeText(this, "program anu monaa", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.thaku,menu);
        return true;
    }
}



