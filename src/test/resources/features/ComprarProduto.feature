#language: pt
#enconding: UTF-8

@ComprarProduto
Funcionalidade: Comprar produto

	@comprarMochila
	Cenario: comprar mochila
		Quando eu adicionar a mochila no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarBikeLight
	Cenario: comprar bike light
		Quando eu adicionar a bike light no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarBoltTShirt
	Cenario: comprar bolt t-shirt
		Quando eu adicionar a bolt t-shirt no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarFleeceJacket
	Cenario: comprar fleece jacket
		Quando eu adicionar a fleece jacket no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarOnesie
	Cenario: comprar onesie
		Quando eu adicionar a onesie no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarFleeceJacket
	Cenario: comprar test t-shirt
		Quando eu adicionar a test t-shirt no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
	@comprarVariosProdutos
	Cenario: comprar varios produtos
		Quando eu adicionar a mochila no carrinho
		E eu adicionar a bike light no carrinho
		E eu adicionar a bolt t-shirt no carrinho
		E eu adicionar a fleece jacket no carrinho
		E eu adicionar a onesie no carrinho
		E eu adicionar a test t-shirt no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		E clicar no botao finish
		Entao o sistema realiza o pedido
		
		@comprarProdutoFalha @firstNameRequired
		Cenario: falha ao comprar produto
		Quando eu adicionar a mochila no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name ""
		E inserir no campo last name "carlos"
		E inserir no campo postal code "000000"
		E clicar no botao continue
		Entao o sistema exibe mensagem de campo vazio
		
		@comprarProdutoFalha @lastNameRequired
		Cenario: falha ao comprar produto
		Quando eu adicionar a mochila no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name ""
		E inserir no campo postal code "000000"
		E clicar no botao continue
		Entao o sistema exibe mensagem de campo vazio
		
		@comprarProdutoFalha @postalCodeRequired
		Cenario: falha ao comprar produto
		Quando eu adicionar a mochila no carrinho
		E clicar no carrinho de compras
		E clicar no botao checkout
		E inserir no campo first name "joao"
		E inserir no campo last name "carlos"
		E inserir no campo postal code ""
		E clicar no botao continue
		Entao o sistema exibe mensagem de campo vazio
		
		