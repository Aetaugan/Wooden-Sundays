package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String TOTAL_COUNT = "total_count";


    public void openView (View view) {
        // Create an Intent to start the second activity
        Intent viewIntent = new Intent(this, ViewActivity.class);
        startActivity(viewIntent);
    }

    public void openNavBar (View view) {
        // Create an Intent to start the second activity
        Intent viewIntent = new Intent(this, NavBarActivity.class);
        startActivity(viewIntent);
    }
}
