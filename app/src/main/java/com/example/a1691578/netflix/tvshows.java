package com.example.a1691578.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tvshows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshows);
    }
    public void sidebar(View view) {
        Intent intent = new Intent(this, Sidebar.class);
        startActivity(intent);
    }
}
