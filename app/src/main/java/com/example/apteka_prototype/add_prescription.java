package com.example.apteka_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class add_prescription extends AppCompatActivity {
    TextView wybory;
    EditText spType;
    Button btFind;
    Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prescription);
        AppDatabase DB = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"DB").build();

        wybory = findViewById(R.id.wybory);
        spType = findViewById(R.id.sp_type);
        btFind = findViewById(R.id.bt_find);
        btAdd = findViewById(R.id.bt_add);

        btFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Lek> Szukaj =(ArrayList<Lek>) DB.lekDao().searchAllByNazwa(spType.getText().toString());
                for (int i = 0; i<Szukaj.size();i++){
                    wybory.append(Szukaj.get(i).NPL + Szukaj.get(i).RP);

                }
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     //           ArrayList<Mlista> Dodaj=(ArrayList<Mlista>) DB.MlistaDao().insertAll(Szukaj);
           }
        });

    }




}