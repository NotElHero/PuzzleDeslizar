package com.example.puzzle2;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Ranking extends Activity {

    SQLiteDatabase db;
    ListView listaRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        listaRank = (ListView) findViewById(R.id.listRank);
        db = openOrCreateDatabase("ranking", Context.MODE_PRIVATE, null);
        listar();
    }

    public void listar(){
        ArrayAdapter<String> adaptador;
        List<String> lista = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM ranking", null);
        if(c.getCount() == 0)
            lista.add("No hay registros");
        else{
            while(c.moveToNext())
                lista.add(c.getString(0)+"-"+c.getString(1));
        }
        adaptador = new ArrayAdapter<>(getApplicationContext(),R.layout.activity_ranking,lista);
        listaRank.setAdapter(adaptador);
    }
}
