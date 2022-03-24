package com.example.puzzle2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.core.app.NotificationCompat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Puzzle extends Activity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonPrueba;
    Boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Chronometer tiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        boton3 = (Button) findViewById(R.id.button3);
        boton4 = (Button) findViewById(R.id.button4);
        boton5 = (Button) findViewById(R.id.button5);
        boton6 = (Button) findViewById(R.id.button6);
        boton7 = (Button) findViewById(R.id.button7);
        boton8 = (Button) findViewById(R.id.button8);
        boton9 = (Button) findViewById(R.id.button9);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);

        botonPrueba = (Button) findViewById(R.id.prueba);
        botonPrueba.setOnClickListener(this);

        tiempo = (Chronometer) findViewById(R.id.tiempo);
        tiempo.setBase(SystemClock.elapsedRealtime());
        tiempo.setFormat("%s");
        tiempo.start();

        crea_aleatoriamente();
    }

    @Override
    public void onClick(View v) {
        //Para 3x3
        ejecuta_movimiento(v);

        if (boton1.getText() == "1"){
            boton1.setBackgroundColor(Color.GREEN);
            b1 = true;
        }else{
            boton1.setBackgroundColor(Color.GRAY);
            b1 = false;
        }

        if (boton2.getText() == "2"){
            boton2.setBackgroundColor(Color.GREEN);
            b2 = true;
        }else{
            boton2.setBackgroundColor(Color.GRAY);
            b2 = false;
        }

        if (boton3.getText() == "3"){
            boton3.setBackgroundColor(Color.GREEN);
             b3 = true;
        }else{
            boton3.setBackgroundColor(Color.GRAY);
            b3 = false;
        }

        if (boton4.getText() == "4"){
            boton4.setBackgroundColor(Color.GREEN);
            b4 = true;
        }else{
            boton4.setBackgroundColor(Color.GRAY);
            b4 = false;
        }

        if (boton5.getText() == "5"){
            boton5.setBackgroundColor(Color.GREEN);
            b5 = true;
        }else{
            boton5.setBackgroundColor(Color.GRAY);
            b5 = false;
        }

        if (boton6.getText() == "6"){
            boton6.setBackgroundColor(Color.GREEN);
            b6 = true;
        }else{
            boton6.setBackgroundColor(Color.GRAY);
            b6 = false;
        }

        if (boton7.getText() == "7"){
            boton7.setBackgroundColor(Color.GREEN);
            b7 = true;
        }else{
            boton7.setBackgroundColor(Color.GRAY);
            b7 = false;
        }

        if (boton8.getText() == "8"){
            boton8.setBackgroundColor(Color.GREEN);
            b8 = true;
        }else{
            boton8.setBackgroundColor(Color.GRAY);
            b8 = false;
        }

        if (boton9.getText() == "0"){
            boton9.setBackgroundColor(Color.GREEN);
            b9 = true;
        }else{
            boton9.setBackgroundColor(Color.GRAY);
            b9 = false;
        }

        if (b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 == true){
            /*Toast toast = Toast.makeText(this, "Has ganado", Toast.LENGTH_SHORT);
            toast.show();*/

            //NotificationCompat.Builder notificacion = new NotificationCompat.Builder(this, )
            tiempo.stop();
        }

    }

    public void crea_aleatoriamente(){

        //Crea una de las posibles combinaciones
        String [] c3x3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        List<String> C3x3 = Arrays.asList(c3x3);

        Collections.shuffle(C3x3);

        boton1.setText(C3x3.get(0));
        boton2.setText(C3x3.get(1));
        boton3.setText(C3x3.get(2));
        boton4.setText(C3x3.get(3));
        boton5.setText(C3x3.get(4));
        boton6.setText(C3x3.get(5));
        boton7.setText(C3x3.get(6));
        boton8.setText(C3x3.get(7));
        boton9.setText(C3x3.get(8));

        //Comprueba si es posible
        Boolean esPosible;

    }

    public void ejecuta_movimiento(View v){
        switch (v.getId()){
            case R.id.button1:
                if (boton2.getText() == "0"){
                    boton2.setText(boton1.getText());
                    boton1.setText("0");
                }else if (boton4.getText() == "0"){
                    boton4.setText(boton1.getText());
                    boton1.setText("0");
                }
                break;

            case R.id.button2:
                if (boton1.getText() == "0"){
                    boton1.setText(boton2.getText());
                    boton2.setText("0");
                }else if (boton3.getText() == "0"){
                    boton3.setText(boton2.getText());
                    boton2.setText("0");
                }else if (boton5.getText() == "0"){
                    boton5.setText(boton2.getText());
                    boton2.setText("0");
                }
                break;

            case R.id.button3:
                if (boton2.getText() == "0"){
                    boton2.setText(boton3.getText());
                    boton3.setText("0");
                }else if (boton6.getText() == "0"){
                    boton6.setText(boton3.getText());
                    boton3.setText("0");
                }
                break;

            case R.id.button4:
                if (boton1.getText() == "0"){
                    boton1.setText(boton4.getText());
                    boton4.setText("0");
                }else if (boton5.getText() == "0"){
                    boton5.setText(boton4.getText());
                    boton4.setText("0");
                }else if (boton7.getText() == "0"){
                    boton7.setText(boton4.getText());
                    boton4.setText("0");
                }
                break;

            case R.id.button5:
                if (boton2.getText() == "0"){
                    boton2.setText(boton5.getText());
                    boton5.setText("0");
                }else if (boton4.getText() == "0"){
                    boton4.setText(boton5.getText());
                    boton5.setText("0");
                }else if (boton6.getText() == "0"){
                    boton6.setText(boton5.getText());
                    boton5.setText("0");
                }else if (boton8.getText() == "0"){
                    boton8.setText(boton5.getText());
                    boton5.setText("0");
                }
                break;

            case R.id.button6:
                if (boton3.getText() == "0"){
                    boton3.setText(boton6.getText());
                    boton6.setText("0");
                }else if (boton5.getText() == "0"){
                    boton5.setText(boton6.getText());
                    boton6.setText("0");
                }else if (boton9.getText() == "0"){
                    boton9.setText(boton6.getText());
                    boton6.setText("0");
                }
                break;

            case R.id.button7:
                if (boton4.getText() == "0"){
                    boton4.setText(boton7.getText());
                    boton7.setText("0");
                }else if (boton8.getText() == "0"){
                    boton8.setText(boton7.getText());
                    boton7.setText("0");
                }
                break;

            case R.id.button8:
                if (boton7.getText() == "0"){
                    boton7.setText(boton8.getText());
                    boton8.setText("0");
                }else if (boton5.getText() == "0"){
                    boton5.setText(boton8.getText());
                    boton8.setText("0");
                }else if (boton9.getText() == "0"){
                    boton9.setText(boton8.getText());
                    boton8.setText("0");
                }
                break;

            case R.id.button9:
                if (boton8.getText() == "0"){
                    boton8.setText(boton9.getText());
                    boton9.setText("0");
                }else if (boton6.getText() == "0"){
                    boton6.setText(boton9.getText());
                    boton9.setText("0");
                }
                break;

            case R.id.prueba:
                boton1.setText("1");
                boton2.setText("2");
                boton3.setText("3");
                boton4.setText("4");
                boton5.setText("5");
                boton6.setText("6");
                boton7.setText("7");
                boton8.setText("0");
                boton9.setText("8");
                break;

        }
    }
}
