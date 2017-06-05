package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity
{
String story;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("STORY_FIRST_PART");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("STORY_FIRST_PART");
        }




    }
    public void next02 (View view)
    {
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nat02 = (EditText) findViewById(R.id.edit_text_nat02);
        EditText et_name03 = (EditText) findViewById(R.id.edit_text_name03);
        EditText et_noun04 = (EditText) findViewById(R.id.edit_text_noun04);
        EditText et_adj05 = (EditText) findViewById(R.id.edit_text_adj05);
        EditText et_noun06 = (EditText) findViewById(R.id.edit_text_noun06);

        String str_adj01 = et_adj01.getText().toString();
        String str_nat02 = et_nat02.getText().toString();
        String str_name03 = et_name03.getText().toString();
        String str_noun04 = et_noun04.getText().toString();
        String str_adj05 = et_adj05.getText().toString();
        String str_noun06 = et_noun06.getText().toString();



        String story = "Pizza was invented by a " + str_adj01 + " " + str_nat02 + " chef named " + str_name03 +
                "." + "To make a pizza, you need to take a lump of " + str_noun04 + ", and make a thin, round "
                + str_adj05 + " " + str_noun06;

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("STORY_SECOND_PART", story);



        startActivity(i);
    }
}

