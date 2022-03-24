package com.example.puzzle2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button x3;
    Boolean puzz3x3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x3 = (Button) findViewById(R.id.boton3x3);
        x3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton3x3:
                puzz3x3 = true;
                Intent cargarPuzzle = new Intent(this, Puzzle.class);
                startActivity(cargarPuzzle);
                break;
            case R.id.boton4x4:
                puzz3x3 = false;
                break;
            case R.id.botonOpciones:

                break;
            case R.id.botonRank:

                break;
        }

    }
}