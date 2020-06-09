Feature: Acessar e validar a homepage Na Mídia do Portal InMetrics

  @Executar
  Scenario: Validar links de Redes Sociais da Página Na Mídia
    Given acesso ao portal "InMetrics"
    When Clicar no link Na Mídia
    Then a mensagem "Veja onde a Inmetrics apareceu na mídia" deve ser exibida
    And título "Conheça os finalistas do prêmio Executivo de TI do Ano 2020" deve ser exibida
    And título "Na essência da acessibilidade digital" deve ser exibida
    And título "Fabricantes de celulares aumentam investimento em segurança" deve ser exibida
    And título "Orizon melhora seu processamento de extração de dados em 10 vezes" deve ser exibida
    And título "Inmetrics oferece programa de estágio em São Paulo" deve ser exibida
    And título "Inmetrics abre inscrições para programa Tech Talent 2020" deve ser exibida
    And título "Inmetrics abre mais de 100 vagas em São Paulo, Minas Gerais e Paraná" deve ser exibida
    And título "Inmetrics busca talentos em tecnologia no Brasil" deve ser exibida
    And título "Inmetrics lança programa Tech Talent que busca talentos em tecnologia no Brasil" deve ser exibida
    And título "Não é estágio: empresa vai efetivar estudantes e ensinar habilidades de TI" deve ser exibida
    And fechar o navegador

  @Executar
  Scenario: Validar links de mídias sociais na página Na Mídia
    Given acesso ao portal "InMetrics"
    When Clicar no link Na Mídia
    And Deve ser exibido link lateral para Facebook
    And Deve ser exibido link lateral para Twitter
    And Deve ser exibido link lateral para YouTube
    And Deve ser exibido link lateral para LikedI
    And fechar o navegador

  @Executar
  Scenario: Validar botão Carregar Mais
    Given acesso ao portal "InMetrics"
    When Clicar no link Na Mídia
    Then clicar no botão Carregar mais
    And Atualização da página deve ser realizada
    And fechar o navegador

  @Executar
  Scenario: Validar a página Conheça os finalistas do prêmio Executivo de TI do Ano 2020
    Given acesso ao portal "InMetrics"
    When Clicar no link Na Mídia
    Then a mensagem "Veja onde a Inmetrics apareceu na mídia" deve ser exibida
    And clicar no link Conheça os finalistas do prêmio Executivo de TI do Ano 2020
    And deve exibir o titulo da página conheça os finalistas do prêmio Executivo de TI do Ano 2020
    And Deve ser exibido link para Facebook
    And Deve ser exibido link para Twitter
    And Deve ser exibido link para LikedIn
    And fechar o navegador