package org.leftbrained.registerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationBarView navigation = findViewById(R.id.bottomNavigationView);
        navigation.setOnItemSelectedListener(
                v -> {
                    int selectedId = v.getItemId();
                    if (selectedId == R.id.signUp) {
                        loadFragment(RegisterFragment.newInstance());
                        return true;
                    }
                    if (selectedId == R.id.signIn) {
                        loadFragment(LoginFragment.newInstance());
                        return true;
                    }
                    return false;
                }
        );
        loadFragment(LoginFragment.newInstance());
    }

    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.host, fragment).commit();
    }
}