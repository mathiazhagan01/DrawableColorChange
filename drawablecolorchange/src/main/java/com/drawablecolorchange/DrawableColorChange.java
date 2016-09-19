package com.drawablecolorchange;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.res.ResourcesCompat;

/**
 * Created by Mathiazhagan on 18-09-2016.
 */
public class DrawableColorChange {
    Context context;
    Drawable drawable = null;
    Integer color = null;

    public DrawableColorChange(Context context) {
        this.context = context;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public void setDrawable(@DrawableRes int drawableResId) {
        this.drawable = ResourcesCompat.getDrawable(context.getResources(), drawableResId, null);
    }

    public void setColor(@ColorInt Integer color) {
        this.color = color;
    }

    public void setColorResId(@ColorRes Integer colorResId) {
        if (colorResId != null) {
            this.color = ResourcesCompat.getColor(context.getResources(), colorResId, null);
        }
    }

    public Drawable changeColor() {
        if (drawable == null) {
            throw new NullPointerException("Drawable is null. Please set drawable by setDrawable() method");
        }
        if (color == null) {
            throw new NullPointerException("Color is null. Please set color by setColor() or setColorResID() method");
        }
        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        return drawable;
    }

    public Drawable getColorChangedDrawable() {
        if (drawable == null) {
            throw new NullPointerException("Drawable is null. Please set drawable by setDrawable() method");
        }
        return drawable;
    }

    @Deprecated
    public Drawable getColorChangeDrawable() {
        return getColorChangedDrawable();
    }

    public Drawable changeColorById(@DrawableRes Integer drawableResId, @ColorRes Integer colorResId) {
        setDrawable(drawableResId);
        if (colorResId != null)
            setColorResId(colorResId);
        return changeColor();
    }

    public Drawable changeColorById(Drawable drawable, @ColorRes Integer colorResId) {
        setDrawable(drawable);
        if (colorResId != null)
            setColorResId(colorResId);
        return changeColor();
    }

    public Drawable changeColorByColor(@DrawableRes Integer drawableResId, @ColorInt Integer color) {
        setDrawable(drawableResId);
        if (color != null)
            setColor(color);
        return changeColor();
    }

    public Drawable changeColorByColor(Drawable drawable, @ColorInt Integer color) {
        setDrawable(drawable);
        if (color != null)
            setColor(color);
        return changeColor();
    }
}
