package com.example.rafiar.aplikasiintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrowserSendiriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_sendiri);
    }

    public void tutup(View view){
        finish();
    }
}
