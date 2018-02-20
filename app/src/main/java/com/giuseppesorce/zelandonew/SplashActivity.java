package com.giuseppesorce.zelandonew;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class SplashActivity extends AppCompatActivity {

    private Button btLogin;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d("zelando", "    onCreate  Splash");


        btLogin = (Button) findViewById(R.id.btLogin);

        progressBar = (ProgressBar) findViewById(R.id.progress);


        btLogin.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogin();
            }
        });

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                enableButton();
            }
        }, 3000);

    }

    private void enableButton() {

        btLogin.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
    }

    private void gotoLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("zelando", "    onStart  Splash");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("zelando", "    onResume  Splash");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("zelando", "    onPause  Splash");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("zelando", "    onStop  Splash");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("zelando", "    onDestroy  Splash");
    }
}

