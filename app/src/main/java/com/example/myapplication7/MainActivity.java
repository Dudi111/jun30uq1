package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etname;
    private Button mbtninten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.etname);
        mbtninten=findViewById(R.id.btnsend);
        mbtninten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vintent=new Intent();
                vintent.setAction(Intent.ACTION_VIEW);
                if(vintent.resolveActivity(getPackageManager())!=null){
                    vintent.putExtra("etname",etname.getText().toString());
                    startActivity(vintent);
                }else{
                    Toast.makeText(MainActivity.this,"Not found",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}