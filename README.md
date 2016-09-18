# DrawableColorChange
Android Library to change drawable color dynamically

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
