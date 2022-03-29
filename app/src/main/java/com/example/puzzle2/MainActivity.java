package com.example.puzzle2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button x3, rank, x4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x3 = (Button) findViewById(R.id.boton3x3);
        x3.setOnClickListener(this);
        x4 = (Button) findViewById(R.id.boton4x4);
        x4.setOnClickListener(this);
        rank = (Button) findViewById(R.id.botonRank);
        rank.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton3x3:
                Intent cargarPuzzle = new Intent(this, Puzzle.class);
                startActivity(cargarPuzzle);
                break;
            case R.id.boton4x4:
                Intent cargarPuzzle4x4 = new Intent(this, Puzzle4x4.class);
                startActivity(cargarPuzzle4x4);
                break;
            case R.id.botonOpciones:

                break;
            case R.id.botonRank:
                Intent cargarRanking = new Intent(this, Ranking.class);
                startActivity(cargarRanking);
                break;
        }

    }
}