package com.example.biglibrary.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BookTagDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void attachTagToBook(List<BookTag> bookTags);

    @Update
    public void updateBookTags(BookTag bookTag);

    @Delete
    public void deleteBookTag(BookTag bookTag);

    @Query("SELECT * FROM tags LEFT JOIN book_tags ON tags.id = book_tags.tag_id AND book_tags.book_id = (:bookId)")
    public  List<Tag> getBookTags(int bookId);
}
