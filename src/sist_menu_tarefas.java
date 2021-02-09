
public class sist_menu_tarefas extends javax.swing.JFrame {

    
    public sist_menu_tarefas() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_registo_produto = new javax.swing.JButton();
        bt_consultar_produto = new javax.swing.JButton();
        bt_novo_registo_fornecedor = new javax.swing.JButton();
        bt_consultar_fornecedor = new javax.swing.JButton();
        bt_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Menu de Tarefas");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\irlen\\Documents\\NetBeansProjects\\Proj_Final\\src\\estoque1.png")); // NOI18N
        jLabel2.setText("jLabel2");

        bt_registo_produto.setText("Novo Registo Produto");
        bt_registo_produto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_registo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registo_produtoActionPerformed(evt);
            }
        });

        bt_consultar_produto.setText("Consultar Produto");
        bt_consultar_produto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_consultar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultar_produtoActionPerformed(evt);
            }
        });

        bt_novo_registo_fornecedor.setText("Novo Registo Fornecedor");
        bt_novo_registo_fornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_novo_registo_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novo_registo_fornecedorActionPerformed(evt);
            }
        });

        bt_consultar_fornecedor.setText("Consultar Fornecedor");
        bt_consultar_fornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_consultar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultar_fornecedorActionPerformed(evt);
            }
        });

        bt_logout.setText("Logout");
        bt_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_registo_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(bt_consultar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_consultar_fornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_novo_registo_fornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_registo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_novo_registo_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_consultar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_consultar_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
        
        this.dispose(); // fecha apenas este formulário
        sist_menu x = new sist_menu();
        x.setVisible(true);
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_registo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registo_produtoActionPerformed
       
        this.dispose();
        sist_registo_prod x = new sist_registo_prod();
        x.setVisible(true);
    }//GEN-LAST:event_bt_registo_produtoActionPerformed

    private void bt_novo_registo_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novo_registo_fornecedorActionPerformed
       
        this.dispose();
        sist_reg_fornecedor x = new sist_reg_fornecedor();
        x.setVisible(true);
    }//GEN-LAST:event_bt_novo_registo_fornecedorActionPerformed

    private void bt_consultar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultar_produtoActionPerformed
        
        this.dispose();
        sist_consult_prod x = new sist_consult_prod();
        x.setVisible(true);
    }//GEN-LAST:event_bt_consultar_produtoActionPerformed

    private void bt_consultar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultar_fornecedorActionPerformed
       
        this.dispose();
        sist_consult_forn x = new sist_consult_forn();
        x.setVisible(true);
    }//GEN-LAST:event_bt_consultar_fornecedorActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sist_menu_tarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_consultar_fornecedor;
    private javax.swing.JButton bt_consultar_produto;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_novo_registo_fornecedor;
    private javax.swing.JButton bt_registo_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
