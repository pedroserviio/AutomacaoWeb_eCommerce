package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CartPage;
import pageObjects.OverviewPage;
import pageObjects.ProductsPage;
import pageObjects.YourInformationPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ComprarProdutoSteps {

	@Quando("eu adicionar a mochila no carrinho")
	public void euAdicionarAMochilaNoCarrinho() {
		Na(ProductsPage.class).adicionarBackpack();
	}

	@Quando("eu adicionar a bike light no carrinho")
	public void euAdicionarABikeLightNoCarrinho() {
		Na(ProductsPage.class).adicionarBikeLight();
	}

	@Quando("eu adicionar a bolt t-shirt no carrinho")
	public void euAdicionarABoltTShirtNoCarrinho() {
		Na(ProductsPage.class).adicionarBoltTShirt();
	}

	@Quando("eu adicionar a fleece jacket no carrinho")
	public void euAdicionarAFleeceJacketNoCarrinho() {
		Na(ProductsPage.class).adicionarFleeceJacket();
	}

	@Quando("eu adicionar a onesie no carrinho")
	public void euAdicionarAOnesieNoCarrinho() {
		Na(ProductsPage.class).adicionarOnesie();
	}

	@Quando("eu adicionar a test t-shirt no carrinho")
	public void euAdicionarATestTShirtNoCarrinho() {
		Na(ProductsPage.class).adicionarTestTShirt();
	}

	@Quando("clicar no carrinho de compras")
	public void clicarNoCarrinhoDeCompras() throws Throwable {
		Thread.sleep(2000);
		Na(ProductsPage.class).clicarNoCarrinho();
	}

	@Quando("clicar no botao checkout")
	public void clicarNoBotaoCheckout() {
		Na(CartPage.class).clicarBtnCheckout();
	}

	@Quando("inserir no campo first name {string}")
	public void inserirNoCampoFirstName(String nome) {
		Na(YourInformationPage.class).informarFirstName(nome);
	}

	@Quando("inserir no campo last name {string}")
	public void inserirNoCampoLastName(String sobrenome) {
		Na(YourInformationPage.class).informarLastName(sobrenome);
	}

	@Quando("inserir no campo postal code {string}")
	public void inserirNoCampoPostalCode(String postalCode) {
		Na(YourInformationPage.class).informarPostalCode(postalCode);
	}

	@Quando("clicar no botao continue")
	public void clicarNoBotaoContinue() {
		Na(YourInformationPage.class).clicarBtnContinue();
	}

	@Quando("clicar no botao finish")
	public void clicarNoBotaoFinish() {
		Na(OverviewPage.class).clicarBtnFinish();
	}

	@Entao("o sistema realiza o pedido")
	public void oSistemaRealizaOPedido() throws Throwable {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed());
	}

	// Falha na compra do produto
	@Entao("o sistema exibe mensagem de campo vazio")
	public void oSistemaExibeMensagemDeCampoVazio() throws Throwable {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
	}

}
