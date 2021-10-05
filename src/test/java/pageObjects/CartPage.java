package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(name = "checkout")
	WebElement btnCheckout;
	
	@FindBy(name = "remove-sauce-labs-backpack")
	WebElement btnRemove;
	
	@FindBy(name = "continue-shopping")
	WebElement btnContinue;
	
	public void clicarBtnCheckout() {
		btnCheckout.click();
	}
}
