package com.github.paulmanta.apptoolsattrs;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.AnyRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleableRes;

public abstract class AppToolsAttrs {

    @Nullable
    public static CharSequence getText(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr) {
        return a.getText(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr);
    }

    @Nullable
    public static String getString(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr) {
        return a.getString(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr);
    }

    public static boolean getBoolean(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, boolean defVal) {
        return a.getBoolean(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static int getInt(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, int defVal) {
        return a.getInt(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static float getFloat(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, float defVal) {
        return a.getFloat(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    @ColorInt
    public static int getColor(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, @ColorInt int defVal) {
        return a.getColor(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static int getInteger(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, int defVal) {
        return a.getInteger(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static float getDimension(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, float defVal) {
        return a.getDimension(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static int getDimensionPixelOffset(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, int defVal) {
        return a.getDimensionPixelOffset(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    public static int getDimensionPixelSize(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, int defVal) {
        return a.getDimensionPixelSize(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr, @AnyRes int defVal) {
        return a.getResourceId(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr, defVal);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr) {
        return a.getDrawable(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr);
    }

    @RequiresApi(26)
    @Nullable
    public static Typeface getFont(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int toolsAttr) {
        return a.getFont(isInEditMode && a.hasValue(toolsAttr) ? toolsAttr : appAttr);
    }

    private AppToolsAttrs() {
        // Just static methods
    }
}
