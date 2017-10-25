package com.example.dsm2016.androideq;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by dsm2016 on 2017-10-23.
 */

public class tabLayoutAdapter extends FragmentStatePagerAdapter{

    private  int tabCount;
    public tabLayoutAdapter(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                TabLayout1 tabLayout = new TabLayout1();
                return tabLayout;
            }
            case 1:{
                TabLayout2 tabLayout2 = new TabLayout2();
                return tabLayout2;
            }
            case 2:{
                TabLayout3 tabLayout3 = new TabLayout3();
                return tabLayout3;
            }
            case 3:{
                TabLayout4 tabLayout4 = new TabLayout4();
                return tabLayout4;
            }

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
