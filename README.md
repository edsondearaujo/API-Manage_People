<h1>
  API simples para gerenciamento de Pessoas
</h1>
<br><br>
<h2><b>Introdução</b></h2>

Essa API foi desenvolvida utilizando Spring Boot.
A organização do projeto foi definida da seguinte maneira:

- *Config:* Contém a configuração do Model Mapper e configuração local para criar as pessoas no banco de dados.

- *Domain:* Classes de modelo com a declaração dos atributos de cada objeto.

- *Resource:* No pacote recursos, temos os métodos controladores da API.

- *Repositories:* Camada de acesso ao banco de dados.

- *Services:* Implementação lógica de negócio.


<h2><b>Qualidade de código</b></h2>
   
1. Quando se fala sobre garantir a qualidade de código. Eu penso em teste unitário, seguir o padrão SOLID, bem como tratar os principais Design Patterns, tais quais:
  - Singleton;
  - Factory;
  - Facade; [ Disposição de serviços úteis de um EJB, por exemplo ];
2. Para um pleno controle de qualidade na construção, deve-se orientar seu desenevolvimento com pensamento "REVERSO",
no qual imagina-se primeiro a consumação do Serviço, para tão somente após, criar a codificação necessária e apta ao produto idealizado;


<h2><b>Tarefas</b></h2>

| Issue | Descrição |     Status     |
|------:|-----------|:--------------:|
|    #5 |      Criar uma pessoa     |     feito      |
|    #6 |    Editar uma pessoa       |     feito      |
|    #1 |       Consultar uma pessoa    |     feito      |
|    #4 |     Listar pessoas      |     feito      |
|     - |      Criar endereço para pessoa     | dívida técnica |
|     - |     Listar endereços da pessoa      | dívida técnica |
|     - |     Poder informar qual endereço é o principal da pessoa      | dívida técnica |


<h2><b>Diferencial</b></h2>

| Issue | Descrição                                            | Status |
|------:|------------------------------------------------------|:------:|
|    #8 | Testes                                               | feito  |
|     - | Clean Code                                           | feito  |


<h2><b>Tecnologias</b></h2>

O projeto foi desenvolvido utilizando as seguintes tecnologias

- Spring Boot
- Java 17
- H2 Database
- Maven
- Lombok
- Model Mapper
- JPA

---

<h2><b>Rodar o projeto</b></h2>

```bash
# Clonar o repositório
$ git@github.com:edsondearaujo/API-Manage_People.git

# Importar na sua IDE de preferência

# Baixar as dependências necessárias para o desenvolvimento Spring

# Rodar o projeto (run Application)
```

---

