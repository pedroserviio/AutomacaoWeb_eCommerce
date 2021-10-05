package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {

	@Before()
	public void setUp() {
		acessarSistema();
	}
	
	@Before(value = "not @Login")
	public void comprarProduto() {
		Na(LoginPage.class).InformarOUsername("standard_user");
		Na(LoginPage.class).informarASenha("secret_sauce");
		Na(LoginPage.class).clicarNoBotaoDeLogin();
	}
	
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
	}
}
