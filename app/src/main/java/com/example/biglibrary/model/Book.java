package com.example.biglibrary.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "books")
public class Book {
   @PrimaryKey(autoGenerate = true)
   @ColumnInfo(name = "id")
   public int bookId;

   @ColumnInfo(name = "book_title")
   public String bookTitle;

    @ColumnInfo(name = "book_author")
    public String bookAuthor;

    @ColumnInfo(name = "book_year_of_publishing")
    public String bookYearOfPublishing;

    @ColumnInfo(name = "book_time_of_adding")
    public String bookTimeOfAdding;

    @ColumnInfo(name = "book_aboutBook")
    public String about_book;


}
