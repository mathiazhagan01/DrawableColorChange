# DrawableColorChange
Android Library to change drawable color dynamically

[![](https://jitpack.io/v/mathiazhagan01/DrawableColorChange.svg)](https://jitpack.io/#mathiazhagan01/DrawableColorChange) 
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-DrawableColorChange-blue.svg?style=flat-square)](http://android-arsenal.com/details/3/4353) 
[![](https://az743702.vo.msecnd.net/cdn/kofi4.png?v=b)](https://ko-fi.com/A8817MW)

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
	        compile 'com.github.mathiazhagan01:DrawableColorChange:1.2'
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
	      <version>1.2</version>
	  </dependency>

### Before changing color

![Screenshot](./before.png)

### After changing color

![Screenshot](./after.png)

### Example 1
  
  	DrawableColorChange drawableColorChange = new DrawableColorChange(this);	
  
  	drawableColorChange.setDrawable(R.drawable.icon);
  	drawableColorChange.setColorResId(R.color.colorAccent);
  	drawableColorChange.changeColor();
  	Drawable drawable = drawableColorChange.getColorChangedDrawable();
  	ImageView imageView = (ImageView) findViewById(R.id.image);
  	imageView.setImageDrawable(drawable);
  
### Example 2
  
  	imageView.setImageDrawable(drawableColorChange.changeColorById(R.drawable.icon, R.color.colorAccent));
  	
### LICENSE

	DrawableColorChange library for Android
	Copyright (c) 2016 Mathiazhagan Dinesh (http://github.com/mathiazhagan01).

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
