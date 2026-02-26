# TaskHub - Backend

Backend da aplicação **TaskHub**, um sistema completo para gerenciamento de tarefas e projetos. Desenvolvido com **Java** e **Spring Boot**, focado em performance, segurança e boas práticas.

## 🚀 Tecnologias Utilizadas

- **Java 21** (LTS)
- **Spring Boot 3.2.3**
  - Spring Web (API REST)
  - Spring Data JPA (Persistência)
- **PostgreSQL** (Banco de Dados)
- **Docker** (Containerização)
- **Maven** (Gerenciamento de Dependências)
- **Lombok** (Produtividade)

## 🛠️ Como Rodar Localmente

### Pré-requisitos
- Java 21 instalado
- Maven instalado
- PostgreSQL rodando (Porta 5432)

### Passo a Passo

1. **Clone o repositório**
   ```bash
   git clone https://github.com/EduardoRSaless/taskhub-backend.git
   cd taskhub-backend/server
   ```

2. **Configure o Banco de Dados**
   - Crie um banco de dados chamado `dashboard_db` no PostgreSQL.
   - Verifique se o usuário é `postgres` e a senha `310105` (ou ajuste no `application.properties`).

3. **Execute a aplicação**
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a API**
   - O servidor iniciará em `http://localhost:8080`.
   - Documentação (se houver Swagger): `http://localhost:8080/swagger-ui.html`

## 📦 Deploy

O projeto está configurado para deploy no **Render** utilizando Docker.
- O arquivo `Dockerfile` na pasta `server` contém as instruções de build.
- O banco de dados PostgreSQL também é hospedado no Render (ou Supabase).

## 📂 Estrutura do Projeto

```
taskhub-backend/
├── server/
│   ├── src/main/java/       # Código Fonte Java
│   ├── src/main/resources/  # Configurações (application.properties)
│   ├── Dockerfile           # Configuração Docker
│   └── pom.xml              # Dependências Maven
└── README.md                # Documentação
```

---
Desenvolvido por [Eduardo Sales](https://github.com/EduardoRSaless)
