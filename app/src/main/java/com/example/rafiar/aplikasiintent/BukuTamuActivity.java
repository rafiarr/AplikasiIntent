package com.example.rafiar.aplikasiintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BukuTamuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku_tamu);
    }

    public void tutup(View view){
        finish();
    }
}
