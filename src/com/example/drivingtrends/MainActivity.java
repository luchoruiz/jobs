package com.example.drivingtrends;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.drivingtrends.fragments.fuelFragment;

/*
 * @author Lruiz
 */
public class MainActivity extends FragmentActivity {

    private Button fuelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fuelButton = (Button) findViewById(R.id.btn_fuel);

        fuelButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // This code replaces an old fragment with a new one in a transactional way
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content, new fuelFragment());
                fragmentTransaction.commit();

            }
        });

    }

}
