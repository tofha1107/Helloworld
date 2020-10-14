package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.io.Serializable;

public class TimeSetActivity extends AppCompatActivity implements View.OnClickListener {

    private Button time_next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_set);

        time_next_button = (Button) findViewById(R.id.time_next_button);
        time_next_button.setOnClickListener(this);
        //Log.v("info_success",LoginInfo.info.getName());

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.time_next_button){
            Intent intent = new Intent(this, DistanceSetActivity.class);
            startActivity(intent);
        }
    }
}