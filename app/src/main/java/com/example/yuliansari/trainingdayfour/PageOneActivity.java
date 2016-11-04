package com.example.yuliansari.trainingdayfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageOneActivity extends AppCompatActivity {
    private Button btn_pageOneNext;
    private EditText pageoneTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        btn_pageOneNext = (Button) findViewById(R.id.pageone_next);
        //nampung edit text
        pageoneTextName = (EditText) findViewById(R.id.pageone_name);

        btn_pageOneNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageOneActivity.this, PageTwoActivity.class);
                intent.putExtra("pageoneTextName", pageoneTextName.getText().toString());
                if(pageoneTextName.length()==0){
                    Toast.makeText(PageOneActivity.this, "Please Insert Your Name First", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(intent);
                }
            }
        });
    }
}
