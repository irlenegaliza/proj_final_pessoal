
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Sist_Utilizador {

    public String username;
    public String password;
    Sist_Conexao objCon = new Sist_Conexao();

    public boolean isUtilizadorRegistado() {

        objCon.abrirConexao();
        boolean isUserFound = false;

        try {
            // instanciar classe que representa a instrução em sql
            PreparedStatement statement = objCon.con.prepareStatement("select * from sis_login where utilizador=? ");
            statement.setString(1, username); // o que se quer procurar "nome"

            ResultSet resultSet = statement.executeQuery(); // classe que irá percorrer toda a tabela fazendo a pesquisa
            isUserFound = resultSet.next();

        } catch (Exception e) {
            System.out.println(e);
        } finally { //essa instrução faz parte do try e do catch 

            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }
        return isUserFound;

    }

    public boolean login() {
        
        objCon.abrirConexao(); // instanciar o objeto de conexao
        boolean status = false; // iniciação da variavel
        
        try{
            String sql = "select * from sis_login where utilizador=? and password =?";
            
            // instanciar a classe que representa a instrução em sql
            PreparedStatement ps = objCon.con.prepareStatement(sql);
            
            String senhaHex = getEncryptedPassword();
            
            ps.setString(1, username); // o que se quer procurar "utilizador"
            ps.setString(2, senhaHex); // o que se quer procurar "psw"
            
            ResultSet rs = ps.executeQuery(); // classe que irá percorrer toda a tabela fazendo a pesquisa
            status = rs.next(); //rs.next(); // passa a ser verdadeira se encontrar resultado na pesquisa
        }
        catch (Exception e){ //tratamento normal da exceção   
        }
        finally { //essa instrução faz parte do try e do catch 

            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } 
            catch (Exception e) {
            }
        }
        return status; //método booleano deve retornar algo
    }
    
    public void registar(){
        
        try{
            
            objCon.abrirConexao();
            String sql = "insert into sis_login (utilizador, password) values(?,?)";
            
            PreparedStatement ps = objCon.con.prepareStatement(sql);
            
            ps.setString(1, username); // o nome do utilizador que se quer pesquisar 
            ps.setString(2, getEncryptedPassword()); // a password que se quer pesquisar
            
            int i = ps.executeUpdate(); //regista qualquer ação, tipo alterações na tabela. O método executa a instrução sql recebida
            
            if(i>0) {// E informará o número de linhas que foram alteradas na tabela com a atualização. Se não houver atualização, retorna 0, se houver, 
                //retorna o numero de linhas alteradas com a inserção de um novo dado
                JOptionPane.showMessageDialog(null, "Registado com sucesso!");
            }    
        }
        catch (Exception e) {System.out.println(e);}
        finally { //essa instrução faz parte do try e do catch 

            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        } 
        
    }
    
    private String getEncryptedPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        //criptografia da senha
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(password.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for(byte b : messageDigest){
            
            sb.append(String.format("%02X", 0xFF & b));
        }
        String senhaHex = sb.toString();
        return senhaHex;
    }
}
