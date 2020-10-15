package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class alertPage extends AppCompatActivity implements View.OnClickListener {

    AlertDialog alertDialog;
    Ringtone rt;
    RingtoneManager rtm;
    private Button basic_sound;
    private Button record_sound;
    private TextView m_tvRingtoneUri;
    private String m_strRingToneUri;


    private final static String TAG = "MainActivity";
    private final static int REQUESTCODE_RINGTONE_PICKER = 1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_page);

        Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        vib.vibrate(1000);

        basic_sound = (Button) findViewById(R.id.basic_sound);
        basic_sound.setOnClickListener(this);

        record_sound = (Button) findViewById(R.id.record_sound);
        record_sound.setOnClickListener(this);

        //기본음 사용하기 버튼을 누름
//        basic_sound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
//                rt = RingtoneManager.getRingtone(getApplicationContext(), notification);
//                rt.play();
//            }
//        });

//        //알림음 녹음하기 버튼을 누름
//        record_sound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(view.getId() == R.id.record_sound){
//                    Intent intent = new Intent();
//                    startActivity(intent);
//                }
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.basic_sound){
//            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
//            rt = RingtoneManager.getRingtone(getApplicationContext(), notification);
//            rt.play(); //누르면 type_alarm 소리가 나옴
        }else if(v.getId() == R.id.record_sound){
            Intent intent = new Intent(this, audioRecord.class);
            startActivity(intent);
        }

        switch( v.getId() ) {
            case R.id.basic_sound: showRingtonChooser();
                break;
//            case R.id.stop_play_ringtone:
//                this.releaseRingtone();
//                break;
        }
    }

//    private void startRingtone(Uri uriRingtone ) {
//        this.releaseRingtone();
//        try { mMediaPlayer = MediaPlayer.create(getApplicationContext(), uriRingtone );
//            if( mMediaPlayer == null ) {
//                throw new Exception( "Can't create player" );
//            }
//            // STREAM_VOICE_CALL, STREAM_SYSTEM, STREAM_RING, STREAM_MUSIC, STREAM_ALARM
//            // STREAM_NOTIFICATION, STREAM_DTMF
//            mMediaPlayer.setAudioStreamType( AudioManager.STREAM_ALARM );
//            mMediaPlayer.setAudioStreamType( AudioManager.STREAM_MUSIC );
//            //mMediaPlayer.setAudioAttributes();
//            mMediaPlayer.start();
//        }
//        catch( Exception e ) {
//            Toast.makeText( this, e.getMessage(), Toast.LENGTH_SHORT ).show();
//            Log.e(TAG, e.getMessage() );
//            e.printStackTrace();
//        }
//    }

    //-- 재생중인 링톤을 중지하는 함수
//    private void releaseRingtone() {
//        if( mMediaPlayer != null ) {
//            if( mMediaPlayer.isPlaying() ) {
//                mMediaPlayer.stop(); } mMediaPlayer.release();
//            mMediaPlayer = null;
//        }
//    }

    private void showRingtonChooser() {
        Intent intent = new Intent(RingtoneManager.ACTION_RINGTONE_PICKER);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TITLE, "기본 알림음을 선택하세요!" );
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_SHOW_SILENT, false);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_SHOW_DEFAULT, true);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TYPE, RingtoneManager.TYPE_ALL);

        //-- 알림 선택창이 떴을 때, 기본값으로 선택되어질 ringtone설정
//        if( m_strRingToneUri != null && m_strRingToneUri.isEmpty() ) {
//            intent.putExtra(RingtoneManager.EXTRA_RINGTONE_EXISTING_URI, Uri.parse( m_strRingToneUri ));
//        }
        this.startActivityForResult( intent, REQUESTCODE_RINGTONE_PICKER ); }

        //-- 알림선택창에서 넘어온 데이터를 처리하는 코드

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if( requestCode == REQUESTCODE_RINGTONE_PICKER ) {
            if (resultCode == RESULT_OK) {
                // -- 알림음 재생하는 코드 --
                 Uri ring = data.getParcelableExtra(RingtoneManager.EXTRA_RINGTONE_PICKED_URI);
                 if (ring != null) {m_strRingToneUri = ring.toString();
                 m_tvRingtoneUri.setText(ring.toString());
                 //this.startRingtone(ring);
                 } else {m_strRingToneUri = null;
                 m_tvRingtoneUri.setText( "Choose ringtone" );
                 }
            }
        }
    }
    //-- 눌러진 버튼에 따라 처리하는 함수
//     @Override
//     public void onClick(View v) {
//        switch( v.getId() ) {
//            case R.id.show_ringtone_chooser: showRingtonChooser();
//                break;
//            case R.id.stop_play_ringtone:
//                this.releaseRingtone();
//                break;
//        }
//    }
}