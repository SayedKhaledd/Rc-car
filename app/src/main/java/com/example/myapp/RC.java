package com.example.myapp;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public class RC extends Fragment implements View.OnTouchListener {
    ImageButton up;
public RC(){

}
    MainActivity m =new MainActivity();
    private long mLastClickTime = 0;

int i=0;
    ImageButton left;
    ImageButton right;
    ImageButton down;
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

        return root;

    }



    @Override
    public boolean onTouch(View v, MotionEvent arg1) {
        if(SystemClock.elapsedRealtime()-mLastClickTime<1000 && (v.getId()==right.getId() || v.getId()==up.getId())){
            int action = arg1.getAction();

            if(action == MotionEvent.ACTION_DOWN) {
                Toast.makeText(m.getApplicationContext(), "Bluetooth Device Not Available", Toast.LENGTH_LONG).show();

                if (MainActivity.btSocket != null) {
                    try {
                        MainActivity.btSocket.getOutputStream().write("I".getBytes());

                        return true;
                    } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                    }

                }
                return true;

            } else if (action == MotionEvent.ACTION_UP) {
                if (MainActivity.btSocket != null) {
                    try {
                        MainActivity.btSocket.getOutputStream().write("0".getBytes());
                        return true;
                    } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                    }

                }
                // check logine functionality.

                return true;


            }
        }
        mLastClickTime = SystemClock.elapsedRealtime();

        switch (v.getId()) {
    case R.id.left :{
        int action = arg1.getAction();

        if(action == MotionEvent.ACTION_DOWN) {

            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("L".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            return true;

        } else if (action == MotionEvent.ACTION_UP) {
            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("0".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            // check logine functionality.

            return true;


        }
        break;
    }
    case R.id.up :{
        int action = arg1.getAction();

        if(action == MotionEvent.ACTION_DOWN) {

            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("F".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            return true;

        } else if (action == MotionEvent.ACTION_UP) {
            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("0".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            // check logine functionality.

            return true;


        }
        break;
    }
    case R.id.right :{
        int action = arg1.getAction();

        if(action == MotionEvent.ACTION_DOWN) {

            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("R".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            return true;

        } else if (action == MotionEvent.ACTION_UP) {
            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("0".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            // check logine functionality.

            return true;


        }
        break;
    }
    case R.id.down :{
        int action = arg1.getAction();

        if(action == MotionEvent.ACTION_DOWN) {

            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("D".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            return true;

        } else if (action == MotionEvent.ACTION_UP) {
            if (MainActivity.btSocket != null) {
                try {
                    MainActivity.btSocket.getOutputStream().write("0".getBytes());
                    return true;
                } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                }

            }
            // check logine functionality.

            return true;


        }
        break;
    }
}

        return false;
    }
}
