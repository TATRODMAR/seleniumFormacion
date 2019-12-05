package tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.loginPage;
import pages.myAccountPage;
import pages.myStorePage;

public class testAutenticar {

    public WebDriver driver;
    //GoogleHomePage homePage;
    
    
	@Before
	public void setUp() {
        System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		myStorePage myStore = new myStorePage(driver);
		loginPage paginaLogin = new loginPage(driver);
		myAccountPage myAccount = new myAccountPage(driver);
		
		myStore.abrirPagina();
		myStore.clicklogin();
		
		paginaLogin.setEmail("tatiana.rodriguez@gfi.world");
		paginaLogin.setPassword("123456");
		paginaLogin.login();
		assertTrue(myAccount.comprobarLoginCorrecto());
		myAccount.navegarCompra(myAccountPage.SECCION_WOMEN);
		myAccount.navegarCompra(myAccountPage.SECCION_TOP);
		myAccount.navegarCompra(myAccountPage.TSHIRT);
		myAccount.navegarCompra(myAccountPage.ANIADIR_CESTA);
		myAccount.navegarCompra(myAccountPage.CHECKOUT);
		myAccount.navegarCompra(myAccountPage.CHECKOUT_CONFIRMAR);
		
	}

}
