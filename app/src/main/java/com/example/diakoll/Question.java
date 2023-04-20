package com.example.diakoll;

public class Question {
    private String question;
    private String[] answers ={"","","",""};
    int rightAnswer;

    public Question(String question, String[] answers, int rightAnswer){
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

}
