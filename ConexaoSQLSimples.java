package exemploprocedure;

//Importando bibliotecas
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConexaoSQLSimples {
    //Variáveis de conexão
    static String servidor = "//TBS0676759W11-1\\SQLEXPRESS:1433";
    static String bancoDeDados = "aula_051125_procedure";
    
    // --- Configurações de Conexão ---
    private static final String CONNECTION_URL = 
            "jdbc:sqlserver:" + servidor + ";databaseName=" + bancoDeDados + 
            ";integratedSecurity=true;trustServerCertificate=true;encrypt=true;";
    
    public static void main(String[] args) {        
        try (Scanner scanner = new Scanner(System.in);
            //Conectando ao banco de dados
            Connection conn = DriverManager.getConnection(CONNECTION_URL)) {

            System.out.println("Conexão estabelecida com sucesso!");
            pausa(2);

        } catch (SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
    }    
    /** Simula a função time.sleep do Python de forma compacta */
    private static void pausa(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }
}