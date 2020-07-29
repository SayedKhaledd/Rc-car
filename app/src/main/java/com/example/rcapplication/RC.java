package com.example.rcapplication;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class RC extends Fragment implements View.OnTouchListener {
    ImageButton up, left, right, down;
    BluetoothSocket btsocket;
    sendData send;
public RC(BluetoothSocket bluetoothSocket){
btsocket=bluetoothSocket;
}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View root = (View) inflater.inflate(R.layout.rc, null);


         left=(ImageButton) root.findViewById(R.id.left);
           left.setOnTouchListener(this);

        up=(ImageButton) root.findViewById(R.id.up);

        up.setOnTouchListener(this);
         right=(ImageButton) root.findViewById(R.id.right);

        right.setOnTouchListener(this);
         down=(ImageButton) root.findViewById(R.id.down);

        down.setOnTouchListener(this);
        send=new sendData(btsocket);

        return root;

    }



    @Override
    public boolean onTouch(View view, MotionEvent arg1) {

        String charactersent = "";
        if (view.getId() == R.id.left) {
            charactersent = "L";

        } else if (view.getId() == R.id.up) {
            charactersent = "F";
        } else if (view.getId() == R.id.right) {
            charactersent = "R";

        } else if (view.getId() == R.id.down) {
            charactersent = "D";

        }


        return send.sendchar( arg1, charactersent);




    }
}
