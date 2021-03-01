package com.example.gpstrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {


    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();
        if(auth == null)
        {
            setContentView(R.layout.activity_main);
        }
        else
        {
            Intent myIntent = new Intent(MainActivity.this, MyNavigationActivity.class);
            startActivity(myIntent);
            finish();
        }



    }

    public void goToLogin(View v)
    {
        Intent myIntent = new Intent(MainActivity.this,LogInActivity.class);
        startActivity(myIntent);
    }
    public void goToRegister(View v)
    {
        Intent myIntent = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(myIntent);
    }
}