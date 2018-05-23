package com.example.justina.peticija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* mygtukas visos peticijos*/

public class NewActivity4 extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new4);

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(NewActivity4.this, NewActivity8.class);
                startActivity(intentLoadNewActivity);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button1 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(NewActivity4.this, NewActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(NewActivity4.this, NewActivity9.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
