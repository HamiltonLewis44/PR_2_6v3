package com.mirea.kt.pr_2_6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// DivisionActivity.java


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//Кравцов Андрей РИБО-02-22 Вариант 2
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DivisionActivity";
    private EditText editTextNum1;
    private EditText editTextNum2;
    private Button buttonDivide;
    private TextView textViewResult;
    private TextView textViewStudentInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.edit_text_num1);
        editTextNum2 = findViewById(R.id.edit_text_num2);
        buttonDivide = findViewById(R.id.button_divide);
        textViewResult = findViewById(R.id.text_view_result);
        textViewStudentInfo = findViewById(R.id.text_view_student_info);

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Button clicked");
                try {
                    double num1 = Double.parseDouble(editTextNum1.getText().toString());
                    double num2 = Double.parseDouble(editTextNum2.getText().toString());
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    double result = num1 / num2;
                    textViewResult.setText(String.format("Result: %.2f", result));
                } catch (NumberFormatException e) {
                    Log.e(TAG, "Invalid input", e);
                    textViewResult.setText("Error: Invalid input");
                } catch (ArithmeticException e) {
                    Log.e(TAG, "Division by zero", e);
                    textViewResult.setText("Error: Division by zero");
                }
            }
        });

        textViewStudentInfo.setText("Variant 2, Student: Andrey Kravtsov");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
