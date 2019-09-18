package com.n01281453.inclass1project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // This is a demo
    // I will add some code here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code
                Toast.makeText(getApplicationContext(),
                        "Hello! This is my first Android app!", Toast.LENGTH_LONG).show();
            }
        } );
    }

}