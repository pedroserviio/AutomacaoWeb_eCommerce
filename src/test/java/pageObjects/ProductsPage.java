package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

	@FindBy(name = "add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	
	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	WebElement bikeLight;
	
	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement boltTShirt;
	
	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement fleeceJacket;
	
	@FindBy(name = "add-to-cart-sauce-labs-onesie")
	WebElement onesie;
	
	@FindBy(name = "add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement testTShirt;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement shoppingCart;
	
	public void adicionarBackpack() {
		backpack.click();
	}
	
	public void adicionarBikeLight() {
		bikeLight.click();
	}
	
	public void adicionarBoltTShirt() {
		boltTShirt.click();
	}
	
	public void adicionarFleeceJacket() {
		fleeceJacket.click();
	}
	
	public void adicionarOnesie() {
		onesie.click();
	}
	
	public void adicionarTestTShirt() {
		testTShirt.click();
	}
	
	public void clicarNoCarrinho() {
		shoppingCart.click();
	}
}
