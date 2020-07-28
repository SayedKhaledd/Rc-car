package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class Auto extends Fragment {

    public Auto() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View root = (View) inflater.inflate(R.layout.auto, null);
        Button but = (Button) root.findViewById(R.id.button2);

        but.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if (MainActivity.btSocket != null) {
                    try {
                        MainActivity.btSocket.getOutputStream().write("A".getBytes());
                    } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/   }
                }

            }});


        return root;
    }


}
