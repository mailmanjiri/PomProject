package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

@Test
public class AddCustomerTest {
	WebDriver driver;
	String userName = "demo@codefios.com";
	String password = "abc123";
	String DashBoardValidationText = "Dashboard";
	String fullName = "test1";
	String email = "abc@gmail.com";
	String companyName = "Techfios";
	String ValidateAddCustomerPageText = "New Customer";

	public void userShouldAbleToAddNewCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSubmitButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardPage(DashBoardValidationText);
		dashboardPage.clickOnCutomerMenu();
		dashboardPage.clickOnAddCustomer();

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage(ValidateAddCustomerPageText);
		addCustomerPage.insertFullNAme(fullName);
		addCustomerPage.insertCompanyName(companyName);
		addCustomerPage.insertEmail(email);

	}

}
