package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases);
        ListView listView = (ListView) findViewById(R.id.listp);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.waba);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this , R.raw.epicsountrack);


        ArrayList<Word> palabra = new ArrayList<Word>();


        palabra.add( new Word ("Wabalabadubdubbb!!" , "Wabalabadubdubbb!!" , mediaPlayer)) ;
        palabra.add( new Word ("Wabalabadubdubbb!!" , "Wabalabadubdubbb!!" , mediaPlayer1)) ;




            Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_phrases);
            listView.setAdapter(adapter );







    }


}

