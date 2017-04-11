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

public class ThirdQuestionsPageActivity extends AppCompatActivity {
int Total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_questions_page);

        Intent intentTwo = getIntent();
        Total = intentTwo.getIntExtra("RunningTotal", 0);
        Typeface harryPTypeFace = Typeface.createFromAsset(getAssets(), "HARRYP__.TTF");
        Button btn = (Button) findViewById(R.id.enter_button_3);
        btn.setTypeface(harryPTypeFace);
    }

    public void toastMessage9 (View view) {
        CheckBox cb25 = (CheckBox) findViewById(R.id.correct_answer_nine);
        CheckBox cb26 = (CheckBox) findViewById(R.id.incorrect_answer_seventeen);
        CheckBox cb27 = (CheckBox) findViewById(R.id.incorrect_answer_eighteen);

        // Question 5 if statements for toasts
        if (cb25.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb26.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb27.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage10 (View view) {
        CheckBox cb28 = (CheckBox) findViewById(R.id.correct_answer_ten);
        CheckBox cb29 = (CheckBox) findViewById(R.id.incorrect_answer_nineteen);
        CheckBox cb30 = (CheckBox) findViewById(R.id.incorrect_answer_twenty);
        // Question 5 if statements for toasts
        if (cb28.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb29.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb30.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage11 (View view) {
        CheckBox cb31 = (CheckBox) findViewById(R.id.correct_answer_eleven);
        CheckBox cb32 = (CheckBox) findViewById(R.id.incorrect_answer_twenty_one);
        CheckBox cb33 = (CheckBox) findViewById(R.id.incorrect_answer_twenty_two);
        // Question 5 if statements for toasts
        if (cb31.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb32.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb33.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void toastMessage12 (View view) {
        CheckBox cb34 = (CheckBox) findViewById(R.id.correct_answer_twelve);
        CheckBox cb35 = (CheckBox) findViewById(R.id.incorrect_answer_twenty_three);
        CheckBox cb36 = (CheckBox) findViewById(R.id.incorrect_answer_twenty_four);
        // Question 5 if statements for toasts
        if (cb34.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb35.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (cb36.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }
    public void final_score_page (View view) {
        Intent intentFinal = new Intent (this, FinalScoreActivity.class);



            CheckBox firstAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_nine);
            if (firstAnswerCheckbox.isChecked()) {
                Total = Total + 1;
            } else {
                Total = Total;
            }

            Log.v("ThirdQuestionsPage", "Score is " + Total);

            CheckBox secondAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_ten);
            if (secondAnswerCheckbox.isChecked()) {
                Total = Total + 1;
            } else {
                Total = Total;
            }

            Log.v("ThirdQuestionsPage", "Score is " + Total);

            CheckBox thirdAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_eleven);
            if (thirdAnswerCheckbox.isChecked()) {
                Total += 1;
            } else {
                Total = Total;
            }

            Log.v("ThirdQuestionsPage", "Score is " + Total);

            CheckBox fourthAnswerCheckbox = (CheckBox) findViewById(R.id.correct_answer_twelve);
            if (fourthAnswerCheckbox.isChecked()) {
                Total += 1;
            } else {
                Total = Total;
            }
            Log.v("ThirdQuestionsPage", "Score" + Total);

            intentFinal.putExtra("RunningTotal", Total);
            startActivity(intentFinal);


        }
    }

