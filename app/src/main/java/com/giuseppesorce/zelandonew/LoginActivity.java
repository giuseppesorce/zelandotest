package com.giuseppesorce.zelandonew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("zelando", "    onStart  Login");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("zelando", "    onResume  Login");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("zelando", "    onPause  Login");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("zelando", "    onStop  Login");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("zelando", "    onDestroy  Login");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        finish();
    }
}
