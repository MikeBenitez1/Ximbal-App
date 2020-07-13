package com.miguel.ximbal.advices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.miguel.ximbal.MainMenu;
import com.miguel.ximbal.R;

public class Advices extends AppCompatActivity {

    private ImageButton back_menu1;
    private Button first_advice;
    private Button second_advice;
    private Button third_advice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advices);

        back_menu1 = (ImageButton) findViewById(R.id.imageButton12);
        first_advice = (Button) findViewById(R.id.btnLogin2);
        second_advice = (Button) findViewById(R.id.btnLogin4);
        third_advice = (Button) findViewById(R.id.btnLogin3);


        back_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, MainMenu.class );
                startActivity(intent); }
        });

        first_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, com.miguel.ximbal.advices.first_advice.class );
                startActivity(intent); }
        });

        second_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, com.miguel.ximbal.advices.second_advice.class );
                startActivity(intent); }
        });

        third_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Advices.this, com.miguel.ximbal.advices.third_advice.class );
                startActivity(intent); }
        });

    }
}