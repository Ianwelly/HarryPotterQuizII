package com.example.android.harrypotterquizii;

        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.Toast;

        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_nine;
        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_sixteen;
        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_thirteen;
        import static com.example.android.harrypotterquizii.R.id.incorrect_answer_twelve;

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

    //Question 5 if statements

    public void toastMessage5(View view) {
        RadioButton answerFive_btOne = (RadioButton) findViewById(R.id.correct_answer_five);
        RadioButton answerFive_btTwo = (RadioButton) findViewById(incorrect_answer_nine);
        RadioButton answerFive_btThree = (RadioButton) findViewById(R.id.incorrect_answer_ten);

        boolean correctAnswerFive = answerFive_btOne.isChecked();

        if (correctAnswerFive) {
            Total = Total + 1;
            answerFive_btOne.setTextColor(Color.GREEN);
        } else {
            answerFive_btOne.setTextColor(Color.GREEN);
            answerFive_btTwo.setTextColor(Color.RED);
            answerFive_btThree.setTextColor(Color.RED);
        }

        if (answerFive_btOne.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerFive_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerFive_btThree.isChecked()) {
            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 6 statements

    public void toastMessage6(View view) {

        RadioButton answerSix_btOne = (RadioButton) findViewById(R.id.incorrect_answer_eleven);
        RadioButton answerSix_btTwo = (RadioButton) findViewById(incorrect_answer_twelve);
        RadioButton answerSix_btThree = (RadioButton) findViewById(R.id.correct_answer_six);

        boolean correctAnswerSix = answerSix_btThree.isChecked();

        if (correctAnswerSix) {
            Total = Total + 1;
            answerSix_btThree.setTextColor(Color.GREEN);
        } else {
            answerSix_btOne.setTextColor(Color.RED);
            answerSix_btTwo.setTextColor(Color.RED);
            answerSix_btThree.setTextColor(Color.GREEN);
        }

        if (answerSix_btOne.isChecked()) {
            Toast.makeText(this, "Inorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerSix_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerSix_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 7 if statements

    public void toastMessage7(View view) {

        RadioButton answerSeven_btOne = (RadioButton) findViewById(R.id.correct_answer_seven);
        RadioButton answerSeven_btTwo = (RadioButton) findViewById(incorrect_answer_thirteen);
        RadioButton answerSeven_btThree = (RadioButton) findViewById(R.id.incorrect_answer_fourteen);

        boolean correctAnswerSeven = answerSeven_btOne.isChecked();

        if (correctAnswerSeven) {
            Total = Total + 1;
            answerSeven_btOne.setTextColor(Color.GREEN);
        } else {
            answerSeven_btOne.setTextColor(Color.GREEN);
            answerSeven_btTwo.setTextColor(Color.RED);
            answerSeven_btThree.setTextColor(Color.RED);
        }

        if (answerSeven_btOne.isChecked()) {
            Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerSeven_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerSeven_btThree.isChecked()) {
            Toast.makeText(this, "Inorrect answer", Toast.LENGTH_SHORT).show();
        }
    }

    //Question 8 if statements

    public void toastMessage8(View view) {
        RadioButton answerEight_btOne = (RadioButton) findViewById(R.id.incorrect_answer_fifteen);
        RadioButton answerEight_btTwo = (RadioButton) findViewById(incorrect_answer_sixteen);
        RadioButton answerEight_btThree = (RadioButton) findViewById(R.id.correct_answer_eight);

        boolean correctAnswerEight = answerEight_btThree.isChecked();

        if (correctAnswerEight) {
            Total = Total + 1;
            answerEight_btThree.setTextColor(Color.GREEN);
        } else {
            answerEight_btOne.setTextColor(Color.RED);
            answerEight_btTwo.setTextColor(Color.RED);
            answerEight_btThree.setTextColor(Color.GREEN);
        }

        if (answerEight_btOne.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerEight_btTwo.isChecked()) {
            Toast.makeText(this, "Incorrect answer!", Toast.LENGTH_SHORT).show();
        }
        if (answerEight_btThree.isChecked()) {
            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void third_question_page(View view) {
        Intent intentTwo = new Intent(this, ThirdQuestionsPageActivity.class);

        intentTwo.putExtra("RunningTotal", Total);
        startActivity(intentTwo);
    }
}




