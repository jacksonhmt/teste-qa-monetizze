# teste-qa-monetizze

## Nomenclatura 
 automacao_monetizze

## Requisitos
- java (jdk1.8.0)
- maven (3.6.3)
- Firefox (84.0.2)

## Como Executar?
1. Abrir o projeto maven no eclipse;
2. Esperar todas as dependências serem baixadas;
3. Atualizar o caminho do driver do firefox na classe "BrowserFactory" localizado na pasta "src/test/java/br/com/jackson/monetizze/e2e/pages".
      (Driver localizado em "automacao_monetizze/drivers")
4. Executar a classe "LojaCucumberRunner" localizada na pasta "src/test/java/br/com/jackson/monetizze/acceptance".
