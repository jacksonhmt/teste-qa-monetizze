# language: pt

@contato
Funcionalidade: Contato

Contexto: 
	Dado que o usuario esta em CONTATO

Cenario: Nao Preencher os campos obrigatorios
	Quando o usuario nao preenche os campos
	E Acionar a opcao ENVIAR
	Entao o sistema apresenta a mensagem de erro
	
Cenario: Campo telefone somente numeros
	Quando o usuario preencher letras no campo telefone
	Entao o sistema nao deve aceitar
	
Cenario: Enviar Contato
	Quando o usuario preencher todos os campos
	E acionar a opcao SALVAR
	Entao o sistema apresenta a mensagem de obrigado