package com.example.puzzle2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

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

    }

    public void crea_aleatoriamente(){
        int [] combinacion = new int [9];
        Random random = new Random();

        for (int i = 0; i<9; i++){
            combinacion [i] = random.nextInt(8);
            System.out.println(combinacion [i]);
        }
    }
}
