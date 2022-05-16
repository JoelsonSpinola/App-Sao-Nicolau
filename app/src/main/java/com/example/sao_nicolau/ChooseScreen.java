package com.example.sao_nicolau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseScreen extends AppCompatActivity {
    ImageButton imgbt1;
    ImageButton imgbt2;
    ImageButton imgbt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_screen);

        imgbt1 = (ImageButton) findViewById(R.id.imgbt1);
        imgbt2 = (ImageButton) findViewById(R.id.imgbt2);
        imgbt3 = (ImageButton) findViewById(R.id.imgbt3);

    }

    public void images(View view) {
        Intent gRB = new Intent(this, ChooseImageType.class);
        startActivity(gRB);
    }

    public void videoYou(View view) {
        Intent gRB = new Intent(this, ChooseVideo.class);
        startActivity(gRB);
    }

    public void historyCulture(View view) {
        Intent gRB = new Intent(this, ScreenWebView.class);
        startActivity(gRB);
    }

}
