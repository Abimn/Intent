package com.blogspot.abimcode.dicodingintent;

import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPindah;
    private Button PindahAcivityData;
    private Button btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = (Button) findViewById(R.id.pindahButton);
        btnPindah.setOnClickListener(this);
        PindahAcivityData = (Button) findViewById(R.id.pindahActivityData);
        PindahAcivityData.setOnClickListener(this);
        btnDialNumber = (Button) findViewById(R.id.btnDialNumber);
        btnDialNumber.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pindahButton:
                Intent intent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(intent);
                break;
            case R.id.pindahActivityData:
                Intent move = new Intent(MainActivity.this, PindahActivityDataActivity.class);
                move.putExtra(PindahActivityDataActivity.EXTRA_NAME, "abi");
                move.putExtra(PindahActivityDataActivity.EXTRA_AGE, "5");
                startActivity(move);
                break;
            case R.id.btnDialNumber:
                String number = "085809914368";
                Intent dial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                startActivity(dial);
                break;
        }

    }

}
