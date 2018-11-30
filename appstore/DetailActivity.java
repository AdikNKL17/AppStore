package com.majesthink.adik.appstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.app_name);

        String APP_NAME = getIntent().getStringExtra("APP_NAME");

        textView.setText(APP_NAME);
    }
}
