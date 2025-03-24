package com.example.applicationlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn1;
    Button btn2;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            textView=findViewById(R.id.textView);
            btn1=findViewById(R.id.btn1);
            btn2=findViewById(R.id.btn2);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 counter=counter+1;
                 textView.setText(""+counter);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                }
            });
            Log.d("Message","First Activity onCreate");
            return insets;
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity","First Activity onStart message is called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity","First Activity onResume message is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity","First Activity onPause message is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main Activity","First Activity onStop message is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main Activity","First Activity destroy message is called");
    }
}