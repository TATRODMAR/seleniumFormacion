package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myAccountPage extends BasePage {
	
	By historialCompras = By.xpath("//span[contains(text(),'Order history and details')]");
	By womenButton = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	By topButton = By.xpath("//div[@id='subcategories']//li[1]//div[1]//a[1]//img[1]");
	By aniadirCesta = By.xpath("//span[contains(text(),'Add to cart')]");
	By tshirtButton =By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@class='replace-2x img-responsive']");
	By checkOutButton = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By checkOutConfirmarButton = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
	
	public final static int SECCION_WOMEN 	= 1;
	public final static int SECCION_TOP	 	= 2;
	public final static int TSHIRT			= 3;
	public final static int ANIADIR_CESTA 	= 4;
	public final static int CHECKOUT		= 5;
	public final static int CHECKOUT_CONFIRMAR	= 6;
	
	
	//constructor
    public myAccountPage(WebDriver driver){
	   super(driver);  
	}
    
    public boolean comprobarLoginCorrecto() {
    	return existElement(historialCompras);
    }
    
    public void navegarCompra (int opcion) {
    	switch (opcion) {
	    	case SECCION_WOMEN:
	    		click(womenButton);
	    	break;
	    	case SECCION_TOP:
	    		click(topButton);
	    	break;
	    	case TSHIRT:
	    		click(tshirtButton);
	    	break;
	    	case ANIADIR_CESTA:
	    		click(aniadirCesta);
	    	break;
	    	case CHECKOUT:
	    		click(checkOutButton);
	    	break;
	    	case CHECKOUT_CONFIRMAR:
	    		click(checkOutConfirmarButton);
	    	break;
    	}
    	
    }


}
