package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HoverMenuTestCase extends TestBase {

	
	HomePage homeOBJ;
	
	@Test
	public void userCanHoverList() {
		
		homeOBJ=new HomePage(driver);
		homeOBJ.hoverMenuItems();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
		
		
	}
}
