package Tela;

import dao.MarcasDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloMarcas;
import modelo.ModeloModelos;
import dao.ModelosDao;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Modelos extends javax.swing.JFrame {

    public Modelos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        h2Titulo = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcbMarca = new javax.swing.JComboBox<>();
        jlMarca = new javax.swing.JLabel();
        jtNomeModelo = new javax.swing.JTextField();
        jlNomeModelo = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jbThread = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbModelos = new javax.swing.JTable();

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
        h2Titulo.setText("Modelos");

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

        jcbMarca.setBackground(new java.awt.Color(255, 255, 255));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca.setBorder(null);
        jcbMarca.setSelectedIndex(-1);
        jcbMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMarcaMouseClicked(evt);
            }
        });
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        jlMarca.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlMarca.setText("Marca");

        jtNomeModelo.setBackground(new java.awt.Color(255, 255, 255));

        jlNomeModelo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNomeModelo.setText("Nome do modelo");

        jbThread.setText("CadThread");
        jbThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbThreadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(h2Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlNomeModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 772, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbThread, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMarca)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h2Titulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbThread)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlNomeModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCadastrar)
                            .addComponent(jbAlterar)
                            .addComponent(jbRemover)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        tbModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idModelo", "Nome do Modelo", "Marca"
            }
        ));
        tbModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbModelosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbModelos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        //verificação se o campo está vazio ou preenchido por espaços
        if (jtNomeModelo.getText().trim().isEmpty() || jcbMarca.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNomeModelo.requestFocus();
        } else {
            try {
                ModeloModelos modelo = new ModeloModelos();//Cria uma nova instância para o modelo que será cadastrado

                //preenche a instância criada com dados dos campos
                modelo.setNomeModelo(jtNomeModelo.getText());
                modelo.setNomeMarca(jcbMarca.getSelectedItem().toString());

                ModelosDao modelosDao = new ModelosDao();//Cria uma nova instância Dao para se comunicar com o banco de dados
                modelosDao.inserir(modelo);//chama a função inserir com o novo modelo instanciado como parâmetro
                renderizarTabela(modelosDao);//Renderiza a tabela com o novo conjunto de dados
                limparCampos();
                jtNomeModelo.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
        }
        ModelosDao modelosDao = new ModelosDao();
        renderizarTabela(modelosDao);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //verifica se há coluna selecionada
        if (tbModelos.getSelectedRow() != -1) {
            if (jtNomeModelo.getText().trim().isEmpty() || jcbMarca.getSelectedIndex() == -1) {//verificação se o campo está vazio ou preenchido por espaços
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                jtNomeModelo.requestFocus();
            } else {
                ModeloModelos modelo = new ModeloModelos();//Cria uma nova instância para o modelo selecionado

                //preenche a instância criada com dados da tabela e dos campos
                modelo.setIdModelo(Integer.parseInt((String) tbModelos.getValueAt(tbModelos.getSelectedRow(), 0)));//Pega o id da tabela
                modelo.setNomeModelo(jtNomeModelo.getText());//Pega o nome do campo
                modelo.setNomeMarca(jcbMarca.getSelectedItem().toString());//Pega a marca do comboBox

                ModelosDao modeloDao = new ModelosDao();//Cria uma nova instância Dao para se comunicar com o banco de dados
                modeloDao.alterar(modelo);//chama a função alterar com o modelo instanciado como parâmetro
                renderizarTabela(modeloDao);//Renderiza a tabela com o novo conjunto de dados
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                limparCampos();
                jtNomeModelo.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try {
            if (tbModelos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            } else {
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                //se for igual a 0 siginifica que clicou em SIM
                if (opcao == 0) {
                    ModelosDao modeloDao = new ModelosDao();
                    //chama o metodo excuir passando o id da marca selecionada
                    modeloDao.excluir(Integer.parseInt((tbModelos.getValueAt(tbModelos.getSelectedRow(), 0)).toString()));
                    renderizarTabela(modeloDao);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MarcasDao marcas = new MarcasDao();
        atualizaMarcas(marcas);
        ModelosDao modelos = new ModelosDao();
        renderizarTabela(modelos);
    }//GEN-LAST:event_formWindowOpened

    private void jcbMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMarcaMouseClicked
        MarcasDao marcas = new MarcasDao();
        atualizaMarcas(marcas);
    }//GEN-LAST:event_jcbMarcaMouseClicked

    private void tbModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbModelosMouseClicked
        if (tbModelos.getSelectedRow() != -1) {
            jcbMarca.setSelectedItem(tbModelos.getValueAt(tbModelos.getSelectedRow(), 2).toString());
            jtNomeModelo.setText(tbModelos.getValueAt(tbModelos.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tbModelosMouseClicked

    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void jbThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbThreadActionPerformed
        cadThread();
    }//GEN-LAST:event_jbThreadActionPerformed

    private void cadThread() {
        new Thread() {
            @Override
            public void run() {
                ModelosDao modeloDao = new ModelosDao();
                for (int i = 0; i <= 123; i++) {
                    try {
                        ModeloModelos modelo = new ModeloModelos();
                        modelo.setNomeModelo("teste thread");
                        modelo.setNomeMarca("Barco");
                        modeloDao.inserir(modelo);
                        jProgressBar.setValue(i / 10);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "TÁ ERRADO. Taí o erro ó: " + ex.getMessage(), "Tu errou", ERROR_MESSAGE);
                        Thread.interrupted();
                    }
                }
            }
        }.start();
    }

    private void limparCampos() {
        jcbMarca.setSelectedIndex(-1);
        jtNomeModelo.setText(null);
    }

    private void atualizaMarcas(MarcasDao marcasDao) {
        try {
            jcbMarca.removeAllItems();
            ArrayList<ModeloMarcas> listarMarcas;
            listarMarcas = marcasDao.consultar(); //consulta todos os registros da tabela Escola

            for (ModeloMarcas marcas : listarMarcas) {
                //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaEscolas
                jcbMarca.addItem(marcas.getNomeMarca());
            }
            jcbMarca.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }

    private void renderizarTabela(ModelosDao modelosDao) {
        try {
            limparTabela();
            ArrayList<ModeloModelos> listaModelos;
            listaModelos = modelosDao.consultar();
            DefaultTableModel modeloTabela = (DefaultTableModel) tbModelos.getModel();
            for (ModeloModelos modelo : listaModelos) {
                modeloTabela.addRow(new String[]{
                    Integer.toString(modelo.getIdModelo()),
                    modelo.getNomeModelo(),
                    modelo.getNomeMarca()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }

    private void limparTabela() {
        //percorre a tabela e exclui todas as linhas
        while (tbModelos.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbModelos.getModel();
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
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel h2Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbThread;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlNomeModelo;
    private javax.swing.JTextField jtNomeModelo;
    private javax.swing.JTable tbModelos;
    // End of variables declaration//GEN-END:variables
}
