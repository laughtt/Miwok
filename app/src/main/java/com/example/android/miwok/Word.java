package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by jose on 11/14/2016.
 */
/*ESTA ES LA CLASE WORD, EL OBJETO QUE SE CREA , TIENE 2 CONSTRUCTORES  Y RECIBE LA PALABRA EN INGLES  , DESPUES EN ESPAÑOL ,
 * LA IMAGEN Y DESPUES EL MEDIAPLAYER */
public class Word {

    private String Español;
    private String Ingltrans ;
    public int Imagenresource = Not_image;
    MediaPlayer player ;
    public static final int Not_image = -1 ;
    /*CONSTRUCTOR*/
    public Word ( String ingltrans , String Español  , int imagenresource , MediaPlayer player1) {

        this.Español = Español ;
        Ingltrans = ingltrans ;
        Imagenresource = imagenresource;
        player = player1 ;
    }
    /*CONSTRUCTOR*/
    public Word ( String ingltrans , String frenchtrans , MediaPlayer player1  ) {

        Español = frenchtrans ;
        Ingltrans = ingltrans ;
        player = player1;


    }

    public String Getfrench () {

        return Español;


    }

   public String Getingle() {

    return Ingltrans ;

 }

    public void startmusic() {
       player.start() ;

    }
    /*COMO VEN LA CLASE FROSES NO TIENE IMAGEN ASI QUE ACA SE HACE UN METODO PARA QUE REGRESE UN FALSO SI NO HAY IMAGEN*/
    public int getImagenresource(){
    return Imagenresource;
    }

    public boolean notimage (){
        return Imagenresource != Not_image ;
    }
}
