# language: pt

@produto
Funcionalidade: Detalhamento dos produtos

Cenario: Acessar a Loja 
	Dado que o usuário está na página HOME
	Quando o usuario acionar a opção LOJA
	Entao todos os vinhos devem ser listados
	
Cenario: Detalhes do Vinho
	Dado que o usuário está página LOJA
	Quando o usuário clicar em um VINHO
	Entao o sistema mostra os detalhes do vinho selecionado
	
Cenario: Adicionar ao Carrinho
	Dado que o usuário está na página LOJA 
	Quando o usuario clicar na opção ADICIONAR AO CARRINHO
	Entao o sistema insere o item no carrinho de compras
	E direciona para página CARRINHO DE COMPRAS