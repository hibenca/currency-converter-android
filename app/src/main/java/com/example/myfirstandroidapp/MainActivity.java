package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // dollar to pounds function
    public void convert(View view) {
        // Get data from input
        EditText editText = (EditText) findViewById(R.id.currency);
        // Store value from input into a string
        String dollars = editText.getText().toString();
        // Convert string to a double
        double dollarsDouble = Double.parseDouble(dollars);
        // convert dollars to pounds
        double poundsDouble = dollarsDouble * 1.3;
        // limit amount to 2 decimal places
        String poundsString = String.format("%.2f", poundsDouble);
        // Display conversion on screen
        Toast.makeText(this, "$" + dollarsDouble + " is £"+ poundsString + " in pounds", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}