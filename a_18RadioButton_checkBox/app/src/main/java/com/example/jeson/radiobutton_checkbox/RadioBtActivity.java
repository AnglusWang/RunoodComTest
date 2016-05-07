package com.example.jeson.radiobutton_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioBtActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button);

        //获取RadioButton选择的值
            //方法一：
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radiobt = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(), "按钮发生变化，你选择了："+radiobt.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
