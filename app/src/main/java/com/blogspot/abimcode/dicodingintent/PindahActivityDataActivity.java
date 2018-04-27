package com.blogspot.abimcode.dicodingintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PindahActivityDataActivity extends AppCompatActivity {

    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_NAME = "extra_name";
    private TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_data);
        tvDataReceived = (TextView) findViewById(R.id.tvReceived);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Name : " + name + ", Your Age" +age;
        tvDataReceived.setText(text);



    }
}
