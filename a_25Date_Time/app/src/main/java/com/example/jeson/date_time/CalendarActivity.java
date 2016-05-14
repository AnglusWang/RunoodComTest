package com.example.jeson.date_time;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by Jeson on 2016/5/13.
 *
 */
public class CalendarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        final CalendarView my_cv = (CalendarView) findViewById(R.id.my_cv);
        my_cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(CalendarActivity.this,
                        "当前选择的日期是" + year + "年" + month + "月" + dayOfMonth + "日",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
