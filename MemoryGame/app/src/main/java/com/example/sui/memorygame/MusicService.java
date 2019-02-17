package com.example.sui.memorygame;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class MusicService extends Service {

    private static String TAG = "MusicService";
    private MediaPlayer mPlayer;

    @Override
    public void onCreate() {

        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ocean_music);
        mPlayer.setLooping(true);
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {

        mPlayer.start();
        super.onStart(intent, startId);
    }
    @Override
    public void onDestroy() {

        mPlayer.stop();
        super.onDestroy();
    }
    // genom onBindService funktion to meddela Service
    @Override
    public IBinder onBind(Intent intent) {

        mPlayer.start();
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {

        mPlayer.stop();
        return super.onUnbind(intent);
    }

}
