package com.miguel.ximbal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Advices extends AppCompatActivity {

    private Button first_advice;
    private ImageButton back_menu1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advices);

        first_advice = (Button) findViewById(R.id.btnLogin2);
        back_menu1 = (ImageButton) findViewById(R.id.imageButton12);

        first_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, first_advice.class );
                startActivity(intent); }
        });

        back_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, MainMenu.class );
                startActivity(intent); }
        });
    }
}