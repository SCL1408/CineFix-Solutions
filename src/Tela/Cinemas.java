package Tela;

import static APIs.CIdadesIBGE.leCidadesIBGE;
import APIs.ViaCEP;
import APIs.ViaCEPException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloEnderecos;
import modelo.ModeloCinemas;
import dao.EnderecosDao;
import dao.EstadosDao;
import dao.CinemasDao;
import java.awt.Color;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import modelo.ModeloEstados;

public class Cinemas extends javax.swing.JFrame {

    public Cinemas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbIDS = new javax.swing.JTable();
        h2Titulo = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jcbEstado = new javax.swing.JComboBox<>();
        jlEstado = new javax.swing.JLabel();
        jtLogradouro = new javax.swing.JTextField();
        jlLogradouro = new javax.swing.JLabel();
        jtNumero = new javax.swing.JFormattedTextField();
        jlNumero = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jtBairro = new javax.swing.JFormattedTextField();
        jlBairro = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCinemas = new javax.swing.JTable();
        jcbCidade = new javax.swing.JComboBox<>();
        jlNomeCinema = new javax.swing.JLabel();
        jtNomeCinema = new javax.swing.JTextField();
        jlCEP = new javax.swing.JLabel();
        jtCEP = new javax.swing.JFormattedTextField();
        searchCepBtn = new javax.swing.JLabel();

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

        jScrollPane1.setVisible(false);

        tbIDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idEnderecoCinema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbIDS.setEnabled(false);
        tbIDS.setFocusable(false);
        tbIDS.setOpaque(false);
        tbIDS.setRequestFocusEnabled(false);
        tbIDS.setVisible(false);
        jScrollPane1.setViewportView(tbIDS);
        if (tbIDS.getColumnModel().getColumnCount() > 0) {
            tbIDS.getColumnModel().getColumn(0).setResizable(false);
        }

        h2Titulo.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        h2Titulo.setForeground(new java.awt.Color(255, 255, 255));
        h2Titulo.setText("Cinemas");

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

