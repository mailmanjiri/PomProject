package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
WebDriver driver;
String userName= "demo@codefios.com";
String password="abc123";
String DashBoardValidationText= "Dashboard";
	@Test
	public void validUserLogin() {
		driver =BrowserFactory.init();
		
		//to call methods from loginPage package, need to create an object as follows
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSubmitButton();
		
		DashboardPage dashBoard= PageFactory.initElements(driver, DashboardPage.class);
		dashBoard.validateDashBoardPage(DashBoardValidationText);
		BrowserFactory.tearDown();

	}
}
  