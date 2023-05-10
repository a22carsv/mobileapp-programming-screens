package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get Bundle that was passed to this activity.
        Bundle bundle = getIntent().getExtras();

        // Extract data from Bundle.
        String message = bundle.getString("message");

        // Display message in TextView.
        TextView messageTextView = findViewById(R.id.messageTextView);
        messageTextView.setText(message);
    }

}