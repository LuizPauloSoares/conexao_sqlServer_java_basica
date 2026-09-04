# ConexaoSQLSimples

Aplicação Java simples para testar conexão com um banco de dados SQL Server usando autenticação integrada do Windows (Integrated Security).

## 🚀 Tecnologias utilizadas

- Java
- JDBC (Java Database Connectivity)
- Microsoft JDBC Driver for SQL Server
- SQL Server / SQL Server Express

## ⚙️ Como o sistema funciona

O programa monta uma URL de conexão JDBC apontando para uma instância nomeada do SQL Server (`SQLEXPRESS`), usa autenticação integrada (do Windows) para autenticar e tenta abrir a conexão com o banco `aula_051125_procedure`. Se a conexão for bem-sucedida, exibe uma mensagem de sucesso; caso contrário, captura e exibe o erro de SQL.

## 📋 Pré-requisitos / Dependências

- JDK instalado (Java 8+)
- SQL Server / SQL Server Express instalado e com a instância `SQLEXPRESS` habilitada
- Driver JDBC do SQL Server (`mssql-jdbc`) adicionado ao classpath do projeto
- Autenticação integrada do Windows habilitada no SQL Server (biblioteca nativa `mssql-jdbc_auth` pode ser necessária, dependendo da versão do driver)
- Banco de dados `aula_051125_procedure` criado na instância

## 📦 Como clonar o projeto

```bash
git clone https://github.com/LuizPauloSoares/exemploprocedure.git
cd exemploprocedure
```

## 🔧 Instalação e configuração

1. Importe o projeto na sua IDE (Eclipse, IntelliJ, NetBeans, etc.).
2. Adicione o driver JDBC do SQL Server (`mssql-jdbc-x.x.x.jre8.jar`) ao classpath do projeto.
3. Ajuste, se necessário, as variáveis de conexão no código:
   ```java
   static String servidor = "//SEU_SERVIDOR\\SQLEXPRESS:1433";
   static String bancoDeDados = "seu_banco_de_dados";
   ```
4. Garanta que o SQL Server Browser esteja em execução (necessário para instâncias nomeadas).
5. Compile e execute a classe `ConexaoSQLSimples`.

## 💻 Exemplo de uso

```bash
javac ConexaoSQLSimples.java
java -cp .;caminho\para\mssql-jdbc.jar exemploprocedure.ConexaoSQLSimples
```

Saída esperada:
```
Conexão estabelecida com sucesso!
```

## 🗂️ Estrutura de dados

- `servidor`: endereço da instância SQL Server
- `bancoDeDados`: nome do banco de dados de destino
- `CONNECTION_URL`: string de conexão JDBC montada a partir dos dados acima

## 📌 Status do projeto

🚧 Em desenvolvimento / estudo (aula de procedures em SQL Server)

## 🗺️ Roadmap / Próximos passos

- [ ] Implementar chamada de stored procedures
- [ ] Adicionar tratamento de parâmetros de entrada via `Scanner`
- [ ] Externalizar configurações de conexão (arquivo `.properties`)
- [ ] Adicionar testes automatizados

## 📄 Licença

Este projeto está sob a licença MIT.

## 👤 Autor

**Luiz Paulo Soares**

- GitHub: [@LuizPauloSoares](https://github.com/LuizPauloSoares)
- LinkedIn: [linuz-paulo-soares](https://linkedin.com/in/luiz-paulo-soares/)
- Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- Email: luizdayspring@gmail.com
