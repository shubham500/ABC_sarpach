package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    TextView title;
    EditText name,email,password,phone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        title=findViewById(R.id.Registration);
        name=findViewById(R.id.Name);
        password=findViewById(R.id.Password);
        email=findViewById(R.id.Email);
        phone=findViewById(R.id.Phone);
        button=findViewById(R.id.Register_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Registration.this, "Your registration sussessfull.....", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
