
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Sist_Fornecedor {

    public String nomeRepresentante;
    public String moradaRepresentante;
    public int telemovelRepresentante;
    public String email;
    public String empresaFornecedor;
    Sist_Conexao objCon = new Sist_Conexao();

    public boolean isFornecedorRegistado() { // verificar se já há registo na BD com o mesmo fornecedor

        objCon.abrirConexao();
        boolean isSuplierFound = false;

        try {
            // instanciar classe que representa a instrcao em sql
            PreparedStatement statement = objCon.con.prepareStatement("select * from sis_fornecedor where empresa_fornecedor=? ");
            statement.setString(1, empresaFornecedor); // o que se quer procurar "o fornecedor"

            ResultSet resultseter = statement.executeQuery(); // classe que irá percorrer toda a tabela fazendo a pesquisa
            isSuplierFound = resultseter.next();
            
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {

            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }
        return isSuplierFound;

    }

    public void registarFornecedor() {

        try {
            objCon.abrirConexao();
            PreparedStatement ps = objCon.con.prepareStatement("insert into sis_fornecedor (nome_representante, morada_representante, telemovel, email, empresa_fornecedor) values(?,?,?,?,?)");
            ps.setString(1, nomeRepresentante);
            ps.setString(2, moradaRepresentante);
            ps.setInt(3, telemovelRepresentante);
            ps.setString(4, email);
            ps.setString(5, empresaFornecedor);

            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Registado com sucesso!");
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }

    }

    public boolean excluirFornecedor() {

        try {
            objCon.abrirConexao();
            PreparedStatement ps = objCon.con.prepareStatement("DELETE from sis_fornecedor where nome_representante=? AND empresa_fornecedor=? ");
            ps.setString(1, nomeRepresentante);
            ps.setString(2, empresaFornecedor);

            int quantidadeFornecedoresExcluidos = ps.executeUpdate();
            
            if (quantidadeFornecedoresExcluidos > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                objCon.con.close(); //fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }

    }
    /*
    public boolean pesquisarFornecedor(){
        
        boolean isSurchSuplier = false;
        
        try {
            objCon.abrirConexao();
            PreparedStatement ps = objCon.con.prepareStatement("select * from sis_fornecedor where nome_representante=? or empresa_fornecedor=?");
            ps.setString(1, nomeRepresentante);
            ps.setString(2, empresaFornecedor);

           ResultSet rs = ps.executeQuery();
           isSurchSuplier = rs.next();
            
           /* if(rs.next() > 0){
                return true;
            }else{
                return false;
            }    */   
        /*} catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {

            try {
                objCon.con.close(); // fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }
        return isSurchSuplier;
    }*/
    
}
