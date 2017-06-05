package com.example.palmdigital.chooseyourownadvendire01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WakeUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        TextView textView_story = (TextView) findViewById(R.id.textViewstory);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
    }
}
