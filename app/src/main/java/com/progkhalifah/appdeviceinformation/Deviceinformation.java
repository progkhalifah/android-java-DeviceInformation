package com.progkhalifah.appdeviceinformation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;

import com.progkhalifah.appdeviceinformation.databinding.ActivityDeviceinformationBinding;

import java.util.Arrays;

public class Deviceinformation extends AppCompatActivity {

    private ActivityDeviceinformationBinding deviceinformationBinding;

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deviceinformation);

        deviceinformationBinding = DataBindingUtil.setContentView(this, R.layout.activity_deviceinformation);

        progressDialog = new ProgressDialog(Deviceinformation.this);
        progressDialog.setTitle("Get information about this Device");
        progressDialog.setMessage("Wait a moment...");
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(100);
        progressDialog.setProgress(0);
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        final int totalprogresstime = 100;
        final Thread t = new Thread(){
            @RequiresApi(api = Build.VERSION_CODES.M)
            @SuppressLint({"SetTextI18n", "HardwareIds"})
            @Override
            public void run() {
                int jumbtime=0;

                while (jumbtime < totalprogresstime){
                    try {
                        sleep(2000);
                        jumbtime += 1;
                        progressDialog.setProgress(jumbtime);
                        deviceinformationBinding.namePhone.setText(Build.DEVICE);
                        deviceinformationBinding.namePhone2.setText(Build.SERIAL);
                        deviceinformationBinding.namePhone3.setText(Build.PRODUCT);
                        deviceinformationBinding.namePhone4.setText(Build.BRAND);
                        deviceinformationBinding.namePhone5.setText(Build.DISPLAY);
                        deviceinformationBinding.namePhone6.setText(Build.FINGERPRINT);
                        deviceinformationBinding.namePhone7.setText(Build.MANUFACTURER);
                        deviceinformationBinding.namePhone8.setText(Build.MODEL);
                        deviceinformationBinding.namePhone9.setText(Build.TYPE);
                        deviceinformationBinding.namePhone10.setText(Build.USER);
                        deviceinformationBinding.namePhone11.setText(Build.UNKNOWN);
                        deviceinformationBinding.namePhone12.setText(Build.RADIO);
                        deviceinformationBinding.namePhone13.setText(Build.VERSION.BASE_OS);
                        deviceinformationBinding.namePhone14.setText(Build.VERSION.CODENAME);
                        deviceinformationBinding.namePhone15.setText(Build.VERSION.INCREMENTAL);
                        deviceinformationBinding.namePhone16.setText(Build.VERSION.RELEASE);
                        deviceinformationBinding.namePhone18.setText(Build.VERSION.SECURITY_PATCH);
                        deviceinformationBinding.namePhone19.setText(Build.VERSION.SDK);
                        deviceinformationBinding.namePhone20.setText(Build.VERSION.SDK_INT);
                        deviceinformationBinding.namePhone21.setText(Build.VERSION.PREVIEW_SDK_INT);
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