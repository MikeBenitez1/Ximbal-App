package com.miguel.ximbal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Trips extends AppCompatActivity {

    private ImageButton back_menu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_trips);

        back_menu7 = (ImageButton) findViewById(R.id.imageButton25);

        back_menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Trips.this, MainMenu.class );
                startActivity(intent); }
        });

    }
}