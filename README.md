**DiaKoll**

# Rapport

Create Buttons
```java
        Button Rulesbtn = (Button) findViewById(R.id.rulesbtn);
        Rulesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
```

Input Data To Send While AnswerButton Pushed 
```java
        Intent RightA1 = new Intent(Q1.this, QRight.class);
        RightA1.putExtra("Answer", "Answer"); // Optional
        RightA1.putExtra("CAnswer", "CAnswer"); // Optional
        startActivity(RightA1);
```

Collect Data From Answerbutton. Print into textview inside WrongPage.xml
```java
        TextView ChangeData = findViewById(R.id.AnswerTextWrong);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
        String Answer = extras.getString("Answer");
        String CAnswer = extras.getString("CAnswer");
        ChangeData.setText("Ditt svar motsvarar " + Answer + ". Rätt Svar motsvarar " + CAnswer + ".");
        }
        }
```


![]()
_Bildtext_