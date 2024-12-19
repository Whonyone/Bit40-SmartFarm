package com.ffarm.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile); // 첫 번째 화면 레이아웃 설정

        ImageButton startButton = findViewById(R.id.ImageButton2);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DiaryActivity 이동
                Intent intent = new Intent(ProfileActivity.this, DiaryActivity.class);
                startActivity(intent);
                finish(); // WelcomeActivity 종료
            }
        });
    }

}
