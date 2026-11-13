package com.example.digistayslip;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvForgotPassword, tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);

        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString();

            if (username.isEmpty()) {
                etUsername.setError("Please enter your Student ID");
                etUsername.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                etPassword.setError("Please enter your Password");
                etPassword.requestFocus();
                return;
            }

            Toast.makeText(Login.this,
                    "Login Successful!",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Login.this, requestform.class);
            startActivity(intent);
        });

        tvForgotPassword.setOnClickListener(v -> {
            Toast.makeText(Login.this,
                    "Forgot Password clicked!",
                    Toast.LENGTH_SHORT).show();
        });

        tvSignUp.setOnClickListener(v -> {
            Toast.makeText(Login.this,
                    "Sign Up clicked!",
                    Toast.LENGTH_SHORT).show();
        });
    }
}
