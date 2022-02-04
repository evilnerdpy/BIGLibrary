package com.example.biglibrary.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.biglibrary.BookAdapter;
import com.example.biglibrary.R;
import com.example.biglibrary.model.Book;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class MainPageFragment extends Fragment {
    private FloatingActionButton addBookButton, findBookButton;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main_page, container, false);
        addBookButton = (FloatingActionButton) view.findViewById(R.id.add_book_button);
        findBookButton = (FloatingActionButton) view.findViewById(R.id.find_book_button);


        addBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideFABs();
                Navigation.findNavController(view)
                        .navigate(R.id.action_mainPageFragment_to_addBookFragment);

            }
        });

        findBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideFABs();
                Navigation.findNavController(view).navigate(R.id.action_mainPageFragment_to_findBookFragment);


            }
        });

        recyclerView = view.findViewById(R.id.book_rec_view);

//        BookAdapter adapter = new BookAdapter();
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        recyclerView.setAdapter(adapter);

        return  view;
    }

    public void onResume() {
        super.onResume();
        addBookButton.show();
        findBookButton.show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    private void hideFABs(){
        findBookButton.hide();
        addBookButton.hide();
    }



}