package com.example.java_crash_course;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void launchSettings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        String message = ((EditText)findViewById(R.id.editTextText)).getText().toString();
        i.putExtra("COOL", message);
        startActivity(i);
    }
}