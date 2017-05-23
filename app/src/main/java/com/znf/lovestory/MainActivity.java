package com.znf.lovestory;

import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.znf.lovestory.base.BaseActivity;
import com.znf.lovestory.data.Constant;
import com.znf.lovestory.listener.HomeFragListener;
import com.znf.lovestory.util.CommonUtil;
import com.znf.lovestory.util.FragmentUtil;
import com.znf.lovestory.view.MyBottomView;

public class MainActivity extends BaseActivity implements HomeFragListener {
    private MyBottomView mBottomView;
    private FragmentUtil fragmentUtil;
    BottomNavigationView.OnNavigationItemSelectedListener myOnNavigationListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentUtil.initFragment(Constant.HOME);
                    return true;
                case R.id.navigation_more:
                    fragmentUtil.initFragment(Constant.MORE);
                    return true;
                case R.id.navigation_user:
                    fragmentUtil.initFragment(Constant.ME);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected int generateId() {
        return R.layout.gank_layout_main;
    }

    @Override
    public void initView() {
        mBottomView = (MyBottomView) findViewById(R.id.bottom_view);
        mBottomView.setOnNavigationItemSelectedListener(myOnNavigationListener);
        fragmentUtil = new FragmentUtil(this);
        fragmentUtil.initFragment(Constant.HOME);
    }

    @Override
    public void showBottom() {
        Log.d("wwq", "showBottom");
        if (mBottomView.isHidden()) {
            mBottomView.show();
            ObjectAnimator.ofFloat(mBottomView, "translationY", CommonUtil.dip2px(56), 0).setDuration(400).start();

        }
    }

    @Override
    public void hideBottom() {
        Log.d("wwq", "hideBottom9090");
        if (!mBottomView.isHidden()) {
            mBottomView.hide();
            ObjectAnimator.ofFloat(mBottomView, "translationY", 0, CommonUtil.dip2px(56)).setDuration(400).start();
        }
    }
}