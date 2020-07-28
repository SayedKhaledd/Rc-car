package com.example.myapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

  private Context myContext;
  int totalTabs;

  public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
    super(fm);
    myContext = context;
    this.totalTabs = totalTabs;
  }
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        RC rc = new RC();
        return rc;
      case 1:
        Arm arm = new Arm();
        return arm;
      case 2:
        Auto auto = new Auto();
        return auto;
      case 3:
        LightSensor lightSensor = new LightSensor();
        return lightSensor;
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return totalTabs;

  }
}
