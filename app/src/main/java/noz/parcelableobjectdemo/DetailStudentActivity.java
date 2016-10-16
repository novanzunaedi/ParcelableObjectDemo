package noz.parcelableobjectdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by CLient-Pc on 16/10/2016.
 */

public class DetailStudentActivity extends AppCompatActivity {

    private TextView tvNama, tvAlamat, tvMatPel, tvUmur;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmuridactivity);
        Murid murid = getIntent().getParcelableExtra("murid");

        tvNama = (TextView) findViewById(R.id.tvNama);
        tvAlamat = (TextView) findViewById(R.id.tvAlamat);
        tvMatPel = (TextView) findViewById(R.id.tvMataPelajaran);
        tvUmur = (TextView) findViewById(R.id.tvUmur);


        if(murid!=null){
            tvNama.setText("Nama : " + murid.mNama);
            tvAlamat.setText("Alamat : " + murid.mAlamat);
            tvMatPel.setText("Mata Pelajaran : " + murid.mMataPelajaran);
            tvUmur.setText("Umur : " + murid.mUmur);
        }
    }
}
