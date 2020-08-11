package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class villege extends AppCompatActivity {

    TextView villegeName,population,about;
    ImageView villageImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villege);
        init();
    }
    private void init()
    {
        villageImage =findViewById(R.id.villege_image);
        villegeName = findViewById(R.id.villege_name);
        population =findViewById(R.id.population);
        about =findViewById(R.id.about_villege);
    }
}
