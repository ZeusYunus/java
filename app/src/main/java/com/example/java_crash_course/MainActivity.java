package com.example.java_crash_course;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("failing", "it's not working");
    }

    public void handleText(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();

        Log.d("info", input);
    }

//    public void disable(View v) {
//        findViewById(R.id.button).setEnabled(false);
//        ((Button)findViewById(R.id.button)).setText("new new disabled");
//
//
//        v.setEnabled(false);
//        Log.d("success", "Button disabled");
//
//        Button button = (Button) v;
//        button.setText("Disabled");
//    }

}