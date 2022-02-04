package com.example.biglibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biglibrary.model.Book;


import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private ArrayList<String> books;
    BookAdapter(ArrayList<String> books){
        this.books = books;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView bookTitle, bookAuthor, bookYearOfPublishing;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookTitle = itemView.findViewById(R.id.book_title);
            bookAuthor = itemView.findViewById(R.id.book_author);
            bookYearOfPublishing = itemView.findViewById(R.id.year_of_publishing);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.book_item_rec_view, viewGroup, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {
//        holder.bookTitle.setText(String.valueOf(booksService.getBooks().get(position).getBookTitle()));
//        holder.bookAuthor.setText(String.valueOf(booksService.getBooks().get(position).getBookAuthor()));
//        holder.bookYearOfPublishing.setText(String.valueOf(booksService.getBooks().get(position).getBookYearOfPublishing()));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }


}
