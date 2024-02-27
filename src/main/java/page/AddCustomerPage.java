package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
    WebDriver driver;
    
    public AddCustomerPage(WebDriver driver) {
    	this.driver=driver;
    }
    
    @FindBy(how=How.XPATH, using="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong")WebElement addCustomerHeader;
    @FindBy(how=How.XPATH,using="//*[@id=\\\"general_compnay\\\"]/div[1]/div/input")WebElement FullName;
    @FindBy(how=How.XPATH,using="//select[@name='company_name']")WebElement CompanyElement;
    @FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[3]/div/input")WebElement Email;
    
    public void validateAddCustomerPage(String addCustomerHeaderText ) {
    validateElement(addCustomerHeader, addCustomerHeaderText, "Add customer page is not available");
    }
    
    public void insertFullNAme(String fullName) {
    	FullName.sendKeys(fullName+generateRandomNum(99));
    }
     public void insertCompanyName(String companyName) {
    	 selectFromDropDown(CompanyElement, companyName);
     }
     
     public void insertEmail(String email) {
    	 Email.sendKeys(generateRandomNum(999)+email);
     }
    
    
}
