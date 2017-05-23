package com.znf.lovestory.util;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by wwq on 2017/5/23.
 */

public class CommonUtil {
    public static int dip2px(float dpValue) {
        final float scale = GlobalContext.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(float pxValue) {
        final float scale = GlobalContext.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获取手机的密度
     */
    public static float getDensity() {
        DisplayMetrics dm = GlobalContext.getContext().getResources().getDisplayMetrics();
        return dm.density;
    }

    public static int getScreenHeight() {
        DisplayMetrics displayMetrics = GlobalContext.getContext().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth() {
        DisplayMetrics displayMetrics = GlobalContext.getContext().getResources().getDisplayMetrics();
        return displayMetrics.widthPixels;
    }

}
