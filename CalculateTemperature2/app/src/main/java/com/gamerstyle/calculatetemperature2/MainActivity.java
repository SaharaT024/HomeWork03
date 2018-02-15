package com.gamerstyle.calculatetemperature2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private EditText input;
    private Button ChangetoF;
    private Button ChangetoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.edit1);
        output = findViewById(R.id.text2);
        ChangetoF = findViewById(R.id.ChangetoF);
        ChangetoC = findViewById(R.id.ChangetoC);

        ChangetoF.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    if (input.length() == 0) {
                        output.setText("input value");
                    }
                    else {
                        double val, cal;
                        String ans;
                        val = Double.parseDouble(input.getText().toString());
                        cal = (val * 1.8) + 32;
                        ans = Double.toString(cal);
                        output.setText(ans + " °F");
                    }
            }
        });
            ChangetoC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (input.length() == 0) {
                        output.setText("input value");
                    }
                    else {
                        double val, cal;
                        String ans;
                        val = Double.parseDouble(input.getText().toString());
                        cal = (val-32)/1.8;
                        ans = Double.toString(cal);
                        output.setText(ans + " °C");
                    }
                }
        });
    }
}
