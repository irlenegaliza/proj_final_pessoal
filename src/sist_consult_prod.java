
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class sist_consult_prod extends javax.swing.JFrame {

    Sist_Conexao objCon = new Sist_Conexao(); // chama o metodo que vai abrir a conexao com a bd
    
    public sist_consult_prod() {
        initComponents();
        setResizable(false);// impede a alteração de tamanho da tela de navegação
        setLocationRelativeTo(null); // faz com que a aba fique centralizada na tela
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_limpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_pesquisa_produto = new javax.swing.JTextField();
        bt_excluir = new javax.swing.JButton();
        bt_listar = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Item:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Consulta de Stock");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\irlen\\Documents\\NetBeansProjects\\Proj_Final\\src\\estoque1.png")); // NOI18N
        jLabel3.setText("jLabel3");

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Fabricante", "Tipo", "conteudo", "Validade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bt_limpar.setText("Limpar");
        bt_limpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        jLabel4.setText("Código:");

        txt_pesquisa_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisa_produtoActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_listar.setText("Listar Itens");
        bt_listar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listarActionPerformed(evt);
            }
        });

        bt_voltar.setText("Voltar ao Menu Anterior");
        bt_voltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(bt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigo)
                            .addComponent(txt_pesquisa_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_pesquisa_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_pesquisar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_listar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_pesquisa_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisa_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisa_produtoActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        txt_codigo.setText("");
        txt_pesquisa_produto.setText("");
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
       
       int selectedRow = jTable1.getSelectedRow();
       Sist_Produto x = new Sist_Produto();
       String codigo = jTable1.getValueAt(selectedRow, 0).toString();
       x.codigoID = Integer.parseInt(codigo);
       
       if(x.excluirProduto()){
          ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow());
          JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
       }
       else{
           JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto selecionado");
       }
       
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        
        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
        int x = tabela.getRowCount();
        
            for(int i= x-1; i>=0;i--)
                tabela.removeRow(i);
        
        objCon.abrirConexao();
        
            boolean verificar = false;
            
            try{
                PreparedStatement ps = objCon.con.prepareStatement("select * from sis_produto where codigo=? or descricao=?");
                String codigo = txt_codigo.getText();
                String descricao = txt_pesquisa_produto.getText();
                ps.setString(1, codigo);
                ps.setString(2, descricao);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    String codigoID = rs.getString(1);
                    String descricaoProduto = rs.getString(2);
                    String fabricante = rs.getString(3);
                    String tipo = rs.getString(4);
                    String conteudo = rs.getString(5);
                    String validade = rs.getString(6);
                    
                    tabela.addRow(new Object[] {codigoID,descricaoProduto,fabricante,tipo,conteudo,validade});
                    verificar = true;
                }
                if(verificar==false){
                    JOptionPane.showMessageDialog(null, "Não consta registo na tabela");
                }
                
            }
            catch (Exception e){System.out.println(e);}
            finally { // essa instrução faz parte do try e do catch
            
                try{
                    objCon.con.close(); // fecha a conexao com a base de dados
                }
                catch (Exception e) {
                }
            
            }
            
            //txt_codigo.setText(null);
            //txt_pesquisa_produto.setText(null);
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listarActionPerformed
        
        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
        
        objCon.abrirConexao();
        try {
            PreparedStatement ps = objCon.con.prepareStatement("select codigo, descricao, fabricante, tipo, conteudo, validade from sis_produto");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){ // método que corre verdadeiro ou falso
                String codigo = rs.getString(1);
                String descricao = rs.getString(2);
                String fabricante = rs.getString(3);
                String tipo = rs.getString(4);
                String conteudo = rs.getString(5);
                String validade = rs.getString(6);
                tabela.addRow(new Object[] {codigo,descricao,fabricante,tipo,conteudo,validade});        
            }
        
        }
        catch (Exception e){System.out.println(e);}
        finally { // essa instrução faz parte do try e do catch
            
            try{
                objCon.con.close(); // fecha a conexao com a base de dados
            }
            catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_bt_listarActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        this.dispose();
        sist_menu_tarefas x = new sist_menu_tarefas();
        x.setVisible(true);
    }//GEN-LAST:event_bt_voltarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sist_consult_prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_listar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_pesquisa_produto;
    // End of variables declaration//GEN-END:variables
}
