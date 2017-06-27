package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
/*Esta es la actividad colors , aca es donde estan linqueado todos los archivos*/
public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  /*este es el setcontentview que pone el color a la actividad , "colors" esta en el manifesto (android manifest) */
          setContentView(R.layout.colors);
 /*Este es el listview donde se van a poner todos los elementos , se pone recyclerview porque asi se puede desplazar los elementos mas facilemente*/
        ListView listView = (ListView) findViewById(R.id.listc);
        /*Mediaplater es una clase que ya viene incluida en android , guarda los mp3 , los archivos mp3 estan en res/raw*/
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.negro);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.marron);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.amarillo);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.gris);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.verde);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.moztaza);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.rojo);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.blanco);


/*CREANDO UN ARRAYLIST ,CON LOS OBJETOS WORD LLAMADO PALABRA  */
        ArrayList<Word> palabra = new ArrayList<Word>() ;

/*ACA SE AÑADE LOS WORD A LA LISTA PALABRA QUE ESTA ACA ARRIBA CON LA INFORMACION A CADA UNO , NOMBRE EN INGLES , NOMBRE EN ESPAÑOL , DIBUJO , Y MUSICA*/
        palabra.add( new Word ("black" , "negro" , R.drawable.color_black , mediaPlayer)) ;
        palabra.add( new Word ("brown" , "marron" , R.drawable.color_brown ,mediaPlayer2 )) ;
        palabra.add( new Word ("dusty yellow" , "amarillo sucio" , R.drawable.color_dusty_yellow ,mediaPlayer3)) ;
        palabra.add( new Word ("gray" , "gris" , R.drawable.color_gray ,mediaPlayer4)) ;
        palabra.add( new Word ("green" , "verde" , R.drawable.color_green ,mediaPlayer5)) ;
        palabra.add( new Word ( "mustard yellow" , "amarillo mostaza" , R.drawable.color_mustard_yellow ,mediaPlayer6 )) ;
        palabra.add( new Word ("red" , "rojo" , R.drawable.color_red ,mediaPlayer7)) ;
        palabra.add( new Word ("white" , "blanco" , R.drawable.color_white ,mediaPlayer8)) ;
/*ESTE ES EL ADAPTADOR ,ESTA CREANDO UN ADAPATADOR , LO QUE HACE EL WORD ADAPTER ES DARLE FORMA A LOS ARCHIVOS , PARA QUE SE VEAN EN LA FORMA QUE SE DEBEN VER
* LO QUE PIDE ESTA CLASE ES EL ACTIVIY , UN ARRAYLIST CON LOS OBJETOS WORD, Y  EL COLOR (R.COLOR.CATEGORY_COLORS)ES EL COLOR)*/
        Wordadapter adapter = new Wordadapter(this , palabra , R.color.category_colors );
        /*SIMPLEMTE HACES UN SET A LA LISTVIEW Y LE MANDAS EL ADAPTADOR  */
        listView.setAdapter(adapter );

    }
}
