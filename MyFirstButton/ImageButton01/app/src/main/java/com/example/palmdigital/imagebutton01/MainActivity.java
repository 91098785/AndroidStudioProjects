package com.example.palmdigital.imagebutton01;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView buttonObject01 = (ImageView)findViewById(R.id.imageView1);
        ImageView buttonObject02 = (ImageView)findViewById(R.id.imageView2);
        ImageView buttonObject03 = (ImageView)findViewById(R.id.imageView3);



        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
        buttonObject03.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1) {
            Log.i("info", "You selected Contacts!");
            Toast.makeText(this, "You selected Contacts!", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.imageView2)
        {
            Log.i("info", "You selected Email!");
            Toast.makeText(this, "You selected Email!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Log.i("info", "You selected Message!");
            Toast.makeText(this, "You selected Messages!", Toast.LENGTH_SHORT).show();

        }
    }
}
