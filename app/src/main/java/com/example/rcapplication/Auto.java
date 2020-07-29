package com.example.rcapplication;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class Auto extends Fragment {
BluetoothSocket btsocket;
    public Auto(BluetoothSocket bluetoothSocket) {
        btsocket=bluetoothSocket;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View root = (View) inflater.inflate(R.layout.auto, null);
        Button but = (Button) root.findViewById(R.id.button2);

        but.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if (btsocket != null) {
                    try {
                       btsocket.getOutputStream().write("A".getBytes());
                    } catch (IOException e) {

                  }
                }

            }});


        return root;
    }


}
