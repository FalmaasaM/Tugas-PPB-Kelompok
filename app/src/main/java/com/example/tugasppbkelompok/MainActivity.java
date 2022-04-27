package com.example.tugasppbkelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void keView(View view) {
        setContentView(R.layout.view_kelompok);
    }

    public void keKeluar(View view) {
        finish();
        System.exit(0);
    }

    public void keMenu(View view) {
        setContentView(R.layout.activity_main);
    }

}