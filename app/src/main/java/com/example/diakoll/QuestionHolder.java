package com.example.diakoll;

import java.util.ArrayList;

public class QuestionHolder {
    private ArrayList<Question> questions = new ArrayList<>();
    private int rightanswer;
    private int totalanswer;
    private int currentquestion;

    int getnextQuestion() {

        return currentquestion++;
    }

    public void Createquestion() {
        /*int numberOfQuestions = 10;
        for(int i = 0; i < numberOfQuestions; i++){
            questions.add(new Question(""))
        }*/
        String[] answers = {"ja","nej", "inte", "ok"};
        questions.add(new Question("ja", answers, 0));
        return;
    }
}