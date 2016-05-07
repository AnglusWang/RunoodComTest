package com.example.jeson.radiobutton_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radiobt = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(), "按钮发生变化，你选择了："+radiobt.getText(), Toast.LENGTH_SHORT).show();
            }
        });
            //方法二：
        Button button = (Button) findViewById(R.id.bt_post);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radio_group);
                //getChildCount()获得按钮组中的单选按钮的数目
                for (int i = 0; i < radiogroup.getChildCount(); i++) {
                    //getChildAt(i):根据索引值获取我们的单选按钮
                    RadioButton radiobt = (RadioButton) radiogroup.getChildAt(i);
                    //isChecked( ):判断按钮是否选中
                    if (radiobt.isChecked()) {
                        Toast.makeText(getApplicationContext(), "点击了提交按钮，你选的是：" + radiobt.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}
