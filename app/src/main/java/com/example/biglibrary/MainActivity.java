package com.example.biglibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Fragment mainPageFragment = new MainPageFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainFragmentContainerView, mainPageFragment)
                    .commit();
        }
    }
}