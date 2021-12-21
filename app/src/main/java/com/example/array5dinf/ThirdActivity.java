package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity
{

    ImageView imgFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        imgFilm= findViewById(R.id.locandina);

        String nomeFilm= getIntent().getStringExtra("key");

        if(nomeFilm.equals("spiderman"))
        {
            imgFilm.setImageResource(R.drawable.spiderman);
            Toast.makeText(getApplicationContext(), nomeFilm, Toast.LENGTH_LONG).show();
        }

        if(nomeFilm.equals("superman"))
        {
            imgFilm.setImageResource(R.drawable.superman);
            Toast.makeText(getApplicationContext(), nomeFilm, Toast.LENGTH_LONG).show();
        }

        if(nomeFilm.equals("batman"))
        {
            imgFilm.setImageResource(R.drawable.batman);
            Toast.makeText(getApplicationContext(), nomeFilm, Toast.LENGTH_LONG).show();
        }

        //imgFilm = (ImageView) findViewById(R.drawable.vittoria);

        /*
        imgFilm.setImageResource(R.drawable.vittoria);
        Intent secInt= getIntent();
        String titolo2= secInt.getStringExtra("key");
        */

        /*String titolo="";
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            titolo= (String) extras.getString("key");
        }*/

        /*
        Toast.makeText(getApplicationContext(), titolo2, Toast.LENGTH_LONG).show();

        if(titolo2 == "Spiderman"){
            imgFilm.setImageResource(R.drawable.spiderman);
        }
        */

        //Bundle extras = getIntent().getExtras();
        /*if(extras != null)
        {
            //String value = extras.getString("key");

        }
        */
    }
}