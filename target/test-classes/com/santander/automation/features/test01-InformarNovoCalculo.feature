#Autor: edna.mayo@hotmail.com
#Language: pt-br
#encoding: iso-8859-1
@test01
Feature: Novo Cálculo

  Scenario: Novo Cálculo de Caixa/Pacote com serviço Mão própria
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem até um determinado CEP de Destino
    When eu informar o tipo de formato Caixa
    And o valor total da soma das medidas do pacote for menor que 200cm e maior que 29cm
    And o comprimento do meu pacote é maior que 16cm, a largura maior que 11cm e a altura maior que 2cm
    And o peso for até 300g
    And eu escolho o tipo de serviço de Mão Própria
   Then terei os Resultado dos Cálculo

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: Salvar cálculo de Envelope
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem até um determinado CEP de Destino
    When eu informar o tipo de formato Envelope
    And o valor total da soma das medidas do envelope for menor que 120cm e maior que 27cm
    And o comprimento do meu envelope é maior que 16cm, a largura maior que 11cm e ambos não são menores que 60cm
    And o peso for até 300g
    And eu possuir os Resultados do Cálculo
    Then eu salvarei o resultado

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: Calcular Somente o Prazo
    Given que possuo CEP de origem e destino válidos
    When eu informar que desejo calcular somente o prazo
    Then terei os Resultados do Cálculo somente com os prazos

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: Não Informar os CEPs de Origem e Destino
    Given não possuo CEP de origem e destino
    When Tento efetuar um Novo Cálculo
    Then Não será possivel obter o calculo sem os CEPs válidos

  # Cenário irá falhar, pois mensagem de "CEP de destino inválido" sobrepõem a mensagem "Digite um CEP de origem válida ou escolha um estado ou escolha um estado ou uma cidade".
  Scenario: Novo Cálculo de Rolo com dimensões inválidas
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem até um determinado CEP de Destino
    When eu informar o tipo de formato Rolo
    And informar o valor da soma das medidas maior que 200cm ou menor que 28cm
    Then Não terei o resultado do Calculo sem as dimensões corretas
