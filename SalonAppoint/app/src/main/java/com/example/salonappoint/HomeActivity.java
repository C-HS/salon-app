package com.example.salonappoint;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.salonappoint.fragment.AccountFragment;
import com.example.salonappoint.fragment.CartFragment;
import com.example.salonappoint.fragment.ExploreFragment;
import com.example.salonappoint.fragment.NearMeFragment;
import com.example.salonappoint.fragment.PopFragment;

public class HomeActivity extends AppCompatActivity {
/*    private BottomNavigationView bottomNavigationView;*/

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.near_me:
                    fragment = new NearMeFragment();
                    loadFragment(fragment);
                    //                    Toast.makeText(MainActivity.this, "Near Me", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.explore:
                    //                  Toast.makeText(MainActivity.this, "Explore", Toast.LENGTH_LONG).show();
                    fragment = new ExploreFragment();
                    loadFragment(fragment);
                    return true;

                case R.id.pop:
                    //                Toast.makeText(MainActivity.this, "POP", Toast.LENGTH_LONG).show();
                    fragment = new PopFragment();
                    loadFragment(fragment);
                    return true;

                case R.id.cart:
                    //              Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_LONG).show();
                    fragment = new CartFragment();
                    loadFragment(fragment);
                    return true;

                case R.id.account:
                    fragment = new AccountFragment();
                    loadFragment(fragment);
                    //            Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_LONG).show();
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(new NearMeFragment());
/*        bottomNavigationView = findViewById(R.id.navigation);
        loadFragment(new NearMeFragment());*/


/*        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()) {
                    case R.id.near_me:
                        fragment = new NearMeFragment();
                        loadFragment(fragment);
                        //                    Toast.makeText(MainActivity.this, "Near Me", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.explore:
                        //                  Toast.makeText(MainActivity.this, "Explore", Toast.LENGTH_LONG).show();
                        fragment = new ExploreFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.pop:
                        //                Toast.makeText(MainActivity.this, "POP", Toast.LENGTH_LONG).show();
                        fragment = new PopFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.cart:
                        //              Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_LONG).show();
                        fragment = new CartFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.account:
                        fragment = new AccountFragment();
                        loadFragment(fragment);
                        //            Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_LONG).show();
                        return true;
                }
                return false;
            }
        });*/
    }


    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
