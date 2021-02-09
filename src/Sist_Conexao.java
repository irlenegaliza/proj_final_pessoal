
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Sist_Conexao {
    // instanciar o atributo a classe
    Connection con; // objeto para ter acesso a classe conection
    String url = "jdbc:mysql://localhost:3306/sis_stock"; // caminho da url para a Basa de dados, aceder
    String user = "root";
    String password = "";
    String driver = "com.mysql.jdbc.Driver"; //o driver é o que vai lebvar os dados a base de dados
   
    public void abrirConexao() {
        
        // metodo responsavel por abrir a conexao
        try{
            // mecanismo para fazer a conexao ao driver
            Class.forName(driver).newInstance(); // driver é um package de instruções para realizar operações na BD
            con = (Connection) DriverManager.getConnection(url, user, password); // inicializará a conxeao a BD  
        }
        catch (Exception e){
            // "e" variável que receberá a string de exceção
            JOptionPane.showMessageDialog(null, "Erro de ligação");
            // dá a mensagem de erro
        }
    }
}
