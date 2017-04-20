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

public class Wordadapter extends ArrayAdapter<Word> {

    private int mcolorRefactor ;
    public Wordadapter(Activity context, ArrayList<Word> palabra, int colorRefactor) {

        super(context, 0, palabra);
         mcolorRefactor = colorRefactor;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.formato, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Word currentword = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwoktxt = (TextView) listItemView.findViewById(R.id.version_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwoktxt.setText(currentword.Getfrench());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentword.Getingle());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imagen);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
       ImageView boton = (ImageView) listItemView.findViewById(R.id.floatingActionButton) ;

       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               currentword.startmusic();
           }
       });




        if ( currentword.notimage() ){

        iconView.setImageResource(currentword.getImagenresource());

   }
        else{
       iconView.setVisibility(View.GONE);
   }
           View textcontainer = listItemView.findViewById(R.id.madre) ;
           int color = ContextCompat.getColor(getContext() , mcolorRefactor) ;
           View textcontainer2 = listItemView.findViewById(R.id.madre2) ;
             textcontainer.setBackgroundColor(color);
             textcontainer2.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
