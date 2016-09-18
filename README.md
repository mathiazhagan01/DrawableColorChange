# DrawableColorChange
Android Library to change drawable color dynamically

[![](https://jitpack.io/v/mathiazhagan01/DrawableColorChange.svg)](https://jitpack.io/#mathiazhagan01/DrawableColorChange)

### Example 1
  
  	DrawableColorChange drawableColorChange = new DrawableColorChange(this);	
  
  	drawableColorChange.setDrawable(R.drawable.icon);
  	drawableColorChange.setColorResId(R.color.colorAccent);
  	drawableColorChange.changeColor();
  	Drawable drawable = drawableColorChange.getColorChangeDrawable();
  	ImageView imageView = (ImageView) findViewById(R.id.image);
  	imageView.setImageDrawable(drawable);
  
### Example 2
  
  	imageView.setImageDrawable(drawableColorChange.changeColorById(R.drawable.icon, R.color.colorAccent));
