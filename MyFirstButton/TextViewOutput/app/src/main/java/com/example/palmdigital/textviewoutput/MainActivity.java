package com.example.palmdigital.textviewoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView TextViewDisplayTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ImageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView ImageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView ImageViewNum3 = (ImageView) findViewById(R.id.imageView3);

        TextViewDisplayTop = (TextView)findViewById(R.id.textView);

        ImageViewNum1.setOnClickListener(this);
        ImageViewNum1.setOnClickListener(this);
        ImageViewNum1.setOnClickListener(this);


    }

    public void onClick(View view) {

        if (view.getId() == R.id.imageView)
        {
            TextViewDisplayTop.setText("1");
        }

        else if (view.getId() == R.id.imageView2)
        {
            TextViewDisplayTop.setText("2");
        }
        else
        {
            TextViewDisplayTop.setText("3");
        }
    }
}
