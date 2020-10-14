package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class videoList extends AppCompatActivity implements View.OnClickListener  {
    private Button tajo1_button;
    private Button tajo2_button;
    private Button tajo3_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);


        tajo1_button = (Button) findViewById(R.id.tajo1_button);
        tajo1_button.setOnClickListener(this);
        //Log.v("info_success",LoginInfo.info.getName());

        tajo2_button = (Button) findViewById(R.id.tajo2_button);
        tajo2_button.setOnClickListener(this);

        tajo3_button = (Button) findViewById(R.id.tajo3_button);
        tajo3_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tajo1_button){
            Intent intent = new Intent(this, PlayVideo.class);
            startActivity(intent);
        }else if(v.getId() == R.id.tajo2_button){
            Intent intent = new Intent(this, PlayVideo.class);
            startActivity(intent);
        }else if(v.getId() == R.id.tajo3_button){
            Intent intent = new Intent(this, PlayVideo.class);
            startActivity(intent);
        }
    }
}