package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView tv;
    EditText ed1;
    EditText ed2;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=ed1.getText().toString();
                Float no1=Float.parseFloat(num1);
                String num2=ed2.getText().toString();
                Float no2=Float.parseFloat(num2);

                float sum=no1+no2;
                Toast.makeText(getApplicationContext(),"ADDITION : "+sum,Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=ed1.getText().toString();
                Float no1=Float.parseFloat(num1);
                String num2=ed2.getText().toString();
                Float no2=Float.parseFloat(num2);

                float sub=no1-no2;
                Toast.makeText(getApplicationContext(),"SUBTRACTION : "+sub,Toast.LENGTH_LONG).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=ed1.getText().toString();
                Float no1=Float.parseFloat(num1);
                String num2=ed2.getText().toString();
                Float no2=Float.parseFloat(num2);

                if(no2!=0)
                {
                    float div=no1/no2;
                    Toast.makeText(getApplicationContext(),"DIVISION : "+div,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"PLEASE CHECK THE NUMBER... ",Toast.LENGTH_LONG).show();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=ed1.getText().toString();
                Float no1=Float.parseFloat(num1);
                String num2=ed2.getText().toString();
                Float no2=Float.parseFloat(num2);

                float mul=no1*no2;
                Toast.makeText(getApplicationContext(),"MULTIPLICATION : "+mul,Toast.LENGTH_LONG).show();
            }
        });
    }
}
