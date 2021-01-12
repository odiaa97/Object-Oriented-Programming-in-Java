package module1;

import processing.core.PApplet;
import processing.core.PImage;

public class myP extends PApplet {
	String URL = "C:\\Users\\ODIAN\\eclipse-workspace\\UCSDUnfoldingMaps\\src\\1";
	PImage myImage;
	public void setUp() {
		size(200, 200);
		myImage = loadImage(URL, "png");
				
	}
	
	public void draw() {
		 background(0);
		 myImage.resize(0, height);
		image(myImage, 0, 0);
		
	}
	
}
