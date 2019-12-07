package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NaukriTest extends BaseClass{

	@Test
	public void naukriTest() throws Exception{
		extentTest = extentReport.createTest("Naukri Test", "Searching jobs");
		extentTest.assignCategory("Regression Test");
		
		driver.get("http://www.naukri.com");
		extentTest.info("url is entered.");
		extentTest.createNode("URL is entered.");
		
		//Click on search job text box
		WebElement searchJobTestBox = driver.findElement(By.id("qsbClick"));
		searchJobTestBox.click();
		extentTest.info("Click on search job text box.");
		extentTest.createNode("Click is done");
		
		//Enter skills
		WebElement skillsTextBox = driver.findElement(By.name("qp"));
		skillsTextBox.sendKeys("Java");
		extentTest.info("Skill is entered..");
		
	}
}
  