package com.zhouxin.mvpdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by 周鑫 on 2016/5/13 15:50.
 */
public class SplashActivity extends Activity{
    Handler mHandler  = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity();
            }
        },2000);
    }

    private void initView() {

    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    private void startMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
    }
}


