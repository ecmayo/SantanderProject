package com.santander.automation.stepDefinitions;

import java.net.MalformedURLException;

import com.santander.automation.mobile.pages.android.OriginAndDestinyPage;
import com.santander.automation.mobile.pages.android.PackageCharacteristicsPage;
import com.santander.automation.mobile.pages.android.ServiceOptionalPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class InformarNovoCalculoSteps {

	OriginAndDestinyPage priceAndTermPage = new OriginAndDestinyPage();
	PackageCharacteristicsPage packagePage = new PackageCharacteristicsPage();
	ServiceOptionalPage serviceOptional = new ServiceOptionalPage();

	@Given("que possuo uma encomenda que preciso enviar do meu CEP de Origem até um determinado CEP de Destino")
	public void launchApplication() throws MalformedURLException {
		priceAndTermPage.informOriginDestinZipCodes();
		priceAndTermPage.clickNextSteps();
	}
	
	@When("eu informar o tipo de formato Caixa")
	public void selectPackage() {
		packagePage.selectPackageAndBoxOpction();
	}
	

	@And("o valor total da soma das medidas do pacote for menor que 200cm e maior que 29cm")
	public void valuesPackage() {
		
	}
	
	@When("o comprimento do meu pacote é maior que 16cm, a largura maior que 11cm e a altura maior que 2cm")
	public void insertDimensionOfPackage() {
		packagePage.insertDimension();	
	}
	
	@And("o peso for até 300g")
	public void insertWeightOption() {
		packagePage.swipeSeekBarWeight();
		packagePage.clickNextSteps();
	}

	@And ("eu escolho o tipo de serviço de Mão Própria")
	public void ownHandTypeOfService () {
		//serviceOptional.ownHandService();
		serviceOptional.valueStatementService();
	}
	
	
	
//	@Then("eu seleciono uma {string} válida")
//	public void inputDate(String date) {
//		driver.findElement(By.id("txt_data")).click();
//		
//		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("Jan"); 
//		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("24");
//		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("1987");
//		
//		driver.findElement(By.id("button1")).click();
//	}
//	
//	@Then("insiro um {string} e {string} válidos")
//	public void insertValidZipCodes(String cpfOrigin, String cpfDest) {
//		driver.findElement(By.id("txt_cep_ori")).sendKeys(cpfOrigin);
//		driver.findElement(By.id("txt_cep_dest")).sendKeys(cpfDest);
//	}
//
//	@And("clico no botão Próximo Passo")
//	public void clickNextButton() {
//		driver.findElement(By.id("button_prox")).click();
//	}
//	
//	@Then("vejo pop-up com mensagem: {string}")
//	public void AlertIsShown(String str) {
////		WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
////		if(wait.until(ExpectedConditions.alertIsPresent())==null)
////		    System.out.println("alert was not present");
////		else
////		    System.out.println("alert was present");
//	}
//	
//	@And("tela InformarFormatoDimensõesePeso é mostrada")
//	public void tela_InformarFormatoDimensõesePeso_é_mostrada() {
//	    // Write code here that turns the phrase above into concrete actions
//	}


}
