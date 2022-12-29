package com.progkhalifah.appdeviceinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;

import com.progkhalifah.appdeviceinformation.databinding.ActivityCPUinformationBinding;

import java.util.Arrays;

public class CPUinformation extends AppCompatActivity {

    ActivityCPUinformationBinding cpUinformationBinding;
    ProgressDialog progressDialog ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_p_uinformation);
        cpUinformationBinding = DataBindingUtil.setContentView(this, R.layout.activity_c_p_uinformation);
        progressDialog = new ProgressDialog(CPUinformation.this);
        progressDialog.setTitle("Get information about this CPU");
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
                        cpUinformationBinding.namePhone1.setText(Build.CPU_ABI);
                        cpUinformationBinding.namePhone2.setText(Build.CPU_ABI2);
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