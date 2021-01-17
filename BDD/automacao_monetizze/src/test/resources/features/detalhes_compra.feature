# language: pt

@detalheCompra
Funcionalidade: Adicionando ao Carrinho

Contexto:
		Dado que o usuario está na pagina DETALHES DA COMPRA

Cenario: Campos Obrigatorios
	Quando o usuario nao preencher os dados pessoais
	E aciona a opção FINALIZAR COMPRA
	Entao é apresentado a mensagem de obrigatoriedade
	
Cenario: Finalizar Compra
	Quando o usuario preenche todos os campos
	E o usuario aciona a opção FINALIZAR COMPRA
	Entao é apresentado a mensagem de agradecimento