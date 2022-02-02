package com.example.biglibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainPageFragment extends Fragment {
    private FloatingActionButton addBookButton, findBookButton;
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