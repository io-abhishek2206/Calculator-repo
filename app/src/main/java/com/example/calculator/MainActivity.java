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
                String firstInput = etFirstValue.getText().toString().trim();
                String secondInput = etSecondValue.getText().toString().trim();
                int Sum = 0;
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    tvAns.setText("Please enter the number");
                } else {
                    int N1 = Integer.parseInt(firstInput);
                    int N2 = Integer.parseInt(secondInput);
                    if (N1 > 100000000 || N2 > 100000000 || N1 < -100000000 || N2 < -100000000) {
                        tvAns.setText("Undifined Value");
                    } else {
                        Sum = N1 + N2;
                        tvAns.setText("" + Sum);
                    }
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = etFirstValue.getText().toString().trim();
                String secondInput = etSecondValue.getText().toString().trim();
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    tvAns.setText("Please enter the number");
                }
                else {
                    int N1 = Integer.parseInt(firstInput);
                    int N2 = Integer.parseInt(secondInput);
                    int Subtract = 0 ;
                    if (N1 > 100000000 || N2 > 100000000 || N1 < -100000000 || N2 < -100000000) {
                        tvAns.setText("Undifined Value");
                    } else {
                        Subtract = N1 - N2;
                        tvAns.setText("" + Subtract);
                    }
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = etFirstValue.getText().toString().trim();
                String secondInput = etSecondValue.getText().toString().trim();
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    tvAns.setText("Please enter the number");
                }
                else {
                    int N1 = Integer.parseInt(firstInput);
                    int N2 = Integer.parseInt(secondInput);
                    int Mul = 0;
                    if (N1 > 10000000 || N2 > 10000000 || N1 < -10000000 || N2 < -10000000) {
                        tvAns.setText("Undifined Value");
                    } else {
                        Mul = N1 * N2;
                        tvAns.setText("" + Mul);
                    }
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = etFirstValue.getText().toString().trim();
                String secondInput = etSecondValue.getText().toString().trim();
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    tvAns.setText("Please enter the number");
                }
                else {
                    float N1 = Integer.parseInt(firstInput);
                    float N2 = Integer.parseInt(secondInput);
                    float Divide = 0;
                    if (N2 != 0) {
                        Divide = N1 / N2;
                        tvAns.setText("" + Divide);
                    } else {
                        tvAns.setText("Cannot divide by zero");
                    }
                }
            }
        });
    }
}