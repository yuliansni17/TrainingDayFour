package com.example.yuliansari.trainingdayfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageTwoActivity extends AppCompatActivity {
    private String nameText;
    private Button btn_pageTwoNext;
    private Button btn_pageTwoPrev;
    private TextView pageTwoOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get value dari pageOne yang txtName
        Intent intent = getIntent();
        nameText = intent.getStringExtra("pageoneTextName");
        btn_pageTwoNext = (Button) findViewById(R.id.pagetwo_next);
        btn_pageTwoPrev = (Button) findViewById(R.id.pagetwo_prev);

        //ditampilin di TextView pageTwo
        pageTwoOutput = (TextView) findViewById(R.id.pagetwo_lblName);
        pageTwoOutput.setText("welcome, "+nameText);

        btn_pageTwoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNext = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intentNext);
            }
        });

        btn_pageTwoPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPrev = new Intent(PageTwoActivity.this, PageOneActivity.class);
                startActivity(intentPrev);
            }
        });
    }
}
