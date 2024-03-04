package com.example.aplikasipenghitung;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        // Mendapatkan nilai dari Intent
        String result = getIntent().getStringExtra("result");

        // Menampilkan hasil di TextView
        TextView tvResult = findViewById(R.id.tv_result);
        tvResult.setText(result);
    }
}
