#language:pt
## Os cenários de teste consideram a carga atual como massa de dados para execução
Funcionalidade: Pesquisar Cursos
  Sendo um usuário do site
  Quero pesquisar pelo curso desejado
  Para ver detalhes e avaliar a compra

  @automatizado
  Cenário: Visualizar detalhes de curso filtrando por professor
    Dado que pesquiso o curso pelo professor "Ena Loiola"
    Quando verifico o valor oferecido para o curso "Inglês p/ CBM-MG (Oficial) - 2020"
    E seleciono o curso "Inglês p/ CBM-MG (Oficial) - 2020"
    Então devo ver detalhes sobre o curso "Inglês p/ CBM-MG (Oficial) - 2020" com os mesmos valores apresentados na busca

  @automatizado
  Cenário: Visualizar detalhes de curso filtrando por concurso
    Dado que pesquiso o curso pelo concurso "PM"
    Quando seleciono o curso "Polícia Militar da Bahia (PM-BA)"
    Então devo ver detalhes sobre o curso "Polícia Militar da Bahia (PM-BA)" selecionado

  @automatizado
  Cenário: Visualizar detalhes de curso filtrando por matéria
    Dado que pesquiso o curso pela matéria "Direito Constitucional"
    Quando verifico o valor oferecido para o curso "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020"
    E seleciono o curso "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020"
    Então devo ver detalhes sobre o curso "Direito Constitucional p/ TJ-SE (Analista Judiciário - Direito) Com Videoaulas - 2020" com os mesmos valores apresentados na busca

  @manual
  Cenário: Visualizar detalhes de curso filtrando por região
    Dado que pesquiso o curso pela região "São Paulo"
    Quando seleciono o curso "Câmara Municipal de Santos-SP"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso filtrando em todos cursos
    Dado que pesquiso o curso "Polícia Federal" em todos os cursos
    Quando seleciono o curso "Raciocínio Lógico p/ Polícia Federal (Agente Administrativo) Com Videoaulas - 2020"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso buscando por nome do curso desejado
    Dado que pesquiso o curso pelo nome do curso "Raciocínio Lógico p/ Polícia Federal (Agente Administrativo)"
    Quando seleciono o curso "Raciocínio Lógico p/ Polícia Federal (Agente Administrativo) Com Videoaulas - 2020"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso buscando em cursos mais vendidos
    Dado que pesquiso o curso "Exame de Ordem - OAB 1ª Fase" pelos cursos mais vendidos
    Quando seleciono o curso "Exame de Ordem - OAB 1ª Fase"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso buscando em cursos com edital publicado
    Dado que pesquiso o curso "Assembleia Legislativa do Estado do Amapá (ALAP)" pelos cursos com edital publicado
    Quando seleciono o curso "Assembleia Legislativa do Estado do Amapá (ALAP)"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso buscando em cursos com edital que será publicado em breve
    Dado que pesquiso o curso "Câmara Municipal de Americana-SP" pelos cursos com edital que será publicado em breve
    Quando seleciono o curso "Câmara Municipal de Americana-SP"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas

  @manual
  Cenário: Visualizar detalhes de curso buscando em cursos para preparação de longo prazo
    Dado que pesquiso o curso "Agência Brasileira de Inteligência (ABIN)" pelos cursos para preparação de longo prazo
    Quando seleciono o curso "Agência Brasileira de Inteligência (ABIN)"
    Então devo ver detalhes sobre o curso selecionado com as informações corretas