package Aula;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteDois {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\leonardo.peixoto.NETSUPREMA\\Desktop\\Qualidade de Software\\Aula19052018\\geckodriver.exe");
		WebDriver navegador = new FirefoxDriver();
		navegador.get("http://elias.projetointegrador.com/patrimonio/benspatrimoniais-excluir-post.php?num=1650");
		
		navegador.get("http://elias.projetointegrador.com");
	
	
	WebElement link = navegador.findElement(By.linkText("Sistema de controle patrimonial"));
	link.click();
	
	WebElement link2 = navegador.findElement(By.linkText("Bens Patrimoniais"));
	link2.click();
	WebElement link3 = navegador.findElement(By.linkText("Adicionar um Novo Bem Patrimonial"));
	link3.click();

	WebElement numero = navegador.findElement(By.name("txtNum"));
	numero.sendKeys("1650");
	WebElement data = navegador.findElement(By.name("txtDtAq"));
	data.sendKeys("2016-05-15");
	WebElement descricao = navegador.findElement(By.name("txtDesc"));
	descricao.sendKeys("Ar condicionado Split");
	WebElement valor = navegador.findElement(By.name("txtVlrCompra"));
	valor.sendKeys("3000");
	WebElement departamento = navegador.findElement(By.name("txtDpto"));
	departamento.sendKeys("Gerencia");
	WebElement sala = navegador.findElement(By.name("txtSala"));
	sala.sendKeys("311");
	WebElement botaoSalvar = navegador.findElement(By.id("btnSalvar"));
	botaoSalvar.click();
	
	String pagina = navegador.getPageSource();
	if(pagina.contains("24") & pagina.contains("Ar condicionado Split")) {
		System.out.println("Teste Com sucesso");
	
	}else {
		System.out.println("Teste sem sucesso");
		
	}
	navegador.close();

	}
}