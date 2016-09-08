package com.Cucumber.MavenCucumberPrototype;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TesteLoginSmile {
	// Inicializar o WebDriver de forma a ser usado pelas funções que se seguem.
	
	InternetExplorerDriver driverIE = null;
	
	@Given("^Abrir o IE$")
	public void abrir_o_IE() throws Throwable {
		
		
		  // Set path of IEDriverServer.exe
		  // Note : IEDriverServer.exe should be In D: drive.
		  System.setProperty("webdriver.ie.driver", "src/test/resource/IEDriverServer.exe");

		  // Set capability of IE driver to Ignore all zones browser protected mode settings.
		  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		  caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		  // Initialize InternetExplorerDriver Instance using new capability.
		  WebDriver driver = new InternetExplorerDriver(caps);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		  // Load sample calc test URL
		  driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");

		  // Execute sample calc test.
		  driver.findElement(By.xpath("//input[@id='1']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']")).click();
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='equals']")).click();
		  String result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		  System.out.println("Calc test result Is : " + result);
		  driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Aqui uso proxy para aceder a rede
				//vou meter os 3 a usar o proxy do sistema
				/*DesiredCapabilities caps = new DesiredCapabilities();
				
				//set proxy to system proxy
				Proxy proxy = new Proxy();
				proxy.setProxyType(ProxyType.SYSTEM);
				caps.setCapability(CapabilityType.PROXY, proxy);
				
				
				
				File fileIE = new File("src/test/resource/IEDriverServer.exe");
				//File fileIE = new File("C:/Selenium/IEDriverServer.exe");
					
				System.setProperty("webdriver.ie.driver", fileIE.getAbsolutePath());
						
				
				
				//launch IE
				
				driverIE = new InternetExplorerDriver(caps);
		
		
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		File file = new File("src/test/resource/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		
		driverIE = new InternetExplorerDriver(capabilities);
		driverIE.manage().window().maximize();*/
		
		//driverIE = new FirefoxDriver();
		//driverIE.navigate().to("http://10.141.3.41:6800/spl/loginPage.jsp#rdr1");
		//driverIE.navigate().to("https://www.google.pt");
		
	}

	@Given("^Autenticar com utilziador registado$")
	public void autenticar_com_utilziador_registado() throws Throwable {
		Thread.sleep(2000);
		
		//driverIE.findElement(By.xpath(".//*[@id='gs_htif0']")).click();
		//driverIE.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Testes");
		
		driverIE.findElement(By.name("q")).clear();
		driverIE.findElement(By.name("q")).sendKeys("smile1");
		
		
		Thread.sleep(2000);
		/*driverIE.findElement(By.id("userId")).click();
		driverIE.findElement(By.id("userId")).sendKeys("smile1");
		driverIE.findElement(By.id("password")).click();
		driverIE.findElement(By.id("password")).sendKeys("smile001");
		driverIE.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);*/
	}

	@When("^Esperar cinco segundos e fazer Logout$")
	public void esperar_s_e_fazer_Logout() throws Throwable {
	   System.out.println("testes");
	}

	@Then("^Fechar o Browser$")
	public void fechar_o_Browser() throws Throwable {
	    driverIE.close();
	}
	
}