        jcbEstado.setBackground(new java.awt.Color(255, 255, 255));
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbEstado.setBorder(null);
        jcbEstado.setSelectedIndex(-1);
        jcbEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEstadoMouseClicked(evt);
            }
        });

        jlEstado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlEstado.setText("Estado");

        jtLogradouro.setBackground(new java.awt.Color(255, 255, 255));

        jlLogradouro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlLogradouro.setText("Logradouro");

        jtNumero.setBackground(new java.awt.Color(255, 255, 255));

        jlNumero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNumero.setText("Número");

        jtComplemento.setBackground(new java.awt.Color(255, 255, 255));

        jlComplemento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlComplemento.setText("Complemento");

        jtBairro.setBackground(new java.awt.Color(255, 255, 255));

        jlBairro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlBairro.setText("Bairro");

        jlCidade.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCidade.setText("Cidade");

        tbCinemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cinema", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCinemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCinemasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCinemas);
        if (tbCinemas.getColumnModel().getColumnCount() > 0) {
            tbCinemas.getColumnModel().getColumn(0).setResizable(false);
            tbCinemas.getColumnModel().getColumn(1).setResizable(false);
            tbCinemas.getColumnModel().getColumn(2).setResizable(false);
            tbCinemas.getColumnModel().getColumn(3).setResizable(false);
            tbCinemas.getColumnModel().getColumn(4).setResizable(false);
            tbCinemas.getColumnModel().getColumn(5).setResizable(false);
            tbCinemas.getColumnModel().getColumn(6).setResizable(false);
            tbCinemas.getColumnModel().getColumn(7).setResizable(false);
        }

        jcbCidade.setBackground(new java.awt.Color(255, 255, 255));
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCidade.setBorder(null);
        jcbCidade.setEnabled(false);
        jcbCidade.setSelectedIndex(-1);

        jlNomeCinema.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNomeCinema.setText("Nome do cinema");

        jtNomeCinema.setBackground(new java.awt.Color(255, 255, 255));

        jlCEP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCEP.setText("CEP");

        jtCEP.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCEPKeyPressed(evt);
            }
        });

        searchCepBtn.setBackground(new java.awt.Color(0, 92, 184));
        searchCepBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtn.png"))); // NOI18N
        searchCepBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCepBtn.setOpaque(true);
        searchCepBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(h2Titulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlComplemento)
                                            .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlBairro)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNomeCinema)
                                            .addComponent(jtNomeCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jlCEP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchCepBtn))
                                            .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlCidade)
                                            .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlEstado)
                                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlLogradouro))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNumero)
                                            .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchCepBtn)
                                    .addComponent(jlLogradouro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlNomeCinema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNomeCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlBairro)
                                    .addComponent(jlComplemento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtComplemento)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h2Titulo)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbAlterar)
                    .addComponent(jbRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
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
        if (jtNomeCinema.getText().trim().isEmpty()
                || jtLogradouro.getText().trim().isEmpty()
                || jtNumero.getText().trim().isEmpty()
                || jtBairro.getText().trim().isEmpty()
                || jtCEP.getText().trim().isEmpty()
                || jcbCidade.getSelectedIndex() == -1
                || jcbEstado.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNomeCinema.requestFocus();
        } else {
            try {
                ModeloCinemas cinema = new ModeloCinemas();
                ModeloEnderecos endereco = new ModeloEnderecos();//Cria uma nova instância para o endereco que será cadastrado

                //preenche a instância criada com dados dos campos
                endereco.setLogradouro(jtLogradouro.getText());
                endereco.setNumero(Integer.parseInt(jtNumero.getText()));
                endereco.setComplemento(jtComplemento.getText());
                endereco.setBairro(jtBairro.getText());
                endereco.setCidade(jcbCidade.getSelectedItem().toString());
                endereco.setNomeEstado(jcbEstado.getSelectedItem().toString());
                endereco.setCEP(jtCEP.getText());

                EnderecosDao enderecoDao = new EnderecosDao();//Cria uma nova instância Dao para se comunicar com o banco de dados
                enderecoDao.inserir(endereco);//chama a função inserir com o novo endereco instanciado como parâmetro

                cinema.setNomeCinema(jtNomeCinema.getText());
                cinema.setIdEndereco(enderecoDao.consultarSelecionado(endereco).getIdEndereco());

                CinemasDao cinemaDao = new CinemasDao();
                cinemaDao.inserir(cinema);

                renderizarTabela(enderecoDao, cinemaDao);//Renderiza a tabela com o novo conjunto de dados
                limparCampos();
                jtLogradouro.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
            }
        }
        EnderecosDao enderecoDao = new EnderecosDao();

        CinemasDao cinema = new CinemasDao();
        renderizarTabela(enderecoDao, cinema);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //verifica se há coluna selecionada
        if (tbCinemas.getSelectedRow() != -1) {
            if (jtNomeCinema.getText().trim().isEmpty()
                    || jtLogradouro.getText().trim().isEmpty()
                    || jtNumero.getText().trim().isEmpty()
                    || jtBairro.getText().trim().isEmpty()
                    || jtCEP.getText().trim().isEmpty()
                    || jcbCidade.getSelectedIndex() == -1
                    || jcbEstado.getSelectedIndex() == -1) {//verificação se o campo está vazio ou preenchido por espaços
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                jtNomeCinema.requestFocus();
            } else {
                ModeloEnderecos endereco = new ModeloEnderecos();//Cria uma nova instância para o endereco selecionado
                EnderecosDao enderecoDao = new EnderecosDao();//Cria uma nova instância Dao para se comunicar com o banco de dados
                ModeloCinemas cinema = new ModeloCinemas();
                CinemasDao cinemaDao = new CinemasDao();
                
                //preenche a instância criada com dados da tabela e dos campos
                endereco.setIdEndereco(Integer.parseInt(tbIDS.getValueAt(tbIDS.getSelectedRow(), 0).toString()));
                endereco.setLogradouro(jtLogradouro.getText());
                endereco.setNumero(Integer.parseInt(jtNumero.getText()));
                endereco.setComplemento(jtComplemento.getText());
                endereco.setBairro(jtBairro.getText());
                endereco.setCidade(jcbCidade.getSelectedItem().toString());
                endereco.setNomeEstado(jcbEstado.getSelectedItem().toString());
                endereco.setCEP(jtCEP.getText());

                enderecoDao.alterar(endereco);//chama a função alterar com o endereco instanciado como parâmetro
                
                cinema.setNomeCinema(jtNomeCinema.getText());
                cinema.setIdEndereco(endereco.getIdEndereco());
                //cinema.setIdCinema(Integer.parseInt(tbIDS.getValueAt(tbIDS.getSelectedRow(), 0).toString()));
                cinemaDao.alterar(cinema);

                renderizarTabela(enderecoDao, cinemaDao);//Renderiza a tabela com o novo conjunto de dados
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                limparCampos();
                jtLogradouro.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para Alterar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try {
            ModeloEnderecos endereco = new ModeloEnderecos();
            EnderecosDao enderecoDao = new EnderecosDao();
            ModeloCinemas cinema = new ModeloCinemas();
            CinemasDao cinemaDao = new CinemasDao();

            if (tbCinemas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um Cadastro para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            } else {
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                //se for igual a 0 siginifica que clicou em SIM
                if (opcao == 0) {
                    //chama o metodo excuir passando o id da marca selecionada
                    cinemaDao.excluir(Integer.parseInt(tbIDS.getValueAt(tbIDS.getSelectedRow(), 0).toString()));
                    enderecoDao.excluir(Integer.parseInt(tbIDS.getValueAt(tbIDS.getSelectedRow(), 0).toString()));
                    renderizarTabela(enderecoDao, cinemaDao);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EstadosDao estado = new EstadosDao();
        atualizaEstados(estado);
        EnderecosDao endereco = new EnderecosDao();
        CinemasDao cinema = new CinemasDao();
        renderizarTabela(endereco, cinema);
    }//GEN-LAST:event_formWindowOpened

    private void tbCinemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCinemasMouseClicked
        if (tbCinemas.getSelectedRow() != -1) {
            tbIDS.setRowSelectionInterval(tbCinemas.getSelectedRow(), tbCinemas.getSelectedRow());

            limparCampos();
            jtNomeCinema.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 0).toString());
            jtLogradouro.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 1).toString());
            jtNumero.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 2).toString());
            if (tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 3) == null) {
                jtComplemento.setText(null);
            } else {
                jtComplemento.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 3).toString());
            }
            jtBairro.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 4).toString());
            jcbEstado.setSelectedItem(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 6).toString());
            jcbCidade.setEnabled(true);
            atualizaCidades();
            jcbCidade.setSelectedItem(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 5).toString());
            jtCEP.setText(tbCinemas.getValueAt(tbCinemas.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_tbCinemasMouseClicked

    private void jcbEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoMouseClicked
        EstadosDao estadoDao = new EstadosDao();
        atualizaEstados(estadoDao);
    }//GEN-LAST:event_jcbEstadoMouseClicked

    private void jcbEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbEstadoPopupMenuWillBecomeInvisible
        if (jcbEstado.getSelectedIndex() != -1) {
            atualizaCidades();
            jcbCidade.setEnabled(true);
        } else {
            jcbCidade.setEnabled(false);
        }
    }//GEN-LAST:event_jcbEstadoPopupMenuWillBecomeInvisible

    private void jtCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCEPKeyPressed
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            consultarCep();
        }
    }//GEN-LAST:event_jtCEPKeyPressed

    private void searchCepBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseEntered
        searchCepBtn.setBackground(new Color(0, 55, 177));
        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtnBranco.png")));
    }//GEN-LAST:event_searchCepBtnMouseEntered

    private void searchCepBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseExited
        searchCepBtn.setBackground(new Color(0, 92, 184));
        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtn.png")));
    }//GEN-LAST:event_searchCepBtnMouseExited

    private void searchCepBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseClicked
        consultarCep();
    }//GEN-LAST:event_searchCepBtnMouseClicked

    private void limparCampos() {
        jtNomeCinema.setText(null);
        jcbEstado.setSelectedIndex(-1);
        jtLogradouro.setText(null);
        jtComplemento.setText(null);
        jtNumero.setText(null);
        jtBairro.setText(null);
        jcbCidade.setSelectedIndex(-1);
    }

    private void atualizaEstados(EstadosDao estadoDao) {
        try {
            jcbEstado.removeAllItems();
            ArrayList<ModeloEstados> listarEstados;
            listarEstados = estadoDao.consultar(); //consulta todos os registros da tabela Escola

            for (ModeloEstados endereco : listarEstados) {
                //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaEscolas
                jcbEstado.addItem(endereco.getNomeEstado());
            }
            jcbEstado.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }

    private void atualizaCidades() {
        try {
            jcbCidade.removeAllItems();
            String estadoSelecionado = jcbEstado.getSelectedItem().toString();
            EstadosDao estadoDao = new EstadosDao();
            String[] lista = leCidadesIBGE(estadoDao.consultarEstado(estadoSelecionado));
            for (String cidade : lista) {
                jcbCidade.addItem(cidade);
            }
            jcbCidade.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
        }
    }

    private void renderizarTabela(EnderecosDao enderecoDao, CinemasDao cinemaDao) {
        try {
            ArrayList<ModeloEnderecos> listaEnderecos = enderecoDao.consultar();
            ArrayList<ModeloCinemas> listaCinemas = cinemaDao.consultar();
            DefaultTableModel modeloTabelaIDS = (DefaultTableModel) tbIDS.getModel();
            DefaultTableModel modeloTabelaCinemas = (DefaultTableModel) tbCinemas.getModel();

            limparTabela();

            for (int i = 0; i < listaCinemas.size(); i++) {
                modeloTabelaCinemas.addRow(new String[]{
                    listaCinemas.get(i).getNomeCinema(),
                    listaEnderecos.get(i).getLogradouro(),
                    Integer.toString(listaEnderecos.get(i).getNumero()),
                    listaEnderecos.get(i).getComplemento(),
                    listaEnderecos.get(i).getBairro(),
                    listaEnderecos.get(i).getCidade(),
                    listaEnderecos.get(i).getNomeEstado(),
                    listaEnderecos.get(i).getCEP()
                });
                modeloTabelaIDS.addRow(new String[]{
                    Integer.toString(listaCinemas.get(i).getIdEndereco())
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 2!", ERROR_MESSAGE);
        }
    }

    private void limparTabela() {
        //percorre a tabela e exclui todas as linhas
        while (tbCinemas.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbCinemas.getModel();
            dm.getDataVector().removeAllElements();
        }
        while (tbIDS.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) tbIDS.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    private void consultarCep() {
        if (jtCEP.getText().trim().length() == 9) {
            ViaCEP viaCep = new ViaCEP();
            EstadosDao estadoDao = new EstadosDao();

            new Thread() {
                @Override
                public void run() {
                    try {
                        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/loading2.gif")));
                        searchCepBtn.setOpaque(false);
                        viaCep.buscar(jtCEP.getText());
                        jtBairro.setText(viaCep.getBairro());
                        jtLogradouro.setText(viaCep.getLogradouro());
                        jcbEstado.setSelectedItem(estadoDao.consultarSigla(viaCep.getUf()));
                        atualizaCidades();
                        jcbCidade.setEnabled(true);
                        jcbCidade.setSelectedItem(viaCep.getLocalidade());
                        searchCepBtn.setOpaque(true);
                    } catch (ViaCEPException ex) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    }
                    searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtn.png")));
                }
            }.start();
        } else {
            JOptionPane.showMessageDialog(null, "CEP inválido!", "ERRO!", WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(Cinemas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cinemas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cinemas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cinemas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cinemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel h2Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlLogradouro;
    private javax.swing.JLabel jlNomeCinema;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JFormattedTextField jtBairro;
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNomeCinema;
    private javax.swing.JFormattedTextField jtNumero;
    private javax.swing.JLabel searchCepBtn;
    private javax.swing.JTable tbCinemas;
    private javax.swing.JTable tbIDS;
    // End of variables declaration//GEN-END:variables
}
