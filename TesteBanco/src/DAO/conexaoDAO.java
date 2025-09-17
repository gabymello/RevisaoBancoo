
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexaoDAO {
  
    public static Connection conector() {
        // Declara uma variavel de conexao do tipo java.sql.Connection, inicialmente definida como null

        java.sql.Connection Conexao = null;
        //Especifica o driver JDBC necessario para se conectar ao banco de dados MySQL.

        String driver = "com.mysql.jdbc.Driver"; 
        //URL de conexao ao banco de dados MYSQL, especifiando o host (localhost), a porta (3306) e o nome do banco de dados (RevisaoBanco)

        String url = "jdbc:mysql://localhost:3306/bancorevisao";
        //Nome de usuario para se conectar ao banco de dados MySQL (neste caso, 'root')

        String user = "root";
        // Senha do usuario root para acessar o banco de dados

        String password = "gaby2008";
        try {//Bloco try-catch para capturar possiveis exceçoes durante a tentativa de conexão.
            //carregar a classe do drive JDBC em tempo de execução, Isso é necessário para registrar o driver.

            Class.forName(driver);
            //Estabelece a conexão com o banco de dados usando os parametros de URL, usuario e senhas definidos.

            Conexao = DriverManager.getConnection(url, user, password);
            //Se a conexao for bem-sucedida, retorna o objeto de conexão.

            return Conexao;

        } catch (Exception e) { //Caso ocorra um erro durante a conexão, exibe uma mensagem de erro em uma caixa de diálogo.
            JOptionPane.showMessageDialog(null, "Conexao falhou:" + e.getMessage());
            //Retorna null se a conexão falhar.

            return null;

        }

    }
}