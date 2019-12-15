package com.example.legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class HomeActivity  extends NavigationDrawer {

    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button2 = findViewById(R.id.button2);
        button = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),CaminActivity.class);
                startActivity(j);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), FitnesActivity.class);
                startActivity(j);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
    }
    @Override
    protected int getLayoutRes() {
        return R.layout.activity_home;
    }
}
