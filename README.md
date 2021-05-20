# Cities Api
## O Projeto
Desafio de projeto realizado no bootcamp da Everis, através da plataforma [Digital Innovation One](https://digitalinnovation.one/)
Desenvolvido em Java e utilizando PostgreSQL, Spring Boot e Heroku. 
Grande agradecimento a [André Gomes](https://github.com/andrelugomes/), pelos vídeos de acompanhamento do projeto.

## Funcionalidades

Para utilizar o que foi desenvolvido ao longo do projeto, deve-se entrar no endereço `https://radiant-everglades-31415.herokuapp.com/` e utilizar alguma das funções desenvolvidas,
sendo elas:
#### Consulta de todos os países, estados ou cidades contidos na database - bastando adicionar o comando `countries`, `states` ou `cities`, respectivamente, ao fim do endereço;
#### Cálculo de distância entre cidades, a partir de seus Códigos de Municípios TOM-SERPRO, disponíveis na consulta de cidades no campo *cod_tom*. Existem 3 alternativas para
o cálculo da distância, e para qualquer uma delas, deve-se adicionar `distances/` ao fim do endereço.
- **Distância por pontos em milhas** = Retornará a distância de duas cidades em milhas a partir do comando `by-points?from=IdCidade1&to=IdCidade2`;
- **Distância por cubo em metros** = Retornará a distância de duas cidades em metros a partir do comando `by-cube?from=IdCidade1&to=IdCidade2`;
- **Distância usando matemática** = Retornará a distância de duas cidades em metros, kilômetros ou milhas, a partir do comando `by-math?from=IdCidade1&to=IdCidade2&unit=Unidade`;

Obs.: *IdCidade* representa o *cod_tom* da cidade que deseja-se inserir e *Unidade* define se o resultado exibido será em metros, kilômetros ou milhas, inserindo *METERS*,
*KILOMETERS* ou *MILES*, para os respectivos resultados.
