#language: pt

Funcionalidade: Login

  @Logar
  Cenário: Realizar Login
    Dado que eu esteja no site do broadleaf
    Quando faço o preenchimento do usuario "admin" e senha "admin"
    Então eu sou logado com sucesso

