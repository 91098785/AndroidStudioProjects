package com.example.palmdigital.simplecalc02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView_0;
    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;
    ImageView imageView_4;
    ImageView imageView_5;
    ImageView imageView_6;
    ImageView imageView_7;
    ImageView imageView_8;
    ImageView imageView_9;
    ImageView imageView_plus;
    ImageView imageView_minus;
    ImageView imageView_zero;
    ImageView imageView_one;
    ImageView imageView_two;
    ImageView imageView_three;
    ImageView imageView_four;
    ImageView imageView_five;
    ImageView imageView_six;
    ImageView imageView_seven;
    ImageView imageView_eight;
    ImageView imageView_nine;
    ImageView imageView_equals;

    TextView textViewtop;
    TextView textViewmiddle;
    TextView textViewbottom;

    int operator;
    int num1, num2;
    int solved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_0 = (ImageView)findViewById(R.id.imageView0);
        imageView_1 = (ImageView)findViewById(R.id.imageView1);
        imageView_2 = (ImageView)findViewById(R.id.imageView2);
        imageView_3 = (ImageView)findViewById(R.id.imageView3);
        imageView_4 = (ImageView)findViewById(R.id.imageView4);
        imageView_5 = (ImageView)findViewById(R.id.imageView5);
        imageView_6 = (ImageView)findViewById(R.id.imageView6);
        imageView_7 = (ImageView)findViewById(R.id.imageView7);
        imageView_8 = (ImageView)findViewById(R.id.imageView8);
        imageView_9 = (ImageView)findViewById(R.id.imageView9);
        imageView_plus = (ImageView)findViewById(R.id.imageViewplus);
        imageView_minus = (ImageView)findViewById(R.id.imageViewminus);
        imageView_zero = (ImageView)findViewById(R.id.imageViewzero);
        imageView_one = (ImageView)findViewById(R.id.imageViewone);
        imageView_two = (ImageView)findViewById(R.id.imageViewtwo);
        imageView_three = (ImageView)findViewById(R.id.imageViewthree);
        imageView_four = (ImageView)findViewById(R.id.imageViewfour);
        imageView_five = (ImageView)findViewById(R.id.imageViewfive);
        imageView_six = (ImageView)findViewById(R.id.imageViewsix);
        imageView_seven = (ImageView)findViewById(R.id.imageViewseven);
        imageView_eight = (ImageView)findViewById(R.id.imageVieweight);
        imageView_nine = (ImageView)findViewById(R.id.imageViewnine);
        imageView_equals = (ImageView)findViewById(R.id.imageViewequals);

        imageView_0.setOnClickListener(this);
        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_7.setOnClickListener(this);
        imageView_8.setOnClickListener(this);
        imageView_9.setOnClickListener(this);
        imageView_plus.setOnClickListener(this);
        imageView_minus.setOnClickListener(this);
        imageView_zero.setOnClickListener(this);
        imageView_one.setOnClickListener(this);
        imageView_two.setOnClickListener(this);
        imageView_three.setOnClickListener(this);
        imageView_four.setOnClickListener(this);
        imageView_five.setOnClickListener(this);
        imageView_six.setOnClickListener(this);
        imageView_seven.setOnClickListener(this);
        imageView_eight.setOnClickListener(this);
        imageView_nine.setOnClickListener(this);
        imageView_equals.setOnClickListener(this);

        textViewtop = (TextView)findViewById(R.id.textViewtop);
        textViewmiddle = (TextView)findViewById(R.id.textViewmiddle);
        textViewbottom = (TextView)findViewById(R.id.textViewbottom);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            textViewtop.setText("1");
            num1 = 1;

        }
        else if (view.getId() == R.id.imageView2)
        {
            textViewtop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewtop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewtop.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewtop.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewtop.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewtop.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textViewtop.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView9)
        {
            textViewtop.setText("9");
            num1 = 9;
        }
        else if (view.getId() == R.id.imageView0)
        {
            textViewtop.setText("0");
            num1 = 0;
        }
        if (view.getId() == R.id.imageViewone)
        {
            textViewmiddle.setText("1");
            num2 = 1;

        }
        else if (view.getId() == R.id.imageViewtwo)
        {
            textViewmiddle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageViewthree)
        {
            textViewmiddle.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageViewfour)
        {
            textViewmiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageViewfive)
        {
            textViewmiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageViewsix)
        {
            textViewmiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageViewseven)
        {
            textViewmiddle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageVieweight)
        {
            textViewmiddle.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageViewnine)
        {
            textViewmiddle.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageViewzero)
        {
            textViewmiddle.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageViewminus)
        {
            imageView_minus.setBackgroundColor(0xff00ffff);
            imageView_plus.setBackgroundColor(0);
            operator = 1;

        }
        else  if  (view.getId() == R.id.imageViewplus)
            {
                imageView_plus.setBackgroundColor(0xff00ffff);
                imageView_minus.setBackgroundColor(0);
                 solved = num1 + num2;
                operator = 0;
            }
            else  if  (view.getId() == R.id.imageViewequals)
            {
                if (operator ==0)
                {
                    solved = num1 + num2;
                }
           else  if (operator ==1)
                {
                    solved = num1 - num2;
                }
                textViewbottom.setText("" + solved);
            }
         }

    public void switchBackground( int operator)
    {
        if (operator == 0)
        {
            imageView_plus.setBackgroundColor(0xff00ffff);
            imageView_minus.setBackgroundColor(0);
        }
        else if (operator == 1)
        {
            imageView_minus.setBackgroundColor(0xff00ffff);
            imageView_plus.setBackgroundColor(0);
        }
    }
    }