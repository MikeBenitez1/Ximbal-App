package com.miguel.ximbal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class third_advice extends AppCompatActivity {

    private ImageButton back_menu4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_advice);

        back_menu4 = (ImageButton) findViewById(R.id.imageButton22);

        back_menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(third_advice.this, Advices.class );
                startActivity(intent); }
        });

    }

}
