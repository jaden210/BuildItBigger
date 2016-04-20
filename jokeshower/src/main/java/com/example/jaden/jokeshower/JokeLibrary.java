package com.example.jaden.jokeshower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_library);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("newjoke");
        TextView textView = (TextView) findViewById(R.id.joke);
        textView.setText(joke);


    }
}
