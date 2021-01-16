# language: pt

@contato
Funcionalidade: Contato
	
Cenario: Preencher os campos obrigatórios
	Dado que o usuario está em CONTATO 
	Quando o usuario não preencher os campos
	E Acionar a opção ENVIAR
	Entao o sistema apresenta a mensagem de erro
	
Cenario: Campo telefone somente numeros
	Dado que o usuario está em CONTATO
	Quando o usuario preencher letras no campo telefone
	Entao o sistema não deve aceitar
	
Cenario: Enviar Contato
	Dado que o usuario está em CONTATO
	Quando o usuario preencher todos os campos
	E acionar a opção SALVAR
	Entao o sistema apresenta a mensagem de obrigado