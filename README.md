# 🛠Ordem de Serviço API
API de criação de ordens de serviço desenvolvida durante o mini curso de Spring Rest da AlgaWorks.

## ⚡ Tecnologias
* [Spring Framework]: Plataforma Java que fornece suporte abrangente à infraestrutura para o desenvolvimento de aplicativos Java.
* [PostgreSQL]: Sistema gerenciador de banco de dados objeto relacional, desenvolvido como projeto de código aberto.

## API endpoints
### Clientes
#### GET
* Clientes - Listar: /clientes
* Clientes - Buscar: /clientes/1
#### POST
* Clientes - Adicionar: /clientes
```json
{
  "nome": "teste",
  "email": "ae@ae.com",
  "telefone": "123"
}
```
### PUT
* Clientes - Atualizar: /clientes/3
```json
{
  "nome": "Teste",
  "email": "ae@ae.com",
  "telefone": "123"
}
```
### DEL
* Clientes - Excluir: /clientes/24


[Spring Framework]: <https://spring.io/projects/spring-framework>
[PostgreSQL]: <https://www.postgresql.org>
