package myronheng.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tvLength;
    Button btnShorter, btnLonger, btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLength = findViewById(R.id.etLength);
        btnShorter = findViewById(R.id.btnShorter);
        btnLonger = findViewById(R.id.btnLonger);
        btnSet = findViewById(R.id.btnSet);



    }
}