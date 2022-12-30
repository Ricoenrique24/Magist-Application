package com.example.projectakhir.Activity.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectakhir.Activity.MenuActivity;
import com.example.projectakhir.Activity.sistempenjualan.Konfirmasi;
import com.example.projectakhir.Activity.dashboard.DashboardActivity;
import com.example.projectakhir.Activity.login.LoginActivity;
import com.example.projectakhir.Activity.sistempenjualan.PilihBarangActivity;
import com.example.projectakhir.Activity.sistempenjualan.SistemPenjualanAdminActivity;
import com.example.projectakhir.R;

public class MainActivity extends AppCompatActivity {
    Button btnDashboard, btnLogin, btnPilihBarang, btnSistemPenjualan, btnSplash, btnKonfirmasi, btnLogout, btnNavigationDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_features);

        btnDashboard        = findViewById(R.id.btnDashboard);
        btnLogin            = findViewById(R.id.btnLoginTest);
        btnPilihBarang      = findViewById(R.id.btnPilihBarang);
        btnSistemPenjualan  = findViewById(R.id.btnSistemPenjualan);
        btnSplash           = findViewById(R.id.btnSplash);
        btnKonfirmasi       = findViewById(R.id.btnKonfirmasi);
        btnLogout           = findViewById(R.id.btnKeluar);
        btnNavigationDrawer = findViewById(R.id.btnNavigationDrawer);

//        System.out.println(btnDashboard);

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
//                Toast.makeText(MainActivity.this,"Error! Under Maintance", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, PilihBarangActivity.class));
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

        btnKonfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Konfirmasi.class));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Apakah Anda Keluar ?");
                builder.setCancelable(true);
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        finish();
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        btnNavigationDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });
    }
}