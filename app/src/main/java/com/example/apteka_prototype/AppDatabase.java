package com.example.apteka_prototype;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Lek.class, Mlista.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LekDao lekDao();
    public abstract MlistaDao MlistaDao();
}
