package com.example.m4l9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        initViews();
    }

    void initViews(){
        countDownTimer();
    }

    void countDownTimer(){
        new CountDownTimer(2000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                callSignInActivity();
            }
        }.start();
    }
    void callSignInActivity(){
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
        finish();
    }
}