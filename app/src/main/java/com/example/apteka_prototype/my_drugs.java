package com.example.apteka_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class my_drugs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_drugs);


    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView b = findViewById(R.id.Lista);
        AppDatabase DB = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "DB").build();
        ArrayList<Mlista> Lista = (ArrayList<Mlista>) DB.MlistaDao().getAll();
        for (int i = 0; i < Lista.size(); i++) {
            b.append(Lista.get(i).NPL + Lista.get(i).OP + Lista.get(i).PO + Lista.get(i).NP + Lista.get(i).CH + Lista.get(i).WP + Lista.get(i).PF + Lista.get(i).OK + Lista.get(i).GD + Lista.get(i).IPL + Lista.get(i).KA + Lista.get(i).M + Lista.get(i).NPS + Lista.get(i).RP + Lista.get(i).SC + Lista.get(i).TP);
        }
    }
}