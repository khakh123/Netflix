package com.example.a1691578.netflix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class Sidebar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidebar);
    }
    public void home(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void manjot(View view) {
        Intent intent = new Intent(this, Users.class);
        startActivity(intent);
    }
    public void downloads(View view) {
        Intent intent = new Intent(this, download.class);
        startActivity(intent);
}
    public void tvshows(View view) {
        Intent intent = new Intent(this, tvshows.class);
        startActivity(intent);
    }
    public void notification(View view) {
        Intent intent = new Intent(this, notification.class);
        startActivity(intent);}}