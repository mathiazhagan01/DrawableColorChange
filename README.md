# DrawableColorChange
Android Library to change drawable color dynamically

[![](https://jitpack.io/v/mathiazhagan01/DrawableColorChange.svg)](https://jitpack.io/#mathiazhagan01/DrawableColorChange)

### Gradle

#### Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:
    
    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		  }
	  }
#### Step 2. Add the dependency
    
    dependencies {
	        compile 'com.github.mathiazhagan01:DrawableColorChange:1.0'
	  }
	  
### Maven

#### Step 1. Add the JitPack repository to your build file

    <repositories>
		  <repository>
		      <id>jitpack.io</id>
		      <url>https://jitpack.io</url>
		  </repository>
	  </repositories>
	  
#### Step 2. Add the dependency
	
	  <dependency>
	      <groupId>com.github.mathiazhagan01</groupId>
	      <artifactId>DrawableColorChange</artifactId>
	      <version>1.0</version>
	  </dependency>
	
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
