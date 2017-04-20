package ccwav.blogspot.com.employeemanager;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ccwav.blogspot.com.employeemanager.Fragment.CompanyFragment;
import ccwav.blogspot.com.employeemanager.Fragment.GroupFragment;
import ccwav.blogspot.com.employeemanager.Fragment.ProfileFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        displaySelect(R.id.nav_Company);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
     //   Handle navigation view item clicks here.

        int id = item.getItemId();
        displaySelect(id);
        return true;
    }
    private void displaySelect(int id){
        Fragment fragment = null;
        switch (id){
            case R.id.nav_Company:
                fragment = new CompanyFragment();
                break;
            case R.id.nav_Group:
                fragment = new GroupFragment();
                break;
            case R.id.nav_Profile:
                fragment = new ProfileFragment();
                break;
            case R.id.nav_Logout:
                finish();
                break;
            case R.id.nav_About:
                Toast.makeText(this,"Version 1",Toast.LENGTH_LONG).show();
                break;
        }
        if(fragment != null){
            FragmentTransaction FT = getSupportFragmentManager().beginTransaction();
            FT.replace(R.id.content_home,fragment);
            FT.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}