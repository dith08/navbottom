package com.example.latihanberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class kerucut extends AppCompatActivity {

    private EditText inputJariJari, inputTinggi;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        inputJariJari = findViewById(R.id.angkapertama);
        inputTinggi = findViewById(R.id.angkakedua);
        hasilLuas = findViewById(R.id.hasil);
    }

    public void hitungLuasKerucut(View view) {
        // Mendapatkan nilai jari-jari dan tinggi dari input
        String jariJariStr = inputJariJari.getText().toString();
        String tinggiStr = inputTinggi.getText().toString();

        if (!jariJariStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Mengonversi nilai jari-jari dan tinggi menjadi double
            double jariJari = Double.parseDouble(jariJariStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung luas kerucut
            double luas = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));

            // Mengubah format angka menjadi dua desimal
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedLuas = decimalFormat.format(luas);

            // Menampilkan hasil luas kerucut ke TextView
            hasilLuas.setText("Luas Kerucut: " + formattedLuas);
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai jari-jari dan tinggi kerucut terlebih dahulu.");
        }
    }
}
