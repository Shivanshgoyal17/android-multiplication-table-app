package com.example.multiplicationtableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    Button button;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(editTextNumber.getText().toString());
                t1.setText(num + " X 1 = " + num);
                t2.setText(num + " X 2 = " + num*2);
                t3.setText(num + " X 3 = " + num*3);
                t4.setText(num + " X 4 = " + num*4);
                t5.setText(num + " X 5 = " + num*5);
                t6.setText(num + " X 6 = " + num*6);
                t7.setText(num + " X 7 = " + num*7);
                t8.setText(num + " X 8 = " + num*8);
                t9.setText(num + " X 9 = " + num*9);
                t10.setText(num + " X 10 = " + num*10);
            }
        });

    }
}