# SantanderProject

### * Introdução
Projeto de automação de teste no fluxo Nova Consulta do aplicativo <a href="https://play.google.com/store/apps/details?id=br.com.correios.calculaprecoprazo">
Cálculo Preço e Prazos Correios</a>

Atividades Prova_QA_01 e Prova_QA_02 também foram realizados.

### * Acesso

Versão do Appium - v1.13.0;
Versão do Eclipse IDE for Java Developers - Version: 2019-06 (4.12.0);
Para especificar os dados do device no teste é necessário modificar os dados na classe DriverSingleton.java 
(caminho: https://github.com/ecmayo/SantanderProject/tree/master/src/test/java/com/santander/automation/appium);
Executar o junit na classe StepRunnerTest.java 
(caminho: https://github.com/ecmayo/SantanderProject/tree/master/src/test/java/com/santander/automation/cucumberOptions);

### * Dependências
<ul>
<li><a href="https://mvnrepository.com/artifact/io.appium/java-client">Appium - (7.1.0)</a></li>
<li><a href="https://mvnrepository.com/artifact/junit/junit">Junit - (4.12)</a></li>
<li><a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-junit">Cucumber - (4.7.1)</a></li>
<li><a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm-deps">Cucumber JVM Repackaged Dependencies - (1.0.6)</a></li>
<li><a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-java">Cucumber JVM Java - (4.7.1)</a></li>
<li><a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-core"> Cucumber Core - (4.7.1)</a></li>
</ul>          
         
### * Cenários

Os cenários foram todos especificados conforme a estrutura do BDD como solicitado, porém vale ressaltar que as features são voltadas a entendimento conjunto da equipe na ação do usuário antes mesmo do aplicativo existir.
(caminho: https://github.com/ecmayo/SantanderProject/tree/master/src/test/java/com/santander/automation/features).
