package com.example.sao_nicolau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChooseImageType extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_image_type);

        listView = (ListView) findViewById(R.id.listv1);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Images of the beach");
        arrayList.add("Images of the forests");
        arrayList.add("Images of Fauna and Flora");



        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), BeachImages.class);
                    startActivity(intent);}

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), ForestImages.class);
                    startActivity(intent);}

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), FaunaFloraImages.class);
                    startActivity(intent);}
            }
        });
    }
}