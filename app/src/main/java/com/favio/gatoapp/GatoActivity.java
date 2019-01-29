package com.favio.gatoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GatoActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnJugar, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String valorBtn1=" ", valorBtn2=" ", valorBtn3=" ", valorBtn4=" ", valorBtn5=" ", valorBtn6=" ",
            valorBtn7=" ", valorBtn8=" ", valorBtn9=" ";
    TextView txtv_ganador, txtv_victoriasJ1, txtv_victoriasJ2;
    int victoriasJ1=0, victoriasJ2=0;
    boolean turno=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);

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

        txtv_ganador=findViewById(R.id.txtv_ganador);
        txtv_victoriasJ1=findViewById(R.id.txtv_victoriasJ1);
        txtv_victoriasJ2=findViewById(R.id.txtv_victoriasJ2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                turno=false;
                limpiar();
            }
        });

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turno == false){
                    btn1.setText("X");
                    btn1.setTextColor(Color.RED);
                    turno=true;
                    btn1.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn1.setText("O");
                    btn1.setTextColor(Color.BLUE);
                    turno=false;
                    btn1.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn1 = (Button) v;
                valorBtn1 = btn1.getText().toString();
                comparar();

                // Log.d("variable",btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn2.setText("X");
                    btn2.setTextColor(Color.RED);
                    turno=true;
                    btn2.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn2.setText("O");
                    btn2.setTextColor(Color.BLUE);
                    turno=false;
                    btn2.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn2 = (Button) v;
                valorBtn2 = btn2.getText().toString();
                comparar();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn3.setText("X");
                    btn3.setTextColor(Color.RED);
                    turno=true;
                    btn3.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn3.setText("O");
                    btn3.setTextColor(Color.BLUE);
                    turno=false;
                    btn3.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn3 = (Button) v;
                valorBtn3 = btn3.getText().toString();
                comparar();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn4.setText("X");
                    btn4.setTextColor(Color.RED);
                    turno=true;
                    btn4.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn4.setText("O");
                    btn4.setTextColor(Color.BLUE);
                    turno=false;
                    btn4.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn4 = (Button) v;
                valorBtn4 = btn4.getText().toString();
                comparar();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn5.setText("X");
                    btn5.setTextColor(Color.RED);
                    turno=true;
                    btn5.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn5.setText("O");
                    btn5.setTextColor(Color.BLUE);
                    turno=false;
                    btn5.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn5 = (Button) v;
                valorBtn5 = btn5.getText().toString();
                comparar();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn6.setText("X");
                    btn6.setTextColor(Color.RED);
                    turno=true;
                    btn6.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn6.setText("O");
                    btn6.setTextColor(Color.BLUE);
                    turno=false;
                    btn6.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn6 = (Button) v;
                valorBtn6 = btn6.getText().toString();
                comparar();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn7.setText("X");
                    btn7.setTextColor(Color.RED);
                    turno=true;
                    btn7.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn7.setText("O");
                    btn7.setTextColor(Color.BLUE);
                    turno=false;
                    btn7.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn7 = (Button) v;
                valorBtn7 = btn7.getText().toString();
                comparar();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn8.setText("X");
                    btn8.setTextColor(Color.RED);
                    turno=true;
                    btn8.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn8.setText("O");
                    btn8.setTextColor(Color.BLUE);
                    turno=false;
                    btn8.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn8 = (Button) v;
                valorBtn8 = btn8.getText().toString();
                comparar();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == false){
                    btn9.setText("X");
                    btn9.setTextColor(Color.RED);
                    turno=true;
                    btn9.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 2", Toast.LENGTH_SHORT).show();
                }else{
                    btn9.setText("O");
                    btn9.setTextColor(Color.BLUE);
                    turno=false;
                    btn9.setEnabled(false);
                    //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();
                }

                btn9 = (Button) v;
                valorBtn9 = btn9.getText().toString();
                comparar();
            }
        });*/

    }

    public void comparar(){

        if((valorBtn1.equals("X") && valorBtn2.equals("X") && valorBtn3.equals("X"))
                || (valorBtn4.equals("X") && valorBtn5.equals("X") && valorBtn6.equals("X"))
                || (valorBtn7.equals("X") && valorBtn8.equals("X") && valorBtn9.equals("X"))
                || (valorBtn1.equals("X") && valorBtn4.equals("X") && valorBtn7.equals("X"))
                || (valorBtn2.equals("X") && valorBtn5.equals("X") && valorBtn8.equals("X"))
                || (valorBtn3.equals("X") && valorBtn6.equals("X") && valorBtn9.equals("X"))
                || (valorBtn1.equals("X") && valorBtn5.equals("X") && valorBtn9.equals("X"))
                || (valorBtn3.equals("X") && valorBtn5.equals("X") && valorBtn7.equals("X"))){

            txtv_ganador.setText("Ganador: Jugador 1");
            victoriasJ1++;
            txtv_victoriasJ1.setText(Integer.toString(victoriasJ1));

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }else if ((valorBtn1.equals("O") && valorBtn2.equals("O") && valorBtn3.equals("O"))
                || (valorBtn4.equals("O") && valorBtn5.equals("O") && valorBtn6.equals("O"))
                || (valorBtn7.equals("O") && valorBtn8.equals("O") && valorBtn9.equals("O"))
                || (valorBtn1.equals("O") && valorBtn4.equals("O") && valorBtn7.equals("O"))
                || (valorBtn2.equals("O") && valorBtn5.equals("O") && valorBtn8.equals("O"))
                || (valorBtn3.equals("O") && valorBtn6.equals("O") && valorBtn9.equals("O"))
                || (valorBtn1.equals("O") && valorBtn5.equals("O") && valorBtn9.equals("O"))
                || (valorBtn3.equals("O") && valorBtn5.equals("O") && valorBtn7.equals("O"))){

            txtv_ganador.setText("Ganador: Jugador 2");
            victoriasJ2++;
            txtv_victoriasJ2.setText(Integer.toString(victoriasJ2));

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    }

    public void limpiar(){

        valorBtn1=" ";
        valorBtn2=" ";
        valorBtn3=" ";
        valorBtn4=" ";
        valorBtn5=" ";
        valorBtn6=" ";
        valorBtn7=" ";
        valorBtn8=" ";
        valorBtn9=" ";

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

        txtv_ganador.setText("Ganador: ????");

        //Toast.makeText(GatoActivity.this, "Turno Jugador 1", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.btn1:
                if(turno==false){
                    btn1.setText("X");
                    btn1.setTextColor(Color.RED);
                    turno=true;
                    btn1.setEnabled(false);
                }else{

                    btn1.setText("O");
                    btn1.setTextColor(Color.BLUE);
                    turno=false;
                    btn1.setEnabled(false);
                }
                btn1=(Button)v;
                valorBtn1=btn1.getText().toString();
                comparar();
                break;
            case R.id.btn2:
                if(turno==false){
                    btn2.setText("X");
                    btn2.setTextColor(Color.RED);
                    turno=true;
                    btn2.setEnabled(false);
                }else{

                    btn2.setText("O");
                    btn2.setTextColor(Color.BLUE);
                    turno=false;
                    btn2.setEnabled(false);
                }
                btn2=(Button)v;
                valorBtn2=btn2.getText().toString();
                comparar();
                break;
            case R.id.btn3:
                if(turno==false){
                    btn3.setText("X");
                    btn3.setTextColor(Color.RED);
                    turno=true;
                    btn3.setEnabled(false);
                }else{

                    btn3.setText("O");
                    btn3.setTextColor(Color.BLUE);
                    turno=false;
                    btn3.setEnabled(false);
                }
                btn3=(Button)v;
                valorBtn3=btn3.getText().toString();
                comparar();
                break;
            case R.id.btn4:
                if(turno==false){
                    btn4.setText("X");
                    btn4.setTextColor(Color.RED);
                    turno=true;
                    btn4.setEnabled(false);
                }else{

                    btn4.setText("O");
                    btn4.setTextColor(Color.BLUE);
                    turno=false;
                    btn4.setEnabled(false);
                }
                btn4=(Button)v;
                valorBtn4=btn4.getText().toString();
                comparar();
                break;
            case R.id.btn5:
                if(turno==false){
                    btn5.setText("X");
                    btn5.setTextColor(Color.RED);
                    turno=true;
                    btn5.setEnabled(false);
                }else{

                    btn5.setText("O");
                    btn5.setTextColor(Color.BLUE);
                    turno=false;
                    btn5.setEnabled(false);
                }
                btn5=(Button)v;
                valorBtn5=btn5.getText().toString();
                comparar();
                break;
            case R.id.btn6:
                if(turno==false){
                    btn6.setText("X");
                    btn6.setTextColor(Color.RED);
                    turno=true;
                    btn6.setEnabled(false);
                }else{

                    btn6.setText("O");
                    btn6.setTextColor(Color.BLUE);
                    turno=false;
                    btn6.setEnabled(false);
                }
                btn6=(Button)v;
                valorBtn6=btn6.getText().toString();
                comparar();
                break;
            case R.id.btn7:
                if(turno==false){
                    btn7.setText("X");
                    btn7.setTextColor(Color.RED);
                    turno=true;
                    btn7.setEnabled(false);
                }else{

                    btn7.setText("O");
                    btn7.setTextColor(Color.BLUE);
                    turno=false;
                    btn7.setEnabled(false);
                }
                btn7=(Button)v;
                valorBtn7=btn7.getText().toString();
                comparar();
                break;
            case R.id.btn8:
                if(turno==false){
                    btn8.setText("X");
                    btn8.setTextColor(Color.RED);
                    turno=true;
                    btn8.setEnabled(false);
                }else{

                    btn8.setText("O");
                    btn8.setTextColor(Color.BLUE);
                    turno=false;
                    btn8.setEnabled(false);
                }
                btn8=(Button)v;
                valorBtn8=btn8.getText().toString();
                comparar();
                break;
            case R.id.btn9:
                if(turno==false){
                    btn9.setText("X");
                    btn9.setTextColor(Color.RED);
                    turno=true;
                    btn9.setEnabled(false);
                }else{

                    btn9.setText("O");
                    btn9.setTextColor(Color.BLUE);
                    turno=false;
                    btn9.setEnabled(false);
                }
                btn9=(Button)v;
                valorBtn9=btn9.getText().toString();
                comparar();
                break;
        }

    }
}
