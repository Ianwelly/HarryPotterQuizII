package com.example.android.harrypotterquizii;

        import android.content.Intent;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface harryPTypeFace = Typeface.createFromAsset(getAssets(), "HARRYP__.TTF");
        TextView tv = (TextView) findViewById(R.id.text_view_1);
        Button btn = (Button) findViewById(R.id.enter_button);
        tv.setTypeface(harryPTypeFace);
        btn.setTypeface(harryPTypeFace);
    }

    public void first_question_page(View view) {
        Intent intent = new Intent(this, FirstQuestionsPageActivity.class);
        startActivity(intent);
    }
}
