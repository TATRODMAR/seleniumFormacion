package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BasePage{
	By emailText = By.xpath("//input[@id='email']");
	By passwordText = By.xpath("//input[@id='passwd']");
	By signInButton = By.xpath("//p[@class='submit']//span[1]");
	
	//constructor
    public loginPage(WebDriver driver){
	   super(driver);  
	}
    
    public void setEmail(String email) {
    	writeText(emailText, email);
    }
    
    public void setPassword(String password) {
    	writeText(passwordText, password);
    }
    
    public void login() {
    	click(signInButton);
    }

}
