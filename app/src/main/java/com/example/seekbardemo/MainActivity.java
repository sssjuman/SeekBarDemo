package com.example.seekbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_text;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_text = (TextView) findViewById(R.id.tv_text);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_text.setTextSize(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                String size = "Start size: " + seekBar.getProgress();    //呼叫getProgress()取得對應的值
                Toast.makeText(MainActivity.this, size, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                String size = "Stop size: " + seekBar.getProgress();
                Toast.makeText(MainActivity.this, size, Toast.LENGTH_SHORT).show();

            }
        });
    }
}