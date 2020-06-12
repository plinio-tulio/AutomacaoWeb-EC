package br.com.automacao.pages;

import java.math.BigDecimal;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.utils.Conversor;

public class DetalhesCursoPage extends BasePage {

	By tituloCurso = By.xpath("//h1[@class='section-header-title']");
	By valorCurso = By.xpath("//div[@class='value']");
	By tituloCursoEspecifico = By.xpath("//h1[@class='cur-details-info-title']");
	By descricaoValorCurso = By.xpath("//div[@class='cur-details-shopping-installments']");

	public String obterValorCurso(){
		return obterTexto(valorCurso);
	}
	
	public String obterTituloCursoEspecifico(){
		return obterTexto(tituloCursoEspecifico);
	}
	
	public String obterTituloCursos(){
		return obterTexto(tituloCurso);
	}
	
	public String obterValorTotalParcelasCurso(){
		String descricaoValor = obterTexto(descricaoValorCurso);
		return Conversor.converterBigDecimalParaValoMonetarioComSigla(obterValor(descricaoValor).multiply(new BigDecimal(12)));
	}
	
}