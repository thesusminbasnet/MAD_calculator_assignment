package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText inpu1,inpu2,res;
    Button a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inpu1 = findViewById(R.id.input1);
        inpu2 = findViewById(R.id.input2);
        res = findViewById(R.id.result);
        a = findViewById(R.id.add);
        b = findViewById(R.id.sub);
        c = findViewById(R.id.mul);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = convertStringToText(inpu1.getText().toString());
                int number2 = convertStringToText(inpu2.getText().toString());
                int resu = addTwo(number1,number2);
                res.setText(Integer.toString(resu));

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = convertStringToText(inpu1.getText().toString());
                int number2 = convertStringToText(inpu2.getText().toString());
                int resu = subtractTwo(number1,number2);
                res.setText(Integer.toString(resu));

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = convertStringToText(inpu1.getText().toString());
                int number2 = convertStringToText(inpu2.getText().toString());
                int resu = multiply(number1,number2);
                res.setText(Integer.toString(resu));
            }
        });



    }
    int addTwo(int a, int b){

        int t = a+b;
        return t;
    }
    int multiply( int a, int b){
        int t = a*b;
        return t;
    }

    int convertStringToText(String value)
    {
        return Integer.parseInt(value);
    }

    int subtractTwo(int a, int b)
    {
        int bgNum =0;
        int smNum = 0;
        if(a>b){
            bgNum =a;
            smNum =b;
        }
        else
        {
            bgNum =b;
            smNum =a;
        }
        return bgNum-smNum;
    }
}