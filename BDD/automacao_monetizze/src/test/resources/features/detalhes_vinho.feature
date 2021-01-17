# language: pt

@detalheVinho
Funcionalidade: Adicionando ao Carrinho
	
Contexto:
		Dado que o usuário está na página DETALHES DO VINHO
	
Cenario: Adicionar ao Carrinho 
	Quando o usuario clicar na opção COMPRAR
	Entao o sistema insere o item no carrinho de compras
	E direciona para página CARRINHO DE COMPRAS