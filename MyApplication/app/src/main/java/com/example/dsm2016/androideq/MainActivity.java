package com.example.dsm2016.androideq;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "xxx";
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab);
        viewPager = (ViewPager)findViewById(R.id.pager);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.music).setText("플레이어"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.eq).setText("이퀄라이징"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.chart).setText("인기차트"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.mypage).setText("마이페이지"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        Log.d(TAG,String.valueOf(tabLayout.getTabCount()));
        tabLayoutAdapter adapter = new tabLayoutAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
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

            }
        });
    }

}
