package com.example.biglibrary.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.Room;

@Entity(
        tableName = "book_tags",
        primaryKeys = {"book_id", "tag_id"},
        indices = {
                @Index("tag_id")
        },
        foreignKeys = {
                @ForeignKey(entity = Book.class,
                parentColumns = "id",
                childColumns = "book_id",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE),
                @ForeignKey(entity = Tag.class,
                parentColumns = "id",
                childColumns = "tag_id",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE)
        }
)
public class BookTag {
    @ColumnInfo(name = "book_id")
    @NonNull
    public String bookID;
    @NonNull
    @ColumnInfo(name = "tag_id")
    public String tagID;
}
