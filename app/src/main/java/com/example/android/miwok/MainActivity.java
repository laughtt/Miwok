/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numbers, family, colors, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // LA ACTIVIDAD PRINCIPAL USA EL LAYOUT PRINCIPAL , ACA SE PONE LOS SET ON CLICK LISTENER DE TODOS LOS OTROS LAYOUTS
        setContentView(R.layout.principal);
        numbers = (TextView) findViewById(R.id.numbers);
        family = (TextView)findViewById(R.id.family) ;
        colors = (TextView)findViewById(R.id.colors) ;
        phrases = (TextView)findViewById(R.id.phrases) ;
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent familyint = new Intent(view.getContext() , family.class );
                    startActivity(familyint);
            }});
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsint = new Intent(view.getContext() , Colors.class);
                startActivity(colorsint);
            }
        });
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersint = new Intent(v.getContext(), Numbers.class);
                startActivity(numbersint);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesint = new Intent(view.getContext() , Phrases.class);
                startActivity(phrasesint);
            }
        });




    }


}






