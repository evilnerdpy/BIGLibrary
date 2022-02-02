package com.example.biglibrary.model;

import java.util.ArrayList;

public class Book {
    private String bookTitle,bookAuthor, bookYearOfPublishing,bookTimeOfAdding,aboutBook;
    private ArrayList<String> bookTags;

    public Book(String bookTitle, String bookAuthor, String bookYearOfPublishing, String bookTimeOfAdding, String aboutBook, ArrayList<String> bookTags) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublishing = bookYearOfPublishing;
        this.bookTimeOfAdding = bookTimeOfAdding;
        this.aboutBook = aboutBook;
        this.bookTags = bookTags;
    }

    public String getBookYearOfPublishing() {
        return bookYearOfPublishing;
    }

    public void setBookYearOfPublishing(String bookYearOfPublishing) {
        this.bookYearOfPublishing = bookYearOfPublishing;
    }

    public String getBookTimeOfAdding() {
        return bookTimeOfAdding;
    }

    public void setBookTimeOfAdding(String bookTimeOfAdding) {
        this.bookTimeOfAdding = bookTimeOfAdding;
    }

    public String getAboutBook() {
        return aboutBook;
    }

    public void setAboutBook(String aboutBook) {
        this.aboutBook = aboutBook;
    }

    public ArrayList<String> getBookTags() {
        return bookTags;
    }

    public void setBookTags(ArrayList<String> bookTags) {
        this.bookTags = bookTags;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
