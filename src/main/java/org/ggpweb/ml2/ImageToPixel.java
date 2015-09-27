package org.ggpweb.ml2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageToPixel {

	String inputPath = "C:\\Users\\camgu\\Documents\\Gus\\codes\\letterA.jpg";

	public int[] toPixel() {
		File inputFile = new File(inputPath);
		int[] pixels = null;
		
		try {
			BufferedImage inputImage = ImageIO.read(inputFile);
			int width = inputImage.getWidth();
			int height = inputImage.getHeight();
			pixels = new int[width * height];
			int index = 0;
			
			//1 by 1
		/*	for(int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					pixels[index] = -inputImage.getRGB(j, i);
					index++;
				}
			}
			*/
			//single shot
			inputImage.getRGB(0, 0, inputImage.getWidth(), inputImage.getHeight(), pixels, 0, inputImage.getWidth());
			
			for(int p = 0; p < width * height; p++) {
				System.out.print(-pixels[p] + ", ");
				if(0 == (p + 1) % width && p !=0) {
					System.out.print("\n");
				}
			}
			System.out.println("width = " + width + "; height = " + height);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		return pixels;
	}
}
