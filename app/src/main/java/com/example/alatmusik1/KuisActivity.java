package com.example.alatmusik1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisActivity extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    //Pertanyaan Kuis
    String[] pertanyaan_kuis = new String[]{
            "1. Dibawah ini yang termasuk alat musik \n gesek adalah ",
            "2. Yang tidak termasuk alat musik petik \n adalah ",
            "3. Berdasarkan cara memainkannya, Rebana,\n Kolintang, dan Talempong termasuk alat musik ",
            "4. Alat musik yang memiliki \n dawai adalah ",
            "5. Alat musik TIUP yang berasal dari Aceh adalah",
            "6. Alat musik yang memiliki paling tidak 2 alat dawai adalah",
            "7. Alat Musik PETIK yang berasal dari sunda adalah ",
            "8. Alat musik PUKUL yang memiliki arti Terbang adalah",
            "9. Alat musik PUKUL khas dari Minangkabau adalah ",
            "10. Alat musik TIUP khas dari Minang adalah"
    };
    //Pilihan Jawaban A,B,C,D
    String[] pilihan_jawaban = new String[]{
            "Rebana","Rebab","Karinding","Sasando",
            "Kecapi dan Sasando","Panting dan Sape Sampek","Panting dan Siter","Kecapi dan Rebana",
            "Pukul","Petik","Gesek","Tiup",
            "Bangai Alas","Karinding","Sasando","Pikon",
            "Keso-Keso","Talempong","Rebana","Bangsi Alas",
            "Gesek","Tiup","Pukul","Petik",
            "Serunai","Kecapi","Rebana","Surdam",
            "Saron","Talempong","Rebana","Kolintang",
            "Rebana","Talempong","Saron","Gambang",
            "Serunai","Surdam","Pikon","Karinding"
    };
    //Jawaban Benar
    String[] jawaban_benar = new String[]{
            "Rebab",
            "Kecapi dan Rebana",
            "Pukul",
            "Sasando",
            "Bangsi Alas",
            "Gesek",
            "Kecapi",
            "Rebana",
            "Talempong",
            "Serunai"
    };
    public  static final  int time = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
        rg = (RadioGroup) findViewById(R.id.radio_group);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {
            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])){
                Toast.makeText(getApplicationContext(), "Selamat Jawaban Kamu Benar!!!\n" + jawaban_benar[nomor],Toast.LENGTH_LONG).show();
                benar++;}
            else {salah++;
                Toast.makeText(getApplicationContext(), "Sayang Sekali Jawabanmu Kurang Tepat\n" +  "Yang benar adalah " +jawaban_benar[nomor],Toast.LENGTH_LONG).show();}
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this, "Pilih Salah Satu Jawaban", Toast.LENGTH_SHORT).show();
        }
    }

}

