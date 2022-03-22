package com.example.puzzle2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Puzzle extends Activity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;

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

        crea_aleatoriamente();
    }

    @Override
    public void onClick(View v) {
        //Para 3x3
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
                }else if (boton4.getText() == "0"){
                    boton4.setText(boton6.getText());
                    boton6.setText("0");
                }else if (boton9.getText() == "0"){
                    boton9.setText(boton6.getText());
                    boton6.setText("0");
                }
                break;
        }
    }

    public void crea_aleatoriamente(){

        String [] c3x3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        List<String> C3x3 = Arrays.asList(c3x3);

        Collections.shuffle(C3x3);
        System.out.println(C3x3);
        System.out.println(C3x3.get(2));

        boton1.setText(C3x3.get(0));
        boton2.setText(C3x3.get(1));
        boton3.setText(C3x3.get(2));
        boton4.setText(C3x3.get(3));
        boton5.setText(C3x3.get(4));
        boton6.setText(C3x3.get(5));
        boton7.setText(C3x3.get(6));
        boton8.setText(C3x3.get(7));
        boton9.setText(C3x3.get(8));

    }

}
