package com.jian86_android.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("changeTitle");
        //깃에서 받기
        //내가 원하는 추가 작업
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
