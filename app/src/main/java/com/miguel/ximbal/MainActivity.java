package com.miguel.ximbal;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Register1;
    /*private TextView Other;
    private ImageView Logo;
    private Toast Message;
    private SignInButton sign_in_button;*/

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Register1 = (Button)findViewById(R.id.btnRegister);
        /*Other = (TextView)findViewById(R.id.tvOther);
        Logo = (ImageView)findViewById(R.id.ivLogo);*/

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
