# language: pt

@contato
Funcionalidade: Contato
	
Cenario: Preencher os campos obrigatorios
	Dado que o usuario está em CONTATO 
	Quando o usuario não preencher os campos
	E Acionar a opção ENVIAR
	Entao o sistema apresenta a mensagem de erro