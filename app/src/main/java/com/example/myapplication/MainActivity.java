package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float bmi;
    EditText height;                //宣告全域變數
    EditText weight;                //宣告全域變數
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.editTextTextPersonName);// 取得體重物件
        weight = findViewById(R.id.editTextTextPersonName2);// 取得身高物件
    }
    public void test(View view) {
        if ( !("".equals(height.getText().toString())||"".equals(weight.getText().toString())) )
        {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, MainActivity2.class);
            TextView BMI = findViewById(R.id.textView);
            float WEIGHT = Float.parseFloat(weight.getEditableText().toString());
            float HEIGHT = Float.parseFloat(height.getEditableText().toString());
            bmi = WEIGHT / (HEIGHT * HEIGHT);
            intent.putExtra("BMI", bmi);
            startActivity(intent);
        }
    }
}





//BMI.setText(editText.getText().toString());BMI更改為editText的字串