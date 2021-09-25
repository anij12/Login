package com.example.my_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView b1;
    EditText e1;
    EditText p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageView) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.user);
        p1= (EditText) findViewById(R.id.pass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String pass=p1.getText().toString();
                if(s1.equals("ani") && pass.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "welcome "+s1,Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Check userid or password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}