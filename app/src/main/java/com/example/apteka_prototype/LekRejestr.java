package com.example.apteka_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class LekRejestr extends AppCompatActivity {

    public int id;
    public String nazwa, nazwaSt, rodzaj,  moc,
            postac, substancja;

    public LekRejestr (int id, String nazwaProduktuLeczniczego, String nazwapowszechniestosowana, String Rodzajpreparatu,
                          String moc, String postaćfarmaceutyczna, String substancjaczynna )
    {
        this.id = id;
        this.nazwa = nazwa;
        this.nazwaSt = nazwaSt;
        this.rodzaj = rodzaj;
        this.moc = moc;
        this.postac = postac;
        this.substancja = substancja;

    }
    public LekRejestr()
    {

    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getNazwa()
    {
        return nazwa;
    }
    public void setNazwa(String Nazwa)
    {
        this.nazwa = nazwa;
    }

    public String getNazwaSt()
    {
        return nazwaSt;
    }
    public void setNazwaSt(String nazwaSt)
    {
        this.nazwaSt = this.nazwaSt;
    }

    public String getRodzaj()
    {
        return nazwa;
    }
    public void setRodzaj(String rodzaj)
    {
        this.rodzaj = this.rodzaj;
    }

    public String getMoc()
    {
        return moc;
    }
    public void setMoc(String moc)
    {
        this.moc = this.moc;
    }

    public String getPostac()
    {
        return postac;
    }
    public void setPostac(String postac)
    {
        this.postac = this.postac;
    }

    public String getSubstancja()
    {
        return substancja;
    }
    public void setSubstancja(String substancja)
    {
        this.substancja = this.substancja;
    }

}