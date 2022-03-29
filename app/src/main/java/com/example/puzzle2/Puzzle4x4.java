package com.example.puzzle2;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Puzzle4x4 extends Activity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, boton11, boton12, boton13, boton14, boton15, boton16, test;
    Boolean b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    Chronometer tiempo;
    SQLiteDatabase db;
    long tiempoFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle4x4);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton6 = (Button) findViewById(R.id.boton6);
        boton7 = (Button) findViewById(R.id.boton7);
        boton8 = (Button) findViewById(R.id.boton8);
        boton9 = (Button) findViewById(R.id.boton9);
        boton10 = (Button) findViewById(R.id.boton10);
        boton11 = (Button) findViewById(R.id.boton11);
        boton12 = (Button) findViewById(R.id.boton12);
        boton13 = (Button) findViewById(R.id.boton13);
        boton14 = (Button) findViewById(R.id.boton14);
        boton15 = (Button) findViewById(R.id.boton15);
        boton16 = (Button) findViewById(R.id.boton16);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton10.setOnClickListener(this);
        boton11.setOnClickListener(this);
        boton12.setOnClickListener(this);
        boton13.setOnClickListener(this);
        boton14.setOnClickListener(this);
        boton15.setOnClickListener(this);
        boton16.setOnClickListener(this);

        test = (Button) findViewById(R.id.test);
        test.setOnClickListener(this);

        tiempo = (Chronometer) findViewById(R.id.tiempo);
        tiempo.setBase(SystemClock.elapsedRealtime());
        tiempo.setFormat("%s");
        tiempo.start();

        db = openOrCreateDatabase("ranking", Context.MODE_PRIVATE, null);

        crea_aleatoriamente();
    }

    @Override
    public void onClick(View v) {
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

        if (boton9.getText() == "9"){
            boton9.setBackgroundColor(Color.GREEN);
            b9 = true;
        }else{
            boton9.setBackgroundColor(Color.GRAY);
            b9 = false;
        }

        if (boton10.getText() == "10"){
            boton10.setBackgroundColor(Color.GREEN);
            b10 = true;
        }else{
            boton10.setBackgroundColor(Color.GRAY);
            b10 = false;
        }

        if (boton11.getText() == "11"){
            boton11.setBackgroundColor(Color.GREEN);
            b11 = true;
        }else{
            boton11.setBackgroundColor(Color.GRAY);
            b11 = false;
        }

        if (boton12.getText() == "12"){
            boton12.setBackgroundColor(Color.GREEN);
            b12 = true;
        }else{
            boton12.setBackgroundColor(Color.GRAY);
            b12 = false;
        }

        if (boton13.getText() == "13"){
            boton13.setBackgroundColor(Color.GREEN);
            b13 = true;
        }else{
            boton13.setBackgroundColor(Color.GRAY);
            b13 = false;
        }

        if (boton14.getText() == "14"){
            boton14.setBackgroundColor(Color.GREEN);
            b14 = true;
        }else{
            boton14.setBackgroundColor(Color.GRAY);
            b14 = false;
        }

        if (boton15.getText() == "15"){
            boton15.setBackgroundColor(Color.GREEN);
            b15 = true;
        }else{
            boton15.setBackgroundColor(Color.GRAY);
            b15 = false;
        }

        if (boton16.getText() == "0"){
            boton16.setBackgroundColor(Color.GREEN);
            b16 = true;
        }else{
            boton16.setBackgroundColor(Color.GRAY);
            b16 = false;
        }

        if (b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 && b10 && b11 && b12 && b13 && b14 && b15 && b16 == true) {
            Toast toast = Toast.makeText(this, "Has ganado", Toast.LENGTH_SHORT);
            toast.show();

            tiempo.stop();
            tiempoFin = (int) (SystemClock.elapsedRealtime() - tiempo.getBase());
            agregar();
        }

    }

    public void ejecuta_movimiento(View v){
        switch (v.getId()) {
            case R.id.boton1:
                if (boton2.getText() == "0") {
                    boton2.setText(boton1.getText());
                    boton1.setText("0");
                } else if (boton5.getText() == "0") {
                    boton5.setText(boton1.getText());
                    boton1.setText("0");
                }
                break;

            case R.id.boton2:
                if (boton1.getText() == "0") {
                    boton1.setText(boton2.getText());
                    boton2.setText("0");
                } else if (boton3.getText() == "0") {
                    boton3.setText(boton2.getText());
                    boton2.setText("0");
                } else if (boton6.getText() == "0") {
                    boton6.setText(boton2.getText());
                    boton2.setText("0");
                }
                break;

            case R.id.boton3:
                if (boton2.getText() == "0") {
                    boton2.setText(boton3.getText());
                    boton3.setText("0");
                } else if (boton7.getText() == "0") {
                    boton7.setText(boton3.getText());
                    boton3.setText("0");
                }
                break;

            case R.id.boton4:
                if (boton3.getText() == "0") {
                    boton3.setText(boton4.getText());
                    boton4.setText("0");
                } else if (boton8.getText() == "0") {
                    boton8.setText(boton4.getText());
                    boton4.setText("0");
                }
                break;

            case R.id.boton5:
                if (boton1.getText() == "0") {
                    boton1.setText(boton5.getText());
                    boton5.setText("0");
                } else if (boton6.getText() == "0") {
                    boton6.setText(boton5.getText());
                    boton5.setText("0");
                } else if (boton9.getText() == "0") {
                    boton9.setText(boton5.getText());
                    boton5.setText("0");
                }
                break;

            case R.id.boton6:
                if (boton2.getText() == "0") {
                    boton2.setText(boton6.getText());
                    boton6.setText("0");
                } else if (boton5.getText() == "0") {
                    boton5.setText(boton6.getText());
                    boton6.setText("0");
                } else if (boton7.getText() == "0") {
                    boton7.setText(boton6.getText());
                    boton6.setText("0");
                } else if (boton10.getText() == "0"){
                    boton10.setText(boton6.getText());
                    boton6.setText("0");
                }
                break;

            case R.id.boton7:
                if (boton3.getText() == "0") {
                    boton3.setText(boton7.getText());
                    boton7.setText("0");
                } else if (boton8.getText() == "0") {
                    boton8.setText(boton7.getText());
                    boton7.setText("0");
                } else if(boton6.getText() == "0"){
                    boton6.setText(boton7.getText());
                    boton7.setText("0");
                } else if (boton11.getText() == "0"){
                    boton11.setText(boton7.getText());
                    boton7.setText("0");
                }
                break;

            case R.id.boton8:
                if (boton4.getText() == "0") {
                    boton4.setText(boton8.getText());
                    boton8.setText("0");
                } else if (boton7.getText() == "0") {
                    boton7.setText(boton8.getText());
                    boton8.setText("0");
                } else if (boton12.getText() == "0") {
                    boton12.setText(boton8.getText());
                    boton8.setText("0");
                }
                break;

            case R.id.boton9:
                if (boton5.getText() == "0") {
                    boton5.setText(boton9.getText());
                    boton9.setText("0");
                } else if (boton10.getText() == "0") {
                    boton10.setText(boton9.getText());
                    boton9.setText("0");
                } else if (boton13.getText() == "0"){
                    boton13.setText(boton9.getText());
                    boton9.setText("0");
                }
                break;

            case R.id.boton10:
                if (boton6.getText() == "0"){
                    boton6.setText(boton10.getText());
                    boton10.setText("0");
                } else if (boton9.getText() == "0"){
                    boton9.setText(boton10.getText());
                    boton10.setText("0");
                } else if (boton11.getText() == "0"){
                    boton11.setText(boton10.getText());
                    boton10.setText("0");
                } else if (boton14.getText() == "0"){
                    boton14.setText(boton10.getText());
                    boton10.setText("0");
                }
                break;

            case R.id.boton11:
                if (boton7.getText() == "0"){
                    boton7.setText(boton11.getText());
                    boton11.setText("0");
                } else if (boton10.getText() == "0"){
                    boton10.setText(boton11.getText());
                    boton11.setText("0");
                } else if (boton12.getText() == "0"){
                    boton12.setText(boton11.getText());
                    boton11.setText("0");
                } else if (boton15.getText() == "0"){
                    boton15.setText(boton11.getText());
                    boton11.setText("0");
                }
                break;

            case R.id.boton12:
                if (boton8.getText() == "0"){
                    boton8.setText(boton12.getText());
                    boton12.setText("0");
                } else if (boton11.getText() == "0"){
                    boton11.setText(boton12.getText());
                    boton12.setText("0");
                } else if (boton16.getText() == "0"){
                    boton16.setText(boton12.getText());
                    boton12.setText("0");
                }
                break;

            case R.id.boton13:
                if (boton9.getText() == "0"){
                    boton9.setText(boton13.getText());
                    boton13.setText("0");
                } else if (boton14.getText() == "0"){
                    boton14.setText(boton13.getText());
                    boton13.setText("0");
                }
                break;

            case R.id.boton14:
                if (boton13.getText() == "0"){
                    boton13.setText(boton14.getText());
                    boton14.setText("0");
                } else if (boton10.getText() == "0"){
                    boton10.setText(boton14.getText());
                    boton14.setText("0");
                } else if (boton15.getText() == "0"){
                    boton15.setText(boton14.getText());
                    boton14.setText("0");
                }
                break;

            case R.id.boton15:
                if (boton14.getText() == "0") {
                    boton14.setText(boton15.getText());
                    boton15.setText("0");
                } else if (boton11.getText() == "0"){
                    boton11.setText(boton15.getText());
                    boton15.setText("0");
                } else if (boton16.getText() == "0"){
                    boton16.setText(boton15.getText());
                    boton15.setText("0");
                }
                break;

            case R.id.boton16:
                if (boton15.getText() == "0"){
                    boton15.setText(boton16.getText());
                    boton16.setText("0");
                } else if (boton12.getText() == "0"){
                    boton12.setText(boton16.getText());
                    boton16.setText("0");
                }
                break;


            case R.id.test:
                boton1.setText("1");
                boton2.setText("2");
                boton3.setText("3");
                boton4.setText("4");
                boton5.setText("5");
                boton6.setText("6");
                boton7.setText("7");
                boton8.setText("8");
                boton9.setText("9");
                boton10.setText("10");
                boton11.setText("11");
                boton12.setText("12");
                boton13.setText("13");
                boton14.setText("14");
                boton15.setText("0");
                boton16.setText("15");
                break;
        }
        }
    public void crea_aleatoriamente(){
        //Crea una de las posibles combinaciones
        String [] c4x4 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        List<String> C4x4 = Arrays.asList(c4x4);

        Collections.shuffle(C4x4);

        boton1.setText(C4x4.get(0));
        boton2.setText(C4x4.get(1));
        boton3.setText(C4x4.get(2));
        boton4.setText(C4x4.get(3));
        boton5.setText(C4x4.get(4));
        boton6.setText(C4x4.get(5));
        boton7.setText(C4x4.get(6));
        boton8.setText(C4x4.get(7));
        boton9.setText(C4x4.get(8));
        boton10.setText(C4x4.get(9));
        boton11.setText(C4x4.get(10));
        boton12.setText(C4x4.get(11));
        boton13.setText(C4x4.get(12));
        boton14.setText(C4x4.get(13));
        boton15.setText(C4x4.get(14));
        boton16.setText(C4x4.get(15));

    }

    public void agregar(){
        db.execSQL("INSERT INTO ranking VALUES (NULL,'"+tiempoFin+"')");
        System.out.println("Rank añadido");
        db.close();
    }
}
