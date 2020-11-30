package com.cobanogluhasan.appbasicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

     /*    int id = view.getId();
        String ourId= "";

       ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw","com.cobanogluhasan.appbasicphrases" );

        MediaPlayer mediaPlayer=  MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

        Log.i("button Tapped.", Integer.toString(id));
*/


        Button buttonTapped = (Button) view;

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonTapped.getTag().toString(), "raw", getPackageName()));

        mediaPlayer.start();



    }


}
