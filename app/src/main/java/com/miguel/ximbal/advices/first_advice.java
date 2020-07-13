package com.miguel.ximbal.advices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import com.miguel.ximbal.R;

public class first_advice extends AppCompatActivity {

    private ImageButton back_menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_advice);

        back_menu2 = (ImageButton) findViewById(R.id.imageButton20);

        back_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(first_advice.this, Advices.class );
                startActivity(intent); }
        });

    }

}
