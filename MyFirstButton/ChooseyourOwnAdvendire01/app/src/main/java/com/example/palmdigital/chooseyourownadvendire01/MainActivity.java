package com.example.palmdigital.chooseyourownadvendire01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonLeft;
    Button buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView_story = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        buttonLeft = (Button) findViewById(R.id.button_left);
        buttonRight = (Button) findViewById(R.id.button_right);

        buttonLeft.setText("Wake Up");
        buttonRight.setText("Explore");

        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this,WakeUpActivty.class);
            startActivity(i);
        }
        if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
        }
    }
    // end od onCreate method

} // end of class
