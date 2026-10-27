# ConexaoSQLSimples

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

Simple Java application to test a connection to a SQL Server database using Windows integrated authentication (Integrated Security).

## 🚀 Technologies

- Java
- JDBC (Java Database Connectivity)
- Microsoft JDBC Driver for SQL Server
- SQL Server / SQL Server Express

## ⚙️ How it works

The program builds a JDBC connection URL pointing to a named SQL Server instance (`SQLEXPRESS`), uses Windows integrated authentication to authenticate, and tries to open a connection to the `aula_051125_procedure` database. If the connection succeeds, it prints a success message; otherwise, it catches and prints the SQL error.

## 📋 Prerequisites / Dependencies

- JDK installed (Java 8+)
- SQL Server / SQL Server Express installed with the `SQLEXPRESS` instance enabled
- SQL Server JDBC driver (`mssql-jdbc`) added to the project's classpath
- Windows integrated authentication enabled on SQL Server (the native `mssql-jdbc_auth` library may be required, depending on the driver version)
- `aula_051125_procedure` database created on the instance

## 📦 How to clone

```bash
git clone https://github.com/LuizPauloSoares/exemploprocedure.git
cd exemploprocedure
```

## 🔧 Installation and setup

1. Import the project into your IDE (Eclipse, IntelliJ, NetBeans, etc.).
2. Add the SQL Server JDBC driver (`mssql-jdbc-x.x.x.jre8.jar`) to the project's classpath.
3. Adjust the connection variables in the code if needed:
   ```java
   static String servidor = "//YOUR_SERVER\\SQLEXPRESS:1433";
   static String bancoDeDados = "your_database";
   ```
4. Make sure the SQL Server Browser service is running (required for named instances).
5. Compile and run the `ConexaoSQLSimples` class.

## 💻 Usage example

```bash
javac ConexaoSQLSimples.java
java -cp .;path\to\mssql-jdbc.jar exemploprocedure.ConexaoSQLSimples
```

Expected output:
```
Conexão estabelecida com sucesso!
```

## 🗂️ Data structure

- `servidor`: address of the SQL Server instance
- `bancoDeDados`: name of the target database
- `CONNECTION_URL`: JDBC connection string built from the data above

## 📌 Project status

🚧 In development / study (SQL Server procedures class)

## 🗺️ Roadmap / Next steps

- [ ] Implement stored procedure calls
- [ ] Add input parameter handling via `Scanner`
- [ ] Externalize connection settings (`.properties` file)
- [ ] Add automated tests

## 📄 License

This project is licensed under the MIT license.

## 👤 Author

**Luiz Paulo Soares**

- GitHub: [@LuizPauloSoares](https://github.com/LuizPauloSoares)
- LinkedIn: [luiz-paulo-soares](https://linkedin.com/in/luiz-paulo-soares/)
- Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- Email: luizdayspring@gmail.com
