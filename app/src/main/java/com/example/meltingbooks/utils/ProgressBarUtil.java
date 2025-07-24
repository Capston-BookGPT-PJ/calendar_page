package com.example.meltingbooks.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class ProgressBarUtil {

    public static void setProgressBar(Context context, View progressFillView, int progressPercent, int totalDp) {
        int totalWidthInPx = dpToPx(context, totalDp);
        int fillWidthInPx = totalWidthInPx * progressPercent / 100;

        ViewGroup.LayoutParams params = progressFillView.getLayoutParams();
        params.width = fillWidthInPx;
        progressFillView.setLayoutParams(params);
    }

    private static int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
}
