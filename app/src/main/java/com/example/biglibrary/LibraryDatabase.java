package com.example.biglibrary;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.biglibrary.model.Book;
import com.example.biglibrary.model.BookDao;
import com.example.biglibrary.model.BookTag;
import com.example.biglibrary.model.BookTagDao;
import com.example.biglibrary.model.Tag;
import com.example.biglibrary.model.TagDao;

@Database(entities = {Book.class, Tag.class, BookTag.class}, version = 1)
public abstract class LibraryDatabase extends RoomDatabase {
    public abstract BookDao bookDao();
    public abstract TagDao tagDao();
    public abstract BookTagDao bookTagDao();

}
