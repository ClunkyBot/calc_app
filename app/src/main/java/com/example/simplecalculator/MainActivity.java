package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView results;
    EditText number1,number2;
    Button add, subtract, multiply, divide, cntn, clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        results=findViewById(R.id.textView);
        number1=findViewById(R.id.editText1);
        number2=findViewById(R.id.editText2);
        add=findViewById(R.id.btn1);
        subtract=findViewById(R.id.btn2);
        multiply=findViewById(R.id.btn3);
        divide=findViewById(R.id.btn4);
        cntn=findViewById(R.id.btn5);
        clr=findViewById(R.id.btn6);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(number1.getText().toString().isEmpty()|| number2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    float number1Int, number2Int;
                    number1Int=Float.parseFloat(number1.getText().toString());
                    number2Int=Float.parseFloat(number2.getText().toString());

                    results.setText(""+(number1Int+number2Int));
                }

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    float number1Int, number2Int;
                    number1Int = Float.parseFloat(number1.getText().toString());
                    number2Int = Float.parseFloat(number2.getText().toString());

                    results.setText("" + (number1Int - number2Int));
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                    } else {
                        float number1Int, number2Int;
                        number1Int = Float.parseFloat(number1.getText().toString());
                        number2Int = Float.parseFloat(number2.getText().toString());

                        results.setText("" + (number1Int * number2Int));
                    }
                }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    float number1Int, number2Int;
                    number1Int = Float.parseFloat(number1.getText().toString());
                    number2Int = Float.parseFloat(number2.getText().toString());

                    results.setText("" + (number1Int / number2Int));
                }
            }
        });
        cntn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Fields are Empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (results.getText().toString().isEmpty())
                    {
                        Toast.makeText(MainActivity.this, "No result to continue calculation", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        float carryover= Float.parseFloat(results.getText().toString());
                        number1.setText(""+carryover);
                        number2.setText("");
                    }
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                results.setText("Result");
            }
        });
    }
}