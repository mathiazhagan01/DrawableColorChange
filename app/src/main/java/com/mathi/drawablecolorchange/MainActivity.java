package com.mathi.drawablecolorchange;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.drawablecolorchange.DrawableColorChange;

public class MainActivity extends AppCompatActivity {

    ImageView search, share, cancel, navigation, direction, screen_share, refresh, receipt, clear, restaurant_menu, favourite, face, fingerprint, mood, whatshot;
    EditText editText;
    Button changeColor;

    Drawable drawable;
    Bitmap bitmap;

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
        favourite = (ImageView) findViewById(R.id.favorite);
        face = (ImageView) findViewById(R.id.face);
        fingerprint = (ImageView) findViewById(R.id.fingerprint);
        mood = (ImageView) findViewById(R.id.mood);
        whatshot = (ImageView) findViewById(R.id.whatshot);

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
            drawable = drawableColorChange.getColorChangedDrawable();
            search.setImageDrawable(drawable);

            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_share_white_48dp, null);
            drawableColorChange.setDrawable(drawable);
            drawableColorChange.setColor(0xFFFF9800);   //Orange
            share.setImageDrawable(drawableColorChange.getColorChangedDrawable());

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

            drawableColorChange.setDrawable(R.drawable.ic_favorite_white_48dp);
            drawableColorChange.setColorResId(R.color.red);
            bitmap = drawableColorChange.getColorChangedBitmap();
            favourite.setImageBitmap(bitmap);

            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_face_white_48dp);
            face.setImageDrawable(drawableColorChange.changeColorById(bitmap, R.color.amber));

            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_fingerprint_white_48dp);
            fingerprint.setImageDrawable(drawableColorChange.changeColorByColor(bitmap, 0xFFE91E63));  //Pink

            drawableColorChange.changeColorById(R.drawable.ic_mood_white_48dp, R.color.teal);
            mood.setImageBitmap(drawableColorChange.getColorChangedBitmap());

            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_whatshot_white_48dp);
            drawableColorChange.setBitmap(bitmap);
            drawableColorChange.setColor(0xFFFF5722);   //Deep Orange
            whatshot.setImageBitmap(drawableColorChange.getColorChangedBitmap());

        } catch (NullPointerException e) {
            Log.v("NullPointerException", e.getLocalizedMessage());
        }
    }
}
