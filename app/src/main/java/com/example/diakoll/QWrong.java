package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QWrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwrong);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("Answer");
            int number = extras.getInt("CAnswer");
        }

    }
}