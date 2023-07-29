package com.example.quizapp;

public class Questionlibrary {
    private String mQuestions[]={
            "Which part of the plants holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bess,butterflies and hummingbirds.",
            "The _ holds the plant upright."
    };

    private String mChoice[][]={
            {"Roots","Stem","Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flower","Root"},
            {"Fruits","Leaves","Stem"}

    };
    private String mCorrectanswer[]={
         "Root",
         "Leaves",
         "Flower",
         "Stem"
    };
    public String getQuestion(int a){
        String q=mQuestions[a];
        return q;
    }
    public String getChoice1(int a){
        String choice0=mChoice[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1=mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2=mChoice[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectanswer[a];
        return answer;
    }

}
