package com.example.riyasewana.ForgotPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.riyasewana.R;

public class ForgotPasswordVeriyCode extends AppCompatActivity {
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_veriy_code);

        verifyBtn = findViewById(R.id.verifyCodeForgotPass);
        verifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgotPasswordVeriyCode.this,ResetPassword.class);
                startActivity(i);
            }
        });
    }
}