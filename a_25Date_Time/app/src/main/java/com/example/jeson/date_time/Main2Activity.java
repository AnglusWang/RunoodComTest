package com.example.jeson.date_time;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepicker);

        TimePicker my_tp = (TimePicker) findViewById(R.id.my_tp);
        my_tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(Main2Activity.this,
                        "您选择的时间是："+hourOfDay+"时"+minute+"分!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
