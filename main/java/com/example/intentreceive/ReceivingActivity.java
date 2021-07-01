package com.example.intentreceive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivingActivity extends AppCompatActivity {
    private TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);
        tview=findViewById(R.id.tvreceive);
        Intent intent=getIntent();
        if(getIntent()!=null && getIntent().getExtras()!=null){
            String data=getIntent().getStringExtra("etname");
            tview.setText(data);

        }
    }
}