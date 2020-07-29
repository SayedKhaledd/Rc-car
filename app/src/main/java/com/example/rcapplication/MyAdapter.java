package com.example.rcapplication;

import android.bluetooth.BluetoothSocket;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

  private Context myContext;
  int totalTabs;
  BluetoothSocket btsocket;

  public MyAdapter(Context context, FragmentManager fm, int totalTabs, BluetoothSocket bluetoothSocket) {
    super(fm);
    myContext = context;
    this.totalTabs = totalTabs;
    btsocket=bluetoothSocket;
  }
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        RC rc = new RC(btsocket);
        return rc;
      case 1:
        Arm arm = new Arm(btsocket);
        return arm;
      case 2:
        Auto auto = new Auto(btsocket);
        return auto;
      case 3:
        LineFollower lineFollower = new LineFollower(btsocket);
        return lineFollower;
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return totalTabs;

  }
}
