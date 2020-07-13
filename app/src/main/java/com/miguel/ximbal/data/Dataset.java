package com.miguel.ximbal.data;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Dataset extends AppCompatActivity {

    public void showToastMethod(Dataset context) {
        Toast.makeText(Dataset.this, "Dataset guardado en /storage/sdcard0/", Toast.LENGTH_SHORT).show();


    }
}
