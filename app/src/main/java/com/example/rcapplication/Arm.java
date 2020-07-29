package com.example.rcapplication;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class Arm extends Fragment implements View.OnTouchListener, View.OnClickListener {
    ImageButton up, down, rightrot, leftrot;
    Button into, out, open, close;
    BluetoothSocket btsocket;
    sendData send;

    public Arm(BluetoothSocket bluetoothSocket) {
        btsocket = bluetoothSocket;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = (View) inflater.inflate(R.layout.arm, null);

        up = (ImageButton) root.findViewById(R.id.up);
        down = (ImageButton) root.findViewById(R.id.down);
        rightrot = (ImageButton) root.findViewById(R.id.rightrot);
        leftrot = (ImageButton) root.findViewById(R.id.leftrot);
        into = (Button) root.findViewById(R.id.into);
        out = (Button) root.findViewById(R.id.out);
        open = (Button) root.findViewById(R.id.open);
        close = (Button) root.findViewById(R.id.close);

        up.setOnTouchListener(this);
        down.setOnTouchListener(this);
        rightrot.setOnTouchListener(this);
        leftrot.setOnTouchListener(this);
        into.setOnClickListener(this);
        out.setOnClickListener(this);
        close.setOnClickListener(this);
        open.setOnClickListener(this);
        send=new sendData(btsocket);
        return root;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        String charactersent = "";
        if (view.getId() == R.id.up) {
            charactersent = "U";

        } else if (view.getId() == R.id.down) {
            charactersent = "V";
        } else if (view.getId() == R.id.rightrot) {
            charactersent = "P";

        } else if (view.getId() == R.id.leftrot) {
            charactersent = "Q";

        }


        return send.sendchar( motionEvent, charactersent);
    }

    @Override
    public void onClick(View view) {
        String charactersent = "";
        if (view.getId() == R.id.into) {
            charactersent = "T";
        } else if (view.getId() == R.id.close) {
            charactersent = "C";

        } else if (view.getId() == R.id.out) {
            charactersent = "X";
        } else if (view.getId() == R.id.open) {
            charactersent = "N";
        }
        send.sendcharfunction(charactersent);

    }



}
