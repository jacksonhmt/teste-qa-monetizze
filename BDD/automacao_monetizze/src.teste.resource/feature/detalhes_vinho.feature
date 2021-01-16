# language: pt

@detalheVinho
Funcionalidade: Adicionando ao Carrinho
	
Cenario: Adicionar ao Carrinho
	Dado que o usuário está na página DETALHES DO VINHO 
	Quando o usuario clicar na opção COMPRAR
	Entao o sistema insere o item no carrinho de compras
	E direciona para página CARRINHO DE COMPRAS