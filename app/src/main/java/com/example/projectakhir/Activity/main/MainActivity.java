package com.example.projectakhir.Activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectakhir.Activity.dashboard.DashboardActivity;
import com.example.projectakhir.Activity.login.LoginActivity;
import com.example.projectakhir.Activity.sistempenjualan.PilihBarangActivity;
import com.example.projectakhir.Activity.sistempenjualan.SistemPenjualanAdminActivity;
import com.example.projectakhir.R;

public class MainActivity extends AppCompatActivity {
    Button btnDashboard, btnLogin, btnPilihBarang, btnSistemPenjualan, btnSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_features);

        btnDashboard        = findViewById(R.id.btnDashboard);
        btnLogin            = findViewById(R.id.btnLogin);
        btnPilihBarang      = findViewById(R.id.btnPilihBarang);
        btnSistemPenjualan  = findViewById(R.id.btnSistemPenjualan);
        btnSplash           = findViewById(R.id.btnSplash);

        // Mengaktifkan OnClickListener
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DashboardActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnPilihBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Error! Under Maintance", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this, PilihBarangActivity.class));
            }
        });

        btnSistemPenjualan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SistemPenjualanAdminActivity.class));
            }
        });

        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SplasActivity.class));
                Toast.makeText(MainActivity.this,"Kosong Mas!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}