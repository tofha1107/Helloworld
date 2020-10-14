package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.View;

public class alertSound extends AppCompatActivity implements View.OnClickListener {

    private final static int REQUESTCODE_RINGTONE_PICKER = 1000;

    // 문제 해결을 위해 Ringtone으로 변경
    private RingtoneManager mRtm;
    // 현재 재생중인 링톤
    private Ringtone mRtCurrent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_sound);
    }

    @Override
    public void onClick(View view) {

    }
}