package com.example.abc.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abc.R;
import com.example.abc.all_component;

public class Login extends AppCompatActivity {
    TextView loginT;
    EditText l_email,l_password;
    Button l_button;

    public Login() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginT=findViewById(R.id.Login_title);
        l_email=findViewById(R.id.Login_Email);
        l_password=findViewById(R.id.Login_Password);
        l_button=findViewById(R.id.L_button);


        l_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Login.this, all_component.class);
                startActivity(intent );
                //Toast.makeText(Login.this, "You are loged in..", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
