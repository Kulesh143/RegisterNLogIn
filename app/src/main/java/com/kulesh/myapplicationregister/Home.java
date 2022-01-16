package com.kulesh.myapplicationregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String name=getIntent().getStringExtra("key");
        TextView tv=findViewById(R.id.txt);
        tv.setText(name);
    }
}