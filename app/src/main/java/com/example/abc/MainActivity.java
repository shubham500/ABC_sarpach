


package com.example.abc;
/*
 * Author :-Swapnil Galdhar..
 * topic:- Grampanchayat...
 * Date:=18 march 2020..
 *
 * */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.abc.login_register.Login;


public class MainActivity extends AppCompatActivity {

    // CardView cardView;
    TextView textView,logint;
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
      //  logint=findViewById(R.id.front_img);
        imageView =findViewById(R.id.front_img);

/*

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, com.example.abc.all_component.class);
                startActivity(intent);
               // Toast.makeText(MainActivity.this, "Hi your app is working", Toast.LENGTH_SHORT).show();
            }
        });
*/

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, all_component.class);
                startActivity(intent);
                 //Toast.makeText(MainActivity.this, "Hi your app is working", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
