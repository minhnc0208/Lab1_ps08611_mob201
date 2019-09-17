package com.example.lab1_ps08611_mob201;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button startService, stopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService = findViewById(R.id.startService);
        stopService = findViewById(R.id.stopService);
        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khoi tao doi tuong Intent
                Intent intent = new Intent(MainActivity.this, ClassLabService.class);
                // khoi tao doi tuong Bundle
                Bundle b = new Bundle();
                // khai bao cac bo gia tri va gan vao Bundle
                b.putInt("StuID", 1);
                b.putString("StuName", "Minh");
                b.putString("Class", "LT14304");
                // gan Bundle vao Intent
                intent.putExtra("Student", b);
                // khoi tao service
                startService(intent);
            }
        });
        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassLabService.class);
                stopService(intent);
            }
        });
    }
}
