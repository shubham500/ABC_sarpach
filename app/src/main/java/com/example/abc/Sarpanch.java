package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sarpanch extends AppCompatActivity {
    TextView sarpanchname,education,karya,awards;
    ImageView sarpanchImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarpanch);
        initsarpanch();
    }

    private void initsarpanch()
    {
        //sarpanchImage=findViewById(R.id.sarpanch_image);
        sarpanchname=findViewById(R.id.sarpanch_name);
        education=findViewById(R.id.sarpanch_education);
        karya=findViewById(R.id.sarpanch_Karya);
        awards=findViewById(R.id.sarpanch_awards);
    }
}
