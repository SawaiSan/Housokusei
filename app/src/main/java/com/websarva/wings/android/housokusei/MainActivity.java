package com.websarva.wings.android.housokusei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_answer1 = findViewById(R.id.bt_answer1);
        HelloListener listener= new HelloListener();
        bt_answer1.setOnClickListener(listener);

        Button bt_answer2 = findViewById(R.id.bt_answer2);
        HelloListener listener2= new HelloListener();
        bt_answer2.setOnClickListener(listener);
    }
    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            int id = view.getId();
            switch(id) {
                case R. id.bt_answer1:
                    String inputStr = input.getText().toString();
                    output.setText("正解！");
                    break;

                case R.id.bt_answer2:
                    output.setText("不正解！");
                    break;

            }
        }

    }
}