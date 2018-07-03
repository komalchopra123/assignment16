package com.example.hp.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext() , "Toast onCreate", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onStart", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext() , "Toast onResume", Toast.LENGTH_LONG).show();
}
@Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop()  {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onStop", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onDestroy", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onRestart", Toast.LENGTH_LONG).show();
    }
    }
