package com.example.projectakhir.Activity.sistempenjualan;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectakhir.R;

public class PilihBarangActivity extends AppCompatActivity {

    ImageView ivKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_barang);

        ivKembali = findViewById(R.id.ibPilBarang);

        ivKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
//                startActivity(new Intent(PilihBarangActivity.this, MenuActivity.class));
            }
        });

    }

}
