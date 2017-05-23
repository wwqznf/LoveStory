package com.znf.lovestory.base;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.znf.lovestory.presenter.BasePresenter;

/**
 * Created by wwq on 2017/5/23.
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    protected P mPresenter;
    View root;

    public abstract int getLayoutId();

    View getRoot(LayoutInflater inflater, @Nullable ViewGroup container) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.unSubscribe();
    }
}
