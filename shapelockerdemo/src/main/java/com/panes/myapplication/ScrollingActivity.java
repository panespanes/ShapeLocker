package com.panes.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.panes.shapelocker.view.ShapeLocker;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp);
        ShapeLocker sl = (ShapeLocker) findViewById(R.id.sl);
        sl.loadLightTheme();
    }

}
