package Aula;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testepatrimonio {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\leonardo.peixoto.NETSUPREMA\\Desktop\\Qualidade de Software\\Aula19052018\\geckodriver.exe");
	WebDriver navegador = new FirefoxDriver();
	navegador.get("https://www.globo.com");

	}

}