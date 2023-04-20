package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        Button button = (Button) findViewById(R.id.q1cancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q1.this, MainActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_main);

            }
        });

        Button q1a1 = (Button) findViewById(R.id.Q1A1);
        q1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q1.this, QRight.class);

                startActivity(intent);
                setContentView(R.layout.activity_qright);

            }
        });

        Button q1a2 = (Button) findViewById(R.id.Q1A2);
        q1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q1.this, QWrong.class);

                startActivity(intent);
                setContentView(R.layout.activity_qwrong);

            }
        });

        Button q1a3 = (Button) findViewById(R.id.Q1A3);
        q1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q1.this, QWrong.class);

                startActivity(intent);
                setContentView(R.layout.activity_qwrong);

            }
        });

        Button q1a4 = (Button) findViewById(R.id.Q1A4);
        q1a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q1.this, QWrong.class);

                startActivity(intent);
                setContentView(R.layout.activity_qwrong);

            }
        });
    }
}