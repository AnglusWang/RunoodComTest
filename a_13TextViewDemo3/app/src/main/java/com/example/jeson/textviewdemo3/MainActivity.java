package com.example.jeson.textviewdemo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private TextView pt_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

//        TextView tv = (TextView) findViewById(R.id.web_tv);
//        String str = "<font color='blue'><b>百度一下，你就知道~：</b></font><br>";
//        str += "<a href = 'http://www.baidu.com'>百度</a>";
//        tv.setText(Html.fromHtml(str));
//        tv.setMovementMethod(LinkMovementMethod.getInstance());
//
//        pt_tv = (TextView) findViewById(R.id.pt_tv);
//        Drawable[] drawable = pt_tv.getCompoundDrawables();
//
//        // 数组下表0~3,依次是:左上右下
//        drawable[1].setBounds(100, 0, 200, 200);
//        pt_tv.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
//                drawable[3]);
    }
}
