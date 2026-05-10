# 🥟 Baozi Store - Backend API

Projeto desenvolvido para a Atividade Prática da disciplina de Desenvolvimento Web - Back End - Uninter. 

Esta é uma API RESTful construída com **Spring Boot** para gerenciar o ecossistema de uma loja de pães chineses (Baozi).

## Sobre o Projeto
O sistema foi criado para automatizar o gerenciamento de uma loja fictícia, permitindo o controle completo de clientes, produtos e o registro de pedidos. A persistência de dados utiliza o banco **H2** em modo arquivo, garantindo que os dados não sejam perdidos ao reiniciar a aplicação.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA** (Persistência)
- **H2 Database** (Banco de Dados em arquivo)
- **Maven** (Gerenciador de Dependências)
- **Postman** (Testes de API)

## Estrutura de Pacotes
A API segue o padrão de arquitetura MVC simplificado:
- `com.uninter.baozistore.controller`: Endpoints da API.
- `com.uninter.baozistore.model`: Entidades (Classes que viram tabelas no banco).
- `com.uninter.baozistore.repository`: Interfaces de comunicação com o banco de dados.

## Endpoints Principais
| Método | Rota | Descrição |
| :--- | :--- | :--- |
| **POST** | `/clientes` | Cadastra um novo cliente (incluindo Nome e RU). |
| **GET** | `/clientes` | Lista todos os clientes cadastrados. |
| **DELETE** | `/clientes/{id}` | Remove um cliente específico pelo ID. |
| **POST** | `/produtos` | Adiciona um novo produto ao cardápio. |
| **POST** | `/pedidos` | Registra uma nova venda vinculando Cliente e Produto. |

## Como Executar
1. Clone o repositório.
2. No Eclipse, importe como **Existing Maven Project**.
3. Execute a classe `BaoziStoreApplication.java`.
4. O banco de dados pode ser acessado via console em: `http://localhost:8080/h2-console`
