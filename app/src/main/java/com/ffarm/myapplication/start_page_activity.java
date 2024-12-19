package com.ffarm.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class start_page_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatbot11); // 첫 번째 화면 레이아웃 설정

//        Button startButton = findViewById(R.id.button2);
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // MainActivity로 이동
//                Intent intent = new Intent(start_page_activity.this, DiaryActivity.class);
//                startActivity(intent);
//                finish(); // WelcomeActivity 종료
//            }
//        });
    }
}
