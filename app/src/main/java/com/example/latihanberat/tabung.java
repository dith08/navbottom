package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tabung extends AppCompatActivity {
    private EditText inputJariJari, inputTinggi;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        inputJariJari = findViewById(R.id.angkapertama);
        inputTinggi = findViewById(R.id.angkakedua);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasTabung(View view) {
        // Mendapatkan nilai jari-jari dan tinggi dari input
        String jariJariStr = inputJariJari.getText().toString();
        String tinggiStr = inputTinggi.getText().toString();

        if (!jariJariStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Mengonversi nilai jari-jari dan tinggi menjadi double
            double jariJari = Double.parseDouble(jariJariStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung luas tabung
            double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);

            // Menampilkan hasil luas tabung ke TextView
            hasilLuas.setText("Luas Tabung: " + luas);
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai jari-jari dan tinggi tabung terlebih dahulu.");
        }
    }
}
