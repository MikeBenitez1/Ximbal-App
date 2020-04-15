package com.miguel.ximbal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class second_advice extends AppCompatActivity {
    private ImageButton back_menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_advice);

        back_menu3 = (ImageButton) findViewById(R.id.imageButton21);

        back_menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(second_advice.this, Advices.class );
                startActivity(intent); }
        });
        }


}
