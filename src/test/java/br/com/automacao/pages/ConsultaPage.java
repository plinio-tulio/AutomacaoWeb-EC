package br.com.automacao.pages;

import java.math.BigDecimal;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.utils.Conversor;

public class ConsultaPage extends BasePage {

	By menuConsultaPorProfessor = By.xpath("//a[text()='Por professor']");
	By menuConsultaPorConcurso = By.xpath("//a[text()='Por concurso']");
	By menuConsultaPorMateria = By.xpath("//a[text()='Por matéria']");
	By filtroTabela = By.xpath("//input[@placeholder='Filtrar']");
	By botaoCancelarModalNotificacao = By.id("onesignal-popover-cancel-button");
	By campoBuscaGeral = By.name("q");
	By botaoBuscaGeral = By.xpath("//button[@class='search-input-icon']");
	By abaCursos = By.xpath("//button[@data-type-button='cursos']");

	public void realizarConsultaPorProfessor(String nomeProfessor) {
		clique(menuConsultaPorProfessor);
		escrever(filtroTabela,nomeProfessor);
		enter(filtroTabela);
		scrollCliquePorTexto(nomeProfessor);
	}

	public void realizarConsultaPorConcurso(String concurso) {
		clique(menuConsultaPorConcurso);
		escrever(filtroTabela,concurso);
		enter(filtroTabela);
	}

	public void realizarConsultaPorMateria(String nomeMateria) {
		clique(menuConsultaPorMateria);
		realizarBuscaGeral(nomeMateria);
		clique(abaCursos);
	}

	public void realizarBuscaGeral(String valor) {
		aguardarElementoVisivel(campoBuscaGeral);
		escrever(campoBuscaGeral,valor);
		clique(botaoBuscaGeral);
	}

	public void desativarNotificacao() {
		aguardarElementoVisivel(menuConsultaPorProfessor);
		clique(botaoCancelarModalNotificacao);
	}

	public void acessarDetalhesDoCurso(String nomeCurso) {
		scrollCliquePorTexto(nomeCurso);
	}

	public String obterValorTotalCursoParcelado(String nomeCurso) {
		String descricaoValor = obterTexto(By.xpath("//a[text()='" + nomeCurso + "']/../../*[@class='card-prod-price']"));
		return Conversor.converterBigDecimalParaValoMonetarioComSigla(obterValor(descricaoValor).multiply(new BigDecimal(12)));
	}

}