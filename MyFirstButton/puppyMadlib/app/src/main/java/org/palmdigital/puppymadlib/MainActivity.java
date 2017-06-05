package org.palmdigital.puppymadlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view)
    {
        EditText et_color = (EditText)findViewById(R.id.color1);
        EditText et_adj2 = (EditText)findViewById(R.id.adj2);
        EditText et_adj3 = (EditText)findViewById(R.id.adj3);
        EditText et_adj4 = (EditText)findViewById(R.id.adj4);
        EditText et_body = (EditText)findViewById(R.id.bodypart1);
        EditText et_noun1 = (EditText)findViewById(R.id.noun1);
        EditText et_verb1 = (EditText)findViewById(R.id.verb1);
        EditText et_noun2 = (EditText)findViewById(R.id.noun2);
        EditText et_noun3 = (EditText)findViewById(R.id.noun3);

        TextView tv_story = (TextView)findViewById(R.id.text_view_story);



        String story = "Today I saw him again. When he looks at me with those ";
        String story2 = " eyes, it makes my ";
        String story3 = "go pitterpat, and I feel as if I have ";
        String story4 = " in my stomach. When he scrunches his nose, I want to";
        String story5 = " him softly. He is so ";
        String story6 = " and ";
        String story7 = ". Tomorrow he will be mine. ";
        String str_color = et_color.getText().toString();
        String str_Adj2 = et_adj2.getText().toString();
        String str_Adj3 = et_adj3.getText().toString();
        String str_Adj4 = et_adj4.getText().toString();
        String str_body = et_body.getText().toString();
        String str_noun1 = et_noun1.getText().toString();
        String str_verb1 = et_noun1.getText().toString();
        String str_Noun2 = et_noun2.getText().toString();
        String str_Noun3 = et_noun3.getText().toString();
        story = story + str_color + " "  + story2 + str_body + story3 + str_noun1 + story4  + str_verb1 + story4 +  " " + str_Adj2 + " " + str_Noun2 + "."
                + story5 + str_Adj3 + " sauce, " + str_Adj4 + story6 + str_Noun3 + story7;

        tv_story.setText(story);
    }
}
