package com.leo.thingsreminder.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leo.thingsreminder.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer = new Thread(){
            public void run(){
                try
                {
                    sleep(2000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent login=new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(login);
                    overridePendingTransition(R.anim.anim_slide_in_left,R.anim.anim_slide_out_left);
                    finish();
                }
            }
        };timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SplashScreen.this.finish();
    }
}
