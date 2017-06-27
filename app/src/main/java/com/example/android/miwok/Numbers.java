package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    /*LO MISMO QUE EL COLORS */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers);
        ListView listView = (ListView) findViewById(R.id.listn);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sound1) ;
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.sound2);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.sound3);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.sound4);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.sound5);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.sound6);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.sound7);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.sound8);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.sound9);



        ArrayList<Word> palabra = new ArrayList<Word>() ;


            palabra.add( new Word ("one" , "uno" , R.drawable.number_one,mediaPlayer )) ;
            palabra.add( new Word ("two" , "dos" , R.drawable.number_two ,mediaPlayer2)) ;
            palabra.add( new Word ("three" , "tres" , R.drawable.number_three ,mediaPlayer3)) ;
            palabra.add( new Word ("four"  , "cuatro" , R.drawable.number_four ,mediaPlayer4)) ;
            palabra.add( new Word ("five"  , "cinco" , R.drawable.number_five ,mediaPlayer5)) ;
            palabra.add( new Word ("six"  , "seis" , R.drawable.number_six,mediaPlayer6 )) ;
            palabra.add( new Word ("seven" , "siete" , R.drawable.number_seven,mediaPlayer7 )) ;
            palabra.add( new Word ("eight"  , "ocho" , R.drawable.number_eight ,mediaPlayer8)) ;
            palabra.add( new Word ("nine"  , "nueve" , R.drawable.number_eight ,mediaPlayer9)) ;



            Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_numbers);
            listView.setAdapter(adapter );


        }


    }





