package com.example.android.harrypotterquizii;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class FirstQuestionsPageActivity extends AppCompatActivity {

    int Total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_questions_page);
        Typeface harryPTypeFace = Typeface.createFromAsset(getAssets(), "HARRYP__.TTF");
        Button btn = (Button) findViewById(R.id.enter_button_1);
        btn.setTypeface(harryPTypeFace);
    }

    public void toastMessage1(View view) {

        // Question 1 if statements

        RadioButton answerOne_btOne = (RadioButton) findViewById(R.id.correct_answer_one);
        RadioButton answerOne_btTwo = (RadioButton) findViewById(R.id.incorrect_answer_one);
        RadioButton answerOne_btThree = (RadioButton) findViewById(R.id.incorrect_answer_two);

        boolean correctAnswerOne = answerOne_btOne.isChecked();

        if (correctAnswerOne) {
            Total = Total + 1;
            answerOne_btOne.setTextColor(Color.GREEN);
        } else {
            answerOne_btOne.setTextColor(Color.GREEN);
            answerOne_btTwo.setTextColor(Color.RED);
            answerOne_btThree.setTextColor(Color.RED);
        }

        if (answerOne_btOne.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerOne_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerOne_btThree.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 2 if Statements

    public void toastMessage2(View view) {

        RadioButton answerTwo_btOne = (RadioButton) findViewById(R.id.incorrect_answer_three);
        RadioButton answerTwo_btTwo = (RadioButton) findViewById(R.id.incorrect_answer_four);
        RadioButton answerTwo_btThree = (RadioButton) findViewById(R.id.correct_answer_two);

        boolean correctAnswerTwo = answerTwo_btThree.isChecked();

        if (correctAnswerTwo) {
            Total = Total + 1;
            answerTwo_btThree.setTextColor(Color.GREEN);
        } else {
            answerTwo_btOne.setTextColor(Color.RED);
            answerTwo_btTwo.setTextColor(Color.RED);
            answerTwo_btThree.setTextColor(Color.GREEN);
        }

        if (answerTwo_btOne.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerTwo_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerTwo_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 3 if statements
    public void toastMessage3(View view) {

        RadioButton answerThree_btOne = (RadioButton) findViewById(R.id.incorrect_answer_five);
        RadioButton answerThree_btTwo = (RadioButton) findViewById(R.id.incorrect_answer_six);
        RadioButton answerThree_btThree = (RadioButton) findViewById(R.id.correct_answer_three);

        boolean correctAnswerThree = answerThree_btThree.isChecked();

        if (correctAnswerThree) {
            Total = Total + 1;
            answerThree_btThree.setTextColor(Color.GREEN);
        } else {
            answerThree_btOne.setTextColor(Color.RED);
            answerThree_btTwo.setTextColor(Color.RED);
            answerThree_btThree.setTextColor(Color.GREEN);
        }
        if (answerThree_btOne.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerThree_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerThree_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 4 if statements

    public void toastMessage4(View view) {
//        RadioButton answerFour_btOne = (RadioButton) findViewById(R.id.incorrect_answer_seven);
//        RadioButton answerFour_btTwo = (RadioButton) findViewById(R.id.correct_answer_four);
//        RadioButton answerFour_btThree = (RadioButton) findViewById(R.id.incorrect_answer_eight);

        CheckBox answerFour_btOne = (CheckBox) findViewById(R.id.incorrect_answer_seven);
        CheckBox answerFour_btTwo = (CheckBox) findViewById(R.id.correct_answer_four);
        CheckBox answerFour_btThree = (CheckBox) findViewById(R.id.incorrect_answer_eight);

        boolean firstCorrectAnswerFour = answerFour_btTwo.isChecked() && answerFour_btThree.isChecked();

        if (firstCorrectAnswerFour) {

            Total = Total + 1;
            answerFour_btTwo.setTextColor(Color.GREEN);
            answerFour_btThree.setTextColor(Color.GREEN);
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        } else if (answerFour_btOne.isChecked() && answerFour_btTwo.isChecked()) {
            answerFour_btOne.setTextColor(Color.RED);
            answerFour_btTwo.setTextColor(Color.RED);
            Toast.makeText(this, "Sorry, those two answers were wrong", Toast.LENGTH_SHORT).show();
        } else if (answerFour_btOne.isChecked() && answerFour_btThree.isChecked()) {
            answerFour_btOne.setTextColor(Color.RED);
            answerFour_btThree.setTextColor(Color.RED);
            Toast.makeText(this, "Sorry, those two answers are wrong", Toast.LENGTH_SHORT).show();
        }
    }

    //Intent for transitioning to second page of questions.

    public void second_question_page(View view) {
        Intent intentOne = new Intent(this, SecondQuestionsPageActivity.class);
        intentOne.putExtra("RunningTotal", Total);
        startActivity(intentOne);
    }
}