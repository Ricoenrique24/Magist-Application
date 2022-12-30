package com.example.projectakhir.Activity.sistempenjualan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.projectakhir.Activity.MenuActivity;
import com.example.projectakhir.Activity.login.LoginActivity;
import com.example.projectakhir.Activity.main.SplasActivity;
import com.example.projectakhir.R;

public class Konfirmasi extends AppCompatActivity {

    private Button btnKonfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        btnKonfirmasi = findViewById(R.id.btnKonfirmasi);
        btnKonfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                berhasil();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

//                        startActivity(new Intent(Konfirmasi.this, MenuActivity.class));
                        finish();
                    }
                }, 1500);
            }
        });
    }

    private void berhasil(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(Konfirmasi.this);
        builder.setTitle("Transaksi Berhasil!");
        builder.setMessage("Data transaksi Berhasil disimpan ke server!");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}