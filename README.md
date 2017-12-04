# DrawableColorChange
Android Library to dynamically change color of drawable. 

[![](https://jitpack.io/v/mathiazhagan01/DrawableColorChange.svg)](https://jitpack.io/#mathiazhagan01/DrawableColorChange)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-DrawableColorChange-blue.svg?style=flat-square)](http://android-arsenal.com/details/3/4353) 
<a href="http://www.methodscount.com/?lib=com.github.mathiazhagan01%3ADrawableColorChange%3A1.4"><img src="https://img.shields.io/badge/Methods and size-core: 37 | deps: 19163 | 18 KB-e91e63.svg"/></a>
[![Codix](https://codix.io/gh/badge/mathiazhagan01/DrawableColorChange)](https://codix.io/gh/repo/mathiazhagan01/DrawableColorChange)
[![](https://az743702.vo.msecnd.net/cdn/kofi4.png?v=b)](https://ko-fi.com/A8817MW)
[![](http://api.flattr.com/button/flattr-badge-large.png)](https://flattr.com/@mathiazhagan01)

If you like the library, please rate us on <a href="https://codix.io/gh/repo/mathiazhagan01/DrawableColorChange">codix.io!</a>

### Gradle

#### Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:
  
``` gradle
    	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		  }
	}
```

#### Step 2. Add the dependency

``` gradle
    	dependencies {
	        compile 'com.github.mathiazhagan01:DrawableColorChange:1.4'
	}
```

### Maven

#### Step 1. Add the JitPack repository to your build file

``` xml
    	<repositories>
		  <repository>
		      <id>jitpack.io</id>
		      <url>https://jitpack.io</url>
		  </repository>
	</repositories>
```
	
#### Step 2. Add the dependency
	
``` xml
	  <dependency>
	      <groupId>com.github.mathiazhagan01</groupId>
	      <artifactId>DrawableColorChange</artifactId>
	      <version>1.4</version>
	  </dependency>
```

### Before changing color

![Screenshot](./before.png)

### After changing color

![Screenshot](./after.png)

### Example 1
  
``` java
  	DrawableColorChange drawableColorChange = new DrawableColorChange(this);	
  
  	drawableColorChange.setDrawable(R.drawable.icon);
  	drawableColorChange.setColorResId(R.color.colorAccent);
  	Drawable drawable = drawableColorChange.getColorChangedDrawable();
  	ImageView imageView = (ImageView) findViewById(R.id.image);
  	imageView.setImageDrawable(drawable);
```
  
### Example 2
  
``` java
  	imageView.setImageDrawable(drawableColorChange.changeColorById(R.drawable.icon, R.color.colorAccent));
```

### Example 3

``` java
  	drawableColorChange.setDrawable(R.drawable.icon);
	drawableColorChange.setColorResId(R.color.colorAccent);
	Bitmap bitmap = drawableColorChange.getColorChangedBitmap();
	imageView.setImageBitmap(bitmap);
```
	
### LICENSE

	DrawableColorChange library for Android
	Copyright (c) 2017 Mathiazhagan Dinesh (http://github.com/mathiazhagan01).

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
