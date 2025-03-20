package com.example.applicationlifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity","The application onStart message is called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity","The application onResume message is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity","The application onPause message is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main Activity","The application onStop message is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main Activity","The application destroy message is called");
    }
}