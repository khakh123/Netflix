package com.example.a1691578.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class download extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
    }
    public void home(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, Sidebar.class);
        startActivity(intent);
    }
}
