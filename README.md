[![Author](https://img.shields.io/badge/author-marioandre01-00b300?style=flat-square)](https://github.com/marioandre01)
[![Languages](https://img.shields.io/github/languages/count/marioandre01/user_api_spring_boot?color=%2300b300&style=flat-square)](#)
[![Stars](https://img.shields.io/github/stars/marioandre01/user_api_spring_boot?color=00b300&style=flat-square)](https://github.com/marioandre01/user_api_spring_boot/stargazers)
[![Forks](https://img.shields.io/github/forks/marioandre01/user_api_spring_boot?color=%2300b300&style=flat-square)](https://github.com/marioandre01/user_api_spring_boot/network/members)
[![Contributors](https://img.shields.io/github/contributors/marioandre01/user_api_spring_boot?color=00b300&style=flat-square)](https://github.com/marioandre01/user_api_spring_boot/graphs/contributors)
[![Licence](https://img.shields.io/github/license/marioandre01/user_api_spring_boot?color=%2300b300&style=flat-square)](https://github.com/marioandre01/user_api_spring_boot/blob/master/LICENCE.md)


<h1 align="center">
  <img alt="moveit" title="moveit" src="src/main/resources/imgs/logo_spring_boot.svg" width="200px" />
  <br>
  user_api_spring_boot
</h1>

<p align="center"> 
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-layout">Layout</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-executando-a-aplicação">Executando a aplicação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#gear-contribuição">Contribuição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-licença">Licença</a>
</p>

## 💻 Projeto

Este projeto tem como objetivo desenvolver uma API de usuários utilizando o framework spring boot.

O resultado da aplicação pode ser acessado através da seguinte URL: 

## 📋 Tecnologias

O projeto foi desenvolvido com as seguintes tecnologias:

- [Java](https://www.java.com/pt-BR/)
- [Spring boot](https://spring.io/)
- [Lombok](https://projectlombok.org/)

<!-- ## 🎨 Layout

### 💻 Web 

<p align="center">
  <img alt="Podcastr web" title="Podcastr web" src="public/podcastr-tela01.png" width="800px">
  <img alt="Podcastr web" title="Podcastr web" src="public/podcastr-tela02.png" width="800px">
  <img alt="Podcastr web" title="Podcastr web" src="public/podcastr-tela03.png" width="800px">
</p>
</p> -->

### :octocat: Clonando o Repositório

```bash
$ git clone https://github.com/marioandre01/user_api_spring_boot.git

# entre na pasta do projeto
$ cd user_api_spring_boot
```
### 💻 Executando a aplicação

Para executar a aplicação há duas formas usando o maven:

Caso o maven não esteja instalado executar:

```bash
$ sudo apt install maven
```
Com o maven instalado a primeira maneira é usando o comando **spring-boot:run**

```bash
$ mvn spring-boot:run
```
A aplicação será iniciada.

A segunda maneira é gerando o seu arquivo **.jar**

 executar o comando:
```bash
$ mvn clean package
```
Concluído o processo de criação, será gerado a pasta **target** na pasta raiz do projeto e dentro dela estará o arquivo **.jar** criado.

Então entrar na pasta **target**
```bash
$ cd target
```
E executar:
```bash
$ java -jar nome_do_arquivo.jar

# exemplo: 
# $ java -jar spring-boot-subscriber-encrypt_decrypt-0.0.1-SNAPSHOT.jar
```
A aplicação será iniciada.

Agora acessar as rotas da API para usar os seus serviços

### Rotas GET
- getMensagem 

  [GET] `http://localhost:8080/`
  #### Resposta: 
  ```bash   
    Spring boot is working!  
  ```

- getUsers 

  [GET] `http://localhost:8080/users`
  #### Resposta:   
  ```bash
    [
      {
        "nome": "Eduardo",
        "cpf": "123",
        "endereco": "Rua a",
        "email": "eduardo@email.com",
        "telefone": "1234-3454",
        "dataCadastro": "2021-05-28T18:48:37.565+00:00"
      },
      {
        "nome": "Luiz",
        "cpf": "456",
        "endereco": "Rua b",
        "email": "luiz@email.com",
        "telefone": "1234-3454",
        "dataCadastro": "2021-05-28T18:48:37.565+00:00"
      },
      {
        "nome": "Bruna",
        "cpf": "789",
        "endereco": "Rua c",
        "email": "bruna@email.com",
        "telefone": "1234-3454",
        "dataCadastro": "2021-05-28T18:48:37.565+00:00"
      }
    ]  
  ```
  
- getUsersByCpf

  [GET] `http://localhost:8080/users/123`
  #### Resposta: 
  ```bash   
    {
      "nome": "Eduardo",
      "cpf": "123",
      "endereco": "Rua a",
      "email": "eduardo@email.com",
      "telefone": "1234-3454",
      "dataCadastro": "2021-05-28T15:11:12.401+00:00"
    } 
  ```
  Se colocar um Cpf que não esta cadastrado vai retorna **Null**

### Rota POST
- insertUser

  [POST] `http://localhost:8080/newUser`
  #### Corpo da mensagem (json): 
  ```bash   
    {
      "cpf":"987",
      "nome":"Carlos",
      "endereco":"Avenida 2",
      "email":"carlos@email.com",
      "telefone":"1234-3454"
    } 
  ```
  #### Resposta: 
  ```bash   
    {
      "nome": "Carlos",
      "cpf": "987",
      "endereco": "Avenida 2",
      "email": "carlos@email.com",
      "telefone": "1234-3454",
      "dataCadastro": "2021-05-28T15:13:44.374+00:00"
    }
  ```
  ### Rota DELETE
- removeUserByCpf
  
  [DELETE] `http://localhost:8080/123`
  #### Resposta: 
  ```bash   
    True 
  ```
  Se informar um Cpf que não esta cadastrado vai retornar **False**


## :gear: Contribuição

Para contribuir com esse projeto faça os seguintes passos:

- Faça um fork desse repositório;
- Crie uma branch com a sua feature: `git checkout -b minha-feature`;
- Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`;
- Faça push para a sua branch: `git push origin minha-feature`.

## :memo: Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](./LICENSE.md) para mais detalhes.





