package com.example.apteka_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.widget.Spinner;
import android.content.DialogInterface;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;

import com.example.apteka_prototype.medicine.MedicineActivity;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity{
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = (ImageButton) findViewById(R.id.add_drug);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.callendar);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.drugs_database);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.my_drugs);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.find_pharmacy);


        TextView theTextView = (TextView) findViewById(R.id.textView);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay <= 5){
            theTextView.setText("DZIEŃ DOBRY");
        }else if(timeOfDay >= 18){
            theTextView.setText("DOBRY WIECZÓR");}


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent1);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, MedicineActivity.class);
                startActivity(intent2);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, drugs_database.class);
                startActivity(intent3);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, add_prescription.class);
                startActivity(intent4);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, find_pharmacy.class);
                startActivity(intent5);
            }
        });
    }
}