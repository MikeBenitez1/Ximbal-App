package com.miguel.ximbal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.miguel.ximbal.activity.ConfigActivity;
import com.miguel.ximbal.activity.SecondActivity;
import com.miguel.ximbal.activity.TripListActivity;
import com.miguel.ximbal.advices.Advices;
import com.miguel.ximbal.car_service_register.MyCar;
import com.miguel.ximbal.data.Dataset;

public class MainMenu extends AppCompatActivity {

    private ImageButton MyCarButton;
    private ImageButton DatasetButton;
    private ImageButton AdvicesButton;
    private Button StartOBDIIButton;
    private Button ConnectOBDIIButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        MyCarButton = (ImageButton)findViewById(R.id.imageButton5);
        DatasetButton = (ImageButton)findViewById(R.id.imageButton6);
        AdvicesButton = (ImageButton)findViewById(R.id.imageButton7);
        StartOBDIIButton = (Button)findViewById(R.id.obd2Button2);
        ConnectOBDIIButton = (Button)findViewById(R.id.obd2Button);

        StartOBDIIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainMenu.this, SecondActivity.class );
                startActivity(intent); }
        });

        ConnectOBDIIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainMenu.this, TripListActivity.class );
                startActivity(intent); }
        });

        MyCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainMenu.this, MyCar.class );
                startActivity(intent); }
        });

        DatasetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Dataset.class);
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
