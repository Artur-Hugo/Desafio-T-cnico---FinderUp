# Desafio-Técnico---FinderUp

# Desafio-Tecnico---FinderUp

<h1 align="center">
    <a href="#" alt="Api Fabricação de Bolos"> API Fabricacão de Bolos </a>
</h1>

<h3 align="center">
    API com funcionalidade para a gestão de matérias primas para confecção de bolos. 
</h3>


<h4 align="center">
	🚧   Concluído 🚀 🚧
</h4>

Tabela de conteúdos
=================
<!--ts-->
   * [Sobre o projeto](#-sobre-o-projeto)
   * [Funcionalidades](#-funcionalidades)
   * [Layout](#-layout)
   * [Como executar o projeto](#-como-executar-o-projeto)
     * [Pré-requisitos](#pré-requisitos)
     * [Rodando o Backend (servidor)](#user-content--rodando-o-backend-servidor)
   * [Tecnologias](#-tecnologias)
   * [Autor](#-autor)
 
<!--te-->


## 💻 Sobre o projeto

API Fabrica de Bolos - é uma API com funcionalidade para a gestão das matérias primas.

---

## ⚙️ Funcionalidades

- [x] O estoquista pode cadastrar uma nova matéria prima:
  - [x] Nome da matéria prima.
    - Farinha de trigo
  - [x] Quantidade de matéria prima.
    - 5
  - [x] Nome do usuario que está cadastrando a matéria prima.
    - Fulano
	[( ͡° ͜V ͡°) -Postman]-(((http://localhost:8080/rawMaterials)))


- [x] O padeiro pode consultar as matérias primas por nome:
  - [x] Nome da matéria prima.
    - Farinha de trigo
	[( ͡° ͜V ͡°) -Postman]-(((http://localhost:8080/rawMaterials/Farinha de trigo)))


- [x] O padeiro pode utilizar as matérias primas através do nome:
  - [x] Quantidade de matéria prima.
    - 5
  - [x] Nome do usuario que irá utilizar a matéria prima.
    - Ribamar
	[( ͡° ͜V ͡°) -Postman]-(((http://localhost:8080/rawMaterials/{{ID}}/request)))

- [x] O Gerente pode ver a quantidade gasta por padeiro, consultando o nome do usuario/padeiro :
  - [x] Nome do usuário/padeiro.
	- Ribamar 
	 [( ͡° ͜V ͡°) -Postman]-(((http://localhost:8080/rawMaterials/user/Ribamar)))


---

---

## 🚀 Como executar o projeto

Este projeto contem a parte:
1. Backend 

💡Para que a API funcione, é necessário que o Backend esteja sendo executado.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java](https://www.java.com/pt-BR/download/manual.jsp)
[SpringTools](https://spring.io/tools). 
Além disto é bom ter um editor para trabalhar com o código como [SpringToolsSuite 4](https://spring.io/tools)

#### 🎲 Rodando o Backend (servidor)

```bash
# Clone este repositório
$ git clone https://github.com/Artur-Hugo/Desafio-Tecnico--FinderUp-Back-end.git

#´´´STS
# Abra o STS(SpringToolsSuite 4) 
# caminho ===> File -> Import -> Maven -> Existing Maven Projects -> Root Directory(o Arquivo do repositório clonado)

# Lauch Desafio-Tecnico--FinderUp-Back-end

# O servidor inciará na porta:8080 - acesse http://localhost:8080

# 

# Baixe o arquivo para ser mais fácil utilizar no Postman -> https://mega.nz/file/62pgBLRL#rcplzH42vWYp_MYg3IpZcHO_-JIapzYmwczQrL4xPUA
```

---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

-   Editor:  **[SpringToolsSuite 4](https://spring.io/tools)**  
-   Banco de Dados: **[H2]. Acesse (http://localhost:8080/h2-console/) com a porta http://localhost:8080 iniciado. Informações no application.properties**
-   Commit:  **[GitHub](https://github.com/)**
-   Teste de API:  **[Postman](https://www.postman.com/downloads/)**


---

## 🦸 Autor

 <sub><b>Artur Hugo</b></sub>



Feito por Artur Hugo 🦸 [Entre em contato!](https://www.linkedin.com/in/artur-hugo/)

