package com.example.jeson.textviewdemo3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pt_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pt_tv = (TextView) findViewById(R.id.pt_tv);
        Drawable[] drawable = pt_tv.getCompoundDrawables();

        // 数组下表0~3,依次是:左上右下
        drawable[1].setBounds(100, 0, 200, 200);
        pt_tv.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);
    }
}
