package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mScoreView;
    private TextView mQuestionView;
    private  Button mbtnChoice1;
    private  Button mbtnChoice2;
    private  Button mbtnChoice3;
    private  Button mbtnquit;
    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;

    private Questionlibrary mquestion_library=new Questionlibrary();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView=findViewById(R.id.tvScore);
        mQuestionView=findViewById(R.id.tvQuestion);
        mbtnChoice1=findViewById(R.id.btnchoice1);
        mbtnChoice2=findViewById(R.id.btnchoice2);
        mbtnChoice3=findViewById(R.id.btnchoice3);
        mbtnquit=findViewById(R.id.btnQuit);
        updatequestion();

        mbtnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mbtnChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updatequestion();

                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();

                    }
                    else{
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updatequestion();

                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();

                }


            }

        });
        mbtnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mbtnChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updatequestion();

                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();

                    }
                    else{
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updatequestion();

                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();

                }


            }

        });
        mbtnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mbtnChoice3.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updatequestion();

                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();

                    }
                    else{
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updatequestion();

                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();

                }


            }

        });
        mbtnquit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScore=0;
                mQuestionView.setText("Questions: ");
                mScoreView.setText("Score: ");
                updatequestion();
                Toast.makeText(MainActivity.this,"Finished",Toast.LENGTH_LONG).show();


            }
        });


    }
    private void updatequestion(){
        mQuestionView.setText(mquestion_library.getQuestion(mQuestionNumber));
        mbtnChoice1.setText(mquestion_library.getChoice1(mQuestionNumber));
        mbtnChoice2.setText(mquestion_library.getChoice2(mQuestionNumber));
        mbtnChoice3.setText(mquestion_library.getChoice3(mQuestionNumber));
        mAnswer=mquestion_library.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber=mQuestionNumber+1;
    }

    private void updateScore(int m)
    {
        mScoreView.setText("Score: "+m);
    }
}