package noz.parcelableobjectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName, etAlamat, etUmur, etMatPel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         etName = (EditText) findViewById(R.id.etNama);
         etAlamat = (EditText) findViewById(R.id.etAlamat);
         etUmur = (EditText) findViewById(R.id.etUmur);
         etMatPel = (EditText) findViewById(R.id.etMatPel);

         findViewById(R.id.btnNext).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNext:
                setDataMurid();
                break;
            default:
                break;
        }
    }

    private void setDataMurid(){
        Murid murid = new Murid(etName.getText().toString(),
                                etAlamat.getText().toString(),
                                etMatPel.getText().toString(),
                                Integer.parseInt(etUmur.getText().toString()));

        startActivity(new Intent(MainActivity.this, DetailStudentActivity.class)
        .putExtra("murid", murid));
    }
}
