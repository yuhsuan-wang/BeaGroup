package com.example.sharon.beagroup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

        if(!SaveSharedPreference.getLog(MainActivity.this))
        {
            // call Login Activity
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }

    }
    public void openAccount(View view){
        startActivity(new Intent(this, account.class));
    } //按下個人帳戶進入畫面
    public void showMyLocation(View view){
        Intent intent = new Intent(this, showBeacons.class);
        startActivity(intent);
    }

    public void openLock(View view){
        startActivity(new Intent(this, lockFriend.class));
    } //按下個人帳戶進入畫面
}
