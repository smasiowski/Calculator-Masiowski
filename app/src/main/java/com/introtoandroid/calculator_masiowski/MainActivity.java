package com.introtoandroid.calculator_masiowski;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    int value = 0;
    int num = 0;
    int previous;

    String txt = "";
    String operation = "null";

    TextView output;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;

    Button decimal;
    Button negate;

    Button add;
    Button multiply;
    Button subtract;
    Button divide;
    Button modulo;

    Button equals;
    Button clear;
    Button clearAll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        output = (TextView) findViewById(R.id.textView);

         button1 = (Button) findViewById(R.id.button1);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);
         button0 = (Button) findViewById(R.id.button0);

         decimal = (Button) findViewById(R.id.decimal);
         negate = (Button) findViewById(R.id.negate);

         add = (Button) findViewById(R.id.add);
         multiply = (Button) findViewById(R.id.multiply);
         subtract = (Button) findViewById(R.id.subtract);
         divide = (Button) findViewById(R.id.divide);
         modulo = (Button) findViewById(R.id.modulo);

         equals = (Button) findViewById(R.id.equals);
         clear = (Button) findViewById(R.id.clear);
         clearAll  = (Button) findViewById(R.id.clearAll);




    }

    // ONCLICK--------------------------------------------------------------------------------------
    public void onClick(View view) {


        // NUMBER BUTTONS---------------------------------------------------------------------------
        if (view == button1) {
            txt += "1";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button2) {
            txt += "2";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button3) {
            txt += "3";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button4) {
            txt += "4";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button5) {
            txt += "5";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button6) {
            txt += "6";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button7) {
            txt += "7";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button8) {
            txt += "8";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button9) {
            txt += "9";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }
        else if (view == button0) {
            txt += "0";
            output.setText(txt);
            num = Integer.parseInt(txt);
        }




        // MATH BUTTONS-----------------------------------------------------------------------------

        else if (view == add){
            num = Integer.parseInt(txt);
            txt = "";

            calculate();

            previous=num;
            operation="add";
            txt = "";
        }

        else if (view == subtract) {

            num = Integer.parseInt(txt);
            txt = "";

           calculate();

            previous=num;
            operation="subtract";
            txt = "";

        } else if (view == multiply) {
            num = Integer.parseInt(txt);
            txt = "";

            calculate();

            previous=num;
            operation="multiply";
            txt = "";
        }

        else if (view == divide) {
            num = Integer.parseInt(txt);
            txt = "";

            calculate();

            previous=num;
            operation="divide";
            txt = "";
        }

        else if (view == negate) {
            num = Integer.parseInt(txt);
            txt = "";
            int x = -1;

            value = num * x;
            //   System.out.println();
            output.setText(Integer.toString(value));

            System.out.println("VALUE: " + value);

            txt = (Integer.toString(value));
            num = value;


        }


        // OPERATIONS-------------------------------------------------------------------------------

        else if (view == clear) {

            txt = "";
            output.setText(txt);

        }
        else if (view == clearAll) {
            txt = "";
            value = 0;
            num = 0;
            previous = 0;
            operation = "null";
            output.setText(txt);
        }

        else if (view == equals) {
            calculate();
            operation = "null";
            previous=num;

        }

    }




    // CALCULATE------------------------------------------------------------------------------------
    public void calculate(){

        System.out.println("NUM: " + num);
        System.out.println("PREVIOUS: " + previous);


        if(operation == "subtract"){

                value = previous - num;
             //   System.out.println();
                output.setText(Integer.toString(value));

                System.out.println("VALUE: " + value);

                txt = (Integer.toString(value));
                num = value;


            }

        if(operation == "add"){

            value = previous + num;
            //   System.out.println();
            output.setText(Integer.toString(value));

            System.out.println("VALUE: " + value);

            txt = (Integer.toString(value));
            num = value;


        }
        if(operation == "multiply"){

            value = previous * num;

            output.setText(Integer.toString(value));

            System.out.println("VALUE: " + value);

            txt = (Integer.toString(value));
            num = value;

        }
        if(operation == "divide"){

            value = previous / num;
            //   System.out.println();
            output.setText(Integer.toString(value));

            System.out.println("VALUE: " + value);

            txt = (Integer.toString(value));
            num = value;


        }

    }

    //SAVE STATE------------------------------------------------------------------------------------

    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putCharSequence("view", output.getText());

    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        output.setText(savedInstanceState.getCharSequence("view"));
    }


}
