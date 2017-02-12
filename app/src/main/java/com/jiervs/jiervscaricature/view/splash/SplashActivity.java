package com.jiervs.jiervscaricature.view.splash;

import android.os.Bundle;
import com.jiervs.jiervscaricature.R;
import com.jiervs.jiervscaricature.view.BaseActivity;

/**
 * Created by Jiervs on 2017/2/12.
 */
public class SplashActivity extends BaseActivity implements SplashViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    public void jumpToMain() {

    }
}
