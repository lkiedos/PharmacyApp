package com.example.apteka_prototype;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface MlistaDao {

        @Query("SELECT * FROM Mlista")
        List<Mlista> getAll();

        @Query("SELECT * FROM Mlista WHERE `Nazwa Produktu Leczniczego` Like (:Nazwa)")
        List<Mlista> searchAllByNazwa(String Nazwa);

        @Query("SELECT * FROM Mlista WHERE `Rodzaj Preparatu` Like (:Rodzaj)")
        List<Mlista> searchAllByRodzaj(String Rodzaj);

        @Insert
        void insertAll(Mlista... mlistas);

        @Delete
        void delete(Mlista mlista);
    }

