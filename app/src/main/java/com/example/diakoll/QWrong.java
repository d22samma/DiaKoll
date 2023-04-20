package com.example.diakoll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QWrong extends AppCompatActivity {
    private GlobalData global = GlobalData.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwrong);

        TextView ChangeData = findViewById(R.id.AnswerTextWrong);
        TextView ChangeData2 = findViewById(R.id.YourAnswer);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Answer = extras.getString("Answer");
            String CAnswer = extras.getString("CAnswer");
            ChangeData.setText("Rätt Svar motsvarar" + CAnswer + ".");
            ChangeData2.setText("Ditt svar motsvarar " + Answer + ".");
        }
    }
}