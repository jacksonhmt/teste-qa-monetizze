# language: pt

@detalheVinho
Funcionalidade: Adicionando ao Carrinho
	
Contexto:
		Dado que o usuário está na página DETALHES DO VINHO
	
Cenario: Adicionar ao Carrinho 
	Quando o usuario aciona o botao COMPRAR
	Entao o sistema adiciona o vinho no carrinho de compras
	E direciona para a tela CARRINHO DE COMPRAS