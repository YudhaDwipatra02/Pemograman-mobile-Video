package com.limun.video_yudhadwipatra;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.limun.video_yudhadwipatra.R.raw.videoku;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Video offline");
        getSupportActionBar().setTitle("YDStudio");

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +  R.raw.videoku));
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
