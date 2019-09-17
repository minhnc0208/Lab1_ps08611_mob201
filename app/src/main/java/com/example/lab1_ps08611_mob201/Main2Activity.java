package com.example.lab1_ps08611_mob201;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
    }

    public void count(View view) {
        String s = editText.getText().toString();
        char c = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        Toast.makeText(this, "So ki tu a la : " + count, Toast.LENGTH_LONG).show();
    }


//    String someString = "elephant";
//    char someChar = 'e';
//    int count = 0;
//
//        for (int i = 0; i < someString.length(); i++) {
//        if (someString.charAt(i) == someChar) {
//            count++;
//        }
//    }

}
