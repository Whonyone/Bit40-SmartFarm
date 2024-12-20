package com.ffarm.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SignUPActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up); // 첫 번째 화면 레이아웃 설정


        //버튼 구현 예제 (참고용)
//        ImageButton startButton = findViewById(R.id.Imagebutton2);
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // ProfileActivity로 이동
//                Intent intent = new Intent(start_page_activity.this, ProfileActivity.class);
//                startActivity(intent);
//                finish(); // WelcomeActivity 종료
//            }
//
//        });
    }
}
