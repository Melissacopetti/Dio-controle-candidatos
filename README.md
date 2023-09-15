## Controle de Candidatos - Santander Bootcamp Java (DIO)
<p align="center">
  <img width="200" height="200" src="https://lp.dio.me/wp-content/uploads/2023/05/BADGE_LUZ-4.png">
</p>

## Descrição 
<p align="justify">
Este é um projeto simples de controle de candidatos desenvolvido durante o Santander Bootcamp Java da Digital Innovation One (DIO). O projeto foi implementado em Java na IDE Eclipse e tem como objetivo demonstrar o uso de estruturas de repetição e condicionais em Java.</p>

## Estrutura do Projeto
<p align="justify">
O projeto consiste em um sistema de seleção de candidatos para uma vaga de emprego com base nas pretensões salariais dos candidatos. Aqui estão as principais funcionalidades do projeto:

Analisar Candidato: Foi criado o método analisarCandidato, que avalia se a pretensão salarial de um candidato é maior, igual ou menor que o salário base proposto pela empresa (R$ 2000). Dependendo da comparação, o sistema fornece uma das seguintes respostas:

Se o salário pretendido for maior que R$ 2000: "LIGAR PARA O CANDIDATO".
Se o salário pretendido for igual a R$ 2000: "LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA".
Se o salário pretendido for menor que R$ 2000: "AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS".
Selecionar Candidatos: O projeto seleciona automaticamente 5 candidatos a partir de uma lista de 10 candidatos com base em suas pretensões salariais. Isso é feito usando o método selecaoCandidatos, que usa a classe ThreadLocalRandom para gerar valores de pretensões salariais aleatórios.

Impressão dos Candidatos Selecionados: Os candidatos selecionados são impressos no console, exibindo o índice do candidato (+1) e seu nome, tanto usando um loop for quanto um loop for each.

Ligar para os Candidatos: Para demonstrar o uso do do-while, o projeto simula a ação de ligar para os candidatos selecionados, com um limite máximo de três tentativas.
</p>

### Como Executar
Para executar este projeto, você pode seguir os seguintes passos:

* Clone este repositório em seu ambiente local:

```git clone https://github.com/seu-usuario/Dio-controle-candidatos.git ```

* Abra o projeto na sua IDE Eclipse.

* Execute o método main no arquivo ProcessoSeletivo.java para iniciar o programa.

### Contribuições
Contribuições para a melhoria deste projeto são bem-vindas. Se você quiser contribuir, siga estas etapas:

* Fork este repositório.

Crie uma nova branch para a sua contribuição:

```git checkout -b minha-contribuicao```

* Faça as alterações desejadas e faça commits dessas alterações.

Envie as alterações para o seu fork com:

``` git push origin minha-contribuicao ```
Crie um Pull Request para este repositório com uma descrição clara das suas alterações.


<p align="center">
  <img width="300" height="100" src="https://static.wixstatic.com/media/7a378f_5140deabd7d040378d740069cb692b87~mv2.png/v1/crop/x_0,y_10,w_1334,h_493/fill/w_568,h_208,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/logo%20DIO.png">
</p>

<h4 align="justify">
Este projeto é parte do Santander Bootcamp 2023 - Backend Java da Dio, e tem como objetivo consolidar os conhecimentos adquiridos no módulo "Conhecendo a Linguagem de Programação Java".</h4>
<h4 align="justify">
