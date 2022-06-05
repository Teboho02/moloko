package com.example.hope;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView v;
    String[] questiom = {"Question 1","Question 2","Question 3"};
    String[] cout = {"1","2","3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.ListV);
        CustomBaseAdapter x = new CustomBaseAdapter(MainActivity.this,cout,questiom);
        v.setAdapter(x);

    }
}