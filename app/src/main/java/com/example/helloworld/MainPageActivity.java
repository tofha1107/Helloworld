package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        start_button = (Button) findViewById(R.id.start_button);
        start_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.start_button){
            Intent intent = new Intent(this, TimeSetActivity.class);
            startActivity(intent);
        }
    }
}