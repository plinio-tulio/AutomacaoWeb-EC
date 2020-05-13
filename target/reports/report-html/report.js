$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buscar_curso.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "## Os cenários de teste consideram a carga atual como massa de dados para execução"
    }
  ],
  "line": 3,
  "name": "Pesquisar Cursos",
  "description": "Sendo um usuário do site\nQuero pesquisar pelo curso desejado\nPara ver detalhes e avaliar a compra",
  "id": "pesquisar-cursos",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 24458456027,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Visualizar detalhes de curso filtrando por professor",
  "description": "",
  "id": "pesquisar-cursos;visualizar-detalhes-de-curso-filtrando-por-professor",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@automatizado"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que pesquiso o curso pelo professor \"Ena Loiola\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "verifico o valor oferecido para o curso \"Inglês p/ CBM-MG (Oficial) - 2020\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "seleciono o curso \"Inglês p/ CBM-MG (Oficial) - 2020\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "devo ver detalhes sobre o curso \"Inglês p/ CBM-MG (Oficial) - 2020\" com os mesmos valores apresentados na busca",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Ena Loiola",
      "offset": 37
    }
  ],
  "location": "BuscarCursoSteps.quePesquisoOCursoPeloProfessor(String)"
});
formatter.result({
  "duration": 17977966941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inglês p/ CBM-MG (Oficial) - 2020",
      "offset": 41
    }
  ],
  "location": "BuscarCursoSteps.verificoOValorOferecidoParaOCurso(String)"
});
formatter.result({
  "duration": 197998192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inglês p/ CBM-MG (Oficial) - 2020",
      "offset": 19
    }
  ],
  "location": "BuscarCursoSteps.selecionoOCurso(String)"
});
formatter.result({
  "duration": 6293052856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inglês p/ CBM-MG (Oficial) - 2020",
      "offset": 33
    }
  ],
  "location": "BuscarCursoSteps.devoVerDetalhesSobreOCursoComOsMesmosValoresApresentadosNaBusca(String)"
});
formatter.result({
  "duration": 5713757962,
  "status": "passed"
});
formatter.after({
  "duration": 1082178384,
  "status": "passed"
});
formatter.after({
  "duration": 829620104,
  "status": "passed"
});
formatter.before({
  "duration": 27063521441,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Visualizar detalhes de curso filtrando por concurso",
  "description": "",
  "id": "pesquisar-cursos;visualizar-detalhes-de-curso-filtrando-por-concurso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 15,
      "name": "@automatizado"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que pesquiso o curso pelo concurso \"PM\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "seleciono o curso \"Polícia Militar da Bahia (PM-BA)\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "devo ver detalhes sobre o curso \"Polícia Militar da Bahia (PM-BA)\" selecionado",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "PM",
      "offset": 36
    }
  ],
  "location": "BuscarCursoSteps.quePesquisoOCursoPeloConcurso(String)"
});
formatter.result({
  "duration": 8663209016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Polícia Militar da Bahia (PM-BA)",
      "offset": 19
    }
  ],
  "location": "BuscarCursoSteps.selecionoOCurso(String)"
});
formatter.result({
  "duration": 3685515329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Polícia Militar da Bahia (PM-BA)",
      "offset": 33
    }
  ],
  "location": "BuscarCursoSteps.devoVerDetalhesSobreOCursoSelecionado(String)"
});
formatter.result({
  "duration": 2517140577,
  "status": "passed"
});
formatter.after({
  "duration": 942839513,
  "status": "passed"
});
formatter.after({
  "duration": 1266892767,
  "status": "passed"
});
formatter.before({
  "duration": 36160677463,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Visualizar detalhes de curso filtrando por matéria",
  "description": "",
  "id": "pesquisar-cursos;visualizar-detalhes-de-curso-filtrando-por-matéria",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 21,
      "name": "@automatizado"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "que pesquiso o curso pela matéria \"Direito Constitucional\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 24,
  "name": "verifico o valor oferecido para o curso \"Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 25,
  "name": "seleciono o curso \"Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020\"",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "devo ver detalhes sobre o curso \"Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020\" com os mesmos valores apresentados na busca",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Direito Constitucional",
      "offset": 35
    }
  ],
  "location": "BuscarCursoSteps.quePesquisoOCursoPelaMateria(String)"
});
formatter.result({
  "duration": 10283957227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020",
      "offset": 41
    }
  ],
  "location": "BuscarCursoSteps.verificoOValorOferecidoParaOCurso(String)"
});
formatter.result({
  "duration": 2693984484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020",
      "offset": 19
    }
  ],
  "location": "BuscarCursoSteps.selecionoOCurso(String)"
});
formatter.result({
  "duration": 7632898380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020",
      "offset": 33
    }
  ],
  "location": "BuscarCursoSteps.devoVerDetalhesSobreOCursoComOsMesmosValoresApresentadosNaBusca(String)"
});
formatter.result({
  "duration": 1806539787,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cR$ 2[19,96]\u003e but was:\u003cR$ 2[20,00]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat br.com.automacao.steps.BuscarCursoSteps.devoVerDetalhesSobreOCursoComOsMesmosValoresApresentadosNaBusca(BuscarCursoSteps.java:63)\r\n\tat ✽.Então devo ver detalhes sobre o curso \"Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020\" com os mesmos valores apresentados na busca(src/test/resources/features/buscar_curso.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1479759554,
  "status": "passed"
});
formatter.after({
  "duration": 972896566,
  "status": "passed"
});
});