package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView resultView;
    EditText firstNumber, secondNumber;
    Button add, sub, multi, div, mod;

    double result;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = findViewById(R.id.resultField);

        add = findViewById(R.id.addButton);
        sub = findViewById(R.id.subButton);
        multi = findViewById(R.id.mulButton);
        div = findViewById(R.id.divButton);
        mod = findViewById(R.id.modButton);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result = num1 + num2;

                resultView.setText(String.valueOf(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result = num1 - num2;

                resultView.setText(String.valueOf(result));
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result = num1 * num2;

                resultView.setText(String.valueOf(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result = num1 / num2;

                resultView.setText(String.valueOf(result));
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result = num1 % num2;

                resultView.setText(String.valueOf(result));
            }
        });
    }
}
