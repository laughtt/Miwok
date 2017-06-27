package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jose on 11/14/2016.
 */
    /*ESTE ES EL ADAPTADOR , EXTIENDE A LA CLASE ARRAYLIST (DE JAVA) https://www.youtube.com/watch?v=Vsf5LfT1-5U chekea este vide
    * si tienes dudas */
public class Wordadapter extends ArrayAdapter<Word> {
    /*CONSTRUCTOR DE EL ADAPTADOR , RECIBE CONTEXTO , ARRAYLIST PALABRA Y EL COLOR */
    private int mcolorRefactor ;

    public Wordadapter(Activity context, ArrayList<Word> palabra, int colorRefactor) {

        super(context, 0, palabra);
         mcolorRefactor = colorRefactor;

    }
        /* OVERRIDE AL METODO GETVIEW DE ARRAY LIST <WORD> ACA TE PIDE UN RETURN QUE ES EL VIEW */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.formato, parent, false);
        }
 /* ACA SE SE VE LA POSICION DE CADA OBJETO EN EL ARRAY LIST Y SE HACE UN SET*/
        final Word currentword = getItem(position);
 /* EL VIEW DE LA PALABRA ESPAÑOL*/
        TextView miwoktxt = (TextView) listItemView.findViewById(R.id.version_name);
 /* SET TEXT DE LA PALABRA EN ESPANOL*/
        miwoktxt.setText(currentword.Getfrench());
 /*EL VIEW DE LA PALBRA EN INGLES */
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);

        numberTextView.setText(currentword.Getingle());
         /* EL VIEW DE LA IMAGEN*/
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imagen);
 /* EL VIEW DEL BOTON*/
       ImageView boton = (ImageView) listItemView.findViewById(R.id.floatingActionButton) ;
 /*ACA SET ON CLICK LISTENER PARA EL BOTON  */
       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               currentword.startmusic();
           }
       });



 /*ACA SI NO TIENE IMAGEN SIMPLEMENTE HACE LA VISIVILIDAD DEL ICONVIEW NULA , Y SI NO ES ASI AGARRA LA IMAGEN Y LA PONE  */
        if ( currentword.notimage() ){

        iconView.setImageResource(currentword.getImagenresource());

   }
        else{
       iconView.setVisibility(View.GONE);
   }
   /*SI LA IMAGEN EXISTE TAMBIEN LE PONE UN BACKGROUND DIFERENTE  */
           View textcontainer = listItemView.findViewById(R.id.madre) ;
           int color = ContextCompat.getColor(getContext() , mcolorRefactor) ;
           View textcontainer2 = listItemView.findViewById(R.id.madre2) ;
             textcontainer.setBackgroundColor(color);
             textcontainer2.setBackgroundColor(color);


        // RETORNO EL LIST ITEM (CONTIENE LOS DOS TEXTOS Y LA IMAGEN )
        // so that it can be shown in the ListView
        return listItemView;
    }

}
