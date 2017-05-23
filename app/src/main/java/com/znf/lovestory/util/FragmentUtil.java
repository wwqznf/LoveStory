package com.znf.lovestory.util;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.znf.lovestory.R;
import com.znf.lovestory.data.Constant;
import com.znf.lovestory.fragment.HomeFragment;
import com.znf.lovestory.fragment.MeFragment;
import com.znf.lovestory.fragment.MoreFragment;


/**
 * Created by zhanghao on 2017/3/17.
 */

public class FragmentUtil {
    private HomeFragment homeFragment;
    private MoreFragment moreFragment;
    private MeFragment meFragment;
    private FragmentManager mManager;
    private ActionBar actionBar;
    private FragmentTransaction mTransaction;
    private Context context;

    public FragmentUtil(AppCompatActivity activity){
        this.context=activity;
        mManager=activity.getSupportFragmentManager();
//        actionBar=activity.getSupportActionBar();
    }

    public void initFragment(String name){
        mTransaction=mManager.beginTransaction();

        hideFragments(mTransaction);
        switch (name){
            case Constant.HOME:
//                actionBar.setTitle("");
                if (homeFragment==null){
                    homeFragment=HomeFragment.getInstance();
                    mTransaction.add(R.id.fragContainer,homeFragment);
                }else
                    mTransaction.show(homeFragment);
                break;
            case Constant.MORE:
//                actionBar.setTitle("");
                if (moreFragment==null){
                    moreFragment=MoreFragment.getInstance();
                    mTransaction.add(R.id.fragContainer,moreFragment);
                }else
                    mTransaction.show(moreFragment);
                break;
            case Constant.ME:
//                actionBar.setTitle("");
                if (meFragment==null){
                    meFragment=MeFragment.getInstance();
                    mTransaction.add(R.id.fragContainer,meFragment);
                }else
                    mTransaction.show(meFragment);
                break;

            default:
                return;
        }
        mTransaction.commit();
    }

    private void hideFragments(FragmentTransaction mTransaction) {
        if (homeFragment!=null) mTransaction.hide(homeFragment);
        if (moreFragment!=null) mTransaction.hide(moreFragment);
        if (meFragment!=null) mTransaction.hide(meFragment);

    }

}
