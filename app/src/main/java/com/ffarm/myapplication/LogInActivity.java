package com.ffarm.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class LogInActivity extends AppCompatActivity {

    boolean isRadioButtonChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView로 설정된 레이아웃이 login_xml인지 확인
        setContentView(R.layout.sign_up);  // login_xml을 설정

        // 현재 설정된 레이아웃이 'login_xml'일 때만 radioButton 초기화
        if (getLayoutInflater().inflate(R.layout.login, null) != null) {
            // login_xml 레이아웃에서 'radioButton'이 존재하는지 확인
            if (findViewById(R.id.radioButton) != null) {
                // ImageView 라디오 버튼 초기화
                ImageView radioButton = findViewById(R.id.radioButton);

                // ImageView 클릭 리스너 설정
                radioButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 체크 상태 토글
                        if (isRadioButtonChecked) {
                            radioButton.setImageResource(R.drawable.auto_login_uncheckbox); // 체크 해제 상태
                            isRadioButtonChecked = false;
                        } else {
                            radioButton.setImageResource(R.drawable.auto_login_checkbox); // 체크 상태
                            isRadioButtonChecked = true;
                        }
                    }
                });
            }
        }
    }
}

