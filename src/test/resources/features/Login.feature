#language: pt
#enconding: UTF-8

@Login
Funcionalidade: Login

	@loginStandard
	Cenario: realizar login como standard
		Quando eu informar o username "standard_user"
		E informar a senha "secret_sauce"
		E clicar no botao de login
		Entao o sistema exibe o usuario logado
	
	@loginLockedOutUser
	Cenario: realizar login como locked_out_user
		Quando eu informar o username "locked_out_user"
		E informar a senha "secret_sauce"
		E clicar no botao de login
		Entao o sistema exibe que o usuario esta bloqueado
	
	@loginProblem
	Cenario: realizar login como problem_user
		Quando eu informar o username "problem_user"
		E informar a senha "secret_sauce"
		E clicar no botao de login
		Entao o sistema exibe o usuario logado
	
	@loginPerformanceGlitchUser
	Cenario: realizar login como performance_glitch_user
		Quando eu informar o username "performance_glitch_user"
		E informar a senha "secret_sauce"
		E clicar no botao de login
		Entao o sistema exibe o usuario logado
		
	@loginFalha @autenticacao
	Cenario: falha de autenticacao
		Quando eu informar o username "joao"
		E informar a senha "joao"
		E clicar no botao de login
		Entao o sistema exibe erro de autenticacao
		
	@loginFalha @usernameRequired
	Cenario: campo username vazio
		Quando eu informar o username ""
		E informar a senha "joao"
		E clicar no botao de login
		Entao o sistema exibe erro de autenticacao
		
	@loginFalha @passwordRequired
	Cenario: campo password vazio
		Quando eu informar o username "joao"
		E informar a senha ""
		E clicar no botao de login
		Entao o sistema exibe erro de autenticacao
	
	
	
