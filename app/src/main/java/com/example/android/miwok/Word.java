package com.example.android.miwok;

import android.media.MediaPlayer;
import android.view.View;

/**
 * Created by jose on 11/14/2016.
 */

public class Word {

    private String Frenchtrans ;
    private String Ingltrans ;
    public int Imagenresource = Not_image;
    MediaPlayer player ;
    public static final int Not_image = -1 ;

    public Word ( String ingltrans , String frenchtrans  , int imagenresource , MediaPlayer player1) {

        Frenchtrans = frenchtrans ;
        Ingltrans = ingltrans ;
        Imagenresource = imagenresource;
        player = player1 ;
    }
    public Word ( String ingltrans , String frenchtrans , MediaPlayer player1  ) {

        Frenchtrans = frenchtrans ;
        Ingltrans = ingltrans ;
        player = player1;


    }

    public String Getfrench () {

        return Frenchtrans ;


    }

   public String Getingle() {

    return Ingltrans ;

 }

    public void startmusic() {
       player.start() ;

    }

    public int getImagenresource(){
    return Imagenresource;
    }

    public boolean notimage (){
        return Imagenresource != Not_image ;
    }
}
