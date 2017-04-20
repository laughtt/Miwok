package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.colors);
        ListView listView = (ListView) findViewById(R.id.listc);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.negro);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.marron);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.amarillo);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.gris);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.verde);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.moztaza);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.rojo);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.blanco);



        ArrayList<Word> palabra = new ArrayList<Word>() ;


        palabra.add( new Word ("black" , "negro" , R.drawable.color_black , mediaPlayer)) ;
        palabra.add( new Word ("brown" , "marron" , R.drawable.color_brown ,mediaPlayer2 )) ;
        palabra.add( new Word ("dusty yellow" , "amarillo sucio" , R.drawable.color_dusty_yellow ,mediaPlayer3)) ;
        palabra.add( new Word ("gray" , "gris" , R.drawable.color_gray ,mediaPlayer4)) ;
        palabra.add( new Word ("green" , "verde" , R.drawable.color_green ,mediaPlayer5)) ;
        palabra.add( new Word ( "mustard yellow" , "amarillo mostaza" , R.drawable.color_mustard_yellow ,mediaPlayer6 )) ;
        palabra.add( new Word ("red" , "rojo" , R.drawable.color_red ,mediaPlayer7)) ;
        palabra.add( new Word ("white" , "blanco" , R.drawable.color_white ,mediaPlayer8)) ;

        Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_colors );
        listView.setAdapter(adapter );

    }
}
