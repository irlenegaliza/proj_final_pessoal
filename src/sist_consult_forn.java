
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sist_consult_forn extends javax.swing.JFrame {

    Sist_Conexao objCon = new Sist_Conexao(); // chama o método que faz a liga ção com a base de dados

    public sist_consult_forn() {
        initComponents();
        setResizable(false); // impede a alteração de tamanho da aba de navegação 
        setLocationRelativeTo(null); // para a aplicação aparecer no meio da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_representante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_fabricante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_pesquisar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_listar = new javax.swing.JButton();
        bt_voltar_menu = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Fornecedor");

        jLabel2.setText("Representante");

        txt_representante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_representanteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\irlen\\Documents\\NetBeansProjects\\Proj_Final\\src\\estoque1.png")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setText("Fabricante:");

        txt_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fabricanteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Morada", "Telemóvel", "Email", "Fabricante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        bt_limpar.setText("Limpar");
        bt_limpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_listar.setText("Listar");
        bt_listar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listarActionPerformed(evt);
            }
        });

        bt_voltar_menu.setText("Voltar ao Menu Anterior");
        bt_voltar_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_voltar_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltar_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)))
                                .addGap(0, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_representante, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                    .addComponent(txt_fabricante)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_voltar_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_limpar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_excluir)
                        .addComponent(bt_pesquisar)
                        .addComponent(bt_listar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_voltar_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        
        int selectedRow = jTable1.getSelectedRow();
        Sist_Fornecedor x = new Sist_Fornecedor();
        x.nomeRepresentante = jTable1.getValueAt(selectedRow, 0).toString(); // o to.String está sendo usado para o getValue que é um objeto
        x.empresaFornecedor = jTable1.getValueAt(selectedRow, 4).toString();

        if (x.excluirFornecedor()) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow()); 
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Fornecedor selecionado");
        }

    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed

       /* if(txt_fabricante.getText().length()>0 || txt_representante.getText().length()>0){
            
            Sist_Fornecedor consultaFornecedor = new Sist_Fornecedor();
            
            consultaFornecedor.nomeRepresentante = txt_representante.getText();
            consultaFornecedor.empresaFornecedor = txt_fabricante.getText();
            
            if(consultaFornecedor.pesquisarFornecedor()){
                
                DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
                int x = tabela.getRowCount();
                int selectedRow = jTable1.getSelectedRow();
                
                for (int i = x - 1; i > 0; i--) {
                    tabela.removeRow(i);
                }
                
                String nomeRepresentante = jTable1.getValueAt(0, 1).toString();
                String moradaRepresentante = jTable1.getValueAt(0, 2).toString();
                String telemovel = jTable1.getValueAt(0, 3).toString();
                String email = jTable1.getValueAt(0, 4).toString();
                String nomeFabricante = jTable1.getValueAt(0, 5).toString();

                tabela.addRow(new Object[]{nomeRepresentante, moradaRepresentante, telemovel, email, nomeFabricante});
                
            
            }else{
                JOptionPane.showMessageDialog(null, "Dados não encontrados!");
            }
                
                
        }*/
        
        
        
        
        
        // Este é o código anterior que funciona, resta passar para os métodos na Sist_Fornecedor
       DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
        int x = tabela.getRowCount();

        for (int i = x - 1; i > 0; i--) {
            tabela.removeRow(i);
        }
        
        objCon.abrirConexao();

        boolean verificar = false;

        try {
            PreparedStatement ps = objCon.con.prepareStatement("select * from sis_fornecedor where nome_representante=? or empresa_fornecedor=?");
            String representante = txt_representante.getText();
            String fabricante = txt_fabricante.getText();
            ps.setString(1, representante);
            ps.setString(2, fabricante);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nomeRepresentante = rs.getString(1);
                String moradaRepresentante = rs.getString(2);
                String telemovel = rs.getString(3);
                String email = rs.getString(4);
                String nomeFabricante = rs.getString(5);

                tabela.addRow(new Object[]{nomeRepresentante, moradaRepresentante, telemovel, email, nomeFabricante});
                verificar = true;

            }
            if (verificar == false) {
                JOptionPane.showMessageDialog(null, "Não consta registo na tabela");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            try {
                objCon.con.close(); // fecha a conexao com a base de dados
            } catch (Exception e) {
            }
        }

        
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        txt_representante.setText("");
        txt_fabricante.setText("");
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listarActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();

        objCon.abrirConexao();
        try {
            PreparedStatement ps = objCon.con.prepareStatement("select nome_representante, morada_representante, telemovel, email, empresa_fornecedor from sis_fornecedor");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { // método que corre verdadeiro ou falso
                String representante = rs.getString(1);
                String morada = rs.getString(2);
                String telemovel = rs.getString(3);
                String email = rs.getString(4);
                String fornecedor = rs.getString(5);

                tabela.addRow(new Object[]{representante, morada, telemovel, email, fornecedor});
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally { // essa instrução faz parte do try e do catch

            try {
                objCon.con.close(); // fecha a conexao com a base de dados
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_bt_listarActionPerformed

    private void bt_voltar_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltar_menuActionPerformed
        this.dispose();
        sist_menu_tarefas x = new sist_menu_tarefas();
        x.setVisible(true);

    }//GEN-LAST:event_bt_voltar_menuActionPerformed

    private void txt_representanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_representanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_representanteActionPerformed

    private void txt_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fabricanteActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sist_consult_forn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_listar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_voltar_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_fabricante;
    private javax.swing.JTextField txt_representante;
    // End of variables declaration//GEN-END:variables
}
