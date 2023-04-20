package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}