package Tela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.EstadosDao;
import modelo.ModeloEstados;
import java.util.ArrayList;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Estados extends javax.swing.JFrame {

    int contador = 1;

    public Estados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        h2Titulo = new javax.swing.JLabel();
        jlNomeEstado = new javax.swing.JLabel();
        jtNomeEstado = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtSigla = new javax.swing.JFormattedTextField();
        jlNomeEstado1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstados = new javax.swing.JTable();

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
        h2Titulo.setText("Estados");

        jlNomeEstado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNomeEstado.setText("Nome do estado");

        jtNomeEstado.setBackground(new java.awt.Color(255, 255, 255));
        jtNomeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeEstadoActionPerformed(evt);
            }
        });

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

        jtSigla.setBackground(new java.awt.Color(255, 255, 255));
        jtSigla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 1));
        try {
            jtSigla.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtSigla.setName(""); // NOI18N
        jtSigla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtSiglaFocusGained(evt);
            }
        });

        jlNomeEstado1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNomeEstado1.setText("Sigla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(h2Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNomeEstado))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeEstado1)
                            .addComponent(jtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h2Titulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeEstado)
                    .addComponent(jlNomeEstado1))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtSigla)
                    .addComponent(jtNomeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbAlterar)
                    .addComponent(jbRemover))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tbEstados.setBackground(new java.awt.Color(255, 255, 255));
        tbEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idMarca", "Nome do Estado", "Sigla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEstadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEstados);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        //verificação se o campo está vazio ou preenchido por espaços
        if (jtNomeEstado.getText().trim().isEmpty() || jtSigla.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNomeEstado.requestFocus();
        } else {
            try {
                ModeloEstados estado = new ModeloEstados();
                estado.setNomeEstado(jtNomeEstado.getText());
                estado.setSiglaEstado(jtSigla.getText().toUpperCase());
                EstadosDao estadoDao = new EstadosDao();
                estadoDao.inserir(estado);
                renderizarTabela(estadoDao);
                limparCampos();
                jtNomeEstado.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
        }
        EstadosDao estadoDao = new EstadosDao();
        renderizarTabela(estadoDao);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //verifica se há coluna selecionada
        if (tbEstados.getSelectedRow() != -1) {
            if (jtNomeEstado.getText().trim().isEmpty() || jtSigla.getText().trim().isEmpty()) {//verificação se o campo está vazio ou preenchido por espaços
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                jtNomeEstado.requestFocus();
            } else {
                modelo.ModeloEstados estado = new modelo.ModeloEstados();
                estado.setIdEstado(Integer.parseInt((String) tbEstados.getValueAt(tbEstados.getSelectedRow(), 0)));
                estado.setNomeEstado(jtNomeEstado.getText());
                estado.setSiglaEstado(jtSigla.getText().toUpperCase());
                EstadosDao estadoDao = new EstadosDao();
                estadoDao.alterar(estado);
                renderizarTabela(estadoDao);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                limparCampos();
                jtNomeEstado.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try{
            if(tbEstados.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            }else{
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                //se for igual a 0 siginifica que clicou em SIM
                if(opcao == 0){
                    EstadosDao estadoDao = new EstadosDao();
                    //chama o metodo excuir passando o id da estado selecionada
                    estadoDao.excluir(Integer.parseInt((tbEstados.getValueAt(tbEstados.getSelectedRow(), 0)).toString()));
                    renderizarTabela(estadoDao);
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

    private void tbEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEstadosMouseClicked
        if (tbEstados.getSelectedRow() != -1) {
            jtNomeEstado.setText(tbEstados.getValueAt(tbEstados.getSelectedRow(), 1).toString());
            jtSigla.setText(tbEstados.getValueAt(tbEstados.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tbEstadosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EstadosDao estadoDao = new EstadosDao();
        renderizarTabela(estadoDao);
    }//GEN-LAST:event_formWindowOpened

    private void jtNomeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeEstadoActionPerformed

    private void jtSiglaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtSiglaFocusGained
        jtSigla.setText(null);
    }//GEN-LAST:event_jtSiglaFocusGained

    private void renderizarTabela(EstadosDao estadoDao) {
        try {
            limparTabela();
            ArrayList<ModeloEstados> listaMarcas;
            listaMarcas = estadoDao.consultar();
            DefaultTableModel modeloTabela = (DefaultTableModel) tbEstados.getModel();
            for (ModeloEstados estado : listaMarcas) {
                modeloTabela.addRow(new String[]{
                    Integer.toString(estado.getIdEstado()), 
                    estado.getNomeEstado(),
                    estado.getSiglaEstado()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }
    
    private void limparCampos(){
        jtNomeEstado.setText(null);
        jtSigla.setText(null);
    }

    private void limparTabela() {
        //percorre a tabela e exclui todas as linhas
        while (tbEstados.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbEstados.getModel();
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
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estados().setVisible(true);
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
    private javax.swing.JLabel jlNomeEstado;
    private javax.swing.JLabel jlNomeEstado1;
    private javax.swing.JTextField jtNomeEstado;
    private javax.swing.JFormattedTextField jtSigla;
    private javax.swing.JTable tbEstados;
    // End of variables declaration//GEN-END:variables
}
