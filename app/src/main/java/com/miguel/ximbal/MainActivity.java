package com.miguel.ximbal;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.miguel.ximbal.auth.Register;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Register1;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Register1 = (Button)findViewById(R.id.btnRegister);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(Name.getText().toString().equals("admin") && Password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),"Redireccionando...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainMenu.class );
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Credenciales Invalidas",Toast.LENGTH_SHORT).show();
                }

            }
        });
        Register1.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Register.class );
                startActivity(intent);
                }

        });
}

}
