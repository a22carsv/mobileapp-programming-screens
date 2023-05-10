package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton; // Declare reference to button widget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton); // Find button by ID
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Create a Bundle object and add data to it
                Bundle bundle = new Bundle();
                bundle.putString("message", "Passing data is cool!");

                // Pass Bundle object to Intent.
                intent.putExtras(bundle);

                // Start second activity
                startActivity(intent);
            }
        });

    }
}
