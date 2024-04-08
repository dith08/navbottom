package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kubus extends AppCompatActivity {


    private EditText inputSisi;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        inputSisi = findViewById(R.id.angkakedua);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasKubus(View view) {
        // Mendapatkan nilai sisi dari input
        String sisiStr = inputSisi.getText().toString();

        if (!sisiStr.isEmpty()) {
            // Mengonversi nilai sisi menjadi integer
            int sisi = Integer.parseInt(sisiStr);

            // Menghitung luas kubus
            int luas = 6 * sisi * sisi;

            // Menampilkan hasil luas kubus
            hasilLuas.setText("Luas Kubus: " + luas);
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai sisi terlebih dahulu.");
        }
    }
}