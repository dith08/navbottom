package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class limas extends AppCompatActivity {

    private EditText inputLuasAlas;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        inputLuasAlas = findViewById(R.id.angkakedua);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasLimas(View view) {
        // Mendapatkan nilai luas alas dari input
        String luasAlasStr = inputLuasAlas.getText().toString();

        if (!luasAlasStr.isEmpty()) {
            // Mengonversi nilai luas alas menjadi integer
            int luasAlas = Integer.parseInt(luasAlasStr);

            // Menghitung luas limas
            double luas = (5 * Math.pow(luasAlas, 2)) + (5 * Math.sqrt(3) * luasAlas);

            // Mengonversi luas ke tipe data int
            int luasBulat = (int) Math.round(luas);

            // Menampilkan hasil luas limas ke dalam TextView
            hasilLuas.setText("Luas Limas: " + luasBulat);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai luas alas limas terlebih dahulu.");
        }
    }
}
