# language: pt

@produto
Funcionalidade: Detalhamento dos produtos

Contexto:
Dado que o usuário está página LOJA 
	
Cenario: Detalhes do Vinho
	Quando o usuário clicar em um VINHO
	Entao o sistema mostra os detalhes do vinho selecionado
	
Cenario: Adicionar ao Carrinho 
	Quando o usuario clicar na opção ADICIONAR AO CARRINHO
	Entao o sistema insere o item no carrinho de compras
	E direciona para página CARRINHO DE COMPRAS