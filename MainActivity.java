package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int hasil = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup rgJawaban1 = (RadioGroup) findViewById(R.id.rgJawaban1);
        final RadioGroup rgJawaban2 = (RadioGroup) findViewById(R.id.rgJawaban2);
        final RadioGroup rgJawaban3 = (RadioGroup) findViewById(R.id.rgJawaban3);
        final RadioGroup rgJawaban4 = (RadioGroup) findViewById(R.id.rgJawaban4);
        final RadioGroup rgJawaban5 = (RadioGroup) findViewById(R.id.rgJawaban5);
        final RadioGroup rgJawaban6 = (RadioGroup) findViewById(R.id.rgJawaban6);
        final RadioGroup rgJawaban7 = (RadioGroup) findViewById(R.id.rgJawaban7);
        final RadioGroup rgJawaban8 = (RadioGroup) findViewById(R.id.rgJawaban8);
        final RadioGroup rgJawaban9 = (RadioGroup) findViewById(R.id.rgJawaban9);
        final RadioGroup rgJawaban10 = (RadioGroup) findViewById(R.id.rgJawaban10);

        Button btSubmit = (Button) findViewById(R.id.btnJawab);
        btSubmit.setOnClickListener((View) ->{
            int s1 = rgJawaban1.getCheckedRadioButtonId();
            switch (s1){
                case R.id.jwb1_1:
                    break;
                case R.id.jwb2_1:
                    hasil += 10;
                    break;
                case R.id.jwb3_1:
                    break;
            }

            int s2 = rgJawaban2.getCheckedRadioButtonId();
            switch (s2){
                case R.id.jwb1_2:
                    hasil += 10;
                    break;
                case R.id.jwb2_2:
                    break;
                case R.id.jwb3_2:
                    break;
            }

            int s3 = rgJawaban3.getCheckedRadioButtonId();
            switch (s3){
                case R.id.jwb1_3:
                    break;
                case R.id.jwb2_3:
                    break;
                case R.id.jwb3_3:
                    hasil += 10;
                    break;
            }

            int s4 = rgJawaban4.getCheckedRadioButtonId();
            switch (s4){
                case R.id.jwb1_4:
                    break;
                case R.id.jwb2_4:
                    break;
                case R.id.jwb3_4:
                    hasil += 10;
                    break;
            }

            int s5 = rgJawaban5.getCheckedRadioButtonId();
            switch (s5){
                case R.id.jwb1_5:
                    hasil += 10;
                    break;
                case R.id.jwb2_5:
                    break;
                case R.id.jwb3_5:
                    break;
            }

            int s6 = rgJawaban6.getCheckedRadioButtonId();
            switch (s6){
                case R.id.jwb1_6:
                    break;
                case R.id.jwb2_6:
                    hasil += 10;
                    break;
                case R.id.jwb3_6:
                    break;
            }

            int s7 = rgJawaban7.getCheckedRadioButtonId();
            switch (s7){
                case R.id.jwb1_7:
                    break;
                case R.id.jwb2_7:
                    break;
                case R.id.jwb3_7:
                    hasil += 10;
                    break;
            }

            int s8 = rgJawaban8.getCheckedRadioButtonId();
            switch (s8){
                case R.id.jwb1_8:
                    break;
                case R.id.jwb2_8:
                    hasil += 10;
                    break;
                case R.id.jwb3_8:
                    break;
            }

            int s9 = rgJawaban9.getCheckedRadioButtonId();
            switch (s9){
                case R.id.jwb1_9:
                    break;
                case R.id.jwb2_9:
                    hasil += 10;
                    break;
                case R.id.jwb3_9:
                    break;
            }

            int s10 = rgJawaban10.getCheckedRadioButtonId();
            switch (s10){
                case R.id.jwb1_10:
                    break;
                case R.id.jwb2_10:
                    hasil += 10;
                    break;
                case R.id.jwb3_10:
                    break;
            }

            Toast.makeText(getApplicationContext(), "Score mu =" + hasil, Toast.LENGTH_SHORT).show();
            hasil = 0;
        });

    }
}