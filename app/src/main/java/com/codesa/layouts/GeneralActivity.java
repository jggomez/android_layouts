package com.codesa.layouts;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        /*FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
        tran.replace(R.id.activity_general, new LogInFragment());
        tran.commit();*/
    }
}
