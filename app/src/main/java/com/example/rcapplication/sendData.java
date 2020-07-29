package com.example.rcapplication;

import android.bluetooth.BluetoothSocket;
import android.view.MotionEvent;

import java.io.IOException;

public class sendData {
    BluetoothSocket btsocket;
    public sendData(BluetoothSocket bt) {
        btsocket=bt;
    }

    public boolean sendchar(MotionEvent motionEvent, String c) {

        int action = motionEvent.getAction();

        if (action == MotionEvent.ACTION_DOWN) {

            return sendcharfunction(c);

        } else if (action == MotionEvent.ACTION_UP) {


            return sendcharfunction("0");

        }
        return false;
    }

    public boolean sendcharfunction(String c) {
        if (btsocket != null) {
            try {
                btsocket.getOutputStream().write(c.getBytes());
                return true;
            } catch (IOException e) {
                return false;

            }

        }
        return true;
    }
}
