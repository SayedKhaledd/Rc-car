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

public class LineFollower extends Fragment {
BluetoothSocket btsocket;
    public LineFollower(BluetoothSocket bluetoothSocket){
btsocket=bluetoothSocket;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View root = (View) inflater.inflate(R.layout.linefollower, null);
        Button but = (Button) root.findViewById(R.id.button3);

        but.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if (btsocket != null) {
                    try {
                       btsocket.getOutputStream().write("S".getBytes());
                    } catch (IOException e) {

                  }
                }

            }});


        return root;
    }
}
