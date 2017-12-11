package com.example.rafiar.aplikasiintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bukaKalkulator(View view){
        Intent intentku = new Intent(getBaseContext(),KalkulatorActivity.class);
        startActivityForResult(intentku,0);
    }

    public void bukaBukuTamu(View view){
        Intent intentku = new Intent(getBaseContext(),BukuTamuActivity.class);
        startActivityForResult(intentku,0);
    }

    public void bukaYoutube(View view){
        Intent intentku = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"));
        startActivity(intentku);
    }

    public void bukaBrowserSendiri(View view){
        Intent intentku = new Intent(getBaseContext(),BrowserSendiriActivity.class);
        startActivityForResult(intentku,0);
    }
}
