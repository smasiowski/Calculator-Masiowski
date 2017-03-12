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
    String txt = "";
    String expression = "";

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

    // ONCLICK-----------------------------------------------------------------
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




        // MATH BUTTONS----------------------------------------------------------------------------

        if (view == add){
            value = value + num;
            output.setText(Integer.toString(value));
        }
        else if (view == subtract) {
            expression += txt;
            expression += "-";
            txt = "";




            /*
            value = value - num;
            output.setText(Integer.toString(value));*/
        } else if (view == multiply) {
            expression += txt;
            expression += "*";
            txt = "";
            //value = value * num;
            //output.setText(Integer.toString(value));
        } else if (view == divide) {
            value = value / num;
            output.setText(Integer.toString(value));
        }
/*
        else if (view == negate) {
            num = num*(-1);
            output.setText(Double.toString(value));
        }
*/

        // OPERATIONS---------------------------------------------------------------------------

        else if (view == clear) {
            num = 0;
            output.setText(Integer.toString(value));
        } else if (view == clearAll) {
            value = 0;
            output.setText(Integer.toString(value));
        }

        else if (view == equals) {
            expression = "12*2+5/2-1";
            calculate(expression);
        }

    }




    public void add(View view) {
         if (view == add){
            value = value + num;
            output.setText(Integer.toString(value));
        }

    }


    public void calculate(String equation){

        String[] parts = equation.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            double val = Double.parseDouble(parts[i+1]);
            switch (op) {
                case "*" :
                    result *= val;
                    break;
                case "/" :
                    result /= val;
                    break;
                case "-" :
                    result -= val;
                    break;
                case "+" :
                    result += val;
            }
        }
        output.setText(Double.toString(result));


    }


    }

