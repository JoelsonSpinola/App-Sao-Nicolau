package com.example.sao_nicolau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChooseVideo extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_video);

        listView = (ListView) findViewById(R.id.lstv1);

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("First Video");
        arrayList.add("Second Video");
        arrayList.add("Third Video");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), FirstVideo.class);
                    startActivity(intent);}

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), SecondVideo.class);
                    startActivity(intent);}

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), ThirdVideo.class);
                    startActivity(intent);}
                }
            });

        }

}
