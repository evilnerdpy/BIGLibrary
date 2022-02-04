package com.example.biglibrary.model;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface TagDao {

    @Insert
    public void addTag(Tag tag);

    @Update
    public void  UpdateTag(Tag tag);

    @Delete
    public  void deleteTag(Tag tag);





}
