package com.jiervs.jiervscaricature.view;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by Jiervs on 2017/2/12.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //继承AppCompatActivity时使用：
        //supportRequestWindowFeature(Window.FEATURENOTITLE);
        //继承activity时使用：
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(getLayoutResId());

        ViewGroup contentFrameLayout = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);
        View parentView = contentFrameLayout.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            parentView.setFitsSystemWindows(true);
        }
    }

    abstract protected int getLayoutResId();

}
