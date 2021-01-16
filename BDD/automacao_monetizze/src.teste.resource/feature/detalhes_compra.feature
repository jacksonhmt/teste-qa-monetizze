# language: pt

@detalheCompra
Funcionalidade: Adicionando ao Carrinho

Cenario: Campos Obrigatórios
	Dado que o usuario está em DETALHES DA COMPRA
	Quando o usuario não preenche os campos
	E aciona a opção SALVAR
	Entao o sistama apresenta a mensagem de erro
	
Cenario: Finalizar Compra
	Dado que o usuario está em DETALHES DA COMPRA
	Quando o usuario preenche todos os campos
	E aciona a opção SALVAR
	Entao o sistema apresenta a mensagem de obrigado