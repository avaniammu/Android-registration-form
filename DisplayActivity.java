package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView age = (TextView) findViewById(R.id.ageValue);
        TextView gender = (TextView) findViewById(R.id.genderValue);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("gender"));



    }
}
