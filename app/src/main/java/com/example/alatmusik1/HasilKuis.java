package com.example.alatmusik1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class HasilKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);
        hasil.setText("Jawaban Benar : "+KuisActivity.benar+"\nJawaban Salah : "+KuisActivity.salah);
        nilai.setText(""+KuisActivity.hasil);
    }

    public  void ulangi(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),KuisActivity.class);
        startActivity(i);

    }
    public  void menu(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(i);

    }
}
