package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity implements View.OnClickListener{

    Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        start_button = findViewById(R.id.start_button);

        start_button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.start_button){
            Intent intent = new Intent(getApplicationContext(), TooClosePageActivity.class);
            startActivity(intent);
        }
    }
}