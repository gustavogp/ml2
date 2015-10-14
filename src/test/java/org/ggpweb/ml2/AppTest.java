package org.ggpweb.ml2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	//SUT
	static ImageToPixel itpSut = new ImageToPixel();
	
	
	
	@Test
    public void testApp()
    {
        assertTrue( itpSut.toPixel().length == itpSut.inputImage.getHeight() * itpSut.inputImage.getWidth() );
    }
}
