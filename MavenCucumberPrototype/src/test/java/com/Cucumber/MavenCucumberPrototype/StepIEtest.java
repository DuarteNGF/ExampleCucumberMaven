package com.Cucumber.MavenCucumberPrototype;

import java.io.File;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepIEtest {
	WebDriver driver = null;
	
	@Given("^Entrar no IE$")
	public void entrar_no_Google() throws Throwable {
		//Aqui uso proxy para aceder a rede
				//vou meter os 3 a usar o proxy do sistema
				DesiredCapabilities caps = new DesiredCapabilities();
				
				//set proxy to system proxy
				Proxy proxy = new Proxy();
				proxy.setProxyType(ProxyType.SYSTEM);
				caps.setCapability(CapabilityType.PROXY, proxy);
				
				
				File fileIE = new File("src/test/resources/IEDriverServer.exe");
					
				System.setProperty("webdriver.ie.driver", fileIE.getAbsolutePath());
						
				
				
				//launch IE
				
				driver = new InternetExplorerDriver(caps);
				driver.navigate().to("https://www.google.pt/");
	}

	@When("^Fazer uma pesquisa$")
	public void fazer_uma_pesquisa() throws Throwable {
		driver.navigate().to("https://www.google.pt/");
	}

	@Then("^Fechar o IE$")
	public void fechar_o_IE() throws Throwable {
		driver.close();
		System.out.println("executed close the browser");
	}
	
}
