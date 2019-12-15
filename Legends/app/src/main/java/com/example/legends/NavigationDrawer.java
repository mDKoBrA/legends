package com.example.legends;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.legends.authentication.LoginActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public abstract class NavigationDrawer extends AppCompatActivity {

    protected DrawerLayout drawer_layout;
    private ActionBarDrawerToggle action_toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        drawer_layout = findViewById(R.id.activity_navigation_drawer);
        action_toggle = new ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.close);

        drawer_layout.addDrawerListener(action_toggle);
        action_toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        NavigationView navigation_view = findViewById(R.id.navigation_view);
        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.home:
                        Intent home = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(home);
                        break;
                    case R.id.cazare_camin:
                        Intent cazare_camin = new Intent(getApplicationContext(), CaminActivity.class);
                        startActivity(cazare_camin);
                        break;
                    case R.id.sala_forta:
                        Intent sala_forta = new Intent(getApplicationContext(), FitnesActivity.class);
                        startActivity(sala_forta);
                        break;
                    case R.id.activitati_extracuriculare:
                        Intent activitati_extracuriculare = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(activitati_extracuriculare);
                        break;
                    case R.id.mail_box:
                        Intent mail_box = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(mail_box);
                        break;
                    case R.id.logout:
                        Intent logout = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(logout);
                        break;
                    default:
                        return true;
                }

                return true;

            }
        });
        setNavigation();
    }

    protected abstract int getLayoutRes();

    private void setNavigation() {
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = Objects.requireNonNull(inflater).inflate(getLayoutRes(), null, false);
        drawer_layout.addView(contentView, 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (action_toggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}