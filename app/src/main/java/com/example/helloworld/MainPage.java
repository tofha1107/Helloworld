package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity implements View.OnClickListener{

    Button start_button, eye_exe_button, set_con_button, user_photo_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        start_button = findViewById(R.id.start_button);
        eye_exe_button = findViewById(R.id.eye_exe_button);
        set_con_button = findViewById(R.id.set_con_button);
        user_photo_button = findViewById(R.id.user_photo_button);

        start_button.setOnClickListener(this);
        eye_exe_button.setOnClickListener(this);
        set_con_button.setOnClickListener(this);
        user_photo_button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.start_button){
            Intent intent = new Intent(getApplicationContext(), TooClosePageActivity.class);
            startActivity(intent);
        }else if(view.getId() == R.id.eye_exe_button){
            Intent intent = new Intent(getApplicationContext(), videoList.class);
            startActivity(intent);
        }else if(view.getId() == R.id.set_con_button){
            Intent intent = new Intent(getApplicationContext(), TimeSetActivity.class);
            startActivity(intent);
        }else if(view.getId() == R.id.user_photo_button){
            Intent intent = new Intent(getApplicationContext(), TooClosePageActivity.class);
            startActivity(intent);
        }
    }
}