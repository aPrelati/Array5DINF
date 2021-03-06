package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity
{

    ListView lvfilm;
    Button btnEsci;
    String film[]={"spiderman","superman","batman"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvfilm = (ListView) findViewById(R.id.lvFilm);

        ArrayAdapter<String> aaFilm = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, film); //è lui che ci popola la listview

        lvfilm.setAdapter(aaFilm);

        lvfilm.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String titoloFilm= (String)lvfilm.getItemAtPosition(position); //faccio il cast a string perchè mi restituisce un oggetto

                Log.d("Errore_Toast", "posizione: "+position);
                //Toast.makeText(getApplicationContext(), titoloFilm, Toast.LENGTH_LONG).show();

                Intent i= new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("key", titoloFilm); //passo dei dati alla seconda activity
                startActivity(i);
            }
        });
    }
}