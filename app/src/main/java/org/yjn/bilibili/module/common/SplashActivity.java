package org.yjn.bilibili.module.common;

import android.content.Intent;
import android.os.Bundle;

import com.trello.rxlifecycle.components.RxActivity;

import org.yjn.bilibili.R;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

public class SplashActivity extends RxActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bind = ButterKnife.bind(this);
//        SystemUiVisibilityUtil.hideStatusBar(getWindow(), true);
        setUpSplash();
    }


    private void setUpSplash() {
        Observable.timer(2000, TimeUnit.MILLISECONDS)
                .compose(bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aLong -> finishTask());
    }


    private void finishTask() {
//        boolean isLogin = PreferenceUtil.getBoolean(ConstantUtil.KEY, false);
        boolean isLogin = true;
        if (isLogin) {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        } else {
//            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        }
        SplashActivity.this.finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}