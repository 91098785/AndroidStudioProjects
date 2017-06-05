package com.example.palmdigital.textviewoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;
    ImageView imageView_4;
    ImageView imageView_5;
    ImageView imageView_6;
    ImageView imageView_plus;
    ImageView imageView_equals;




    TextView textView;
    TextView textView2;
    TextView textView3;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView_1 = (ImageView)findViewById(R.id.imageView1);
         imageView_2 = (ImageView)findViewById(R.id.imageView2);
         imageView_3 = (ImageView)findViewById(R.id.imageView3);
        imageView_4 = (ImageView)findViewById(R.id.imageView4);
        imageView_5 = (ImageView)findViewById(R.id.imageView5);
        imageView_6 = (ImageView)findViewById(R.id.imageView6);
        imageView_plus = (ImageView)findViewById(R.id.imageViewplus);
        imageView_equals = (ImageView)findViewById(R.id.imageViewequals);






        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_equals.setOnClickListener(this);



        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
        textView.setText("1");
            num1 = 1;

        }
        else if (view.getId() == R.id.imageView2)
        {
            textView.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textView.setText("3");
            num1 =3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textView2.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textView2.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textView2.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageViewequals)
        {
            int sum = num1 + num2;
            textView3.setText("" + (num1 + num2));
            
        }
    }
}
