package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//Strong[text()='Dashboard']")WebElement dashBoardHeader;
    @FindBy(how= How.XPATH,using= "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span")WebElement CustomerMenu;
    @FindBy(how= How.XPATH, using="//*[@id=\\\"customers\\\"]/li[2]/a/span")WebElement addCustomerMenu;
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateDashBoardPage(String dashboard) {
		validateElement(dashBoardHeader, dashboard, "DashBoard Page is not available");
	}
	
	public void clickOnCutomerMenu() {
		CustomerMenu.click();
	}
	
	public void clickOnAddCustomer() {
		addCustomerMenu.click();
	}


}
