package com.sybsccs.administrator.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etResult;
    TextView txtmsg;
    
    Button btnAC, btnClear,btnDiv,btnper,btn7,btn8,btn9
            ,btn4,btn5,btn6,btn1,btn2,btn3,btn0,btnDot,btnEquals,btnAdd,btnSub,btnMul;
    float a, b,c ,d;

    boolean Add, Sub, Mul, Div ,Per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnper = (Button) findViewById(R.id.btnper);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn0 = (Button) findViewById(R.id.btn0);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        etResult=(EditText)findViewById(R.id.etResult);
        txtmsg=(TextView) findViewById(R.id.txtmsg);

        
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "1");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "0");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "6");
            }
        });btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(etResult.getText() + "");
                Add = true ;
                etResult.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(etResult.getText() + "");
                Sub = true ;
                etResult.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(etResult.getText() + "");
                Mul = true ;
                etResult.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(etResult.getText() + "");
                Div = true;
                etResult.setText(null);
            }
        });

        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(etResult.getText() + "");
                Per = true;
                etResult.setText(null);
            }
        });


        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Float.parseFloat(etResult.getText() + "");

                if (Add == true) {
                    etResult.setText(a + b + "");
                    Add = false;
                }

                if (Sub == true) {
                    etResult.setText(a - b + "");
                    Sub = false;
                }

                if (Mul == true) {
                    etResult.setText(a * b + "");
                    Mul = false;
                }

                if (Div == true) {
                    etResult.setText(a / b + "");
                    Div = false;
                }
                if(Per ==true){
                    etResult.setText(a%b +"");
                    Per= false;

                }
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + ".");
            }
        });
    }
}


