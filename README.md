<img src="icon.png" align="right" />

# Awesome README [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)
> O melhor README(ou tentativa) que você ira ver hoje.

Tokyo: Desafio criado para o processo seletivo da HOTMART

## Getting Started

Esse projeto se propõe a criar um WebChat comspringboot.


### Prerequisites

Projeto Desenvolvido em Java 1.8 usando Springboot.

Deve-se a escolha do Springboot como starter e varios modulos para falicitar aconfiguração do projeto, os modulos usados neste projeto são:

```
Web - Full-Stack para desenvolvimento do spring MVC incluindo o tomcat.
JPA - Pera a persistencia dos dados incluindo spring-data e hibernate.
H2 -Banco de dados em memoria.
Spring-security - Usado para a segurança na exposição dos endpoints.
Swagger2 - Para criação do swagger para documentação dos endpoints.
Stomp e Socket.js - bliblotecas js para ajudar a desenvolver o chat.
```
Durante todo o processo de desenvolvido foi se atento para que seja limpo e organizado seguindo os princípios SOLID.

### Usage

Para fazer uso da aplicação deve-se acesar:
```
localhost:8080/api/login
```
Onde você deve fazer um cadastro previamente para depois entrar no chat.
O nick do participanete no chat e o nome adotado no cadastro, a troca de mensagem e rapida e fluida, listando quando o contato fica online.
 


### Documentação

Foi adicionado um swagger mapeando as rotas disponiveis, ele esta acessivel em: 

```
http://localhost:8080/swagger-ui.html
```



### Observaçes

Não implementei 100% do que queria e como queria por questes de tempo.
Queria cobrir com mais testes,organizar melhor o codigo e implementar outras funcionalidades.
Adotei a solução que e mais comum e agradavel que me senti mais a vontade para desenvolver.
Toda critica e sempre bem vinda.
