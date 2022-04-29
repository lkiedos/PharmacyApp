package com.example.apteka_prototype;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Lek {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "Identyfikator Produktu Leczniczego")
    public String IPL;

    @ColumnInfo(name = "Nazwa Produktu Leczniczego")
    public String NPL;

    @ColumnInfo(name = "Nazwa Powszechnie Stosowana")
    public String NPS;

    @ColumnInfo(name = "Rodzaj Preparatu")
    public String RP;

    @ColumnInfo(name = "Gatunki Docelowe")
    public String GD;

    @ColumnInfo(name = "Okres karenacji")
    public String OK;

    @ColumnInfo(name = "Moc")
    public String M;

    @ColumnInfo(name = "Postać Farmaceutyczna")
    public String PF;

    @ColumnInfo(name = "Ważność pozwolenia")
    public String WP;

    @ColumnInfo(name = "Typ Procedury")
    public String TP;

    @ColumnInfo(name = "Numer Procedury")
    public String NP;

    @ColumnInfo(name = "Kod ATC")
    public String KA;

    @ColumnInfo(name = "Podmiot odpowiedzialny")
    public String PO;

    @ColumnInfo(name = "Opakowanie")
    public String OP;

    @ColumnInfo(name = "Substancja Czynna")
    public String SC;

    @ColumnInfo(name = "Ulotka")
    public String UL;

    @ColumnInfo(name = "Charakterystyka")
    public String CH;


}
