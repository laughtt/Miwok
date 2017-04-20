package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    private AudioManager maudiomanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers);
        maudiomanager =(AudioManager) getSystemService(Context.AUDIO_SERVICE) ;
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
        AudioManager.OnAudioFocusChangeListener afChangeListener =
                new AudioManager.OnAudioFocusChangeListener() {
                    public void onAudioFocusChange(int focusChange) {
                        if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                            mediaPlayer.stop();
                            mediaPlayer.seekTo(0);
                        } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                            mediaPlayer.start();

                        } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                         mediaPlayer.release() ;
                            // Stop playback
                        }
                    }
                };



        ArrayList<Word> palabra = new ArrayList<Word>() ;


            palabra.add( new Word (EnglishNumberToWords.convert(1) , "uno" , R.drawable.number_one,mediaPlayer )) ;
            palabra.add( new Word (EnglishNumberToWords.convert(2) , "dos" , R.drawable.number_two ,mediaPlayer2)) ;
            palabra.add( new Word (EnglishNumberToWords.convert(3) , "tres" , R.drawable.number_three ,mediaPlayer3)) ;
            palabra.add( new Word (EnglishNumberToWords.convert(4)  , "cuatro" , R.drawable.number_four ,mediaPlayer4)) ;
            palabra.add( new Word (EnglishNumberToWords.convert(5)  , "cinco" , R.drawable.number_five ,mediaPlayer5)) ;
            palabra.add( new Word (EnglishNumberToWords.convert(6)  , "seis" , R.drawable.number_six,mediaPlayer6 )) ;
            palabra.add( new Word (EnglishNumberToWords.convert(7)  , "siete" , R.drawable.number_seven,mediaPlayer7 )) ;
            palabra.add( new Word (EnglishNumberToWords.convert(8)  , "ocho" , R.drawable.number_eight ,mediaPlayer8)) ;
            palabra.add( new Word (EnglishNumberToWords.convert(9)  , "nueve" , R.drawable.number_eight ,mediaPlayer9)) ;




     // Request audio focus for playback
        int result = maudiomanager.requestAudioFocus(afChangeListener,
                // Use the music stream.
                AudioManager.STREAM_MUSIC,
                // Request permanent focus.
                AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

        if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

            Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_numbers);
            listView.setAdapter(adapter );

            // Start playback.
        }


    }




}
