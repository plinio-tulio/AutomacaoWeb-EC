package br.com.automacao.pages;

import java.math.BigDecimal;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.utils.Conversor;

public class DetalhesCursoPage extends BasePage {

	public String obterValorCurso(){
		return obterTexto(By.xpath("//div[@class='value']"));
	}
	
	public String obterTituloCursoEspecifico(){
		return obterTexto(By.xpath("//h1[@class='cur-details-info-title']"));
	}
	
	public String obterTituloCursos(){
		return obterTexto(By.xpath("//h1[@class='section-header-title']"));
	}
	
	public String obterValorTotalParcelasCurso(){
		String descricaoValor = obterTexto(By.xpath("//div[@class='cur-details-shopping-installments']"));
		return Conversor.converterBigDecimalParaValoMonetarioComSigla(obterValor(descricaoValor).multiply(new BigDecimal(12)));
	}
	
}