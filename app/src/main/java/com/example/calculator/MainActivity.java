package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue , etSecondValue ;
    TextView tvAns ;
    Button add , subtract , multiply , divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int N1 , N2 , Sum ;
                N1 = Integer.parseInt(etFirstValue.getText().toString());
                N2 = Integer.parseInt(etSecondValue.getText().toString());
                Sum = N1 + N2 ;
                tvAns.setText(""+Sum);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int N1 , N2 , Subtract ;
                N1 = Integer.parseInt(etFirstValue.getText().toString());
                N2 = Integer.parseInt(etSecondValue.getText().toString());
                Subtract = N1 - N2 ;
                tvAns.setText(""+Subtract);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int N1 , N2 , Mul ;
                N1 = Integer.parseInt(etFirstValue.getText().toString());
                N2 = Integer.parseInt(etSecondValue.getText().toString());
                Mul = N1 * N2 ;
                tvAns.setText(""+Mul);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float N1 , N2 ;
                float Divide ;
                N1 = Integer.parseInt(etFirstValue.getText().toString());
                N2 = Integer.parseInt(etSecondValue.getText().toString());
                if (N2 != 0) {
                    Divide = N1 / N2;
                    tvAns.setText(""+Divide);
                } else {
                    tvAns.setText("Cannot divide by zero");
                }
            }
        });
    }
}