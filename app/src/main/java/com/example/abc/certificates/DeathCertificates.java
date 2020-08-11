package com.example.abc.certificates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abc.R;

public class DeathCertificates extends AppCompatActivity {

    TextView textView;
    EditText ap_name,ap_adhar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_certificates);
        textView=findViewById(R.id.domicile);
        ap_name=findViewById(R.id.apllicant_name);
        ap_adhar=findViewById(R.id.apllicant_adharno);
        button=findViewById(R.id.btn_genarateCertificate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent=new Intent(Cetificate.this, DomicileCertificate);
                startActivity(intent);*/
                Toast.makeText(DeathCertificates.this, "Your Certificate is Generated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
