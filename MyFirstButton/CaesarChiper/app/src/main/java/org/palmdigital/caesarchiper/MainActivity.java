package org.palmdigital.caesarchiper;

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


        //System.out.println("the unencrypted string is " + myInput);
        //System.out.println("The encrypted string is " + result);

    }

    //    public static void main(String[] args) {
//
//    } // end of main
    //opasly7
    public void encrypt(View view) {
        EditText et_input = (EditText) findViewById(R.id.Message);
        String input = et_input.getText().toString();

        EditText et_shift = (EditText) findViewById(R.id.shift);
        String str_shift = et_shift.getText().toString();
        int shift = Integer.parseInt(str_shift);

        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        String output = "";
        int shiftCharIndex;
        int fixedCharIndex;
        String toUpperCase = input.toUpperCase();
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (toUpperCase.charAt(i) == alphabet[j]) {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26;
                    output = output + alphabet[fixedCharIndex];
                }
            }
            if (input.charAt(i) == ' ') {
                output += " ";
            }
        }
        TextView tv_textView = (TextView) findViewById(R.id.encryptedMessage);
        tv_textView.setText(output);

    }

    public void decrypt(View view) {
        EditText et_input = (EditText) findViewById(R.id.editText);
        String input = et_input.getText().toString();

        EditText et_shift = (EditText) findViewById(R.id.editText2);
        String str_shift = et_shift.getText().toString();
        int shift = Integer.parseInt(str_shift);

        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        String output = "";
        int shiftCharIndex;
        int fixedCharIndex;
        String toUpperCase = input.toUpperCase();
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (toUpperCase.charAt(i) == alphabet[j]) {
                    shiftCharIndex = j - shift;
                    fixedCharIndex = shiftCharIndex % 26;
                    output = output + alphabet[fixedCharIndex];
                }
            }
            if (input.charAt(i) == ' ') {
                output += " ";
            }
        }
        TextView tv_textView2 = (TextView) findViewById(R.id.decryptedMessage);
        tv_textView2.setText(output);
    }
}

