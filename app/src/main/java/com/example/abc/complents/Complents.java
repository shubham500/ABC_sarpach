package com.example.abc.complents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abc.R;

public class Complents extends AppCompatActivity {
    TextView textView,complintReg;
    Button postbtn;
    ImageView compImge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complents);

        complintReg=findViewById(R.id.complentText);
        postbtn=findViewById(R.id.postButton);
        compImge=findViewById(R.id.compImg);

    }
}