package com.example.jeson.framelayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.myLayout);
        final PhotoView photo = new PhotoView(MainActivity.this);
        photo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //设置图片显示的位置
                photo.bitmapX = event.getX() - 240;
                photo.bitmapY = event.getY() - 240;
                //调用重绘方法
                photo.invalidate();
                return true;
            }
        });
        frameLayout.addView(photo);
    }
}
