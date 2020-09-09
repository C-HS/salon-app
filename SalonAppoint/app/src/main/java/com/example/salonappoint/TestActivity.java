package com.example.salonappoint;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.salonappoint.fragment.AccountFragment;
import com.example.salonappoint.fragment.HomeFragment;
import com.example.salonappoint.fragment.MyAccountFragment;
import com.example.salonappoint.fragment.OrderFragment;

public class TestActivity extends AppCompatActivity {

    android.support.v4.app.FragmentManager manager;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   /// mTextMessage.setText(R.string.title_home);

                    HomeFragment homeFragment = new HomeFragment();

                    manager.beginTransaction()
                            .replace(R.id.fragnment_layout,homeFragment)
                            .commit();

                    return true;
                case R.id.navigation_dashboard:
                   // mTextMessage.setText(R.string.title_dashboard);

                    OrderFragment orderFragment = new OrderFragment();
                    manager.beginTransaction()
                            .replace(R.id.fragnment_layout,orderFragment)
                            .commit();

                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_notifications);

                    MyAccountFragment accountFragment = new MyAccountFragment();
                    manager.beginTransaction()
                            .replace(R.id.fragnment_layout,accountFragment)
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        manager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();

        manager.beginTransaction()
                .replace(R.id.fragnment_layout,homeFragment)
                .commit();
    }

}
