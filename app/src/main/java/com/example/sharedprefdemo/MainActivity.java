package com.example.sharedprefdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//put an override before a new function is made
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnClick);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        //variable name variable value is a key value pair
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        //creates editor
        SharedPreferences.Editor editor = sharedPreferences.edit();

        //applies edits to value
        editor.putString("myString", "pingas");
        editor.apply();
    }


    class HandleTheClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            //Toast.maketext(MainActivity.this, "I am a toast message", Toast.LENGTH_LONG).show();
            Intent intent = new Intent (MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
    }
}