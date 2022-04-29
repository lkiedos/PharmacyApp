package com.example.apteka_prototype;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LekDao {
    @Query("SELECT * FROM Lek")
    List<Lek> getAll();

    @Query("SELECT * FROM Lek WHERE `Nazwa Produktu Leczniczego` Like (:Nazwa)")
    List<Lek> searchAllByNazwa(String Nazwa);

    @Query("SELECT * FROM Lek WHERE `Rodzaj Preparatu` Like (:Rodzaj)")
    List<Lek> searchAllByRodzaj(String Rodzaj);

    @Insert
    void insertAll(Lek... leki);

    @Delete
    void delete(Lek lek);
}