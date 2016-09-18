package com.mathi.drawablecolorchange;

import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.drawablecolorchange.DrawableColorChange;

public class MainActivity extends AppCompatActivity {

    ImageView search, share, cancel, navigation, direction, screen_share, refresh, receipt, clear, restaurant_menu;
    EditText editText;
    Button changeColor;

    Drawable drawable;

    DrawableColorChange drawableColorChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (ImageView) findViewById(R.id.search);
        share = (ImageView) findViewById(R.id.share);
        cancel = (ImageView) findViewById(R.id.cancel);
        navigation = (ImageView) findViewById(R.id.navigation);
        direction = (ImageView) findViewById(R.id.direction);
        screen_share = (ImageView) findViewById(R.id.screen_share);
        refresh = (ImageView) findViewById(R.id.refresh);
        receipt = (ImageView) findViewById(R.id.receipt);
        clear = (ImageView) findViewById(R.id.clear);
        restaurant_menu = (ImageView) findViewById(R.id.restaurant_menu);

        editText = (EditText) findViewById(R.id.edit_text);

        changeColor = (Button) findViewById(R.id.change_color);

        changeColor.setOnClickListener(changeColorOnClickListener);

        drawableColorChange = new DrawableColorChange(this);
    }

    View.OnClickListener changeColorOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            changeColor();
        }
    };

    public void changeColor() {
        try {
            drawableColorChange.setDrawable(R.drawable.ic_search_white_48dp);
            drawableColorChange.setColorResId(R.color.pink);
            drawableColorChange.changeColor();
            drawable = drawableColorChange.getColorChangeDrawable();
            search.setImageDrawable(drawable);

            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_share_white_48dp, null);
            drawableColorChange.setDrawable(drawable);
            drawableColorChange.setColor(0xFFFF9800);   //Orange
            share.setImageDrawable(drawableColorChange.changeColor());

            drawableColorChange.setColorResId(R.color.teal);
            cancel.setImageDrawable(drawableColorChange.changeColorById(R.drawable.ic_cancel_white_48dp, null));

            drawableColorChange.setColor(0XFF4CAF50);   //Green
            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_navigation_white_48dp, null);
            navigation.setImageDrawable(drawableColorChange.changeColorById(drawable, null));

            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_directions_white_48dp, null);
            direction.setImageDrawable(drawableColorChange.changeColorById(drawable, R.color.amber));

            screen_share.setImageDrawable(drawableColorChange.changeColorById(R.drawable.ic_screen_share_black_48dp, R.color.blue_grey));

            drawableColorChange.setColor(0xFFFF5722);   //Deep Orange
            refresh.setImageDrawable(drawableColorChange.changeColorByColor(R.drawable.ic_refresh_black_48dp, null));

            drawableColorChange.setColor(0xFF795548);   //Brown
            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_receipt_black_48dp, null);
            receipt.setImageDrawable(drawableColorChange.changeColorByColor(drawable, null));

            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_clear_black_48dp, null);
            clear.setImageDrawable(drawableColorChange.changeColorByColor(drawable, 0xFFF44336));   //Red

            restaurant_menu.setImageDrawable(drawableColorChange.changeColorByColor(R.drawable.ic_restaurant_menu_black_48dp, 0xFF3F51B5)); //Indigo

            editText.setCompoundDrawablesWithIntrinsicBounds(null, null, drawableColorChange.changeColorById(R.drawable.ic_clear_white_48dp, android.R.color.black), null);

        } catch (NullPointerException e) {
            Log.v("Exception", "Null");
        }
    }
}
