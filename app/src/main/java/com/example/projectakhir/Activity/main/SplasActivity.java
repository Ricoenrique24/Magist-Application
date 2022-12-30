package com.example.projectakhir.Activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.projectakhir.Activity.login.LoginActivity;
import com.example.projectakhir.R;

public class SplasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplasActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}