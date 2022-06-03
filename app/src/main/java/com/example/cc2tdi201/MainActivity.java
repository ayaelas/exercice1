package com.example.cc2tdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main);
    }
    public void ajouter(View v){
        Intent i =new Intent(getApplicationContext(),Activity_add.class);
        startActivity(i);
    }
    public void editer(View v){
        Intent i =new Intent(getApplicationContext(),Activity_edit.class);
        startActivity(i);
    }
    public void lister(View v){
        Intent i =new Intent(getApplicationContext(),Activity_lister.class);
        startActivity(i);
    }

}