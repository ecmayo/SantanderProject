package feature.steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InformarNovoCalculoSteps {

	static AppiumDriver<MobileElement> driver;

	@Given("^que estou na tela de Origem e Destino$")
	public void launchApplication() throws MalformedURLException {

		System.out.println("Chamou");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName","ASUS_X00ID");
		cap.setCapability("udid","H8AXB771E717FUP");
		cap.setCapability("platformName","Android"); 
		cap.setCapability("platformVersion","8.1.0");
		cap.setCapability("appPackage","br.com.correios.calculaprecoprazo");
		cap.setCapability("appActivity","br.com.correios.calculaprecoprazo.activity.SplashScreenActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
	}

	@When("eu dou um back para sumir com o menu")
	public void selectNewCalcule() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navigation_drawer"))); 
		driver.navigate().back();
	}
	
	@Then("eu seleciono uma {string} válida")
	public void inputDate(String date) {
		driver.findElement(By.id("txt_data")).click();
		
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("Jan"); 
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("24");
		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("1987");
		
		driver.findElement(By.id("button1")).click();
	}
	
	@Then("insiro um {string} e {string} válidos")
	public void insertValidZipCodes(String cpfOrigin, String cpfDest) {
		driver.findElement(By.id("txt_cep_ori")).sendKeys(cpfOrigin);
		driver.findElement(By.id("txt_cep_dest")).sendKeys(cpfDest);
	}

	@And("clico no botão Próximo Passo")
	public void clickNextButton() {
		driver.findElement(By.id("button_prox")).click();
	}
	
	@Then("vejo pop-up com mensagem: {string}")
	public void AlertIsShown(String str) {
//		WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
//		if(wait.until(ExpectedConditions.alertIsPresent())==null)
//		    System.out.println("alert was not present");
//		else
//		    System.out.println("alert was present");
	}
	
	@And("tela InformarFormatoDimensõesePeso é mostrada")
	public void tela_InformarFormatoDimensõesePeso_é_mostrada() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
