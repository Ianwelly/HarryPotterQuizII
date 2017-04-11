package com.example.android.harrypotterquizii;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

    public void toastMessage1 (View view) {

        CheckBox cb1 = (CheckBox) findViewById(R.id.correct_answer_one);
        CheckBox cb2 = (CheckBox) findViewById(R.id.incorrect_answer_one);
        CheckBox cb3 = (CheckBox) findViewById(R.id.incorrect_answer_two);


        // Question 1 if statements for toasts

        if (cb1.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb2.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb3.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage2(View view) {
        CheckBox cb4 = (CheckBox) findViewById(R.id.correct_answer_two);
        CheckBox cb5 = (CheckBox) findViewById(R.id.incorrect_answer_three);
        CheckBox cb6 = (CheckBox) findViewById(R.id.incorrect_answer_four);

        // Question 2 if statements or toasts

        if (cb4.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb5.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb6.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage3 (View view) {
        CheckBox cb7 = (CheckBox) findViewById(R.id.correct_answer_three);
        CheckBox cb8 = (CheckBox) findViewById(R.id.incorrect_answer_five);
        CheckBox cb9 = (CheckBox) findViewById(R.id.incorrect_answer_six);


        //Question 3 if statements for toasts

        if (cb7.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb8.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb9.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage4 (View view) {
        CheckBox cb10 = (CheckBox) findViewById(R.id.correct_answer_four);
        CheckBox cb11 = (CheckBox) findViewById(R.id.incorrect_answer_seven);
        CheckBox cb12 = (CheckBox) findViewById(R.id.incorrect_answer_eight);


        //Question 4 if statements for toasts

        if (cb10.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb11.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb12.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }


    public void second_question_page(View view) {
        Intent intentOne = new Intent(this, SecondQuestionsPageActivity.class);

        CheckBox firstAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_one);
        if (firstAnswerCheckbox.isChecked()) {
            Total = Total +1;
        } else {
            Total = Total;
        }
        Log.v("FirstQuestionsPage", "Checkbox state = "+ firstAnswerCheckbox);
        Log.v("score", "Score is " + Total);

        CheckBox secondAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_two);
        if (secondAnswerCheckbox.isChecked()) {
            Total = Total + 1;
        } else {
            Total = Total;
        }
        Log.v("FirstQuestionPage", "Checkbox state= " + secondAnswerCheckbox);
        Log.v("score", "Score is " + Total);

        CheckBox thirdAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_three);
        if (thirdAnswerCheckbox.isChecked()) {
            Total += 1;
        } else {
            Total = Total;
        }

        Log.v("FirstQuestionPage", "Score is " + Total);

        CheckBox fourthAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_four);
        if (fourthAnswerCheckbox.isChecked()) {
            Total += 1;
        } else {
            Total = Total;
        }
        Log.v("FirstQuestionPage", "Score" + Total);

        intentOne.putExtra("RunningTotal", Total);
        startActivity(intentOne);



    }

}