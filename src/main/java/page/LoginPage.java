package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
   WebDriver driver;
   
   public LoginPage(WebDriver driver) {
	 this.driver= driver;
   }
   
   //WebElements /Attributes
   @FindBy(how=How.XPATH, using="//input[@id='user_name']")WebElement UserNameElement;
   @FindBy(how= How.XPATH, using="//input[@id='password']")WebElement PasswordElement;
   @FindBy(how=How.XPATH, using="//button[@id='login_submit']")WebElement SubmitButtonElement;
   
   //Itractable method
   public void insertUserName(String userName) {
	   UserNameElement.sendKeys(userName);
   }
   
   public void insertPassword(String password) {
	   PasswordElement.sendKeys(password);
   }
   
   public void clickSubmitButton() {
	   SubmitButtonElement.click();
   }
   
   //can create combined method but it will make code hard to manage or find where the error is
   
   public void login(String userName, String password) {
	   UserNameElement.sendKeys(userName);
	   PasswordElement.sendKeys(password);
	   SubmitButtonElement.click();
   }
}
