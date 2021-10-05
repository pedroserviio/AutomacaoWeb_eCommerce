package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage {

	@FindBy(name = "firstName")
	WebElement campoFirstName;
	
	@FindBy(name = "lastName")
	WebElement campoLastName;
	
	@FindBy(name = "postalCode")
	WebElement campoPostalCode;
	
	@FindBy(name = "continue")
	WebElement btnContinue;
	
	@FindBy(name = "cancel")
	WebElement btnCancel;
	
	public void informarFirstName(String nome) {
		campoFirstName.sendKeys(nome);
	}
	
	public void informarLastName(String sobrenome) {
		campoLastName.sendKeys(sobrenome);
	}
	
	public void informarPostalCode(String postalCode) {
		campoPostalCode.sendKeys(postalCode);
	}
	
	public void clicarBtnContinue() {
		btnContinue.click();
	}
}
