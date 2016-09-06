package com.Cucumber.MavenCucumberPrototype;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testeie {
	WebDriver driverIE = null;
	
	
	@Given("^Entrar no IE$")
	public void entrar_no_Google() throws Throwable {
		
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		File file = new File("src/test/resource/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		//WebDriver driver = new FirefoxDriver();
		
		
		WebDriver driverIE = new InternetExplorerDriver();
		driverIE.navigate().to("https://www.google.pt/");
		
				
	}

	@When("^pesquisar benfica$")
	public void pesquisar_benfica() throws Throwable {
	    System.out.println("OLA");
	}

	@Then("^Fechar o IE$")
	public void fechar_o_IE() throws Throwable {
		driverIE.close();
		System.out.println("executed close the browser");
	}
	
}
