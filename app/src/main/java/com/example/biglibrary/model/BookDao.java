package com.example.biglibrary.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface BookDao {

    @Insert
    public void addBook(Book book);

    @Update
    public void UpdateBook(Book book);

    @Query("SELECT * FROM books WHERE id IN (:bookIDs)")
    List<Book> loadAllByIds(int[] bookIDs);

    @Query("SELECT * FROM books WHERE book_title LIKE :value ")
    List<Book> findByTitle(String value);


    @Query("SELECT * FROM books WHERE book_author LIKE :value")
    List<Book> findByAuthor(String value);






}
