package com.example.android.harrypotterquizii;

        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.Toast;

        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_eighteen;
        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_nineteen;

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

    //Question 9 if statements

    public void toastMessage9(View view) {

        RadioButton answerNine_btOne = (RadioButton) findViewById(R.id.incorrect_answer_seventeen);
        RadioButton answerNine_btTwo = (RadioButton) findViewById(incorrect_answer_eighteen);
        RadioButton answerNine_btThree = (RadioButton) findViewById(R.id.correct_answer_nine);

        boolean correctAnswerNine = answerNine_btThree.isChecked();

        if (correctAnswerNine) {
            Total ++;
            answerNine_btThree.setTextColor(Color.GREEN);
        } else {

            answerNine_btOne.setTextColor(Color.RED);
            answerNine_btTwo.setTextColor(Color.RED);
            answerNine_btThree.setTextColor(Color.GREEN);
        }

        if (answerNine_btOne.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerNine_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerNine_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 10 if statements

    public void toastMessage10(View view) {

        RadioButton answerTen_btOne = (RadioButton) findViewById(R.id.correct_answer_ten);
        RadioButton answerTen_btTwo = (RadioButton) findViewById(incorrect_answer_nineteen);
        RadioButton answerTen_btThree = (RadioButton) findViewById(R.id.incorrect_answer_twenty);

        boolean correctAnswerTen = answerTen_btOne.isChecked();

        if (correctAnswerTen) {
            Total ++;
            answerTen_btOne.setTextColor(Color.GREEN);
        } else {

            answerTen_btOne.setTextColor(Color.GREEN);
            answerTen_btTwo.setTextColor(Color.RED);
            answerTen_btThree.setTextColor(Color.RED);
        }

        if (answerTen_btOne.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerTen_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerTen_btThree.isChecked()) {
            Toast.makeText(this, "Inorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 11 if statements

    public void toastMessage11(View view) {

        RadioButton answerEleven_btOne = (RadioButton) findViewById(R.id.incorrect_answer_twentyone);
        RadioButton answerEleven_btTwo = (RadioButton) findViewById(R.id.incorrect_answer_twentytwo);
        RadioButton answerEleven_btThree = (RadioButton) findViewById(R.id.correct_answer_eleven);

        boolean correctAnswerEleven = answerEleven_btThree.isChecked();

        if (correctAnswerEleven) {
            Total ++;
            answerEleven_btThree.setTextColor(Color.GREEN);
        } else {

            answerEleven_btOne.setTextColor(Color.RED);
            answerEleven_btTwo.setTextColor(Color.RED);
            answerEleven_btThree.setTextColor(Color.GREEN);
        }

        if (answerEleven_btOne.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerEleven_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerEleven_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 12 if statements

    public void toastMessage12(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text_myrtle);
        String answer = editText.getText().toString().trim();
        if (answer.equalsIgnoreCase("Moaning Myrtle")) {
            Total++;
            Toast.makeText(ThirdQuestionsPageActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(ThirdQuestionsPageActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void final_score_page(View view) {
        Intent intentFinal = new Intent(this, FinalScoreActivity.class);
        intentFinal.putExtra("RunningTotal", Total);
        startActivity(intentFinal);
        Toast.makeText(ThirdQuestionsPageActivity.this, "Your final score is" + Total, Toast.LENGTH_SHORT).show();
    }
}

