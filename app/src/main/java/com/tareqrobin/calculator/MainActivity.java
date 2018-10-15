package com.tareqrobin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.DoubleBuffer;

public class MainActivity extends AppCompatActivity {
    private Button zero,one,two,three,four,five,six,seven,eight, nine,div,multi,sum,sub,equal,clear;
    private TextView control, result;

    private final char ADDITION='+';
    private final char SUBSTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char EQUAL=0;

    private double val1=Double.NaN;
    private double val2;
    private char ACTION;

    public void calculate(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble((control.getText().toString()));
            switch (ACTION){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBSTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else {
            val1=Double.parseDouble((control.getText().toString()));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero=(Button) findViewById(R.id.btn0);
        one=(Button) findViewById(R.id.btn1);
        two=(Button) findViewById(R.id.btn2);
        three=(Button) findViewById(R.id.btn3);
        four=(Button) findViewById(R.id.btn4);
        five=(Button) findViewById(R.id.btn5);
        six=(Button) findViewById(R.id.btn6);
        seven=(Button) findViewById(R.id.btm7);
        eight=(Button) findViewById(R.id.btn8);
        nine=(Button) findViewById(R.id.btn9);
        div=(Button) findViewById(R.id.btndiv);
        multi=(Button) findViewById(R.id.btnmulti);
        sum=(Button) findViewById(R.id.btnadd);
        sub=(Button) findViewById(R.id.btnsub);
        equal=(Button) findViewById(R.id.btnequ);
        clear=(Button) findViewById(R.id.btnclr);

        control=(TextView) findViewById(R.id.tvcontrol);
        result=(TextView) findViewById(R.id.tvresult);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"9");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1));
                control.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                ACTION=SUBSTRACTION;
                result.setText(String.valueOf(val1));
                control.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1));
                control.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1));
                control.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                result.setText(result.getText().toString()+ACTION+String.valueOf(val2)+"="+String.valueOf(val1));
                ACTION=EQUAL;
                control.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (control.getText().length()>0){
                    CharSequence name=control.getText().toString();
                    control.setText(name.subSequence(0,name.length()-1));
                }
                else {
                    val1=Double.NaN;
                    val2= Double.NaN;
                    control.setText(null);
                    result.setText(null);
                }
            }
        });

    }
}
