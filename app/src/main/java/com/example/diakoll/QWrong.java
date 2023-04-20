package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QWrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwrong);

        TextView ChangeData = findViewById(R.id.AnswerTextWrong);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Answer = extras.getString("Answer");
            String CAnswer = extras.getString("CAnswer");
            ChangeData.setText("Ditt svar motsvarar " + Answer + ". Rätt Svar motsvarar " + CAnswer + ".");
        }
    }
}