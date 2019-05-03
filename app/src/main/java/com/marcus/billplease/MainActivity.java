package com.marcus.billplease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    EditText etAmt;
    EditText etPax;
    ToggleButton tbthnGST;
    ToggleButton tbtnSC;
    Button btnCalc;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmt = findViewById(R.id, etAmt);
        etPax = findViewById(R.id, etPax);
        tbthnGST = findViewById(R.id, tbthnGST);
        tbtnSC = findViewById(R.id, tbtnSC);
        btnCalc = findViewById(R.id, btnCalc);
        tvResult = findViewById(R.id, tvResult);



        public void onClick(View v){
            String data = etAmt.getText().toString();


            double amt = Double.parseDouble(data);
            int pax = Integer.parseInt(etPax.getText().toString());

            if (tbtnSC.isChecked() == true){
                amt = amt + 1.10;
            }

            if (tbthnGST.isChecked() == true){
                amt = amt + 1.07;
            }

            double ave = amt/pax;
            tvResult.setText("Each pax pays " + ave);

        }


    }
}
