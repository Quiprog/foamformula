BOOTCAMP

PROJETO - Desenvolvimento de um sistema de gerenciamento de formulações químicas para a produção de espumas de
poliuretano.

INTRODUÇÃO
Na área química novos produtos surgem a partir do desenvolvimento de novas formulações elaboradas nos mais variados
laboratórios de pesquisa. Nesse projeto há a proposição de solução para o armazenamento, preservação, retenção,
controle de alteração e recuperação de formulações químicas - neste caso em particular para formulações químicas
para espumas de poliuretano.

SOFTWARES, APPS e FRAMEWORKS
- Java 11.
- Maven 4.0.0.
- Intellij IDEA Community Edition.
- GitHub para o armazenamento do seu projeto na nuvem.
- Conta no Heroku para o deploy do projeto na nuvem

PROCEDIMENTO

- Setup inicial de projeto com o Spring Boot Initialzr.

- Abertura do projeto com o IntelliJ idea.

- Setup das configurações da versão do java e definição da classe principal.

- Inserção do texto "java.runtime.version=11" no arquivo "system.properties".

- Criação da classe "controller" e em seguida o teste de conexão.

- Criação da classe "entity" para o mapeamento no banco de dados "h2".

- Criação da classe "DTO" para a blindagem da API.

- Para o mapeamento do dom?nio e Objetos de Transferência de Dados foi criada a classe "mapper".

OUTROS PROCEDIMENTOS

- Para acessa o bando de dados "h2" foi utilizada a porta http://localhost:8080/h2-console.

- Para testar o lançamento dos dados no bando de dados foi utilizado o "Postman".

exemplo de um lançamento do postman:

{
"id" : 4,
"a" : "Nero Louren?o", a = analyst_name
"b" : "279.861.092-38", b = analyst_cpf
"c" : "2020-08-14", c = dateAnalyse
"d" : "4", d = version
"e" : "50.69", e = mdi_diisocianate
"f" : "46.80", f = propylene_glycol
"g" : "1.34", g = water
"h" : "0.28", h = flame_retardant
"i" : "0.89", i = additive
"total" : "100.00",
"gels" : [
{   
"id" : 4,
"type" : "SEA",
"time" : "24"
}
]
}

Obs.: Na classe "entity" utilizou-se "a, b, c, d, e, f, g, h e i" para que os títulos a que ser referem no banco
de dados h2 apareçam naquela ordem.

POTENCIAIS MELHORIAS

- Desenvolvimento de testes unit?rios para validação de outras funcionalidades.

- Desenvolvimento de outros métodos Http (PATCH, HEAD e OPTION).
- Desenvolvimento de uma conexão front-end.