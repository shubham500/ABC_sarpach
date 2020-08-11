package com.example.abc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.abc.certificates.BirthCertificates;
import com.example.abc.certificates.DeathCertificates;
import com.example.abc.certificates.DomicileCertificate;

public class Cetificate extends AppCompatActivity {

    TextView certificate;
    Button domicile, birth, death;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        certificate = findViewById(R.id.document_title);
        domicile = findViewById(R.id.domicile);
        birth = findViewById(R.id.birth_certificate);
        death = findViewById(R.id.death_certificate);

        domicile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cetificate.this, DomicileCertificate.class);
                startActivity(intent);
            }
        });
        death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cetificate.this, DeathCertificates.class);
                startActivity(intent);
            }
        });
        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cetificate.this, BirthCertificates.class);
                startActivity(intent);
            }
        });

    }
}
