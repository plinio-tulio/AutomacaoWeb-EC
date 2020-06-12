package br.com.automacao.core;

import static br.com.automacao.core.DriverFactory.getDriver;

import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private final String BaseURL = "https://www.estrategiaconcursos.com.br/";

	public void acessarSistema() {
		getDriver().get(BaseURL);
	}

	public void acessar(String texto) {
		getDriver().get(texto);
	}

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public void clique(By by) {
		getDriver().findElement(by).click();
	}

	public void enter(By by) {
		getDriver().findElement(by).sendKeys(Keys.ENTER);
	}
	
	public BigDecimal obterValor(String descricao) {
		String valor=descricao.substring(descricao.indexOf("R$")+3, descricao.length());
		return new BigDecimal(valor.replace(",", "."));	
	}

	public static void scrollCliquePorTexto(String valor) {
		WebElement ele = getDriver().findElement(By.xpath("//*[text()='" + valor + "']"));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",ele);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	public static void scrollClique(By element) {
		WebElement ele = getDriver().findElement(element);
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",ele);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	public void aguardarElementoVisivel(By element){
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(element)));
	}

}