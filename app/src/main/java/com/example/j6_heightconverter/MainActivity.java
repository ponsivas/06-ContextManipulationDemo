package com.example.j6_heightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText INCH,CM;
    Button CON,CL;
    Double IN,CMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        INCH = (EditText) findViewById(R.id.INCH);
        CM = (EditText) findViewById(R.id.CM);
        CON = (Button) findViewById(R.id.CVRT);
        CL = (Button) findViewById(R.id.CLR);

        CON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (INCH.getText().length()==0 && CM.getText().length()==0){
                    Toast.makeText(getApplicationContext(), "Enter numerical value in the INCHES/CENTIMETER Box, then press CONVERT button.", Toast.LENGTH_SHORT).show();
                }
                else if(INCH.getText().length()>0) {
                    IN = Double.parseDouble(INCH.getText().toString());
                    CMS = IN * 2.54;
                    CM.setText(Double.toString(CMS));
                }
                else if (CM.getText().length()>0){
                    CMS = Double.parseDouble(CM.getText().toString());
                    IN = CMS / 2.54;
                    INCH.setText(Double.toString(IN));
                }
            }
        });

        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                INCH.setText("");
                CM.setText("");
            }
        });

    }
}