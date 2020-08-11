package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.abc.complents.Complents;
import com.example.abc.gallary.Gallay;

public class all_component extends AppCompatActivity {
    CardView sarpanch;
    CardView village;
    CardView comity;
    CardView documents;
    CardView gallery;
    CardView complent;
    CardView complents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_component);
        initview();

        //sarpanch=(CardView) findViewById(R.id.cv_sarpanch);

        sarpanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(all_component.this,Sarpanch.class);
                startActivity(intent);
            }
        });

        village.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(all_component.this,villege.class);
                startActivity(intent);
            }
        });

        comity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(all_component.this,GrampanchayatSamiti.class);
                startActivity(intent);
            }
        });

        documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(all_component.this,Cetificate.class);
                startActivity(intent);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(all_component.this, Gallay.class);
                startActivity(intent);
            }
        });

        complents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(all_component.this, Complents.class);
                startActivity(intent);
            }
        });




    }

    private void initview() {
        sarpanch =findViewById(R.id.cv_sarpanch);
        village= findViewById(R.id.cv_village);
        comity=findViewById(R.id.cv_comity);
        documents=findViewById(R.id.cv_documents);
        gallery=findViewById(R.id.cv_gallery);
        complents=findViewById(R.id.cv_complaint);

/*

        plans=findViewById(R.id.cv_plans);

        epayment=findViewById(R.id.cv_epay);
        education=findViewById(R.id.cv_education);*/
    }
}
