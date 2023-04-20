package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1 extends AppCompatActivity {
    private GlobalData globalData = GlobalData.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        globalData.setNumber(globalData.getNumber() +1);
        GlobalData.getInstance().incrementNumber();
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
                globalData.setNumber(globalData.getNumber() +1);
                Intent RightA1 = new Intent(Q1.this, QRight.class);
                RightA1.putExtra("Answer", "Answer"); // Optional
                RightA1.putExtra("CAnswer", "CAnswer"); // Optional
                startActivity(RightA1);
                setContentView(R.layout.activity_qright);

            }
        });

        Button q1a2 = (Button) findViewById(R.id.Q1A2);
        q1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent WrongA2 = new Intent(Q1.this, QWrong.class);
                WrongA2.putExtra("Answer", "Answer2"); // Optional
                WrongA2.putExtra("CAnswer", "CAnswer2"); // Optional
                startActivity(WrongA2);
                setContentView(R.layout.activity_qwrong);

            }
        });

        Button q1a3 = (Button) findViewById(R.id.Q1A3);
        q1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent WrongA3 = new Intent(Q1.this, QWrong.class);
                WrongA3.putExtra("Answer", "Answer3"); // Optional
                WrongA3.putExtra("CAnswer", "CAnswer3"); // Optional
                startActivity(WrongA3);
                setContentView(R.layout.activity_qwrong);
            }
        });

        Button q1a4 = (Button) findViewById(R.id.Q1A4);
        q1a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent WrongA4 = new Intent(Q1.this, QWrong.class);
                WrongA4.putExtra("Answer", "Answer4"); // Optional
                WrongA4.putExtra("CAnswer", "CAnswer4"); // Optional
                startActivity(WrongA4);
                setContentView(R.layout.activity_qwrong);

            }
        });
    }
}