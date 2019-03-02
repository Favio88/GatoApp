package com.favio.gatoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class GatoActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn, btnJugar, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView txtv_ganador, txtv_victoriasJ1, txtv_victoriasJ2;
    int victoriasJ1=0, victoriasJ2=0;
    boolean turno=false;
    ViewGroup vg_botones;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);

        btnJugar = findViewById(R.id.btnJugar);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        txtv_ganador = findViewById(R.id.txtv_ganador);
        txtv_victoriasJ1 = findViewById(R.id.txtv_victoriasJ1);
        txtv_victoriasJ2 = findViewById(R.id.txtv_victoriasJ2);
        vg_botones=(ViewGroup)findViewById(R.id.rl_botones);

        restablecerTextoBotones();
        deshabilitarBotones();

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

                turno = false;
                limpiar();
            }
        });
    }

    @Override
    public void onClick(View v) {

        btn=(Button)v;

        if(turno==false){
            btn.setText("X");
            btn.setTextColor(Color.RED);
            turno=true;
            btn.setEnabled(false);
        }
        else{
            btn.setText("O");
            btn.setTextColor(Color.BLUE);
            turno=false;
            btn.setEnabled(false);
        }
        comparar();
    }

    public void deshabilitarBotones(){

        int numBotones=vg_botones.getChildCount();

        for(int i=0; i<numBotones; i++){

            v=vg_botones.getChildAt(i);
            v.setEnabled(false);
        }
    }

    public void habilitarBotones(){

        int numBotones=vg_botones.getChildCount();

        for(int i=0; i<numBotones; i++){

            v=vg_botones.getChildAt(i);
            v.setEnabled(true);
        }
    }

    public void restablecerTextoBotones(){

        int numBotones=vg_botones.getChildCount();

        for(int i=0; i<numBotones; i++){

            v=vg_botones.getChildAt(i);
            Button btnTexto=(Button)v;
            btnTexto.setText(" ");
        }
    }

    public void comparar(){

        if((btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X"))
                || (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X"))
                || (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X"))
                || (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X"))
                || (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X"))
                || (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X"))
                || (btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X"))
                || (btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X"))){

            txtv_ganador.setText("Ganador: Jugador 1");
            victoriasJ1++;
            txtv_victoriasJ1.setText(Integer.toString(victoriasJ1));

            deshabilitarBotones();

        }else if ((btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O"))
                || (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O"))
                || (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O"))
                || (btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O"))
                || (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O"))
                || (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O"))
                || (btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O"))
                || (btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O"))){

            txtv_ganador.setText("Ganador: Jugador 2");
            victoriasJ2++;
            txtv_victoriasJ2.setText(Integer.toString(victoriasJ2));

            deshabilitarBotones();
        }
    }

    public void limpiar(){

        habilitarBotones();
        restablecerTextoBotones();

        txtv_ganador.setText("Ganador: ????");
    }

}
