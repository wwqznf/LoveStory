package com.znf.lovestory.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.util.AttributeSet;
import android.util.Log;

import com.znf.lovestory.util.CommonUtil;

/**
 * Created by wwq on 2017/5/15.
 */

public class MyBottomView extends BottomNavigationView {
    private Context mContext;
    private ObjectAnimator mHideAnim; // 隐藏的动画
    private ObjectAnimator mShowAnim; // 显现的动画
    private boolean isHiden = false;
    private int mDiffer;

    public MyBottomView(Context context) {
        this(context, null);
    }

    public MyBottomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyBottomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        mDiffer = CommonUtil.dip2px(56);
        mHideAnim = ObjectAnimator.ofFloat(this, "translationY", 0, mDiffer).setDuration(400);
        mShowAnim = ObjectAnimator.ofFloat(this, "translationY", mDiffer, 0).setDuration(400);
    }

    public void hide() {
        isHiden = true;
        Log.d("wwq", "getY: " + getY());
//        mHideAnim.start();
        Log.d("wwq", "hide()");
    }

    public boolean isHidden() {
        return isHiden;
    }

    public void show() {
        isHiden = false;
//        mShowAnim.start();
        Log.d("wwq", "show()");
    }

}
