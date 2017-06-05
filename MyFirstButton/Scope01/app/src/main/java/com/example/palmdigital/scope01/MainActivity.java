package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside the class
// we are outside any methods



// Understanding how scope works is important
public class MainActivity extends AppCompatActivity
{
    // in the Main activity class not in the methods
    int myInt;// this is declaring a variable of datatype int called myInt
    double myDouble;// this is declaring a variable of datatype double called myDouble
    TextView TextView_story;// this is declaring a variable of datatype textview called TextView_story
    ImageView ImageView_example;//
    int myInt2;
   String myString = "fgf";

    double enemyHealth;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inside the oncreate method and mainactivity clas

        // when we declare or define a variable use this format
        //datatype variableName



        enemyHealth = 7.888888888888888888888666666666666666666667874787646665374654612345678900987654323456788765432345678765432456787654323456787654323456787654323456;


        //asigning a value to a declared variable
        //after we declare a variable we can asign a value
        //variableName = someValueOfTheSameDataTypeAsTheVariable

        myInt = 1;
        myDouble = 2.3;
        TextView_story =  (TextView) findViewById(R.id.textView_story);
        ImageView_example = (ImageView) findViewById(R.id.imageViewexample);

       ;

        /// !!!!!!!!!!!!!!!!! Whevever you declare a variable only that method can see the variable
    }// end of onCreate method


    public  void myMethod()
    {
        enemyHealth = 8009.88888;
        }
    public  void extraMethod()
    {
        enemyHealth = 809.88888;
    }
}// end class
