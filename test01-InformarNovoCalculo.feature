#Autor: edna.mayo@hotmail.com
#Language: pt-br
#encoding: iso-8859-1
 

@test01
Feature: Novo C�lculo
	
	Background: 
		Given que estou na tela de Origem e Destino
#		And estou conectado a uma rede WI-FI ou rede movel 
		
	Scenario: Informar Origem e Destino
		When eu dou um back para sumir com o menu
		Then eu seleciono uma "01/08/2019" v�lida
		Then insiro um "69028360" e "69054238" v�lidos
		And clico no bot�o Pr�ximo Passo 
		Then vejo pop-up com mensagem: "Aguarde, Validando CEP de Origem e Destino"
		And tela InformarFormatoDimens�esePeso � mostrada

