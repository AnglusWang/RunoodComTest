package com.example.jeson.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

    private Button bt_one, bt_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_one = (Button) findViewById(R.id.btnOne);
        bt_two = (Button) findViewById(R.id.btnTwo);
        bt_one.setEnabled(false);
        bt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt_two.getText().toString().equals("按钮不可用")){
                    bt_one.setEnabled(true);
                    bt_two.setText("按钮可用");
                }else{
                    bt_one.setEnabled(false);
                    bt_two.setText("按钮不可用");
                }
            }
        });
    }
}
