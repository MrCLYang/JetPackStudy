package com.ycl.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class Step1Activity extends AppCompatActivity {

    private Chronometer chronometer;
    private long currenttime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);

    }

    @Override
    protected void onResume() {
        super.onResume();
        chronometer.setBase(SystemClock.elapsedRealtime()-currenttime);
        chronometer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        currenttime = SystemClock.elapsedRealtime() - chronometer.getBase();
        chronometer.stop();
    }
}