package com.sonmob.vishot.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.sonmob.vishot.MainActivity;
import com.sonmob.vishot.R;
import com.sonmob.vishot.sharedpreferences.MySharedPreferences;

public class SplashActivity extends AppCompatActivity {

    private static final String KEY_FIRST_INSTALL = "KEY_SHARED_PREFERENCES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        final MySharedPreferences mySharedPreferences = new MySharedPreferences(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mySharedPreferences.getBooleanValue(KEY_FIRST_INSTALL)) {
                    //main
                    startActivity(MainActivity.class);
                } else {
                    //onboard
                    startActivity(OnBoardingActivity.class);
                    // khi mo onboard rui thi can update data trong mySharedPreferences = key
                    // de danh dau nguoi dung = lan cai dat dau tien = true => lan sau vao >> main
                    mySharedPreferences.putBooleanValue(KEY_FIRST_INSTALL, true);
                }
            }
        }, 2000);
    }

    private void startActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);

        //distroy splah screen
        finish();
    }
}