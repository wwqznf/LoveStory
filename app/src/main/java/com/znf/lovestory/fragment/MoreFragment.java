package com.znf.lovestory.fragment;

import android.support.v4.app.Fragment;

import com.znf.lovestory.base.BaseFragment;

/**
 * Created by wwq on 2017/5/15.
 */
public class MoreFragment extends BaseFragment {
    private static MoreFragment instance;

    public static MoreFragment getInstance() {
        if(instance==null){
            instance=new MoreFragment();
        }
        return instance;
    }

    @Override
    public int getLayoutId() {
        return 0;
    }
}
