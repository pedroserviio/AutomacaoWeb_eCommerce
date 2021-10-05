package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "user-name")
	WebElement campoUsername;
	
	@FindBy(name = "password")
	WebElement campoPassword;
	
	@FindBy(name = "login-button")
	WebElement btnLogin;
	
	public void InformarOUsername(String username) {
	    campoUsername.sendKeys(username);
	}

	public void informarASenha(String password) {
	    campoPassword.sendKeys(password);
	}
	
	public void clicarNoBotaoDeLogin() {
		btnLogin.click();
	}
	
	public void login(String username, String password) {
		InformarOUsername(username);
		informarASenha(password);
		clicarNoBotaoDeLogin();
	}
}
