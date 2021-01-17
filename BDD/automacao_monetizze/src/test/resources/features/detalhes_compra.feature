# language: pt

@detalheCompra
Funcionalidade: Adicionando ao Carrinho

Contexto:
		Dado que o usuario está em DETALHES DA COMPRA

Cenario: Campos Obrigatórios
	Quando o usuario não preenche os campos
	E aciona a opção SALVAR
	Entao o sistama apresenta a mensagem de erro
	
Cenario: Finalizar Compra
	Quando o usuario preenche corretamente os campos
	E aciona a opção SALVAR
	Entao o sistema apresenta a mensagem de obrigado