package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class trapesium extends AppCompatActivity {
    private EditText angkaPertamaEditText, angkaKeduaEditText, angkaKetigaEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        // Inisialisasi EditText untuk input angka pertama, kedua, dan ketiga
        angkaPertamaEditText = findViewById(R.id.angkapertama);
        angkaKeduaEditText = findViewById(R.id.angkakedua);
        angkaKetigaEditText = findViewById(R.id.angkaketiga);

        // Inisialisasi TextView untuk menampilkan hasil
        hasilTextView = findViewById(R.id.hasil);

        // Inisialisasi ImageView untuk gambar hitung trapesium
        ImageView hitungImageView = findViewById(R.id.hitungpersegipanjang);

        // Menambahkan OnClickListener pada ImageView
        hitungImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTrapesium();
            }
        });
    }

    // Method untuk menghitung luas trapesium
    private void hitungLuasTrapesium() {
        // Mendapatkan nilai angka pertama, kedua, dan ketiga dari EditText
        String angkaPertamaStr = angkaPertamaEditText.getText().toString().trim();
        String angkaKeduaStr = angkaKeduaEditText.getText().toString().trim();
        String angkaKetigaStr = angkaKetigaEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!angkaPertamaStr.isEmpty() && !angkaKeduaStr.isEmpty() && !angkaKetigaStr.isEmpty()) {
            // Konversi nilai angka pertama, kedua, dan ketiga menjadi integer
            int angkaPertama = Integer.parseInt(angkaPertamaStr);
            int angkaKedua = Integer.parseInt(angkaKeduaStr);
            int angkaKetiga = Integer.parseInt(angkaKetigaStr);

            // Menghitung luas trapesium
            double luas = 0.5 * (angkaPertama + angkaKedua) * angkaKetiga;

            // Mengonversi luas ke tipe data int
            int luasBulat = (int) Math.round(luas);

            // Menampilkan hasil dalam TextView
            hasilTextView.setText("Luas Trapesium: " + luasBulat);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilTextView.setText("Masukkan semua angka terlebih dahulu");
        }
    }
}