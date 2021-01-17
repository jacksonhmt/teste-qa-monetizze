# language: pt

@produto
Funcionalidade: Detalhamento dos produtos

Contexto:
Dado que o usuario esta na pagina LOJA
	
Cenario: Detalhes do Vinho
	Quando o usuario acionar algum vinho
	Entao o sistema apresenta os detalhes do vinho selecionado
	
Cenario: Adicionar ao Carrinho 
	Quando o usuario clicar na opção ADICIONAR AO CARRINHO
	Entao o sistema insere o item no carrinho de compras
	E o usuario é direcionado para o CARRINHO DE COMPRAS