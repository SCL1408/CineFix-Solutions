/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import dao.DashboardDao;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import modelo.ModeloDashboard;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author saler
 */
public class Dashboard extends javax.swing.JFrame {

    private Clip clip;

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        navProjetores = new javax.swing.JLabel();
        navOrdens = new javax.swing.JLabel();
        navTecnicos = new javax.swing.JLabel();
        navManutencoes = new javax.swing.JLabel();
        navTipos = new javax.swing.JLabel();
        navStatus = new javax.swing.JLabel();
        navModelos = new javax.swing.JLabel();
        navMarcas = new javax.swing.JLabel();
        navCinemas = new javax.swing.JLabel();
        navEstados = new javax.swing.JLabel();
        jPanelProjCadastrados = new javax.swing.JPanel();
        TituloProjCadastrados = new javax.swing.JLabel();
        ValorProjsCadastrados = new javax.swing.JLabel();
        jPanelCineCadastrados = new javax.swing.JPanel();
        TituloCineCadastrados = new javax.swing.JLabel();
        ValorCineCadastrados = new javax.swing.JLabel();
        pizzaPanel = new javax.swing.JPanel();
        barraPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1441, 1025));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 1024));

        jPanel2.setBackground(new java.awt.Color(0, 92, 184));
        jPanel2.setMaximumSize(new java.awt.Dimension(401, 1025));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 1024));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 1024));

        navProjetores.setBackground(new java.awt.Color(0, 92, 184));
        navProjetores.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navProjetores.setForeground(new java.awt.Color(255, 255, 255));
        navProjetores.setText("Projetores");
        navProjetores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navProjetores.setMaximumSize(new java.awt.Dimension(301, 51));
        navProjetores.setMinimumSize(new java.awt.Dimension(300, 49));
        navProjetores.setOpaque(true);
        navProjetores.setPreferredSize(new java.awt.Dimension(300, 50));
        navProjetores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navProjetoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navProjetoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navProjetoresMouseExited(evt);
            }
        });

        navOrdens.setBackground(new java.awt.Color(0, 92, 184));
        navOrdens.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navOrdens.setForeground(new java.awt.Color(255, 255, 255));
        navOrdens.setText("Ordens de Serviço");
        navOrdens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navOrdens.setMaximumSize(new java.awt.Dimension(301, 51));
        navOrdens.setMinimumSize(new java.awt.Dimension(300, 49));
        navOrdens.setOpaque(true);
        navOrdens.setPreferredSize(new java.awt.Dimension(300, 50));
        navOrdens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navOrdensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navOrdensMouseExited(evt);
            }
        });

        navTecnicos.setBackground(new java.awt.Color(0, 92, 184));
        navTecnicos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navTecnicos.setForeground(new java.awt.Color(255, 255, 255));
        navTecnicos.setText("Técnicos");
        navTecnicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navTecnicos.setMaximumSize(new java.awt.Dimension(301, 51));
        navTecnicos.setMinimumSize(new java.awt.Dimension(300, 49));
        navTecnicos.setOpaque(true);
        navTecnicos.setPreferredSize(new java.awt.Dimension(300, 50));
        navTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navTecnicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navTecnicosMouseExited(evt);
            }
        });

        navManutencoes.setBackground(new java.awt.Color(0, 92, 184));
        navManutencoes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navManutencoes.setForeground(new java.awt.Color(255, 255, 255));
        navManutencoes.setText("Manutenções");
        navManutencoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navManutencoes.setMaximumSize(new java.awt.Dimension(301, 51));
        navManutencoes.setMinimumSize(new java.awt.Dimension(300, 49));
        navManutencoes.setOpaque(true);
        navManutencoes.setPreferredSize(new java.awt.Dimension(300, 50));
        navManutencoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navManutencoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navManutencoesMouseExited(evt);
            }
        });

        navTipos.setBackground(new java.awt.Color(0, 92, 184));
        navTipos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navTipos.setForeground(new java.awt.Color(255, 255, 255));
        navTipos.setText("Tipos de Projetores");
        navTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navTipos.setMaximumSize(new java.awt.Dimension(301, 51));
        navTipos.setMinimumSize(new java.awt.Dimension(300, 49));
        navTipos.setOpaque(true);
        navTipos.setPreferredSize(new java.awt.Dimension(300, 50));
        navTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navTiposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navTiposMouseExited(evt);
            }
        });

        navStatus.setBackground(new java.awt.Color(0, 92, 184));
        navStatus.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navStatus.setForeground(new java.awt.Color(255, 255, 255));
        navStatus.setText("Status");
        navStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navStatus.setMaximumSize(new java.awt.Dimension(301, 51));
        navStatus.setMinimumSize(new java.awt.Dimension(300, 49));
        navStatus.setOpaque(true);
        navStatus.setPreferredSize(new java.awt.Dimension(300, 50));
        navStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navStatusMouseExited(evt);
            }
        });

        navModelos.setBackground(new java.awt.Color(0, 92, 184));
        navModelos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navModelos.setForeground(new java.awt.Color(255, 255, 255));
        navModelos.setText("Modelos");
        navModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navModelos.setMaximumSize(new java.awt.Dimension(301, 51));
        navModelos.setMinimumSize(new java.awt.Dimension(300, 49));
        navModelos.setOpaque(true);
        navModelos.setPreferredSize(new java.awt.Dimension(300, 50));
        navModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navModelosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navModelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navModelosMouseExited(evt);
            }
        });

        navMarcas.setBackground(new java.awt.Color(0, 92, 184));
        navMarcas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navMarcas.setForeground(new java.awt.Color(255, 255, 255));
        navMarcas.setText("Marcas");
        navMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navMarcas.setMaximumSize(new java.awt.Dimension(301, 51));
        navMarcas.setMinimumSize(new java.awt.Dimension(300, 49));
        navMarcas.setOpaque(true);
        navMarcas.setPreferredSize(new java.awt.Dimension(300, 50));
        navMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navMarcasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navMarcasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navMarcasMouseExited(evt);
            }
        });

        navCinemas.setBackground(new java.awt.Color(0, 92, 184));
        navCinemas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navCinemas.setForeground(new java.awt.Color(255, 255, 255));
        navCinemas.setText("Cinemas");
        navCinemas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navCinemas.setMaximumSize(new java.awt.Dimension(301, 51));
        navCinemas.setMinimumSize(new java.awt.Dimension(300, 49));
        navCinemas.setOpaque(true);
        navCinemas.setPreferredSize(new java.awt.Dimension(300, 50));
        navCinemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navCinemasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navCinemasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navCinemasMouseExited(evt);
            }
        });

        navEstados.setBackground(new java.awt.Color(0, 92, 184));
        navEstados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        navEstados.setForeground(new java.awt.Color(255, 255, 255));
        navEstados.setText("Estados");
        navEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navEstados.setMaximumSize(new java.awt.Dimension(301, 51));
        navEstados.setMinimumSize(new java.awt.Dimension(300, 49));
        navEstados.setOpaque(true);
        navEstados.setPreferredSize(new java.awt.Dimension(300, 50));
        navEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navEstadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navEstadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navEstadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navProjetores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navOrdens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navManutencoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navCinemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(navProjetores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navOrdens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navManutencoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navCinemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProjCadastrados.setBackground(new java.awt.Color(0, 92, 184));

        TituloProjCadastrados.setBackground(new java.awt.Color(26, 132, 239));
        TituloProjCadastrados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TituloProjCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        TituloProjCadastrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloProjCadastrados.setText("Projetores Cadastrados");
        TituloProjCadastrados.setToolTipText("");
        TituloProjCadastrados.setOpaque(true);

        ValorProjsCadastrados.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ValorProjsCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        ValorProjsCadastrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorProjsCadastrados.setText("0000");

        javax.swing.GroupLayout jPanelProjCadastradosLayout = new javax.swing.GroupLayout(jPanelProjCadastrados);
        jPanelProjCadastrados.setLayout(jPanelProjCadastradosLayout);
        jPanelProjCadastradosLayout.setHorizontalGroup(
            jPanelProjCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloProjCadastrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(ValorProjsCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelProjCadastradosLayout.setVerticalGroup(
            jPanelProjCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjCadastradosLayout.createSequentialGroup()
                .addComponent(TituloProjCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(ValorProjsCadastrados)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        jPanelCineCadastrados.setBackground(new java.awt.Color(0, 92, 184));

        TituloCineCadastrados.setBackground(new java.awt.Color(26, 132, 239));
        TituloCineCadastrados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TituloCineCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        TituloCineCadastrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCineCadastrados.setText("Cinemas Cadastrados");
        TituloCineCadastrados.setToolTipText("");
        TituloCineCadastrados.setOpaque(true);

        ValorCineCadastrados.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ValorCineCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        ValorCineCadastrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorCineCadastrados.setText("0000");

        javax.swing.GroupLayout jPanelCineCadastradosLayout = new javax.swing.GroupLayout(jPanelCineCadastrados);
        jPanelCineCadastrados.setLayout(jPanelCineCadastradosLayout);
        jPanelCineCadastradosLayout.setHorizontalGroup(
            jPanelCineCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloCineCadastrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(ValorCineCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCineCadastradosLayout.setVerticalGroup(
            jPanelCineCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCineCadastradosLayout.createSequentialGroup()
                .addComponent(TituloCineCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(ValorCineCadastrados)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pizzaPanel.setLayout(new java.awt.BorderLayout());

        barraPanel.setPreferredSize(new java.awt.Dimension(333, 100));
        barraPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanelProjCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pizzaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jPanelCineCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(barraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pizzaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelProjCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCineCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navProjetoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProjetoresMouseEntered
        navProjetores.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navProjetoresMouseEntered

    private void navOrdensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navOrdensMouseEntered
        navOrdens.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navOrdensMouseEntered

    private void navTecnicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navTecnicosMouseEntered
        navTecnicos.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navTecnicosMouseEntered

    private void navManutencoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navManutencoesMouseEntered
        navManutencoes.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navManutencoesMouseEntered

    private void navTiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navTiposMouseEntered
        navTipos.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navTiposMouseEntered

    private void navStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navStatusMouseEntered
        navStatus.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navStatusMouseEntered

    private void navModelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navModelosMouseEntered
        navModelos.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navModelosMouseEntered

    private void navMarcasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMarcasMouseEntered
        navMarcas.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navMarcasMouseEntered

    private void navCinemasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navCinemasMouseEntered
        navCinemas.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navCinemasMouseEntered

    private void navEstadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navEstadosMouseEntered
        navEstados.setBackground(new Color(0, 55, 177));
        reproduzSom();
    }//GEN-LAST:event_navEstadosMouseEntered

    private void navProjetoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProjetoresMouseExited
        navProjetores.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navProjetoresMouseExited

    private void navOrdensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navOrdensMouseExited
        navOrdens.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navOrdensMouseExited

    private void navTecnicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navTecnicosMouseExited
        navTecnicos.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navTecnicosMouseExited

    private void navManutencoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navManutencoesMouseExited
        navManutencoes.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navManutencoesMouseExited

    private void navTiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navTiposMouseExited
        navTipos.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navTiposMouseExited

    private void navStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navStatusMouseExited
        navStatus.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navStatusMouseExited

    private void navModelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navModelosMouseExited
        navModelos.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navModelosMouseExited

    private void navMarcasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMarcasMouseExited
        navMarcas.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navMarcasMouseExited

    private void navCinemasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navCinemasMouseExited
        navCinemas.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navCinemasMouseExited

    private void navEstadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navEstadosMouseExited
        navEstados.setBackground(new Color(0, 92, 184));
    }//GEN-LAST:event_navEstadosMouseExited

    private void navProjetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navProjetoresMouseClicked
        Projetores projetores = new Projetores();
        projetores.setVisible(true);
        dispose();
    }//GEN-LAST:event_navProjetoresMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizarDash();
        try {
            // Carregue o arquivo de áudio (substitua o caminho pelo seu arquivo de áudio)
            //File audioFile = new File("C:/Users/saler/OneDrive/Documentos/Transição/som3.wav");
            File audioFile = new File("src/Media/som3.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Adicione um ouvinte para monitorar o término da reprodução
            clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.setFramePosition(0);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void navModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navModelosMouseClicked
        Modelos novaTela = new Modelos();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navModelosMouseClicked

    private void navMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMarcasMouseClicked
        Marcas novaTela = new Marcas();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navMarcasMouseClicked

    private void navEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navEstadosMouseClicked
        Estados novaTela = new Estados();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navEstadosMouseClicked

    private void navCinemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navCinemasMouseClicked
        Cinemas novaTela = new Cinemas();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navCinemasMouseClicked

    private void reproduzSom(){
        // Inicie a reprodução do som
        if (!clip.isRunning()) {
            clip.setFramePosition(0); // Reinicie o áudio do início
            clip.start();
        }
    }
    
    private void atualizarDash(){
        new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        DashboardDao dashDao = new DashboardDao();
                        ModeloDashboard info = new ModeloDashboard();
                        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
                        DefaultPieDataset pizzaChartData = new DefaultPieDataset();
                        
                        dashDao.retrieve(info);
                        ValorProjsCadastrados.setText(Integer.toString(info.getCountProjetores()));
                        ValorCineCadastrados.setText(Integer.toString(info.getCountCinemas()));
                        
                        //GRÁFICO DE PIZZA -------------------------------------
                        
                        // Define os valores para o conjunto de dados do gráfico de pizza.
                        pizzaChartData.setValue("Em Serviço", info.getCountStatus()[0]);
                        pizzaChartData.setValue("Disponível", info.getCountStatus()[1]);
                        pizzaChartData.setValue("Aguardando Peças", info.getCountStatus()[2]);
                        pizzaChartData.setValue("Manutenção Agendada", info.getCountStatus()[3]);
                        pizzaChartData.setValue("Descartado", info.getCountStatus()[4]);
                        pizzaChartData.setValue("Manutenção Solicitada", info.getCountStatus()[5]);
                        
                        JFreeChart pizzaChart = ChartFactory.createPieChart("Status dos Projetores", pizzaChartData);// Cria um gráfico de pizza com os dados fornecidos.
                        PiePlot pizzachrt = (PiePlot) pizzaChart.getPlot();// Obtém a plotagem (configuração) do gráfico de pizza.
                        ChartPanel ChartPizza = new ChartPanel(pizzaChart);// Cria um painel de gráfico e adiciona o gráfico de pizza a ele.
                        // Remove qualquer conteúdo anterior do painel e adiciona o novo gráfico.
                        pizzaPanel.removeAll();
                        pizzaPanel.add(ChartPizza, BorderLayout.CENTER);
                        pizzaPanel.validate();// Solicita que o painel de pizza seja validado para atualização na interface do usuário.
                        
                        //GRÁFICO DE BARRAS-------------------------------------
                        
                        // Adiciona dados ao gráfico de barras
                         barChartData.setValue(info.getCountStatus()[0], "Em Serviço", "Em Serviço");
                         barChartData.setValue(info.getCountStatus()[1], "Disponível", "Disponível");
                         barChartData.setValue(info.getCountStatus()[2], "Aguardando Peças", "Aguardando Peças");
                         barChartData.setValue(info.getCountStatus()[3], "Manutenção Agendada", "Manutenção Agendada");
                         barChartData.setValue(info.getCountStatus()[4], "Descartado", "Descartado");
                         barChartData.setValue(info.getCountStatus()[5], "Manutenção Solicitada", "Manutenção Solicitada");
                         
                        JFreeChart barChart = ChartFactory.createBarChart("Ex Barras", "Dados", "Valores", barChartData,
                                PlotOrientation.VERTICAL, true, true, false);
                        CategoryPlot barchrt = barChart.getCategoryPlot();
                        barchrt.setRangeGridlinePaint(new Color(140, 105, 204));
                        ChartPanel ChartP = new ChartPanel(barChart);
                        barraPanel.removeAll();
                        barraPanel.add(ChartP, BorderLayout.CENTER);
                        barraPanel.validate();

                        Thread.sleep(1000);
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro inesperado: "+ex, "Erro  em atualizaDash", WARNING_MESSAGE);
                        Thread.interrupted();
                    }
                }
            }
        }.start();
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloCineCadastrados;
    private javax.swing.JLabel TituloProjCadastrados;
    private javax.swing.JLabel ValorCineCadastrados;
    private javax.swing.JLabel ValorProjsCadastrados;
    private javax.swing.JPanel barraPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCineCadastrados;
    private javax.swing.JPanel jPanelProjCadastrados;
    private javax.swing.JLabel navCinemas;
    private javax.swing.JLabel navEstados;
    private javax.swing.JLabel navManutencoes;
    private javax.swing.JLabel navMarcas;
    private javax.swing.JLabel navModelos;
    private javax.swing.JLabel navOrdens;
    private javax.swing.JLabel navProjetores;
    private javax.swing.JLabel navStatus;
    private javax.swing.JLabel navTecnicos;
    private javax.swing.JLabel navTipos;
    private javax.swing.JPanel pizzaPanel;
    // End of variables declaration//GEN-END:variables
}
