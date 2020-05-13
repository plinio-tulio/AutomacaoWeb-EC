package br.com.automacao.pages;

import java.math.BigDecimal;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.utils.Conversor;

public class ConsultaPage extends BasePage {

	public void realizarConsultaPorProfessor(String nomeProfessor) {
		clique(By.xpath("//a[text()='Por professor']"));
		escrever(By.xpath("//input[@placeholder='Filtrar']"), nomeProfessor);
		clique(By.xpath("//button[@title='Filtrar']"));
		scrollClique(By.xpath("//a[text()='" + nomeProfessor + "']"));
	}

	public void realizarConsultaPorConcurso(String concurso) {
		clique(By.xpath("//a[text()='Por concurso']"));
		escrever(By.xpath("//input[@placeholder='Filtrar']"), concurso);
		clique(By.xpath("//button[@title='Filtrar']"));
	}

	public void realizarConsultaPorMateria(String nomeMateria) {
		clique(By.xpath("//a[text()='Por matéria']"));
		realizarBuscaGeral(nomeMateria);
		clique(By.xpath("//button[@data-type-button='cursos']"));
	}

	public void realizarBuscaGeral(String nomeMateria) {
		escrever(By.name("q"), nomeMateria);
		clique(By.xpath("//button[@class='search-input-icon']"));
	}

	public void desativarNotificacao() {
		aguardarElementoVisivel(By.id("onesignal-popover-cancel-button"));
		clique(By.id("onesignal-popover-cancel-button"));
	}

	public void acessarDetalhesDoCurso(String nomeCurso) {
		scrollClique(By.xpath("//a[text()='" + nomeCurso + "']"));
	}

	public String obterValorTotalCursoParcelado(String nomeCurso) {
		String descricaoValor = obterTexto(
				By.xpath("//a[text()='" + nomeCurso + "']/../../*[@class='card-prod-price']"));
		return Conversor
				.converterBigDecimalParaValoMonetarioComSigla(obterValor(descricaoValor).multiply(new BigDecimal(12)));
	}

}