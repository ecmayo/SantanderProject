#Autor: edna.mayo@hotmail.com
#Language: pt-br
#encoding: iso-8859-1
@test01
Feature: Novo C�lculo

  Scenario: Novo C�lculo de Caixa/Pacote com servi�o M�o pr�pria
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem at� um determinado CEP de Destino
    When eu informar o tipo de formato Caixa
    And o valor total da soma das medidas do pacote for menor que 200cm e maior que 29cm
    And o comprimento do meu pacote � maior que 16cm, a largura maior que 11cm e a altura maior que 2cm
    And o peso for at� 300g
    And eu escolho o tipo de servi�o de M�o Pr�pria
   Then terei os Resultado dos C�lculo

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: Salvar c�lculo de Envelope
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem at� um determinado CEP de Destino
    When eu informar o tipo de formato Envelope
    And o valor total da soma das medidas do envelope for menor que 120cm e maior que 27cm
    And o comprimento do meu envelope � maior que 16cm, a largura maior que 11cm e ambos n�o s�o menores que 60cm
    And o peso for at� 300g
    And eu possuir os Resultados do C�lculo
    Then eu salvarei o resultado

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: Calcular Somente o Prazo
    Given que possuo CEP de origem e destino v�lidos
    When eu informar que desejo calcular somente o prazo
    Then terei os Resultados do C�lculo somente com os prazos

  #		| Data		       | 31/07/2019    |
  #		|Cep de Origem   | 64546455      |
  #		|Cep de Destino  | 55434334      |
  Scenario: N�o Informar os CEPs de Origem e Destino
    Given n�o possuo CEP de origem e destino
    When Tento efetuar um Novo C�lculo
    Then N�o ser� possivel obter o calculo sem os CEPs v�lidos

  # Cen�rio ir� falhar, pois mensagem de "CEP de destino inv�lido" sobrep�em a mensagem "Digite um CEP de origem v�lida ou escolha um estado ou escolha um estado ou uma cidade".
  Scenario: Novo C�lculo de Rolo com dimens�es inv�lidas
    Given que possuo uma encomenda que preciso enviar do meu CEP de Origem at� um determinado CEP de Destino
    When eu informar o tipo de formato Rolo
    And informar o valor da soma das medidas maior que 200cm ou menor que 28cm
    Then N�o terei o resultado do Calculo sem as dimens�es corretas
