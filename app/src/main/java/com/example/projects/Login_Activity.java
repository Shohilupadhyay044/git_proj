package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class Login_Activity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        mVideoView = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

        mVideoView.setVideoURI(uri);
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    public void Phone(View view) {
        Intent intent =new Intent(Login_Activity.this,Phone_Authentication.class);
        startActivity(intent);
        finish();
    }

    public void facebook(View view) {
        Toast.makeText(this, "Facebook Login Under Development", Toast.LENGTH_SHORT).show();
    }
}
