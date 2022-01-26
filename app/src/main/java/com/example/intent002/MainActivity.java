package com.example.intent002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intent002.activity.SecondActivity;
import com.example.intent002.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_main_activity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Sherzod",21);
                initView(user);

            }
        });
    }
    private  void initView(User user){
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("user",user);
        startActivity(intent);
    }
}