package Tela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.MarcasDao;
import modelo.ModeloMarcas;
import java.util.ArrayList;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Marcas extends javax.swing.JFrame {

    int contador = 1;

    public Marcas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        h2Titulo = new javax.swing.JLabel();
        jlNomeMarca = new javax.swing.JLabel();
        jtNomeMarca = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMarcas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));

        jPanel2.setBackground(new java.awt.Color(0, 92, 184));
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 300));

        h2Titulo.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        h2Titulo.setForeground(new java.awt.Color(255, 255, 255));
        h2Titulo.setText("Marcas");

        jlNomeMarca.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNomeMarca.setText("Nome da marca");

        jtNomeMarca.setBackground(new java.awt.Color(255, 255, 255));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setName("JbpCadastrar"); // NOI18N
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbRemover.setText("Remover");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(h2Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtNomeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlNomeMarca)
                                .addGap(78, 78, 78))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h2Titulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNomeMarca)
                .addGap(10, 10, 10)
                .addComponent(jtNomeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbAlterar)
                    .addComponent(jbRemover))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbMarcas.setBackground(new java.awt.Color(255, 255, 255));
        tbMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idMarca", "Nome da Marca"
            }
        ));
        tbMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMarcasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMarcas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        //verificação se o campo está vazio ou preenchido por espaços
        if (jtNomeMarca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNomeMarca.requestFocus();
        } else {
            try {
                ModeloMarcas marca = new ModeloMarcas();
                marca.setNomeMarca(jtNomeMarca.getText());
                MarcasDao marcasDao = new MarcasDao();
                marcasDao.inserir(marca);
                atualizarTabela(marcasDao);
                jtNomeMarca.setText(null);
                jtNomeMarca.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
        }
        MarcasDao marcasDao = new MarcasDao();
        atualizarTabela(marcasDao);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //verifica se há coluna selecionada
        if (tbMarcas.getSelectedRow() != -1) {
            if (jtNomeMarca.getText().trim().isEmpty()) {//verificação se o campo está vazio ou preenchido por espaços
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                jtNomeMarca.requestFocus();
            } else {
                modelo.ModeloMarcas marca = new modelo.ModeloMarcas();
                marca.setIdMarca(Integer.parseInt((String) tbMarcas.getValueAt(tbMarcas.getSelectedRow(), 0)));
                marca.setNomeMarca(jtNomeMarca.getText());
                MarcasDao marcasDao = new MarcasDao();
                marcasDao.alterar(marca);
                atualizarTabela(marcasDao);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                jtNomeMarca.setText(null);
                jtNomeMarca.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try{
            if(tbMarcas.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            }else{
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                //se for igual a 0 siginifica que clicou em SIM
                if(opcao == 0){
                    MarcasDao marcaDao = new MarcasDao();
                    //chama o metodo excuir passando o id da marca selecionada
                    marcaDao.excluir(Integer.parseInt((tbMarcas.getValueAt(tbMarcas.getSelectedRow(), 0)).toString()));
                    atualizarTabela(marcaDao);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMarcasMouseClicked
        if (tbMarcas.getSelectedRow() != -1) {
            jtNomeMarca.setText(tbMarcas.getValueAt(tbMarcas.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tbMarcasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MarcasDao marcasDao = new MarcasDao();
        atualizarTabela(marcasDao);
    }//GEN-LAST:event_formWindowOpened

    private void atualizarTabela(MarcasDao marcasDao) {
        try {
            limparTabela();
            ArrayList<ModeloMarcas> listaMarcas;
            listaMarcas = marcasDao.consultar();
            DefaultTableModel modeloTabela = (DefaultTableModel) tbMarcas.getModel();
            for (ModeloMarcas brand : listaMarcas) {
                modeloTabela.addRow(new String[]{Integer.toString(brand.getIdMarca()), brand.getNomeMarca()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }

    private void limparTabela() {
        //percorre a tabela e exclui todas as linhas
        while (tbMarcas.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbMarcas.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel h2Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JLabel jlNomeMarca;
    private javax.swing.JTextField jtNomeMarca;
    private javax.swing.JTable tbMarcas;
    // End of variables declaration//GEN-END:variables
}
