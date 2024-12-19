package com.ffarm.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class DiaryActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        // viewPager2 및 인디케이터 설정
        viewPager2 = findViewById(R.id.viewPager);
        LinearLayout indicatorLayout = findViewById(R.id.indicatorLayout);

        // 페이지 데이터 추가
        List<PageItem> pages = new ArrayList<>();
        pages.add(new PageItem(R.drawable.gplant, "내 마음 속 작은 정원","2022년에 생성됨"," 어느 날 아침, 나는 내 마음 속에 작은 정원이 있다는 사실을 깨달았다. 이 정원은 세상 누구에게도 보이지 않지만, 나만의 특별한 장소였다. 정원에는 내가 좋아하는 모든 것들이 있었다. 향기로운 꽃들, 부드럽게 흔들리는 나무들, 그리고 조용히 졸졸 흐르는 작은 시냇물까지. 이곳에서는 시간이 멈춘 것처럼 느껴졌다." +
                "하지만, 가만히 생각해보니 이 정원은 내가 돌보지 않으면 금방 황폐해질 수도 있다는 생각이 들었다. 그래서 매일 조금씩 정원을 가꾸기로 마음먹었다. 하루는 피곤해서 그냥 지나칠 때도 있었지만, 시간이 지나면서 깨달은 것이 있다. 정원은 나의 노력만큼 아름다워지고, 내가 주는 관심만큼 풍성해진다는 것이다."));
        pages.add(new PageItem(R.drawable.he2, "두 번째 페이지", "2023년에 생성됨", "이것은 두 번째 페이지입니다."));
        pages.add(new PageItem(R.drawable.pllant, "세 번째 페이지", "2024년에 생성됨", "이것은 세 번째 페이지입니다."));

        // 어댑터 설정
        SlidePagerAdapter adapter = new SlidePagerAdapter(pages);
        viewPager2.setAdapter(adapter);

        // 동그라미 인디케이터 설정
        int pageCount = pages.size();
        ImageView[] indicators = new ImageView[pageCount];

        // 동그라미 인디케이터 생성
        for (int i = 0; i < pageCount; i++) {
            indicators[i] = new ImageView(this);
            indicators[i].setImageResource(R.drawable.circle_unselected); // 비활성화 상태
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(30, 30);
            params.setMargins(15, 8, 15, 8);
            indicatorLayout.addView(indicators[i], params);
        }

        // ViewPager2 페이지 변경 시 동그라미 상태 업데이트
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                // 모든 동그라미를 비활성화
                for (int i = 0; i < indicators.length; i++) {
                    if (i == position) {
                        indicators[i].setImageResource(R.drawable.circle_selected); // 활성화
                    } else {
                        indicators[i].setImageResource(R.drawable.circle_unselected); // 비활성화
                    }
                }
            }
        });

    }
}
