package com.example.android.harrypotterquizii;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.TextView;

public class FinalScoreActivity extends AppCompatActivity {
    int Total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        Intent intentFinal = getIntent();
        Total = intentFinal.getIntExtra("RunningTotal", 0);
        String GrandTotal = String.valueOf(Total);
        TextView tvGrandTotal = (TextView) findViewById(R.id.FinalScore);
        tvGrandTotal.setText(GrandTotal);

    }
}
