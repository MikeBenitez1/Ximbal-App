package com.miguel.ximbal;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyCar extends AppCompatActivity implements AdapterView.OnItemSelectedListener, DatePickerDialog.OnDateSetListener  {

    String[] TipoRegistro = {"Servicio", "Reparación", "Verificación"};
    String[] Auto = {"Seleccionar auto", "Mazda"};
    private Button AutoRegister;
    private Button ServiceRegister;
    private TextView dateText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_car);


        AutoRegister = (Button) findViewById(R.id.btnLogin7);
        ServiceRegister = (Button) findViewById(R.id.btnLogin5);
        dateText = findViewById(R.id.textView2);


        AutoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Auto Registrado", Toast.LENGTH_SHORT).show();
            }
        });

        ServiceRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Registrado", Toast.LENGTH_SHORT).show();
            }
        });

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
        spin1.setOnItemSelectedListener(this);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, TipoRegistro);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter aa2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Auto);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin1.setAdapter(aa1);
        spin2.setAdapter(aa2);


        findViewById(R.id.buttonDate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });


    }

    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date =  + month + "/" + dayOfMonth + "/" + year;
        dateText.setText(date);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


