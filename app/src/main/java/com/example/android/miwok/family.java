package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {
    /*LO MISMO QUE EL COLORS */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family);
        ListView listView = (ListView) findViewById(R.id.listf);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.padre);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.hija);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.abuelo);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.abuela);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.madre);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.hermano);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.hermana);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.hijo);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.hermano);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.hermanita);



        ArrayList<Word> palabra = new ArrayList<Word>() ;


        palabra.add( new Word ("father" , "padre" , R.drawable.family_father , mediaPlayer)) ;
        palabra.add( new Word ("daughter" , "hija" , R.drawable.family_daughter ,mediaPlayer2)) ;
        palabra.add( new Word ("grandfather" , "abuelo" , R.drawable.family_grandfather ,mediaPlayer3)) ;
        palabra.add( new Word ("grandmother" , "abuela" , R.drawable.family_grandmother ,mediaPlayer4)) ;
        palabra.add( new Word ("mother" , "madre" , R.drawable.family_mother , mediaPlayer5)) ;
        palabra.add( new Word ("older brother" , "hermano mayor " , R.drawable.family_older_brother ,mediaPlayer6)) ;
        palabra.add( new Word ("older sister" , "hermana mayor" , R.drawable.family_older_sister ,mediaPlayer7)) ;
        palabra.add( new Word ("hijo" , "hijo" , R.drawable.family_son , mediaPlayer8)) ;
        palabra.add( new Word ("younger brother" , "hermano menor" , R.drawable.family_younger_brother , mediaPlayer9)) ;
        palabra.add( new Word ("younger sister" , "hermana menor" , R.drawable.family_younger_sister ,mediaPlayer10)) ;

            Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_family);
            listView.setAdapter(adapter );



    }
}
