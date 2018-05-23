package com.example.justina.peticija;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/* mygtukas taisykles */
public class NewActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
