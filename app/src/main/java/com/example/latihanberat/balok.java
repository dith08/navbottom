package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class balok extends AppCompatActivity {

    private EditText inputPanjang, inputLebar, inputTinggi;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        inputPanjang = findViewById(R.id.angkapertama);
        inputLebar = findViewById(R.id.angkakedua);
        inputTinggi = findViewById(R.id.angkaketiga);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasBalok(View view) {
        // Mendapatkan nilai panjang, lebar, dan tinggi dari input
        String panjangStr = inputPanjang.getText().toString();
        String lebarStr = inputLebar.getText().toString();
        String tinggiStr = inputTinggi.getText().toString();

        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Mengonversi nilai panjang, lebar, dan tinggi menjadi integer
            int panjang = Integer.parseInt(panjangStr);
            int lebar = Integer.parseInt(lebarStr);
            int tinggi = Integer.parseInt(tinggiStr);

            // Menghitung luas balok
            int luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

            // Menampilkan hasil luas balok
            hasilLuas.setText("Luas Balok: " + luas);
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai panjang, lebar, dan tinggi balok terlebih dahulu.");
        }
    }
}