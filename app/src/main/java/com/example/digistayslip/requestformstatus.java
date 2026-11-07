package com.example.digistayslip;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class requestformstatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestformstatus);

        // 1. Find the TextViews from your reqformstatus.xml layout
        TextView tvDisplayGradeSection = findViewById(R.id.tvDisplayGradeSection);
        TextView tvDisplayDateTime = findViewById(R.id.tvDisplayDateTime);
        TextView tvDisplayReason = findViewById(R.id.tvDisplayReason);

        // 2. Receive the data sent via Intent from requestform.java
        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_NAME");
        String gradeSection = intent.getStringExtra("EXTRA_GRADE_SECTION");
        String reason = intent.getStringExtra("EXTRA_REASON");
        String date = intent.getStringExtra("EXTRA_DATE");
        String time = intent.getStringExtra("EXTRA_TIME");
        String teacher = intent.getStringExtra("EXTRA_TEACHER");

        // 3. Display the received data inside the TextViews safely
        if (gradeSection != null) {
            tvDisplayGradeSection.setText(gradeSection);
        }

        if (date != null && time != null) {
            tvDisplayDateTime.setText("Date: " + date + " | Time: " + time);
        }

        if (reason != null) {
            tvDisplayReason.setText(reason);
        }
    }
}