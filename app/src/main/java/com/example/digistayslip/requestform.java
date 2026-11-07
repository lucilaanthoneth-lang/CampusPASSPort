package com.example.digistayslip;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class requestform extends AppCompatActivity {

    private EditText etName, etGradeSection, etReason, etDate, etTime, etTeacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestform);

        etName = findViewById(R.id.etName);
        etGradeSection = findViewById(R.id.etGradeSection);
        etReason = findViewById(R.id.etReason);
        etDate = findViewById(R.id.etDate);
        etTime = findViewById(R.id.etTime);
        etTeacher = findViewById(R.id.etTeacher);

        ImageButton btnSubmit= findViewById(R.id.btnSubmit);
        ImageButton btnBack= findViewById(R.id.btnBack);

        btnSubmit.setOnClickListener(v -> {

            String name = etName.getText().toString().trim();
            String gradeSection = etGradeSection.getText().toString().trim();
            String reason = etReason.getText().toString().trim();
            String date = etDate.getText().toString().trim();
            String time = etTime.getText().toString().trim();
            String teacher = etTeacher.getText().toString().trim();

            if (name.isEmpty()|| gradeSection.isEmpty()|| reason.isEmpty()||
                    date.isEmpty()|| time.isEmpty()||teacher.isEmpty()){
                Toast.makeText(requestform. this, "Please complete all fields before submitting.",
                        Toast.LENGTH_SHORT).show();
                return;
        }
            Intent intent = new Intent(requestform.this, requestformstatus.class);

            intent.putExtra("EXTRA_NAME", name);
            intent.putExtra("EXTRA_GRADE_SECTION", gradeSection);
            intent.putExtra("EXTRA_REASON", reason);
            intent.putExtra("EXTRA_DATE", date);
            intent.putExtra("EXTRA_TIME", time);
            intent.putExtra("EXTRA_TEACHER", teacher);
            startActivity(intent);
        });
        btnBack.setOnClickListener(v -> finish());
    }
    }