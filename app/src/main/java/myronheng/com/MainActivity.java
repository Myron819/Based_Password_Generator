package myronheng.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tvLength;
    Button btnShorter, btnLonger, btnSet;

    HalvingValue hv;
    RandomSequence rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLength = findViewById(R.id.etLength);
        btnShorter = findViewById(R.id.btnShorter);
        btnLonger = findViewById(R.id.btnLonger);
        btnSet = findViewById(R.id.btnSet);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = Integer.parseInt(tvLength.getText().toString());
                hv = new HalvingValue(length);
            }
        });

        btnShorter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}