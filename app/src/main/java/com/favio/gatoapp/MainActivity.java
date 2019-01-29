package com.favio.gatoapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtv_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv_contador = findViewById(R.id.txtv_contador);

        new CountDownTimer(7000, 1000){

            @Override
            public void onTick(long l) {

                txtv_contador.setText(String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {

                Intent i_GatoActivity=new Intent(MainActivity.this, GatoActivity.class);
                startActivity(i_GatoActivity);

                finish();
            }
        }.start();

    }

}

