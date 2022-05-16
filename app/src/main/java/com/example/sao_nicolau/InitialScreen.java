package com.example.sao_nicolau;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InitialScreen extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_screen);
        bt = findViewById(R.id.bt1);

        //INITIALIZING THE BACKGROUND SONG
        if (mediaPlayer ==  null)
            mediaPlayer = MediaPlayer.create(this, R.raw.backsong);
        mediaPlayer.start();

    }
    public void changeActivity(View view){
        Intent intent = new Intent(this, ChooseScreen.class);
        startActivity(intent);
        mediaPlayer.stop();
    }

}