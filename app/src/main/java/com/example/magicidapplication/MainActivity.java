package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_id;
    TextView tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id);
        btn_id = findViewById(R.id.btn_id);
        tv_id = findViewById(R.id.tv_id);

        btn_id.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String idNum = et_id.getText().toString().trim();

                String dob = idNum.substring(0, 6);

                int gender = Integer.parseInt(Character.toString(idNum.charAt(6)));

                String sGender;

                if (gender < 5) {
                    sGender = getString(R.string.female);
                }
                else {
                    sGender = getString(R.string.male);
                }

                int nationality = Integer.parseInt(Character.toString(idNum.charAt(10)));

                String sNationality;

                if (nationality==0) {
                    sNationality = getString(R.string.citizen);
                }
                else {
                    sNationality = getString(R.string.resident);
                }

                String text = (getString(R.string.dob) + dob + "/n" + getString(R.string.gender) + sGender +  getString(R.string.nationality) + sNationality);


                tv_id.setText(text);


            }
        });
    }
}
