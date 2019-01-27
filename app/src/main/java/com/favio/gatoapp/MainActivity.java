package com.favio.gatoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnJugar, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    boolean turno=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJugar=findViewById(R.id.btnJugar);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);

                btn1.setText(" ");
                btn2.setText(" ");
                btn3.setText(" ");
                btn4.setText(" ");
                btn5.setText(" ");
                btn6.setText(" ");
                btn7.setText(" ");
                btn8.setText(" ");
                btn9.setText(" ");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn1.setText("X");
                    turno=true;
                    btn1.setEnabled(false);
                }else{
                    btn1.setText("O");
                    turno=false;
                    btn1.setEnabled(false);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn2.setText("X");
                    turno=true;
                    btn2.setEnabled(false);
                }else{
                    btn2.setText("O");
                    turno=false;
                    btn2.setEnabled(false);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn3.setText("X");
                    turno=true;
                    btn3.setEnabled(false);
                }else{
                    btn3.setText("O");
                    turno=false;
                    btn3.setEnabled(false);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn4.setText("X");
                    turno=true;
                    btn4.setEnabled(false);
                }else{
                    btn4.setText("O");
                    turno=false;
                    btn4.setEnabled(false);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn5.setText("X");
                    turno=true;
                    btn5.setEnabled(false);
                }else{
                    btn5.setText("O");
                    turno=false;
                    btn5.setEnabled(false);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn6.setText("X");
                    turno=true;
                    btn6.setEnabled(false);
                }else{
                    btn6.setText("O");
                    turno=false;
                    btn6.setEnabled(false);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn7.setText("X");
                    turno=true;
                    btn7.setEnabled(false);
                }else{
                    btn7.setText("O");
                    turno=false;
                    btn7.setEnabled(false);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn8.setText("X");
                    turno=true;
                    btn8.setEnabled(false);
                }else{
                    btn8.setText("O");
                    turno=false;
                    btn8.setEnabled(false);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(turno == false){
                    btn9.setText("X");
                    turno=true;
                    btn9.setEnabled(false);
                }else{
                    btn9.setText("O");
                    turno=false;
                    btn9.setEnabled(false);
                }
            }
        });

    }

}
