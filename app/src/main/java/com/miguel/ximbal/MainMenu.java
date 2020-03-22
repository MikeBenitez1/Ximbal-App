package com.miguel.ximbal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    private ImageButton MyCarButton;
    private ImageButton TripsButton;
    private ImageButton AdvicesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        MyCarButton = (ImageButton)findViewById(R.id.imageButton5);
        TripsButton = (ImageButton)findViewById(R.id.imageButton6);
        AdvicesButton = (ImageButton)findViewById(R.id.imageButton7);

        MyCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainMenu.this, MyCar.class );
                startActivity(intent); }
        });

        TripsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Trips.class);
                startActivity(intent); }
        });

        AdvicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Advices.class);
                startActivity(intent); }
        });
        }
}
