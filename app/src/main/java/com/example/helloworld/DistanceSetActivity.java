package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DistanceSetActivity extends AppCompatActivity implements View.OnClickListener{

    private Button distance_next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance_set);

        distance_next_button = (Button) findViewById(R.id.distance_next_button);
        distance_next_button.setOnClickListener(this);
        //Log.v("info_success",LoginInfo.info.getName());
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.distance_next_button){
            Intent intent = new Intent(this, EyesexeSetActivity.class);
            startActivity(intent);
        }
    }
}