package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QRight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qright);

        TextView ChangeDatan = findViewById(R.id.CorrectAnswer);
        TextView ChangeDatan2 = findViewById(R.id.CorrectAnswer2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String CAnswer = extras.getString("CAnswer");
            ChangeDatan.setText("Du svarade Korrekt");
            ChangeDatan2.setText("Svaret motsvarar" + CAnswer + "." );
        }

        Button nextbtn = (Button) findViewById(R.id.CorrectNext);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Next = new Intent(QRight.this, MainActivity.class);
                startActivity(Next);
                setContentView(R.layout.activity_main);
            }
        });
    }
}