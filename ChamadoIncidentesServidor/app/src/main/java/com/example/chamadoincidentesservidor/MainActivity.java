package com.example.chamadoincidentesservidor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button ir;
    Spinner spinnerSetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.arraySpinnerSetor, android.R.layout.simple_dropdown_item_1line);
        spinnerSetor.setAdapter(adapter);



        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, IncidentActivity.class);
                startActivity(it);
            }
        });

    }

    void init(){
        ir = findViewById(R.id.buttonIr);
        spinnerSetor = findViewById(R.id.spinnerSetor);
    }
}
