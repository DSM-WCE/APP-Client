package com.example.dsm2016.androideq;

import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class EqualizerActivity extends AppCompatActivity {

    Equalizer equalizer;

    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;
    SeekBar seekBar4;
    SeekBar seekBar5;

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;

    TextView eqInfo1;
    TextView eqInfo2;
    TextView eqInfo3;
    TextView eqInfo4;
    TextView eqInfo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equalizer);

        try{
            equalizer = null;
            equalizer = new Equalizer(0, 0);
            equalizer.setEnabled(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        seekBar4 = (SeekBar)findViewById(R.id.seekBar4);
        seekBar5 = (SeekBar)findViewById(R.id.seekBar5);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);

        eqInfo1 = (TextView)findViewById(R.id.eqInfo1);
        eqInfo2 = (TextView)findViewById(R.id.eqInfo2);
        eqInfo3 = (TextView)findViewById(R.id.eqInfo3);
        eqInfo4 = (TextView)findViewById(R.id.eqInfo4);
        eqInfo5 = (TextView)findViewById(R.id.eqInfo5);

        seekBar1.setProgress(equalizer.getBandLevel((short)0));
        seekBar2.setProgress(equalizer.getBandLevel((short)1));
        seekBar3.setProgress(equalizer.getBandLevel((short)2));
        seekBar4.setProgress(equalizer.getBandLevel((short)3));
        seekBar5.setProgress(equalizer.getBandLevel((short)4));

        text1.setText(String.valueOf(seekBar1.getProgress()));
        text2.setText(String.valueOf(seekBar2.getProgress()));
        text3.setText(String.valueOf(seekBar3.getProgress()));
        text4.setText(String.valueOf(seekBar4.getProgress()));
        text5.setText(String.valueOf(seekBar5.getProgress()));

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                equalizer.setBandLevel((short)0, (short)(i-1500));
                text1.setText(String.valueOf(equalizer.getBandLevel((short)0)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                equalizer.setBandLevel((short)1, (short)(i-1500));
                text2.setText(String.valueOf(equalizer.getBandLevel((short)1)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                equalizer.setBandLevel((short)2, (short)(i-1500));
                text3.setText(String.valueOf(equalizer.getBandLevel((short)2)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                equalizer.setBandLevel((short)3, (short)(i-1500));
                text4.setText(String.valueOf(equalizer.getBandLevel((short)3)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                equalizer.setBandLevel((short)4, (short)(i-1500));
                text5.setText(String.valueOf(equalizer.getBandLevel((short)4)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }


}
