package com.progkhalifah.appdeviceinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.progkhalifah.appdeviceinformation.databinding.ActivityAboutUsPageBinding;

public class Aboutuspage extends AppCompatActivity {

    ActivityAboutUsPageBinding aboutUsPageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);

        aboutUsPageBinding = DataBindingUtil.setContentView(this, R.layout.activity_about_us_page);

        aboutUsPageBinding.txtclickme.setOnClickListener(v -> {
            ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.show();
        });

        aboutUsPageBinding.imgFacebook.setOnClickListener(v -> {

            mysocialmedia("https://www.facebook.com/profile.php?id=100076185465448");


            /*ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("The FaceBook will be add in the original app");
            progressDialog.show();*/
        });


        aboutUsPageBinding.imgSnap.setOnClickListener(v -> {

            mysocialmedia("http://www.snapchat.com/add/raad733raad");

            /* ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("The SnapChat will be add in the original app");
            progressDialog.show();*/
        });


        aboutUsPageBinding.imgWhats.setOnClickListener(v -> {

            mysocialmedia("https://api.whatsapp.com/send?phone="+"0550731413");

            /*ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("The WhatsApp will be add in the original app");
            progressDialog.show();*/
        });


        aboutUsPageBinding.imgTwitter.setOnClickListener(v -> {

            mysocialmedia("https://twitter.com/TechnlogyPlanet/");

            /*ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("The Twitter account will be add in the original app");
            progressDialog.show();*/
        });


        aboutUsPageBinding.imgInsta.setOnClickListener(v -> {

            mysocialmedia("https://www.instagram.com/technlogyplanet/");


            /*ProgressDialog progressDialog = new ProgressDialog(Aboutuspage.this);
            progressDialog.setTitle("Coming Soon....");
            progressDialog.setMessage("The Instagram account will be add in the original app");
            progressDialog.show();*/
        });






    }
    private void mysocialmedia(String url) {
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}