package com.progkhalifah.appdeviceinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;

import com.progkhalifah.appdeviceinformation.databinding.ActivitySysteminformationBinding;

import java.util.Arrays;

public class Systeminformation extends AppCompatActivity {

    ActivitySysteminformationBinding systeminformationBinding;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systeminformation);
        systeminformationBinding = DataBindingUtil.setContentView(this, R.layout.activity_systeminformation);
        progressDialog = new ProgressDialog(Systeminformation.this);
        progressDialog.setTitle("Get information about this System");
        progressDialog.setMessage("Wait a moment...");
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(100);
        progressDialog.setProgress(0);
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        final int totalprogresstime = 100;
        final Thread t = new Thread(){
            @Override
            public void run() {
                int jumbtime=0;

                while (jumbtime < totalprogresstime){
                    try {
                        sleep(2000);
                        jumbtime += 1;
                        progressDialog.setProgress(jumbtime);
                        systeminformationBinding.namePhone1.setText(Build.BOARD);
                        systeminformationBinding.namePhone2.setText(Build.BOOTLOADER);
                        systeminformationBinding.namePhone3.setText(Build.HARDWARE);
                        systeminformationBinding.namePhone4.setText(Build.HOST);
                        systeminformationBinding.namePhone5.setText(Build.ID);
                        systeminformationBinding.namePhone6.setText(Build.TAGS);
                        systeminformationBinding.namePhone7.setText(Arrays.toString(Build.SUPPORTED_32_BIT_ABIS));
                        systeminformationBinding.namePhone8.setText(Arrays.toString(Build.SUPPORTED_64_BIT_ABIS));
                        systeminformationBinding.namePhone9.setText((int) Build.TIME);
                        systeminformationBinding.namePhone10.setText(Arrays.toString(Build.SUPPORTED_ABIS));
                        progressDialog.dismiss();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();






    }
}