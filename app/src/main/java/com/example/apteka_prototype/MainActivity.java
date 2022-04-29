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

import com.example.apteka_prototype.addmedicine.AddMedicineActivity;
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
    private AppDatabase DB;


    public void readcsv(){
        String file = "src\\Rejestr.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new InputStreamReader(getAssets().open("Rejestr.csv")));
            while ((line = reader.readLine()) !=null){

                String[] row = line.split(",");

                Lek temp = new Lek();
                temp.IPL = row[0];
                temp.NPL = row[1];
                temp.NPS = row[2];
                temp.RP = row[3];
                temp.GD = row[4];
                temp.OK = row[5];
                temp.M = row[6];
                temp.PF = row[7];
                temp.WP = row[8];
                temp.TP = row[9];
                temp.NP = row[10];
                temp.KA = row[11];
                temp.PO = row[12];
                temp.OP = row[13];
                temp.SC = row[14];
                temp.UL = row[15];
                temp.CH = row[16];
                DB.lekDao().insertAll(temp);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = (ImageButton) findViewById(R.id.add_drug);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.callendar);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.drugs_database);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.my_drugs);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.find_pharmacy);
        DB = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"DB").build();
        readcsv();

        TextView theTextView = (TextView) findViewById(R.id.textView);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 18){
            theTextView.setText("DZIEŃ DOBRY");
        }else if(timeOfDay >= 18 && timeOfDay < 24){
            theTextView.setText("DOBRY WIECZÓR");}


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, add_prescription.class);
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
                Intent intent4 = new Intent(MainActivity.this, my_drugs.class);
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