import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/GerenciadorPsicologico";
        String usuario = "root";
        String senha = "May2006*";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✓ Conexão estabelecida com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("✗ Erro ao conectar: " + e.getMessage());
        }
    }
}

