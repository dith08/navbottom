package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class bola extends AppCompatActivity {

    private EditText inputSisi;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        inputSisi = findViewById(R.id.angkakedua);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasBola(View view) {
        // Mendapatkan nilai sisi dari input
        String sisiStr = inputSisi.getText().toString();

        if (!sisiStr.isEmpty()) {
            // Mengonversi nilai sisi menjadi double
            double sisi = Double.parseDouble(sisiStr);

            // Menghitung luas bola
            double luas = 4 * Math.PI * Math.pow(sisi, 2);

            // Menampilkan hasil luas bola ke TextView
            hasilLuas.setText(String.format("Luas Bola: %.2f", luas));
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai sisi bola terlebih dahulu.");
        }
    }
}