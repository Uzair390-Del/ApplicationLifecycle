package com.example.applicationlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            btn3=findViewById(R.id.btn3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
            });
            Log.d("Message","Second Activity onCreate");
            return insets;

        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity","Second Activity onStart message is called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity","Second Activity onResume message is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity","Second Activity onPause message is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main Activity","Second Activity onStop message is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main Activity","Second Activity destroy message is called");
    }

}