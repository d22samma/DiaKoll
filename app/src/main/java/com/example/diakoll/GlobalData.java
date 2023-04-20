package com.example.diakoll;

public class GlobalData {
    private String NextQ;
    private String CorrectAnswers;

    private int number;
    private static GlobalData instance = null;


    private GlobalData(){

    }

    public static GlobalData getInstance(){
        if(instance == null) {
            instance = new GlobalData();
        }
        return instance;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }

    public void incrementNumber(){
        number++;
    }

    public int getNumber(){
        return number;
    }
}
