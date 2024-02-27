package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	 public void validateElement(WebElement element, String expected, String errorMsg) {
		 Assert.assertEquals(element.getText(), expected, errorMsg);
	 }
	 public void selectFromDropDown(WebElement element, String visisbleText){
			Select sel = new Select(element);
			sel.selectByVisibleText(visisbleText);
			}
		
		public int generateRandomNum(int rndNum) {
			Random rnd= new Random();
			int generateRndNumber= rnd.nextInt(rndNum);
			return generateRndNumber;
		}
}
