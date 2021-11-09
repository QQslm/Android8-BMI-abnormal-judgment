package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView BMITXET = findViewById(R.id.textView4);// 取得目標物件
        TextView BMISTATUS = findViewById(R.id.textView5);// 取得目標物件
        Intent intent = getIntent();
        Float BMI = intent.getFloatExtra("BMI",0);
        BMITXET.setText("你的BMI指數為:"+BMI);
        if(BMI>=18.5&BMI<=24){
            BMISTATUS.setText("恭喜！「健康體重」，要繼續保持！");
        }
        else if(BMI<=18.5){
            BMISTATUS.setText("「體重過輕」，需要多運動，均衡飲食，以增加體能，維持健康！");
        }
        else if(BMI>=24){
            BMISTATUS.setText("「體重過重」了，要小心囉，趕快力行「健康體重管理」！");
        }
    }
    public void test(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}