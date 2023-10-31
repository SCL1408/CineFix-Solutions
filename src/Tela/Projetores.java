/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import dao.CinemasDao;
import dao.MarcasDao;
import dao.ModelosDao;
import dao.ProjetoresDao;
import dao.StatusDao;
import dao.TiposDao;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloMarcas;
import modelo.ModeloTipos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloCinemas;
import modelo.ModeloModelos;
import modelo.ModeloProjetores;
import modelo.ModeloStatus;
import java.sql.Timestamp;

public class Projetores extends javax.swing.JFrame {

    private Frame Projetores;

    public Projetores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTiposProjetor = new javax.swing.JTable();
        h2Titulo = new javax.swing.JLabel();
        jlNumSerie = new javax.swing.JLabel();
        jtNumSerie = new javax.swing.JTextField();
        jlModelo = new javax.swing.JLabel();
        jcbModelo = new javax.swing.JComboBox<>();
        jlMarca = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        jlDataFabricacao = new javax.swing.JLabel();
        jftDataFabricacao = new javax.swing.JFormattedTextField();
        jlTipo = new javax.swing.JLabel();
        jlCinema = new javax.swing.JLabel();
        jcbCinema = new javax.swing.JComboBox<>();
        jlDataInstalacao = new javax.swing.JLabel();
        jftDataInstalacao = new javax.swing.JFormattedTextField();
        jlStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox<>();
        jbCadastrar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        ljIcon = new javax.swing.JLabel();
        jbAdicionarTipo = new javax.swing.JButton();
        listaIDS = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProjetores = new javax.swing.JTable();

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

        tbTiposProjetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo do projetor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbTiposProjetor);
        if (tbTiposProjetor.getColumnModel().getColumnCount() > 0) {
            tbTiposProjetor.getColumnModel().getColumn(0).setResizable(false);
        }

        h2Titulo.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        h2Titulo.setForeground(new java.awt.Color(255, 255, 255));
        h2Titulo.setText("Projetores");

        jlNumSerie.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNumSerie.setText("Número de série");

        jtNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        jtNumSerie.setNextFocusableComponent(jcbModelo);

        jlModelo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlModelo.setText("Modelo");

        jcbModelo.setBackground(new java.awt.Color(255, 255, 255));
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbModelo.setBorder(null);
        jcbModelo.setNextFocusableComponent(jcbMarca);
        jcbModelo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbModeloPopupMenuWillBecomeVisible(evt);
            }
        });
        jcbModelo.setSelectedIndex(-1);

        jlMarca.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlMarca.setText("Marca");

        jcbMarca.setBackground(new java.awt.Color(255, 255, 255));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarca.setBorder(null);
        jcbMarca.setNextFocusableComponent(jftDataFabricacao);
        jcbMarca.setSelectedIndex(-1);
        jcbMarca.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbMarcaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbMarcaPopupMenuWillBecomeVisible(evt);
            }
        });

        jlDataFabricacao.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlDataFabricacao.setText("Data de fabricação");

        jftDataFabricacao.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jftDataFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataFabricacao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jftDataFabricacao.setToolTipText("AAAA/MM/DD");
        jftDataFabricacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlTipo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlTipo.setText("Tipo");

        jlCinema.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCinema.setText("Cinema");

        jcbCinema.setBackground(new java.awt.Color(255, 255, 255));
        jcbCinema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCinema.setBorder(null);
        jcbCinema.setNextFocusableComponent(jftDataInstalacao);
        jcbCinema.setSelectedIndex(-1);
        jcbCinema.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbCinemaPopupMenuWillBecomeVisible(evt);
            }
        });

        jlDataInstalacao.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlDataInstalacao.setText("Data de instalação");

        jftDataInstalacao.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jftDataInstalacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlStatus.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlStatus.setText("Status");

        jcbStatus.setBackground(new java.awt.Color(255, 255, 255));
        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbStatus.setBorder(null);
        jcbStatus.setSelectedIndex(-1);
        jcbStatus.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbStatusPopupMenuWillBecomeVisible(evt);
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

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        ljIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icon2.png"))); // NOI18N

        jbAdicionarTipo.setText("Modificar tipagem");
        jbAdicionarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarTipoActionPerformed(evt);
            }
        });

        listaIDS.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlModelo)
                            .addComponent(jftDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDataFabricacao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlMarca)
                            .addComponent(jlTipo)
                            .addComponent(jcbMarca, 0, 200, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAdicionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlNumSerie)
                    .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlStatus)
                            .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCinema)
                            .addComponent(jcbCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jftDataInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDataInstalacao))
                .addGap(392, 392, 392))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(listaIDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318)
                .addComponent(ljIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(h2Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h2Titulo)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ljIcon)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(listaIDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNumSerie)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCinema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlModelo)
                        .addComponent(jlMarca))
                    .addComponent(jlDataInstalacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftDataInstalacao)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jcbModelo))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDataFabricacao)
                        .addComponent(jlTipo))
                    .addComponent(jlStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbStatus)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jftDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAdicionarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbAlterar)
                    .addComponent(jbRemover))
                .addGap(17, 17, 17))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbProjetores.setBackground(new java.awt.Color(255, 255, 255));
        tbProjetores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Serie", "Modelo", "Marca", "Cinema", "Status", "Data de Fabricação", "Data de Instalação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProjetores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProjetoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProjetores);
        if (tbProjetores.getColumnModel().getColumnCount() > 0) {
            tbProjetores.getColumnModel().getColumn(0).setResizable(false);
            tbProjetores.getColumnModel().getColumn(1).setResizable(false);
            tbProjetores.getColumnModel().getColumn(2).setResizable(false);
            tbProjetores.getColumnModel().getColumn(3).setResizable(false);
            tbProjetores.getColumnModel().getColumn(4).setResizable(false);
            tbProjetores.getColumnModel().getColumn(5).setResizable(false);
            tbProjetores.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        if (jtNumSerie.getText().trim().isEmpty()
                || jftDataFabricacao.getText().trim().isEmpty()
                || jcbCinema.getSelectedIndex() == -1
                || jcbMarca.getSelectedIndex() == -1
                || jcbModelo.getSelectedIndex() == -1
                || jcbStatus.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNumSerie.requestFocus();
        }
        else {
            try {
                ModeloProjetores projetor = new ModeloProjetores();
                ProjetoresDao projetorDao = new ProjetoresDao();

                projetor.setNomeCinema((String) jcbCinema.getSelectedItem().toString());
                projetor.setNomeModelo(jcbModelo.getSelectedItem().toString());
                projetor.setNomeStatus(jcbStatus.getSelectedItem().toString());
                projetor.setNumSerie(jtNumSerie.getText());

                projetorDao.inserir(projetor);

                renderizarTabelaProjetores();
                limparCampos();
                jtNumSerie.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
                Thread.interrupted();
            }
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //verifica se há coluna selecionada
        if (tbProjetores.getSelectedRow() != -1) {
            if (jtNumSerie.getText().trim().isEmpty()
                    || jftDataFabricacao.getText().trim().isEmpty()
                    || jftDataInstalacao.getText().trim().isEmpty()
                    || jcbCinema.getSelectedIndex() == -1
                    || jcbMarca.getSelectedIndex() == -1
                    || jcbModelo.getSelectedIndex() == -1
                    || jcbStatus.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
                jtNumSerie.requestFocus();
            } else{
                ModeloProjetores projetor = new ModeloProjetores();
                ProjetoresDao projetorDao = new ProjetoresDao();

                projetor.setNomeCinema(jcbCinema.getSelectedItem().toString());
                projetor.setNomeModelo(jcbModelo.getSelectedItem().toString());
                projetor.setNomeStatus(jcbStatus.getSelectedItem().toString());
                projetor.setIdProjetor(Integer.parseInt(listaIDS.getItem(tbProjetores.getSelectedRow())));
                projetor.setNumSerie(jtNumSerie.getText());
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date utilDate = dateFormat.parse(jftDataFabricacao.getText()); // Converte a string para java.util.Date
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Converte java.util.Date para java.sql.Date
                    projetor.setDataFabricacao(sqlDate);

                    SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    java.util.Date utilDateTime = dateTimeFormat.parse(jftDataInstalacao.getText()); // Converte a string para java.util.Date
                    Timestamp timestamp = new Timestamp(utilDateTime.getTime()); // Converte java.util.Date para java.sql.Timestamp
                    projetor.setDataInstalacao(timestamp);
                } catch (ParseException ex) {
                    Logger.getLogger(Projetores.class.getName()).log(Level.SEVERE, null, ex);
                }

                projetorDao.alterar(projetor);

                renderizarTabelaProjetores();
                limparCampos();
                jtNumSerie.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try {
            ProjetoresDao projetorDao = new ProjetoresDao();

            if (tbProjetores.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            } else {
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                //se for igual a 0 siginifica que clicou em SIM
                if (opcao == 0) {
                    //chama o metodo excuir passando o id da marca selecionada
                    projetorDao.excluir(Integer.parseInt(listaIDS.getItem(tbProjetores.getSelectedRow())));
                    renderizarTabelaProjetores();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbAdicionarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarTipoActionPerformed
        String[] tiposProjetor = new String[tbTiposProjetor.getRowCount()];
        for (int i = 0; i < tbTiposProjetor.getRowCount(); i++) {
            tiposProjetor[i] = tbTiposProjetor.getValueAt(i, 0).toString();
        }
        PopUpTipos popup = new PopUpTipos(this.Projetores, tiposProjetor);
        popup.setVisible(true);
    }//GEN-LAST:event_jbAdicionarTipoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        renderizarTabelaProjetores();
        atualizaModelosJCB();
        atualizaMarcasJCB();
        atualizaCinemasJCB();
        atualizaStatusJCB();
    }//GEN-LAST:event_formWindowOpened

    private void jcbModeloPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbModeloPopupMenuWillBecomeVisible
        atualizaModelosJCB();
    }//GEN-LAST:event_jcbModeloPopupMenuWillBecomeVisible

    private void jcbMarcaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbMarcaPopupMenuWillBecomeVisible
        atualizaMarcasJCB();
    }//GEN-LAST:event_jcbMarcaPopupMenuWillBecomeVisible

    private void jcbMarcaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbMarcaPopupMenuWillBecomeInvisible
        atualizaModelosJCB();
    }//GEN-LAST:event_jcbMarcaPopupMenuWillBecomeInvisible

    private void jcbCinemaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbCinemaPopupMenuWillBecomeVisible
        atualizaCinemasJCB();
    }//GEN-LAST:event_jcbCinemaPopupMenuWillBecomeVisible

    private void jcbStatusPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbStatusPopupMenuWillBecomeVisible
        atualizaStatusJCB();
    }//GEN-LAST:event_jcbStatusPopupMenuWillBecomeVisible

    private void tbProjetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProjetoresMouseClicked
        if (tbProjetores.getSelectedRow() != -1) {
            limparCampos();
            jtNumSerie.setText(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 0).toString());
            jcbModelo.setSelectedItem(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 1).toString());
            jcbMarca.setSelectedItem(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 2).toString());
            jcbCinema.setSelectedItem(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 3).toString());
            jcbStatus.setSelectedItem(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 4).toString());
            jftDataFabricacao.setText(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 5).toString());
            jftDataInstalacao.setText(tbProjetores.getValueAt(tbProjetores.getSelectedRow(), 6).toString());
            
            ProjetoresDao projetorDao = new ProjetoresDao();
            String[] listaTipos = projetorDao.consultarTipos(Integer.parseInt(listaIDS.getItem(tbProjetores.getSelectedRow())));

            renderizarTabelaTiposProjetor(listaTipos);
        }
    }//GEN-LAST:event_tbProjetoresMouseClicked

    private void renderizarTabelaProjetores() {
        new Thread() {
            @Override
            public void run() {
                try {
                    DefaultTableModel tdm = (DefaultTableModel) tbProjetores.getModel();
                    ArrayList<ModeloProjetores> listaProjetores = new ArrayList<ModeloProjetores>();
                    ProjetoresDao projetorDao = new ProjetoresDao();
                    
                    limparTabela(tbProjetores);
                    listaProjetores = projetorDao.consultar();
                    for (ModeloProjetores projetor : listaProjetores) {
                        tdm.addRow(new String[]{
                            projetor.getNumSerie(),
                            projetor.getNomeModelo(),
                            projetor.getNomeMarca(),
                            projetor.getNomeCinema(),
                            projetor.getNomeStatus(),
                            projetor.getDataFabricacao().toString(),
                            projetor.getDataInstalacao().toString()
                        }); 
                        listaIDS.add(String.valueOf(projetor.getIdProjetor()));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "TÁ ERRADO. Taí o erro ó: " + ex.getMessage(), "Tu errou", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();
    }

    private void renderizarTabelaTiposProjetor(String[] listaTipos) {
        DefaultTableModel tdm = (DefaultTableModel) tbTiposProjetor.getModel();
        limparTabela(tbTiposProjetor);
        if(listaTipos.length==0){
            tdm.addRow(new String[]{});
        }
        for (int i = 0; i < listaTipos.length; i++) {
            tdm.addRow(new String[]{listaTipos[i]});
        }
    }

    private void atualizaModelosJCB() {
        ModelosDao modeloDao = new ModelosDao();
        new Thread() {
            @Override
            public void run() {
                try {
                    jcbModelo.removeAllItems();
                    ArrayList<ModeloModelos> listaModelos;
                    if (jcbMarca.getSelectedIndex() == -1) {
                        listaModelos = modeloDao.consultar();
                    } else {
                        listaModelos = modeloDao.consultarPorMarca(jcbMarca.getSelectedItem().toString());
                        if (listaModelos.size() == 0) {
                            jcbModelo.addItem("Não modelos da marca " + jcbMarca.getSelectedItem().toString() + " nos registros");
                            jcbModelo.setSelectedIndex(0);
                            return;
                        }
                    }
                    for (ModeloModelos modelo : listaModelos) {
                        jcbModelo.addItem(modelo.getNomeModelo());
                    }
                    if(jcbMarca.getSelectedIndex()==-1)
                        jcbModelo.setSelectedIndex(-1);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();
        
    }

    private void atualizaMarcasJCB() {
        MarcasDao marcasDao = new MarcasDao();
        new Thread() {
            @Override
            public void run() {
                try {
                    jcbMarca.removeAllItems();
                    ArrayList<ModeloMarcas> listarMarcas;
                    listarMarcas = marcasDao.consultar();

                    for (ModeloMarcas marcas : listarMarcas) {
                        jcbMarca.addItem(marcas.getNomeMarca());
                    }
                    jcbMarca.setSelectedIndex(-1);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }

        }.start();
    }

    private void atualizaCinemasJCB() {
        CinemasDao cinemaDao = new CinemasDao();
        new Thread() {
            @Override
            public void run() {
                try {
                    jcbCinema.removeAllItems();
                    ArrayList<ModeloCinemas> listarMarcas;
                    listarMarcas = cinemaDao.consultar();

                    for (ModeloCinemas marcas : listarMarcas) {
                        jcbCinema.addItem(marcas.getNomeCinema());
                    }
                    jcbCinema.setSelectedIndex(-1);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();

    }

    private void atualizaStatusJCB() {
        StatusDao statusDao = new StatusDao();
        new Thread() {
            @Override
            public void run() {
                try {
                    jcbStatus.removeAllItems();
                    ArrayList<ModeloStatus> listarStatus;
                    listarStatus = statusDao.consultar();

                    for (ModeloStatus status : listarStatus) {
                        jcbStatus.addItem(status.getNomeStatus());
                    }
                    jcbStatus.setSelectedIndex(-1);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();
    }

    private void limparTabela(JTable tabela) {
        while (tabela.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tabela.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    private void limparCampos() {
        jtNumSerie.setText(null);
        jftDataFabricacao.setText(null);
        jftDataInstalacao.setText(null);
        jcbModelo.setSelectedIndex(-1);
        jcbMarca.setSelectedIndex(-1);
        //limparTabela(tbTiposProjetor);
        jcbCinema.setSelectedIndex(-1);
        jcbStatus.setSelectedIndex(-1);
        
        while (tbTiposProjetor.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbTiposProjetor.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    public class PopUpTipos extends JDialog {

        //Criaçãod dos componentes que serão utilizados
        private JTable tbTipos;
        private JTable tbIDS;
        private JButton jbConfirmar;
        private JButton jbSalvar;
        private JButton jbEditarTipo;
        private JButton jbExcluirTipo;
        private JButton jbCadastrarNovo;
        private JTextField jtNovoTipo;
        private JLabel jlCadastrarNovo;

        public PopUpTipos(Frame parent, String[] tiposProjetor) {
            super(parent, "Tipos de Projetores", true);//define pai, título e características de modal

            Object[] ColumnNames = {"Tipo"};//variável que será utilizada na criação das tabelas, na nomeção das colunas
            //consulta o banco de dados e armazena a seleção dos tipos de projetores
            TiposDao tipoDao = new TiposDao();
            java.util.ArrayList<ModeloTipos> listaTipos = tipoDao.consultar();
            //Identifica o index dos tipos do projetor na futura tabela tbTipos
            ArrayList<IndexTiposProjetor> indexArray = new ArrayList<IndexTiposProjetor>();//Cria vetor que armazenará os indices
            for (int i = 0; i < tiposProjetor.length; i++) {//laço externo percorre os tipos do projetor
                for (int j = 0; j < listaTipos.size(); j++) {//laço interno percorre os tipos de projetor retornados do banco de dados
                    if (listaTipos.get(j).getNomeTipo().equals(tiposProjetor[i])) {//se ambos forem iguais, o ítem é adicionado à liste de índices
                        IndexTiposProjetor aux = new IndexTiposProjetor();
                        aux.setIndex(j);
                        indexArray.add(aux);
                        break;//vai pro próximo
                    }
                }
            }
            //cria variável que será utilizada na criação das tabelas, na inserção de dados, de linhas
            Object[][] data = new Object[listaTipos.size()][1];
            //percorre todo o vetor com o resultado da consulta do banco salvando os nomes em data
            for (int i = 0; i < listaTipos.size(); i++) {
                data[i][0] = listaTipos.get(i).getNomeTipo();
            }

            //cria um modelo de tabela e inicializa a tbTipos com esse modelo
            DefaultTableModel tabelaTiposModelo = new DefaultTableModel(data, ColumnNames);
            tbTipos = new javax.swing.JTable(tabelaTiposModelo);

            tbTipos.setDefaultRenderer(Object.class, new CustomTableCellRenderer(indexArray, Color.GREEN));

            //Refaz o mesmo procedimento anterior, mas agora para a tabela de ids
            ColumnNames[0] = "idTipo";//estabalece o nome da coluna da próxima tabela
            //preenche data com os valores dos ids
            for (int i = 0; i < listaTipos.size(); i++) {
                data[i][0] = listaTipos.get(i).getIdTipo();
            }
            //cria um modelo de tabela e inicializa a tbIDS com esse modelo
            DefaultTableModel tabelaIDSModelo = new DefaultTableModel(data, ColumnNames);
            tbIDS = new javax.swing.JTable(tabelaIDSModelo);

            //estabelece o texto de cada botão, da label e do input
            jbConfirmar = new JButton("Modificar tipagem do projetor");
            jbSalvar = new JButton("Salvar");
            jbCadastrarNovo = new JButton("Cadastrar novo tipo");
            jbEditarTipo = new JButton("Editar");
            jbExcluirTipo = new JButton("Excluir");
            jlCadastrarNovo = new JLabel("Cadastrar novo tipo:");
            jtNovoTipo = new JTextField("");

            // Adicionar um WindowListener para monitorar quando o popup é fechado
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    // Evento disparado quando o popup é fechado
                    String[] listaTipagem = new String[indexArray.size()];
                    for (int i = 0; i < indexArray.size(); i++) {
                        listaTipagem[i] = tbTipos.getValueAt(indexArray.get(i).getIndex(), 0).toString();
                    }
                    renderizarTabelaTiposProjetor(listaTipagem);
                }
            });

            //evento para fechar a tela
            jbSalvar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    dispose();
                }
            });

            //Evento de clique na tabela
            tbTipos.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    //Se após clicar houver uma linha selecionada, preenche o input com o texto da seleção
                    if (tbTipos.getSelectedRow() != -1) {
                        jtNovoTipo.setText(tbTipos.getValueAt(tbTipos.getSelectedRow(), 0).toString());
                    }
                }
            });

            jbConfirmar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    if (tbTipos.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(null, "Selecione algum tipo para atribuir pu desatribuir do projetor");
                    } else {
                        if (tbTipos.getSelectedRowCount() == 1) {
                            boolean selected = false;
                            for (IndexTiposProjetor i : indexArray) {
                                if (i.getIndex() == tbTipos.getSelectedRow()) {
                                    selected = true;
                                    indexArray.remove(i);
                                    break;
                                }
                            }
                            if (!selected) {
                                IndexTiposProjetor aux = new IndexTiposProjetor();
                                aux.setIndex(tbTipos.getSelectedRow());
                                indexArray.add(aux);
                            }
                        } else {
                            int[] selecoes = tbTipos.getSelectedRows();
                            //int[] selecoes = new int[tbTipos.getSelectedRows()];
                            for (int i = 0; i < selecoes.length; i++) {
                                boolean selected = false;
                                for (IndexTiposProjetor j : indexArray) {
                                    if (j.getIndex() == selecoes[i]) {
                                        selected = true;
                                        indexArray.remove(j);
                                        break;
                                    }
                                }
                                if (!selected) {
                                    IndexTiposProjetor aux = new IndexTiposProjetor();
                                    aux.setIndex(selecoes[i]);
                                    indexArray.add(aux);
                                }
                            }
                        }
                        tbTipos.clearSelection();
                        renderizarTabelaTipos(tipoDao, indexArray);
                    }
                }
            });
            //CADASTRAR
            jbCadastrarNovo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    if (jtNovoTipo.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
                        jtNovoTipo.requestFocus();
                    } else {
                        try {
                            ModeloTipos tipo = new ModeloTipos();
                            tipo.setNomeTipo(jtNovoTipo.getText());
                            TiposDao tipoDao = new TiposDao();
                            tipoDao.inserir(tipo);
                            renderizarTabelaTipos(tipoDao, indexArray);
                            jtNovoTipo.setText(null);
                            jtNovoTipo.requestFocus();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                        }
                    }
                }
            });
            //EXCLUIR            
            jbExcluirTipo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    try {
                        if (tbTipos.getSelectedRow() == -1) {//verifiaca se há alguma linha selecionada na tabela
                            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
                        } else {
                            //pergunda de confirmação antes de excluir o registro
                            int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                            //se for igual a 0 siginifica que clicou em SIM
                            if (opcao == 0) {
                                TiposDao tipoDao = new TiposDao();
                                //chama o metodo excuir passando o id do tiop selecionada
                                tipoDao.excluir(Integer.parseInt((tbIDS.getValueAt(tbTipos.getSelectedRow(), 0)).toString()));
                                renderizarTabelaTipos(tipoDao, indexArray);
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    }
                }
            });
            //EDITAR
            jbEditarTipo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    //verifica se há coluna selecionada
                    if (tbTipos.getSelectedRow() != -1) {
                        if (jtNovoTipo.getText().trim().isEmpty()) {//verificação se o campo está vazio ou preenchido por espaços
                            JOptionPane.showMessageDialog(null, "Dados Inválidos");
                            jtNovoTipo.requestFocus();
                        } else {
                            ModeloTipos tipo = new ModeloTipos();
                            tipo.setIdTipo(Integer.parseInt(tbIDS.getValueAt(tbTipos.getSelectedRow(), 0).toString()));
                            tipo.setNomeTipo(jtNovoTipo.getText());
                            TiposDao tipoDao = new TiposDao();
                            tipoDao.alterar(tipo);
                            renderizarTabelaTipos(tipoDao, indexArray);
                            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                            jtNovoTipo.setText(null);
                            jtNovoTipo.requestFocus();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
                    }
                }
            });

            //configuração de layout e posicionamento dos elementos do JDialog
            setLayout(new BorderLayout());//organiza os componentes em cinco áreas: norte, sul, leste, oeste e centro.
            //posiciona as duas tabelas na região norte sobreponto tbTipos sobre tbIDS
            add(new JScrollPane(tbIDS), BorderLayout.NORTH);
            add(new JScrollPane(tbTipos), BorderLayout.NORTH);
            JPanel inputPanel = new JPanel();//cria um panel para o input e label
            //configura um bom tamanho para o input
            jtNovoTipo.setPreferredSize(new Dimension(250, 30));
            jtNovoTipo.setMinimumSize(new Dimension(250, 30));
            jtNovoTipo.setMaximumSize(new Dimension(250, 30));
            //adiciona label e input no panel
            inputPanel.add(jlCadastrarNovo);
            inputPanel.add(jtNovoTipo);

            add(inputPanel, BorderLayout.CENTER);//posiciona o panel na região central
            JPanel buttonPanel = new JPanel();//cria panel para os botões

            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));  // Define o layout como BoxLayout na direção vertical
            //Cria dois panels para dividir os botões em 2 linhas
            JPanel buttonRow_1 = new JPanel();
            JPanel buttonRow_2 = new JPanel();
            //adiciona os botões nos respectivos panels
            buttonRow_2.add(jbConfirmar);
            buttonRow_2.add(jbSalvar);
            buttonRow_1.add(jbCadastrarNovo);
            buttonRow_1.add(jbEditarTipo);
            buttonRow_1.add(jbExcluirTipo);
            //adiciona os panels das linhas de botões ao panel principal
            buttonPanel.add(buttonRow_1);
            buttonPanel.add(buttonRow_2);

            add(buttonPanel, BorderLayout.SOUTH);//posiciona o panel principal de botões na região sul do JDialog

            pack();//faz o tamanho do JDialog se moldar e encaixar com o conteúdo (fit)

            setLocationRelativeTo(parent);//Posiciona o popup em relação ao elemento pai que, em questão, é o frame
        }

        public void renderizarTabelaTipos(TiposDao tipoDao, ArrayList<IndexTiposProjetor> indexArray) {
            try {
                limparTabelaTipos();//limpa todos os dados da tabela
                //consulta o banco de dados e armazena a seleção no vetor listaTipos
                ArrayList<ModeloTipos> listaTipos;
                listaTipos = tipoDao.consultar();
                //cria um moedlo de manipulação para cada uma das tabelas
                DefaultTableModel modeloTabelaTipos = (DefaultTableModel) tbTipos.getModel();
                DefaultTableModel modeloTabelaIDS = (DefaultTableModel) tbIDS.getModel();
                //percorre o vetor e, a cada iteração, adiciona uma linha em cada tabela com o respectivo dado coerente
                for (ModeloTipos tipo : listaTipos) {
                    modeloTabelaTipos.addRow(new String[]{
                        tipo.getNomeTipo()
                    });
                    modeloTabelaIDS.addRow(new String[]{
                        Integer.toString(tipo.getIdTipo())
                    });
                }
                tbTipos.setDefaultRenderer(Object.class, new CustomTableCellRenderer(indexArray, Color.GREEN));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
            }
        }

        private void limparTabelaTipos() {
            //percorre a tabela e exclui todas as linhas
            while (tbTipos.getRowCount() > 0) {
                //cria um modelo de manipulação para cada uma das tabelas
                DefaultTableModel dmTipos = (DefaultTableModel) tbTipos.getModel();
                DefaultTableModel dmIDS = (DefaultTableModel) tbIDS.getModel();
                //seleciona todos os elementos de uma linha e apaga-os. Isso é feito nas duas tabelas já que têm o mesmo número de linhas
                dmTipos.getDataVector().removeAllElements();
                dmIDS.getDataVector().removeAllElements();
            }
        }
    }

    public class CustomTableCellRenderer extends DefaultTableCellRenderer {

        private int[] targetRows;
        private Color corFundo;

        //construtor da classe
        public CustomTableCellRenderer(ArrayList<IndexTiposProjetor> targetRows, Color backgroundColor) {
            int[] auxArray = new int[targetRows.size()];
            for (int i = 0; i < targetRows.size(); i++) {
                auxArray[i] = targetRows.get(i).getIndex();
            }
            this.targetRows = auxArray;
            this.corFundo = backgroundColor;
        }

        @Override//cobrescreve a função de rendedrização de célula
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            // Obtém o componente padrão de célula da superclasse
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            // Verifica se a linha atual é uma das linhas-alvo que queremos colorir
            if (isTargetRow(row)) {
                // Mantém a cor de seleção padrão
                if (isSelected) {
                    component.setForeground(table.getSelectionForeground());
                    // Define a cor de fundo do componente de célula para a cor desejada
                    component.setBackground(new Color(57, 105, 138));
                } else {
                    component.setForeground(table.getForeground());
                    // Define a cor de fundo do componente de célula para a cor desejada
                    component.setBackground(new Color(140, 212, 103));
                }
            } else {
                // Se não é uma linha-alvo, mantém as cores padrão
                if (isSelected) {
                    component.setBackground(table.getSelectionBackground());
                    component.setForeground(table.getSelectionForeground());
                } else {
                    component.setBackground(table.getBackground());
                    component.setForeground(table.getForeground());
                }
            }
            // Retorna o componente de célula modificado
            return component;
        }

        // Verifica se a linha atual é uma das linhas-alvo que queremos colorir
        private boolean isTargetRow(int row) {
            // Percorre a lista de linhas-alvo
            for (int targetRow : targetRows) {
                if (row == targetRow) {// Se a linha atual é uma das linhas-alvo
                    return true;
                }
            }
            return false;
        }
    }

    public class IndexTiposProjetor {

        int index;

        public IndexTiposProjetor() {
        }

        public IndexTiposProjetor(int index) {
            this.index = index;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
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
            java.util.logging.Logger.getLogger(Projetores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Projetores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Projetores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Projetores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Projetores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel h2Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdicionarTipo;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbCinema;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbModelo;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JFormattedTextField jftDataFabricacao;
    private javax.swing.JFormattedTextField jftDataInstalacao;
    private javax.swing.JLabel jlCinema;
    private javax.swing.JLabel jlDataFabricacao;
    private javax.swing.JLabel jlDataInstalacao;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNumSerie;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JTextField jtNumSerie;
    private java.awt.List listaIDS;
    private javax.swing.JLabel ljIcon;
    private javax.swing.JTable tbProjetores;
    private javax.swing.JTable tbTiposProjetor;
    // End of variables declaration//GEN-END:variables
}
