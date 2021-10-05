package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class LoginSteps {

	@Quando("eu informar o username {string}")
	public void euInformarOUsername(String username) {
		Na(LoginPage.class).InformarOUsername(username);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarASenha(senha);
	}

	@Quando("clicar no botao de login")
	public void clicarNoBotaoDeLogin() {
		Na(LoginPage.class).clicarNoBotaoDeLogin();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() throws Throwable {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed());
	}

	@Entao("o sistema exibe que o usuario esta bloqueado")
	public void oSistemaExibeQueOUsuarioEstaBloqueado() throws Throwable {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
	}

	@Entao("o sistema exibe erro de autenticacao")
	public void oSistemaExibeErroDeAutenticacao() throws Throwable {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
	}

}
