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
    public static CharSequence getText(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getText(appToolsAttr);
        }
        return a.getText(appAttr);
    }

    @Nullable
    public static String getString(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getString(appToolsAttr);
        }
        return a.getString(appAttr);
    }

    public static boolean getBoolean(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, boolean def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getBoolean(appToolsAttr, def);
        }
        return a.getBoolean(appAttr, def);
    }

    public static int getInt(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getInt(appToolsAttr, def);
        }
        return a.getInt(appAttr, def);
    }

    public static float getFloat(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, float def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getFloat(appToolsAttr, def);
        }
        return a.getFloat(appAttr, def);
    }

    @ColorInt
    public static int getColor(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, @ColorInt int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getColor(appToolsAttr, def);
        }
        return a.getColor(appAttr, def);
    }

    public static int getInteger(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getInteger(appToolsAttr, def);
        }
        return a.getInteger(appAttr, def);
    }

    public static float getDimension(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, float def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getDimension(appToolsAttr, def);
        }
        return a.getDimension(appAttr, def);
    }

    public static int getDimensionPixelOffset(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getDimensionPixelOffset(appToolsAttr, def);
        }
        return a.getDimensionPixelOffset(appAttr, def);
    }

    public static int getDimensionPixelSize(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getDimensionPixelSize(appToolsAttr, def);
        }
        return a.getDimensionPixelSize(appAttr, def);
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr, @AnyRes int def) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getResourceId(appToolsAttr, def);
        }
        return a.getResourceId(appAttr, def);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getDrawable(appToolsAttr);
        }
        return a.getDrawable(appAttr);
    }

    @RequiresApi(26)
    @Nullable
    public static Typeface getFont(@NonNull TypedArray a, boolean isInEditMode, @StyleableRes int appAttr, @StyleableRes int appToolsAttr) {
        if (isInEditMode && appToolsAttr != 0 && a.hasValue(appToolsAttr)) {
            return a.getFont(appToolsAttr);
        }
        return a.getFont(appAttr);
    }

    private AppToolsAttrs() {
        // Just static methods
    }
}
