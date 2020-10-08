package com.miguel.ximbal.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.miguel.ximbal.MainActivity;
import com.miguel.ximbal.R;
import com.miguel.ximbal.data.DataBaseHelper;

public class Register extends AppCompatActivity {
    private DataBaseHelper db;
    private EditText e1, e2, e3, e4, e5;
    private Button b1;
    private ImageButton back_menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        db = new DataBaseHelper(this);
        e1 = (EditText) findViewById(R.id.etName3);
        e2 = (EditText) findViewById(R.id.etName2);
        e3 = (EditText) findViewById(R.id.etName4);
        e4 = (EditText) findViewById(R.id.etName5);
        e5 = (EditText) findViewById(R.id.etName6);
        b1 = (Button) findViewById(R.id.btnRegister2);
        back_menu6 = (ImageButton) findViewById(R.id.imageButton24);

        back_menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Register.this, MainActivity.class );
                startActivity(intent); }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                if (s1.equals("")||s3.equals("")||s2.equals("")||s4.equals("")||s5.equals("")) {
                    Toast.makeText(getApplicationContext(), "Hay campos vacios", Toast.LENGTH_LONG).show();

                }
                else {
                     if (s3.equals(s4)) {
                         Boolean chkemail = db.checkemail(s2);
                         if (chkemail == true) {
                             Boolean insert = db.insert(s2, s3);
                             if (insert == true) {
                                 Toast.makeText(getApplicationContext(), "Registro Satisfactorio", Toast.LENGTH_LONG).show();
                                 Intent intent = new Intent(Register.this, MainActivity.class);
                                 startActivity(intent);
                             }
                         else {
                            Toast.makeText(getApplicationContext(), "Correo Existente", Toast.LENGTH_LONG).show();
                        }
                     }
                     else {
                         Toast.makeText(getApplicationContext(), "No coinciden las contraseñas", Toast.LENGTH_LONG).show();
                     }
                }
            }
        }

    });

}}