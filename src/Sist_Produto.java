
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Sist_Produto {
    // as variaveis que serao usadas no metodo
    public int codigoID;
    public String produto;
    public String fabricante;
    public String tipoProduto;
    public String conteudo;
    public Date validade;
    Sist_Conexao objCon = new Sist_Conexao();
    
    public boolean isProdutoRegistado(){ // verifica se há registo anterior na base de dados
        // fazer a ligação com a pagina de conexao a base de dados
        objCon.abrirConexao();
        boolean isProdutoRegistado = false; // vai procurar se a informação já existe na bd
        
        try {
            // instanciar classe que representa a instrução em sql
            PreparedStatement statement = objCon.con.prepareStatement("select * from sis_produto where descricao=? and fabricante=? and conteudo=? ");
            statement.setString(1, produto); // busca de acordo com o conteudo do produto para verificar se não há repetição
            statement.setString(2, fabricante);
            statement.setString(3, conteudo);
            
            ResultSet resultSet = statement.executeQuery(); // classe que irá percorrer toda a tabela fazendo a pesquisa
            isProdutoRegistado = resultSet.next();
        }
        catch (Exception e) {
            System.out.println(e); // se houver um erro no processo
        }
        finally{ // o finally faz parte do try e do catch
            
            try {
                objCon.con.close(); //fecha a conexao com a base de dados com ou sem exito na conexao a bd
            } catch (Exception e) {
            }
        }
        return isProdutoRegistado;
    }  
    
    public void registarProduto(){
        
        try {
           objCon.abrirConexao();
           PreparedStatement ps = objCon.con.prepareStatement("insert into sis_produto (codigo, descricao, fabricante, tipo, conteudo, validade) values(?,?,?,?,?,?)");
           ps.setInt(1, codigoID);
           ps.setString(2, produto);
           ps.setString(3, fabricante);
           ps.setString(4, tipoProduto);
           ps.setString(5, conteudo);
           ps.setDate(6, validade);
           
           int i = ps.executeUpdate(); // regista qualquer ação, alterações na tabela. O método executa a instrução sql recebida
           if(i>0) // informará o número de linhas que foram alteradas na tabela com a atualização. 
               //Se não houver alterações na tabela, retorna 0
               JOptionPane.showMessageDialog(null, "Registado com sucesso!");      
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally { // essa instrução faz parte do try e do catch
            
            try{
                objCon.con.close(); // fecha a conexao com a base de dados
            }
            catch (Exception e) {
            }
            
        }
    
    }
    
    public boolean excluirProduto(){
    
        try {
            objCon.abrirConexao();
            PreparedStatement ps = objCon.con.prepareStatement("DELETE from sis_produto where codigo=?");
            ps.setInt(1, codigoID);
            
            int quantidadeProdutosExcluidos = ps.executeUpdate();
            
            if(quantidadeProdutosExcluidos > 0) {
                return true;
            }else {
                return false;
            }                       
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally {
            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }
    }
}
