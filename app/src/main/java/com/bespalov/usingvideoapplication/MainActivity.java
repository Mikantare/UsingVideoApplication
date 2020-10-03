package com.bespalov.usingvideoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private String TEST_URL = "https://cv1.pikabu.ru/video/2020/10/02/1601587456298314831_352x640.webm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

    }

    public void StarVideoURL(View view) {
        videoView.setVideoPath(TEST_URL);
        videoView.start();

//        Uri uri = Uri.parse(TEST_URL);
//        videoView.setVideoURI(uri);
//        videoView.start();
    }

    public void starLocalVideo(View view) {
        videoView.setVideoPath("android.resource://" + "com.bespalov.usingvideoapplication" + "/" + R.raw.video);
        videoView.start();
    }
}