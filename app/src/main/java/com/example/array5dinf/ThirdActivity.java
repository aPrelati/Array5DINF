package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity
{

    ImageView imgFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

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
        Blunde extras = getIntent().getExtras();
        if(extras != null)
        {
            String value = extras.getString("key");
            Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
        }
    }
}