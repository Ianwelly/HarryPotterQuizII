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

public class SecondQuestionsPageActivity extends AppCompatActivity {

    int Total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_questions_page);

        Intent intentOne = getIntent();
        Total = intentOne.getIntExtra("RunningTotal", 0);
        Typeface harryPTypeFace = Typeface.createFromAsset(getAssets(), "HARRYP__.TTF");
        Button btn = (Button) findViewById(R.id.enter_button_2);
        btn.setTypeface(harryPTypeFace);


    }

    public void toastMessage5 (View view) {
        CheckBox cb13 = (CheckBox) findViewById(R.id.correct_answer_five);
        CheckBox cb14 = (CheckBox) findViewById(R.id.incorrect_answer_nine);
        CheckBox cb15 = (CheckBox) findViewById(R.id.incorrect_answer_ten);

        // Question 5 if statements for toasts
        if (cb13.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb14.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb15.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage6 (View view) {
        CheckBox cb16 = (CheckBox) findViewById(R.id.correct_answer_six);
        CheckBox cb17 = (CheckBox) findViewById(R.id.incorrect_answer_eleven);
        CheckBox cb18 = (CheckBox) findViewById(R.id.incorrect_answer_twelve);


        // Question 6 if statements or toasts

        if (cb16.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb17.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb18.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage7 (View view) {
        CheckBox cb19 = (CheckBox) findViewById(R.id.correct_answer_seven);
        CheckBox cb20 = (CheckBox) findViewById(R.id.incorrect_answer_thirteen);
        CheckBox cb21 = (CheckBox) findViewById(R.id.incorrect_answer_fourteen);

        //Question 7 if statements for toasts

        if (cb19.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb20.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb21.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage8 (View view) {
        CheckBox cb22 = (CheckBox) findViewById(R.id.correct_answer_eight);
        CheckBox cb23 = (CheckBox) findViewById(R.id.incorrect_answer_fifteen);
        CheckBox cb24 = (CheckBox) findViewById(R.id.incorrect_answer_sixteen);

        //Question 8 if statements for toasts

        if (cb22.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb23.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb24.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }


    public void third_question_page(View view) {
        Intent intentTwo = new Intent(this, ThirdQuestionsPageActivity.class);

        CheckBox firstAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_five);
        if (firstAnswerCheckbox.isChecked()) {
            Total = Total + 1;
        } else {
            Total = Total;
        }

        Log.v("SecondQuestionsPage", "Score is " + Total);

        CheckBox secondAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_six);
        if (secondAnswerCheckbox.isChecked()) {
            Total = Total + 1;
        } else {
            Total = Total;
        }

        Log.v("SecondQuestionsPage", "Score is " + Total);

        CheckBox thirdAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_seven);
        if (thirdAnswerCheckbox.isChecked()) {
            Total += 1;
        } else {
            Total = Total;
        }

        Log.v("SecondQuestionsPage", "Score is " + Total);

        CheckBox fourthAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_eight);
        if (fourthAnswerCheckbox.isChecked()) {
            Total += 1;
        } else {
            Total = Total;
        }
        Log.v("SecondQuestionsPage", "Score" + Total);

        intentTwo.putExtra("RunningTotal", Total);
        startActivity(intentTwo);


    }
}




