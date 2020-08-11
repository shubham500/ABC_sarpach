package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GrampanchayatSamiti extends AppCompatActivity {
    ImageView gs1,gs2;
    TextView gsname1,gsname2;
    TextView gswarsd1,gswarsd2;
    TextView mob1,mob2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grampanchayat_samiti);
        initgs();
    }

    private void initgs() {
        gsname1=findViewById(R.id.G_S_name1);
        gsname2=findViewById(R.id.G_S_name2);
        gs1=findViewById(R.id.G_S_photo1);
        gs2=findViewById(R.id.G_S_photo2);
        mob1=findViewById(R.id.G_S_mobile_number1);
        mob2=findViewById(R.id.G_S_mobile_number2);
        gswarsd1=findViewById(R.id.Ward_no1);
        gswarsd2=findViewById(R.id.Ward_no2);

    }
}
