package com.example.biglibrary.model;

import java.util.ArrayList;
public class BooksService {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void  addBook(Book book){
        this.books.add(book);
    }

    public ArrayList<Book> getBooksTitleContainsSubstring(String substring){
        return  getBookContainsSubstringByFactor(substring, "title");
    }

    public ArrayList<Book> getBooksAuthorContainsSubstring(String substring){
        return  getBookContainsSubstringByFactor(substring, "author");
    }

    public void sortArrayOfBooks(ArrayList<Book> books){

    }

    private ArrayList<Book> getBookContainsSubstringByFactor(String substring, String factor){
        if (factor.equals("title")){
            return  new ArrayList<Book>();
        } else if (factor.equals("author")){
            return  new ArrayList<Book>();
        } else {
            return null;
        }
    }

}
