package com.example.day6joko;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailactivity extends AppCompatActivity {

    private TextView tvNamaKopi, tvDeskripsiKopi, tvHargaKopi;
    private ImageView ivKopi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);

        tvNamaKopi = findViewById(R.id.tv1);
        tvDeskripsiKopi = findViewById(R.id.tv2);
        tvHargaKopi = findViewById(R.id.tv3);
        ivKopi = findViewById(R.id.iv);



        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("KopiModel")) {
            kopimodel kopiModel = intent.getParcelableExtra("KopiModel");
            if (kopiModel != null) {
                // Menampilkan informasi kopi di UI
                tvNamaKopi.setText(kopiModel.getListKopi());
                tvDeskripsiKopi.setText(kopiModel.getDeskripsi());
                tvHargaKopi.setText("Harga: Rp " + kopiModel.getHarga());
                ivKopi.setImageResource(kopiModel.getLogo());
            }
        }
    }


    Button shareKopiInfo = findViewById(R.id.btn1);

    private void shareKopiInfo(kopimodel kopiModel) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = "Nama Kopi: " + kopiModel.getListKopi() +
                "\nDeskripsi: " + kopiModel.getDeskripsi() +
                "\nHarga: Rp " + kopiModel.getHarga();
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}