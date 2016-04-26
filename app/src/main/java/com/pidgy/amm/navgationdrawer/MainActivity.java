package com.pidgy.amm.navgationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);



    drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
    actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar , R.string.drawer_open,R.string.drawer_close);
    drawerLayout.setDrawerListener(actionBarDrawerToggle);




    NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
    navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    // ------------------------ Drawer Mapping Between Menu To Activities ----------------------------//
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dash_id:
                // Maping the button to Halo Class
                startActivity(new Intent(this, Dashboard.class));
                break;
            case R.id.about_id:
                startActivity(new Intent(this, AboutUs.class));
                break;

            case R.id.setting_id:
                startActivity(new Intent(this, Setting.class));
                break;

        }
        return true;

    }
}

