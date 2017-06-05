package org.palmdigital.hi_low;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view)
    {

        TextView check = (TextView) findViewById(R.id.textViewCheck);

        EditText guess = (EditText) findViewById(R.id.editText_guess);
        String guess_1 = guess.getText().toString();
        Random myRandom = new Random();
        for (int i = 0; i < 15; i++)
        {
            int answer = myRandom;
            if (guess_1 == answer)
            {
                check.setText("You have won the game");
                System.exit(0);
            }
            else if (guess > answer)
            {
                check.setText("Too High!");
            }
            else
            {
                check.setText("Too Low");
            }
        }
        check.setText("You Lost");
    }
}
