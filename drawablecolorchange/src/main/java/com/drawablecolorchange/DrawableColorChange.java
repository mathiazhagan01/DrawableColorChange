package com.drawablecolorchange;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
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

    public void setDrawable(Bitmap bitmap) {
        setBitmap(bitmap);
    }

    public void setBitmap(Bitmap bitmap) {
        setDrawable(bitmapToDrawable(bitmap));
    }

    public void setBitmap(Drawable drawable) {
        setDrawable(drawable);
    }

    public void setBitmap(@DrawableRes int drawableResId) {
        setDrawable(drawableResId);
    }

    public void setColor(@ColorInt Integer color) {
        this.color = color;
    }

    public void setColorResId(@ColorRes Integer colorResId) {
        if (colorResId != null) {
            this.color = ResourcesCompat.getColor(context.getResources(), colorResId, null);
        }
    }

    public void changeColor() {
        if (drawable == null) {
            throw new NullPointerException("Drawable is null. Please set drawable by setDrawable() or setBitmap() method");
        }
        if (color == null) {
            throw new NullPointerException("Color is null. Please set color by setColor() or setColorResID() method");
        }
        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
    }

    public Drawable getColorChangedDrawable() {
        changeColor();
        return drawable;
    }

    private Bitmap drawableToBitmap() throws OutOfMemoryError {
        Bitmap mutableBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mutableBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return mutableBitmap;
    }

    public Bitmap getColorChangedBitmap() {
        if (drawable == null) {
            throw new NullPointerException("Drawable is null. Please set drawable by setDrawable() or setBitmap() method");
        }
        if (color == null) {
            throw new NullPointerException("Color is null. Please set color by setColor() or setColorResID() method");
        }
        return drawableToBitmap();
    }

    private Drawable bitmapToDrawable(Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public Drawable changeColorById(@DrawableRes Integer drawableResId, @ColorRes Integer colorResId) {
        setDrawable(drawableResId);
        if (colorResId != null)
            setColorResId(colorResId);
        return getColorChangedDrawable();
    }

    public Drawable changeColorById(Drawable drawable, @ColorRes Integer colorResId) {
        setDrawable(drawable);
        if (colorResId != null)
            setColorResId(colorResId);
        return getColorChangedDrawable();
    }

    public Drawable changeColorById(Bitmap bitmap, @ColorRes Integer colorResId) {
        return changeColorById(bitmapToDrawable(bitmap), colorResId);
    }

    public Drawable changeColorByColor(@DrawableRes Integer drawableResId, @ColorInt Integer color) {
        setDrawable(drawableResId);
        if (color != null)
            setColor(color);
        return getColorChangedDrawable();
    }

    public Drawable changeColorByColor(Drawable drawable, @ColorInt Integer color) {
        setDrawable(drawable);
        if (color != null)
            setColor(color);
        return getColorChangedDrawable();
    }

    public Drawable changeColorByColor(Bitmap bitmap, @ColorInt Integer color) {
        return changeColorByColor(bitmapToDrawable(bitmap), color);
    }
}