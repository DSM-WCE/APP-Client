package com.example.dsm2016.androideq;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsm2016 on 2017-10-24.
 */

public class TabLayout2 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Intent intent = new Intent(getActivity(),EqualizerActivity.class);
//        startActivity(intent);
        View v = inflater.inflate(R.layout.activity_equalizer,container,false);
        return v;
    }
}
