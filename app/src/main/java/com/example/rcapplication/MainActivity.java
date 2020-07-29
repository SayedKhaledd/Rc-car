package com.example.rcapplication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    BluetoothDevice knownDevice;
    BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
    BluetoothAdapter myBluetooth;
    BluetoothSocket btSocket;
    TabLayout tabLayout;
    ViewPager viewPager;
    TextView r;
     final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(this);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("RC"));
        tabLayout.addTab(tabLayout.newTab().setText("Arm"));
        tabLayout.addTab(tabLayout.newTab().setText("Auto"));
        tabLayout.addTab(tabLayout.newTab().setText("LineFollower"));

        MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount(), btSocket);
        viewPager.setAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String message= bluetoothConnection();
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction("Action", null).show();
        Log.d("OnClick","before");
       message= deviceConnection();
        //Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }
    public String bluetoothConnection() {

String message="";
        myBluetooth = BluetoothAdapter.getDefaultAdapter();
        if (myBluetooth == null) {
        message="Bluetooth Device Not Available";
            finish();
        }
        else {
            if (myBluetooth.isEnabled()) {
               message="connected";
            } else {
                Intent turnBTon = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(turnBTon, 1);

            }
        }
        return message;
    }


    public  String deviceConnection() {
String message="";

        try {
            knownDevice = bluetooth.getRemoteDevice("98:D3:21:FC:82:65");
            btSocket = knownDevice.createInsecureRfcommSocketToServiceRecord(myUUID);
        } catch (IOException e) {
            message="connection failed";

        }

        try {
            if(btSocket!=null){
                if(!btSocket.isConnected())
            btSocket.connect();
            message="Successfully connected ";
            }

        } catch (IOException e) {
            message="connection failed";

        }
        return message;

    }
}