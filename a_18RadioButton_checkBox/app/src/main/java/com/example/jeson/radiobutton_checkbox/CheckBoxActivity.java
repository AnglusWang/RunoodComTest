package com.example.jeson.radiobutton_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends Activity
        implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener {

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private Button bt_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        init();
    }

    private void init() {
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        bt_send = (Button) findViewById(R.id.bt_send);


        checkbox1.setOnCheckedChangeListener(this);
        checkbox2.setOnCheckedChangeListener(this);
        checkbox3.setOnCheckedChangeListener(this);
        bt_send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String choose = "";
        if(checkbox1.isChecked())
            choose += checkbox1.getText().toString() + " ";
        if(checkbox2.isChecked())
            choose += checkbox2.getText().toString() + " ";
        if(checkbox3.isChecked())
            choose += checkbox3.getText().toString() + " ";
        Toast.makeText(this,choose,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.isChecked()) {
            Toast.makeText(this, buttonView.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
