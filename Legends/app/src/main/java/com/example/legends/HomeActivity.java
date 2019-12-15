package com.example.legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class HomeActivity  extends NavigationDrawer {

    Button button2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button2 = findViewById(R.id.button2);
        button = findViewById(R.id.button);

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
    }
    @Override
    protected int getLayoutRes() {
        return R.layout.activity_home;
    }
}
