package com.example.intent002.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.intent002.R;
import com.example.intent002.model.User;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    private void initView(){
        TextView tv_pdp = findViewById(R.id.tv_hello_pdp);

        User user = (User)getIntent().getSerializableExtra("user");
        tv_pdp.setText(user.toString());
    }

}