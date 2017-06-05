package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Button button = (Bu)
    }
    public void getName (View victorillo)

    {
        Toast.makeText(this, "This button works", Toast.LENGTH_LONG).show();
    }
    public void testMethod (View victoriyo)

    {
        Toast.makeText(this, "This button does not work", Toast.LENGTH_LONG).show();
    }
}
