# Desafio de Projeto - Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week 2023, utilizando Java 17 e Spring Boot 3.

### Tecnologias

- Java 17: [Documentação](https://docs.oracle.com/en/java/javase/17/)
- Spring Boot 3: [Documentação](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started)
- Spring Data JPA: [Documentação](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- Railway: [Documentação](https://docs.railway.app/)

### Diagrama de Classe da API

```mermaid

classDiagram
  class User {
    - name: String
    - account: Account
    - features: List<Feature>
    - card: Card
    - news: List<News>
  }
  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }
  class Feature {
    - icon: String
    - description: String
  }
  class Card {
    - number: String
    - limit: Float
  }
  class News {
    - icon: String
    - description: String
  }

  User "1" *--> "1" Account: has
  User "0..*" *--> "N" Feature: has
  User "1" * --> "1" Card: has
  User "0..*" *--> "N" News: has
```

### Modelo Figma do App Santander

Uma prévia do modelo usado para construção da api:
 - [Modelo Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=2-92&mode=design&t=yRxhKzjzKWJ3XQ4J-0)
