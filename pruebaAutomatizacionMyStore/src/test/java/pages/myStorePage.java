package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myStorePage extends BasePage {
	String url = "http://automationpractice.com/index.php";
	By SignInButton = By.xpath("//a[@class='login']");

	//constructor
    public myStorePage(WebDriver driver){
	   super(driver);  
	}
    public void abrirPagina() {
    	navigateTo(url);
    }
    public void clicklogin() {
    	click(SignInButton);
    }

}
