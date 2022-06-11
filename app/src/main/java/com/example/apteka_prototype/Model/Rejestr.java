package com.example.apteka_prototype.Model;


public class Rejestr {
    public int id;
    public String nazwa, rodzaj, moc, postac, substancja;

    public Rejestr(int id, String nazwa, String rodzaj, String moc, String postac, String substancja){
        this.id = id;
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
        this.moc = moc;
        this.postac = postac;
        this.substancja = substancja;
    }

    public Rejestr() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getMoc() {
        return moc;
    }

    public void setMoc(String moc) {
        this.moc = moc;
    }

    public String getPostac() {
        return postac;
    }

    public void setPostac(String postac) {
        this.postac = postac;
    }

    public String getSubstancja() {
        return substancja;
    }

    public void setSubstancja(String substancja) {
        this.substancja = substancja;
    }
}
