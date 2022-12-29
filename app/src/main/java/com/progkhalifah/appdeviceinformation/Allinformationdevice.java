package com.progkhalifah.appdeviceinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import com.progkhalifah.appdeviceinformation.databinding.ActivityAllinformationdeviceBinding;

public class Allinformationdevice extends AppCompatActivity {

    private ActivityAllinformationdeviceBinding allinformationdeviceBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allinformationdevice);
        allinformationdeviceBinding = DataBindingUtil.setContentView(this, R.layout.activity_allinformationdevice);
        allinformationdeviceBinding.btnDevice.setOnClickListener(v -> {
            startActivity(new Intent(Allinformationdevice.this, Deviceinformation.class));
        });

        allinformationdeviceBinding.btnCpu.setOnClickListener(v -> {
            startActivity(new Intent(Allinformationdevice.this, CPUinformation.class));
        });

        allinformationdeviceBinding.btnSystem.setOnClickListener(v -> {
            startActivity(new Intent(Allinformationdevice.this, Systeminformation.class));
        });

        allinformationdeviceBinding.btnMemory.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Allinformationdevice.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("These details will be add in the original app");
            progressDialog.show();
        });

        allinformationdeviceBinding.btnBattery.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Allinformationdevice.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("These details will be add in the original app");
            progressDialog.show();
        });

        allinformationdeviceBinding.btnNetwork.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Allinformationdevice.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("These details will be add in the original app");
            progressDialog.show();
        });

        allinformationdeviceBinding.btnCamera.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Allinformationdevice.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("These details will be add in the original app");
            progressDialog.show();
        });

        allinformationdeviceBinding.btnSensors.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Allinformationdevice.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("These details will be add in the original app");
            progressDialog.show();
        });

        allinformationdeviceBinding.btnAboutus.setOnClickListener(v -> {
            startActivity(new Intent(Allinformationdevice.this, Aboutuspage.class));
        });

    }
}