package br.com.automacao.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.automacao.core.DriverFactory;
import br.com.automacao.pages.ConsultaPage;
import br.com.automacao.pages.DetalhesCursoPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscarCursoSteps {

	private ConsultaPage consultaPage;
	private DetalhesCursoPage detalhesCursoPage;
	private String valorCursoTotalParcelado;
	
	@Before
	public void setUp() {
		DriverFactory.getDriver();
		consultaPage = new ConsultaPage();
		detalhesCursoPage = new DetalhesCursoPage();
		consultaPage.acessarSistema();
		consultaPage.desativarNotificacao();
	}

	@Dado("^que pesquiso o curso pelo professor \"([^\"]*)\"$")
	public void quePesquisoOCursoPeloProfessor(String nomeProfessor) throws Throwable {
		consultaPage.realizarConsultaPorProfessor(nomeProfessor);
	}
	
	@Dado("^que pesquiso o curso pelo concurso \"([^\"]*)\"$")
	public void quePesquisoOCursoPeloConcurso(String concurso) throws Throwable {
		consultaPage.realizarConsultaPorConcurso(concurso);
	}
	
	@Dado("^que pesquiso o curso pela matéria \"([^\"]*)\"$")
	public void quePesquisoOCursoPelaMateria(String nomeMateria) throws Throwable {
		consultaPage.realizarConsultaPorMateria(nomeMateria);
	}
	
	@Quando("^seleciono o curso \"([^\"]*)\"$")
	public void selecionoOCurso(String nomeCurso) throws Throwable {
		consultaPage.acessarDetalhesDoCurso(nomeCurso);
	}
	
	@Quando("^verifico o valor oferecido para o curso \"([^\"]*)\"$")
	public void verificoOValorOferecidoParaOCurso(String nomeCurso) throws Throwable {
		valorCursoTotalParcelado = consultaPage.obterValorTotalCursoParcelado(nomeCurso);
	}

	@Então("^devo ver detalhes sobre o curso \"([^\"]*)\" com os mesmos valores apresentados na busca$")
	public void devoVerDetalhesSobreOCursoComOsMesmosValoresApresentadosNaBusca(String nomeCurso) throws Throwable {
		Assert.assertEquals(valorCursoTotalParcelado, detalhesCursoPage.obterValorCurso());
		Assert.assertEquals(nomeCurso, detalhesCursoPage.obterTituloCursoEspecifico());
		Assert.assertEquals(valorCursoTotalParcelado, detalhesCursoPage.obterValorTotalParcelasCurso());
	}

	@Então("^devo ver detalhes sobre o curso \"([^\"]*)\" selecionado$")
	public void devoVerDetalhesSobreOCursoSelecionado(String nomeCurso) throws Throwable {
		Assert.assertEquals(nomeCurso, detalhesCursoPage.obterTituloCursos());
	}

	@After(order = 1, value = { "@automatizado" })
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getName() +".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 0, value = { "@automatizado" })
	public void fechaBrowser() throws InterruptedException {
		DriverFactory.killDriver();
		System.out.println("finalizando cenário de teste.");
	}

}