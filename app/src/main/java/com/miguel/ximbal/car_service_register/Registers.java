package com.miguel.ximbal.car_service_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.miguel.ximbal.MainMenu;
import com.miguel.ximbal.R;
import com.miguel.ximbal.advices.Advices;

import java.util.ArrayList;

public class Registers extends AppCompatActivity {
    private ImageButton back_menu_registers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registers);

        back_menu_registers = (ImageButton) findViewById(R.id.imageButtonRegisters);

        back_menu_registers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Registers.this, MyCar.class );
                startActivity(intent); }
        });


        //create object of listview
        ListView listView = (ListView) findViewById(R.id.listview);

        //create ArrayList of String
        final ArrayList<String> arrayList = new ArrayList<>();

//Add elements to arraylist
        arrayList.add("android");
        arrayList.add("is");
        arrayList.add("great");
        arrayList.add("and I love it");
        arrayList.add("It");
        arrayList.add("is");
        arrayList.add("better");
        arrayList.add("then");
        arrayList.add("many");
        arrayList.add("other");
        arrayList.add("operating system.");
        arrayList.add("android");
        arrayList.add("is");
        arrayList.add("great");

        //Create Adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

//assign adapter to listview
        listView.setAdapter(arrayAdapter);

//add listener to listview
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
        //       public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//            Toast.makeText(MainActivity.this,"clicked item:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
        //       }
        //  });
    }
}


