package com.ehmenzala.app;

import com.ehmenzala.classes.Fighter;
import com.ehmenzala.classes.Question;
import com.ehmenzala.classes.QuestionPool;
import com.ehmenzala.enums.CombatCinematics;
import com.ehmenzala.enums.Dice;
import com.ehmenzala.enums.GenericCombatCinematics;
import com.ehmenzala.enums.MainSkill;

import static com.ehmenzala.enums.MainSkill.*;
import com.ehmenzala.enums.SecondarySkill;
import static com.ehmenzala.enums.SecondarySkill.*;

import java.awt.Image;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class FightGame {

    private static final Fighter[] FIGHTERS = {
        new Fighter(),
        new Fighter(),
    };

    private static final int TOTAL_PLAYERS = FIGHTERS.length;
    
    public static class MainMenu extends javax.swing.JFrame {

        public MainMenu() {
            initComponents();
            setLocationRelativeTo(null);
        }

        // <editor-fold defaultstate="collapsed" desc="Init components"> 
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            btnStart = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            lblBackground = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            btnStart.setBackground(new java.awt.Color(134, 134, 134));
            btnStart.setFont(new java.awt.Font("IBM Plex Sans", 1, 20)); // NOI18N
            btnStart.setForeground(new java.awt.Color(255, 255, 255));
            btnStart.setText("¡Comenzar!");
            btnStart.setBorderPainted(false);
            btnStart.setFocusable(false);
            btnStart.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnStartActionPerformed(evt);
                }
            });
            jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, 40));

            jLabel1.setFont(new java.awt.Font("IBM Plex Sans", 1, 20)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("¡BIENVENIDO AL JUEGO DE PREGUNTAS Y COMBATES!");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

            jLabel2.setFont(new java.awt.Font("IBM Plex Sans", 3, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(129, 129, 129));
            jLabel2.setText("Iniciar el juego");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

            lblBackground.setIcon(new javax.swing.ImageIcon("./assets/images/swords-bg.png")); // NOI18N
            jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

            pack();
        }// </editor-fold>

        private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {
            this.dispose();
            new FighterData().setVisible(true);
        }

        private javax.swing.JButton btnStart;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lblBackground;
    }

    public static class FighterData extends javax.swing.JFrame {

        private int playerCount = 0;

        public FighterData() {
            initComponents();
            setLocationRelativeTo(null);
            renderUI();
        }

        // <editor-fold defaultstate="collapsed" desc="Init components"> 
        private void initComponents() {

            btnsMainSkill = new javax.swing.ButtonGroup();
            btnsSecondarySkill = new javax.swing.ButtonGroup();
            panelBg = new javax.swing.JPanel();
            btnConfirm = new javax.swing.JButton();
            inputPlayerName = new javax.swing.JTextField();
            msFire = new javax.swing.JRadioButton();
            msWater = new javax.swing.JRadioButton();
            msSnow = new javax.swing.JRadioButton();
            ssDuality = new javax.swing.JRadioButton();
            ssVehicle = new javax.swing.JRadioButton();
            ssKnife = new javax.swing.JRadioButton();
            lblPlayer = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            btnBack = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            panelBg.setBackground(new java.awt.Color(51, 51, 51));

            btnConfirm.setBackground(new java.awt.Color(134, 134, 134));
            btnConfirm.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
            btnConfirm.setText("CONFIRMAR");
            btnConfirm.setBorder(null);
            btnConfirm.setBorderPainted(false);
            btnConfirm.setFocusable(false);
            btnConfirm.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnConfirmActionPerformed(evt);
                }
            });

            inputPlayerName.setBackground(new java.awt.Color(51, 51, 51));
            inputPlayerName.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            inputPlayerName.setForeground(new java.awt.Color(255, 255, 255));
            inputPlayerName.setBorder(null);

            msFire.setBackground(new java.awt.Color(51, 51, 51));
            btnsMainSkill.add(msFire);
            msFire.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            msFire.setForeground(new java.awt.Color(255, 255, 255));
            msFire.setText("Fuego");
            msFire.setFocusable(false);

            msWater.setBackground(new java.awt.Color(51, 51, 51));
            btnsMainSkill.add(msWater);
            msWater.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            msWater.setForeground(new java.awt.Color(255, 255, 255));
            msWater.setText("Agua");
            msWater.setFocusable(false);

            msSnow.setBackground(new java.awt.Color(51, 51, 51));
            btnsMainSkill.add(msSnow);
            msSnow.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            msSnow.setForeground(new java.awt.Color(255, 255, 255));
            msSnow.setText("Nieve");
            msSnow.setFocusable(false);

            ssDuality.setBackground(new java.awt.Color(51, 51, 51));
            btnsSecondarySkill.add(ssDuality);
            ssDuality.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            ssDuality.setForeground(new java.awt.Color(255, 255, 255));
            ssDuality.setText("Dualidad");
            ssDuality.setFocusable(false);

            ssVehicle.setBackground(new java.awt.Color(51, 51, 51));
            btnsSecondarySkill.add(ssVehicle);
            ssVehicle.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            ssVehicle.setForeground(new java.awt.Color(255, 255, 255));
            ssVehicle.setText("Vehículo");
            ssVehicle.setFocusable(false);

            ssKnife.setBackground(new java.awt.Color(51, 51, 51));
            btnsSecondarySkill.add(ssKnife);
            ssKnife.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            ssKnife.setForeground(new java.awt.Color(255, 255, 255));
            ssKnife.setText("Chuchillo");
            ssKnife.setFocusable(false);

            lblPlayer.setFont(new java.awt.Font("ArcadeClassic", 1, 36)); // NOI18N
            lblPlayer.setForeground(new java.awt.Color(255, 255, 255));
            lblPlayer.setText("Jugador 1");

            jLabel2.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Ingresa tu nombre de jugador");

            jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

            jLabel3.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("<html> Habilidad<br> secundaria</html> ");

            jLabel4.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("<html>\nHabilidad<br>\nprincipal\n</html>\n");

            btnBack.setBackground(new java.awt.Color(134, 134, 134));
            btnBack.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            btnBack.setForeground(new java.awt.Color(255, 255, 255));
            btnBack.setText("⬅");
            btnBack.setBorder(null);
            btnBack.setBorderPainted(false);
            btnBack.setFocusable(false);
            btnBack.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBackActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
            panelBg.setLayout(panelBgLayout);
            panelBgLayout.setHorizontalGroup(
                    panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBgLayout.createSequentialGroup()
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelBgLayout.createSequentialGroup()
                                                    .addGap(86, 86, 86)
                                                    .addComponent(lblPlayer))
                                            .addGroup(panelBgLayout.createSequentialGroup()
                                                    .addGap(44, 44, 44)
                                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(panelBgLayout.createSequentialGroup()
                                                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(29, 29, 29)
                                                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel2)
                                                            .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(inputPlayerName)
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                                                                            .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(jSeparator1)
                                                                                    .addGroup(panelBgLayout.createSequentialGroup()
                                                                                            .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addComponent(msWater, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(msFire, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(msSnow, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                            .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(panelBgLayout.createSequentialGroup()
                                                                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                            .addGap(6, 6, 6))
                                                                                                    .addGroup(panelBgLayout.createSequentialGroup()
                                                                                                            .addGap(112, 112, 112)
                                                                                                            .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                    .addComponent(ssKnife)
                                                                                                                    .addComponent(ssVehicle))
                                                                                                            .addGap(0, 0, Short.MAX_VALUE))))
                                                                                    .addGroup(panelBgLayout.createSequentialGroup()
                                                                                            .addGap(0, 0, Short.MAX_VALUE)
                                                                                            .addComponent(ssDuality)
                                                                                            .addGap(6, 6, 6)))
                                                                            .addGap(40, 40, 40))))))
                                    .addContainerGap(20, Short.MAX_VALUE))
            );
            panelBgLayout.setVerticalGroup(
                    panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBgLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblPlayer)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(inputPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(msWater)
                                            .addComponent(ssDuality))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(msFire)
                                            .addComponent(ssVehicle))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(msSnow)
                                            .addComponent(ssKnife))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(29, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
            if (playerCount == 1) {
                this.dispose();
                new MainMenu().setVisible(true);
            } else {
                playerCount -= 2;
                renderUI();
            }
        }

        private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {

            if (inputPlayerName.getText().length() == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debes colocarle un nombre a tu jugador",
                        "¡Cuidado!",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (inputPlayerName.getText().length() > 12) {
                JOptionPane.showMessageDialog(
                        null,
                        "El nombre del jugador no puede pasar de 12 caracteres",
                        "¡Cuidado!",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (!((msFire.isSelected() || msSnow.isSelected() || msWater.isSelected())
                    && (ssDuality.isSelected() || ssKnife.isSelected() || ssVehicle.isSelected()))) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debes seleccionar una habilidad principal y una habilidad secundaria",
                        "¡Cuidado!",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            FIGHTERS[playerCount - 1].setNickname(inputPlayerName.getText());

            if (msFire.isSelected()) {
                FIGHTERS[playerCount - 1].setMainSkill(FIRE);
            } else if (msWater.isSelected()) {
                FIGHTERS[playerCount - 1].setMainSkill(WATER);
            } else {
                FIGHTERS[playerCount - 1].setMainSkill(SNOW);
            }

            if (ssDuality.isSelected()) {
                FIGHTERS[playerCount - 1].setSecondarySkill(DUALITY);
            } else if (ssVehicle.isSelected()) {
                FIGHTERS[playerCount - 1].setSecondarySkill(VEHICLE);
            } else {
                FIGHTERS[playerCount - 1].setSecondarySkill(KNIFE);
            }

            if (playerCount < TOTAL_PLAYERS) {
                renderUI();
            } else {
                this.dispose();
                new TriviaGame().setVisible(true);
            }
        }

        private void renderUI() {
            inputPlayerName.setText("");
            btnsMainSkill.clearSelection();
            btnsSecondarySkill.clearSelection();
            lblPlayer.setText(String.valueOf("Jugador " + (playerCount + 1)));
            playerCount++;
        }

        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnConfirm;
        private javax.swing.ButtonGroup btnsMainSkill;
        private javax.swing.ButtonGroup btnsSecondarySkill;
        private javax.swing.JTextField inputPlayerName;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel lblPlayer;
        private javax.swing.JRadioButton msFire;
        private javax.swing.JRadioButton msSnow;
        private javax.swing.JRadioButton msWater;
        private javax.swing.JPanel panelBg;
        private javax.swing.JRadioButton ssDuality;
        private javax.swing.JRadioButton ssKnife;
        private javax.swing.JRadioButton ssVehicle;
    }

    public static class TriviaGame extends javax.swing.JFrame {

        private Fighter currentFighter;
        private int playerCount = 0;
        private int seconds = 2;
        Question randomQuestion;

        Timer timer = new Timer(1000, (e) -> {
            if (seconds < 0) {
                if (playerCount == 2) {
                    findWinner();
                    stopTimer();
                    return;
                }

                nextPlayer();
                seconds = 2;
            }
            this.lblTimer.setText(String.valueOf(seconds));
            seconds--;
        });

        public TriviaGame() {
            initComponents();
            setLocationRelativeTo(null);
            timer.start();
            nextPlayer();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Init components">
        private void initComponents() {

            lblAnswerCounter = new javax.swing.JLabel();
            lblPlayerName = new javax.swing.JLabel();
            lblCathegory = new javax.swing.JLabel();
            lblTimer = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            btnOptTwo = new javax.swing.JButton();
            btnOptOne = new javax.swing.JButton();
            btnOptThree = new javax.swing.JButton();

            jScrollPane1 = new javax.swing.JScrollPane();
            txtAreaQuestion = new javax.swing.JTextArea();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            lblAnswerCounter.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            lblAnswerCounter.setText("0");

            lblPlayerName.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            lblPlayerName.setText("<player_name>");

            lblCathegory.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            lblCathegory.setText("<cathegory>");

            lblTimer.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            lblTimer.setText("X");

            jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
            jLabel2.setText("Has contestado");

            jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            jLabel3.setText("Trivia -");

            jLabel5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
            jLabel5.setText("Te quedan");

            jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            jLabel6.setText("preguntas");

            jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
            jLabel7.setText("s");

            btnOptTwo.setBackground(new java.awt.Color(95, 94, 94));
            btnOptTwo.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            btnOptTwo.setForeground(new java.awt.Color(255, 255, 255));
            btnOptTwo.setText("<option 3>");
            btnOptTwo.setBorderPainted(false);
            btnOptTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnOptTwo.setFocusable(false);

            btnOptOne.setBackground(new java.awt.Color(95, 94, 94));
            btnOptOne.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            btnOptOne.setForeground(new java.awt.Color(255, 255, 255));
            btnOptOne.setText("<option 1>");
            btnOptOne.setBorderPainted(false);
            btnOptOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnOptOne.setFocusable(false);

            btnOptThree.setBackground(new java.awt.Color(95, 94, 94));
            btnOptThree.setFont(new java.awt.Font("Fira Code Light", 1, 14)); // NOI18N
            btnOptThree.setForeground(new java.awt.Color(255, 255, 255));
            btnOptThree.setText("<option 2>");
            btnOptThree.setBorderPainted(false);
            btnOptThree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnOptThree.setFocusable(false);

            btnOptOne.addActionListener(this::optionsActionPerformed);

            btnOptTwo.addActionListener(this::optionsActionPerformed);

            btnOptThree.addActionListener(this::optionsActionPerformed);

            optionBtns.add(btnOptOne);
            optionBtns.add(btnOptTwo);
            optionBtns.add(btnOptThree);

            jScrollPane1.setBorder(null);

            txtAreaQuestion.setEditable(false);
            txtAreaQuestion.setBackground(new java.awt.Color(240, 240, 240));
            txtAreaQuestion.setColumns(20);
            txtAreaQuestion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
            txtAreaQuestion.setLineWrap(true);
            txtAreaQuestion.setRows(5);
            txtAreaQuestion.setText("Empleamos este concepto cuando queremos mantener partes de nuestro código que no cambian separadas en partes que cambian: ¡Así, es más fácil hacer cambios en el código sin romperlo todo!");
            txtAreaQuestion.setToolTipText("");
            txtAreaQuestion.setWrapStyleWord(true);
            txtAreaQuestion.setBorder(null);
            jScrollPane1.setViewportView(txtAreaQuestion);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblCathegory))
                                            .addComponent(lblPlayerName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(7, 7, 7)
                                                    .addComponent(lblTimer)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel7))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblAnswerCounter)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)))
                                    .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnOptOne, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnOptThree, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnOptTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(204, 204, 204))
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCathegory)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(lblAnswerCounter)
                                            .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOptOne)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnOptThree)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnOptTwo)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblPlayerName)
                                            .addComponent(jLabel5)
                                            .addComponent(lblTimer)
                                            .addComponent(jLabel7))
                                    .addGap(27, 27, 27))
            );

            pack();
        }// </editor-fold>                        

        public void optionsActionPerformed(java.awt.event.ActionEvent evt) {

            int answerIndex = randomQuestion.getAnswer();
            int currentIndex = optionBtns.indexOf((javax.swing.JButton) evt.getSource());

            if (answerIndex == currentIndex) {
                currentFighter.addPoint();
                lblAnswerCounter.setText(String.valueOf(currentFighter.getCorrectQuestions()));
            }

            nextQuestion();
        }

        public void nextQuestion() {
            try {
                randomQuestion = QuestionPool.getRandomQuestion();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ya no quedan más preguntas ):",
                        "¡Oops!",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            txtAreaQuestion.setText(randomQuestion.getQuestion());
            lblCathegory.setText(randomQuestion.getCategory());
            btnOptOne.setText(randomQuestion.getOptions()[0]);
            btnOptTwo.setText(randomQuestion.getOptions()[1]);
            btnOptThree.setText(randomQuestion.getOptions()[2]);
        }

        public void nextPlayer() {

            System.out.println("Le toca al jugador #" + (playerCount + 1));

            currentFighter = FIGHTERS[playerCount];
            String playerName = currentFighter.getNickname();
            lblPlayerName.setText(playerName);
            lblAnswerCounter.setText(String.valueOf(currentFighter.getCorrectQuestions()));
            nextQuestion();
            playerCount++;
        }

        public void stopTimer() {
            timer.stop();
        }

        public void findWinner() {
            Fighter firstPlayer = FIGHTERS[0];
            Fighter secondPlayer = FIGHTERS[1];
            
            this.dispose();
            
            if (firstPlayer.getCorrectQuestions() > secondPlayer.getCorrectQuestions()) {
                new CinematicWindow(GenericCombatCinematics.randomGenericCinematic(), firstPlayer.getNickname()).setVisible(true);
            } else if (secondPlayer.getCorrectQuestions() > firstPlayer.getCorrectQuestions()) {
                new CinematicWindow(GenericCombatCinematics.randomGenericCinematic(), secondPlayer.getNickname()).setVisible(true);
            } else {
                new TheFight().setVisible(true);
            }
        }

        // <editor-fold desc="Variables" defaultstate="collapsed">
        private ArrayList<javax.swing.JButton> optionBtns = new ArrayList<>();
        private javax.swing.JButton btnOptOne;
        private javax.swing.JButton btnOptThree;
        private javax.swing.JButton btnOptTwo;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblAnswerCounter;
        private javax.swing.JLabel lblCathegory;
        private javax.swing.JLabel lblPlayerName;
        private javax.swing.JLabel lblTimer;
        private javax.swing.JTextArea txtAreaQuestion;
        // </editor-fold>
    }
    
    public static class TheFight extends javax.swing.JFrame  {
        
        private Fighter firstFighter = FIGHTERS[0];
        private Fighter secondFighter = FIGHTERS[1];
        
        private final String[] STICKMAN_POSES = {
            "./assets/gifs/stickman-microphone-pose-v1.gif",
            "./assets/gifs/stickman-microphone-pose-v2.gif",
            "./assets/gifs/stickman-microphone-pose-v3.gif",
            "./assets/gifs/stickman-with-fire-on-mouth-pose.gif",
        };
        
        public TheFight() {
            initComponents();
            
            lblFPNickname.setText(firstFighter.getNickname());
            lblSPNickname.setText(secondFighter.getNickname());
            colocarImagen(lblFPBadge, firstFighter.getMainSkill().getBadgePath());
            colocarImagen(lblSPBadge, secondFighter.getMainSkill().getBadgePath());
            
            colocarImagen(fondo, "./assets/images/vs-img-bg.jpeg");
            
            colocarImagen(lblSPImage, STICKMAN_POSES[2]);
            colocarImagen(lblFPImage, STICKMAN_POSES[3]);
            
            this.setLocationRelativeTo(null);
        }
        
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            btnFight = new javax.swing.JButton();
            lblSPImage = new javax.swing.JLabel();
            lblFPBadge = new javax.swing.JLabel();
            lblFPNickname = new javax.swing.JLabel();
            lblSPNickname = new javax.swing.JLabel();
            lblSPBadge = new javax.swing.JLabel();
            lblFPImage = new javax.swing.JLabel();
            jProgressBar1 = new javax.swing.JProgressBar();
            jProgressBar2 = new javax.swing.JProgressBar();
            fondo = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(204, 204, 204));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            btnFight.setBackground(new java.awt.Color(254, 220, 74));
            btnFight.setFont(new java.awt.Font("IBM Plex Sans", 1, 14)); // NOI18N
            btnFight.setText("¡Combate!");
            btnFight.setFocusPainted(false);
            btnFight.setFocusable(false);
            btnFight.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnFightActionPerformed(evt);
                }
            });
            jPanel1.add(btnFight, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

            jPanel1.add(lblSPImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, 140));

            jPanel1.add(lblFPBadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 39, 41));

            lblFPNickname.setFont(new java.awt.Font("ArcadeClassic", 0, 24)); // NOI18N
            lblFPNickname.setText("fpname");
            jPanel1.add(lblFPNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 45, 140, 30));

            lblSPNickname.setFont(new java.awt.Font("ArcadeClassic", 0, 24)); // NOI18N
            lblSPNickname.setText("SPName");
            jPanel1.add(lblSPNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 45, 130, 30));

            jPanel1.add(lblSPBadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 40, 38));

            jPanel1.add(lblFPImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 110, 90, 140));

            jProgressBar1.setBackground(new java.awt.Color(255, 0, 0));
            jProgressBar1.setForeground(new java.awt.Color(99, 228, 158));
            jProgressBar1.setValue(100);
            jProgressBar1.setFocusable(false);
            jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

            jProgressBar2.setForeground(new java.awt.Color(99, 228, 158));
            jProgressBar2.setValue(100);
            jProgressBar2.setFocusable(false);
            jPanel1.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 20));
            jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 340));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold> 
    
        private void btnFightActionPerformed(java.awt.event.ActionEvent evt) {                                         
            findFightWinner();
        }
        
        public void findFightWinner() {

            
            MainSkill ffMainSkill = firstFighter.getMainSkill();
            SecondarySkill ffSecondarySkill = firstFighter.getSecondarySkill();

            MainSkill sfMainSkill = secondFighter.getMainSkill();
            SecondarySkill sfSecondarySkill = secondFighter.getSecondarySkill();
            
            Fighter MainSkillWinner = null;
            Fighter SecondarySkillWinner = null;
            
            if (ffMainSkill == sfMainSkill.getWeakness()) {
                MainSkillWinner = firstFighter;
            } else if (sfMainSkill == ffMainSkill.getWeakness()) {
                MainSkillWinner = secondFighter;
            }

            if (ffSecondarySkill == sfSecondarySkill.getWeakness()) {
                SecondarySkillWinner = firstFighter;
            } else if (sfSecondarySkill == ffSecondarySkill.getWeakness()) {
                SecondarySkillWinner = secondFighter;
            }
            
            this.dispose();
            
            if (MainSkillWinner != null) {
                if (firstFighter.getMainSkill() == WATER && secondFighter.getMainSkill() == FIRE
                        || firstFighter.getMainSkill() == FIRE && secondFighter.getMainSkill() == WATER) {
                    new FightGame.CinematicWindow(CombatCinematics.WATER_FIRE, MainSkillWinner.getNickname()).setVisible(true);
                } else if (firstFighter.getMainSkill() == FIRE && secondFighter.getMainSkill() == SNOW
                        || firstFighter.getMainSkill() == SNOW && secondFighter.getMainSkill() == FIRE) {
                    new FightGame.CinematicWindow(CombatCinematics.FIRE_SNOW, MainSkillWinner.getNickname()).setVisible(true);
                } else if (firstFighter.getMainSkill() == SNOW && secondFighter.getMainSkill() == WATER
                        || firstFighter.getMainSkill() == WATER && secondFighter.getMainSkill() == SNOW) {
                    new FightGame.CinematicWindow(CombatCinematics.SNOW_WATER, MainSkillWinner.getNickname()).setVisible(true);
                }
                
            } else if (SecondarySkillWinner != null) {
                if (firstFighter.getSecondarySkill() == DUALITY && secondFighter.getSecondarySkill() == VEHICLE
                        || firstFighter.getSecondarySkill() == VEHICLE && secondFighter.getSecondarySkill() == DUALITY) {
                    new FightGame.CinematicWindow(CombatCinematics.DUALITY_VEHICLE, SecondarySkillWinner.getNickname()).setVisible(true);
                } else if (firstFighter.getSecondarySkill() == VEHICLE && secondFighter.getSecondarySkill() == KNIFE
                        || firstFighter.getSecondarySkill() == KNIFE && secondFighter.getSecondarySkill() == VEHICLE) {
                    new FightGame.CinematicWindow(CombatCinematics.VEHICLE_KNIFE, SecondarySkillWinner.getNickname()).setVisible(true);
                } else if (firstFighter.getSecondarySkill() == KNIFE && secondFighter.getSecondarySkill() == DUALITY
                        || firstFighter.getSecondarySkill() == DUALITY && secondFighter.getSecondarySkill() == KNIFE) {
                    new FightGame.CinematicWindow(CombatCinematics.KNIFE_DUALITY, SecondarySkillWinner.getNickname()).setVisible(true);
                }
                
            } else {
                new DeathMatch().setVisible(true);
            }

        }
        
        private void colocarImagen(JLabel lbl, String ruta) {
            ImageIcon image = new ImageIcon(ruta);
            Icon icono = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(icono);
            this.repaint();
        }
        
        private javax.swing.JButton btnFight;
        private javax.swing.JLabel fondo;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JProgressBar jProgressBar1;
        private javax.swing.JProgressBar jProgressBar2;
        private javax.swing.JLabel lblFPBadge;
        private javax.swing.JLabel lblFPImage;
        private javax.swing.JLabel lblFPNickname;
        private javax.swing.JLabel lblSPBadge;
        private javax.swing.JLabel lblSPImage;
        private javax.swing.JLabel lblSPNickname;
    }

    public static class DeathMatch extends javax.swing.JFrame {

        public DeathMatch() {
            initComponents();
            lblFPName.setText(FIGHTERS[0].getNickname());
            this.colocarImagen(lblFPBadge, FIGHTERS[0].getMainSkill().getBadgePath());
            lblSPName.setText(FIGHTERS[1].getNickname());
            this.colocarImagen(lblSPBadge, FIGHTERS[1].getMainSkill().getBadgePath());
            this.colocarImagen(fondo, "./assets/images/fondoCombat.jpg");
            this.colocarImagen(jugador1, "./assets/gifs/deathmatch-fighter-right.gif");
            this.colocarImagen(jugador2, "./assets/gifs/deathmatch-fighter-left.gif");
            this.setLocationRelativeTo(null);
        }

        // <editor-fold defaultstate="collapsed" desc="Init components">
        @SuppressWarnings("unchecked")
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jugador1 = new javax.swing.JLabel();
            jugador2 = new javax.swing.JLabel();
            lblFPDice = new javax.swing.JLabel();
            lblSPDice = new javax.swing.JLabel();
            btnSecondPlayer = new javax.swing.JButton();
            btnFirstPlayer = new javax.swing.JButton();
            lblSPHP = new javax.swing.JLabel();
            lblFPHP = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            pgbFP = new javax.swing.JProgressBar();
            pgbSP = new javax.swing.JProgressBar();
            lblFPBadge = new javax.swing.JLabel();
            lblFPName = new javax.swing.JLabel();
            lblSPName = new javax.swing.JLabel();
            lblSPBadge = new javax.swing.JLabel();
            fondo = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(550, 430));

            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jPanel1.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, 220));
            jPanel1.add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 220));

            jPanel1.add(lblFPDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 60, 60));

            jPanel1.add(lblSPDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 60, 60));

            btnSecondPlayer.setText("LANZAR");
            btnSecondPlayer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    throwBtnActionPerformed(evt);
                }
            });
            btnSecondPlayer.setEnabled(false);
            jPanel1.add(btnSecondPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 20));

            btnFirstPlayer.setText("LANZAR");
            btnFirstPlayer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    throwBtnActionPerformed(evt);
                }
            });
            jPanel1.add(btnFirstPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 20));
            
            throwBtns.add(btnFirstPlayer);
            throwBtns.add(btnSecondPlayer);

            lblSPHP.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
            lblSPHP.setForeground(new java.awt.Color(255, 204, 0));
            lblSPHP.setText("20");
            jPanel1.add(lblSPHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 50));

            lblFPHP.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
            lblFPHP.setForeground(new java.awt.Color(255, 204, 0));
            lblFPHP.setText("20");
            jPanel1.add(lblFPHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 30, 50));

            jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 204, 0));
            jLabel1.setText("HP:");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

            jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 204, 0));
            jLabel2.setText("HP:");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

            pgbFP.setBackground(new java.awt.Color(255, 0, 0));
            pgbFP.setForeground(new java.awt.Color(99, 228, 158));
            pgbFP.setMaximum(20);
            pgbFP.setToolTipText("");
            pgbFP.setValue(20);
            jPanel1.add(pgbFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 20));

            pgbSP.setBackground(new java.awt.Color(255, 0, 0));
            pgbSP.setForeground(new java.awt.Color(99, 228, 158));
            pgbSP.setMaximum(20);
            pgbSP.setValue(20);
            jPanel1.add(pgbSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 190, 20));

            jPanel1.add(lblFPBadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 40, 40));

            lblFPName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
            lblFPName.setForeground(new java.awt.Color(255, 204, 0));
            lblFPName.setText("Jugador");
            jPanel1.add(lblFPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

            lblSPName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
            lblSPName.setForeground(new java.awt.Color(255, 204, 0));
            lblSPName.setText("Jugador");
            jPanel1.add(lblSPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

            jPanel1.add(lblSPBadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, 40));
            jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

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
        }// </editor-fold>

        private void throwBtnActionPerformed(java.awt.event.ActionEvent evt) {
            javax.swing.JButton currentBtn = (javax.swing.JButton) evt.getSource();
            int btnIndex = throwBtns.indexOf(currentBtn);
           
            Random r = new Random();
            int randomFace, totalHP;
            Dice[] diceValues = Dice.values();
            randomFace = r.nextInt(6) + 1;
            String remains;

            if (btnIndex == 0) {
                colocarImagen(lblFPDice, diceValues[randomFace - 1].getImagePath());
                totalHP = Integer.parseInt(lblSPHP.getText());
                remains = String.valueOf(totalHP - randomFace);
                
                lblSPHP.setText(remains);
                pgbSP.setValue(Integer.parseInt(remains));
                
                btnSecondPlayer.setEnabled(true);
                btnFirstPlayer.setEnabled(false);
                
            } else {
                colocarImagen(lblSPDice, diceValues[randomFace - 1].getImagePath());
                totalHP = Integer.parseInt(lblFPHP.getText());
                remains = String.valueOf(totalHP - randomFace);
                
                lblFPHP.setText(remains);
                pgbFP.setValue(Integer.parseInt(remains));
                
                btnSecondPlayer.setEnabled(false);
                btnFirstPlayer.setEnabled(true);
            }
            
            if (Integer.parseInt(lblSPHP.getText()) <= 0 || Integer.parseInt(lblFPHP.getText()) <= 0) {
                btnSecondPlayer.setEnabled(false);
                btnFirstPlayer.setEnabled(false);
                
                this.dispose();
                
                if (Integer.parseInt(lblSPHP.getText()) <= 0) {
                    lblSPHP.setText("0");
                    new CinematicWindow(GenericCombatCinematics.randomGenericCinematic(), FIGHTERS[0].getNickname()).setVisible(true);
                } else if (Integer.parseInt(lblFPHP.getText()) <= 0) {
                    lblFPHP.setText("0");
                    new CinematicWindow(GenericCombatCinematics.randomGenericCinematic(), FIGHTERS[1].getNickname()).setVisible(true);
                }
            }
            
            System.out.println(randomFace);
        }

        private void colocarImagen(JLabel lbl, String ruta) {
            ImageIcon image = new ImageIcon(ruta);
            Icon icono = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(icono);
            this.repaint();
        }

        private ArrayList<javax.swing.JButton> throwBtns = new ArrayList<>();
        private javax.swing.JButton btnFirstPlayer;
        private javax.swing.JButton btnSecondPlayer;
        private javax.swing.JLabel fondo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel jugador1;
        private javax.swing.JLabel jugador2;
        private javax.swing.JLabel lblFPBadge;
        private javax.swing.JLabel lblFPDice;
        private javax.swing.JLabel lblFPName;
        private javax.swing.JLabel lblSPBadge;
        private javax.swing.JLabel lblSPDice;
        private javax.swing.JLabel lblSPName;
        private javax.swing.JProgressBar pgbFP;
        private javax.swing.JProgressBar pgbSP;
        private javax.swing.JLabel lblFPHP;
        private javax.swing.JLabel lblSPHP;

    }

    public static class CinematicWindow extends javax.swing.JFrame {
        
        Timer timer;
        
        public CinematicWindow(GenericCombatCinematics genericCinematic, String winnerNickname) {
            
            int duration = genericCinematic.getDuration();
            initComponents();
            colocarImagen(lblVideo, genericCinematic.getGIFPath());
            lblWinner.setText(winnerNickname);

            timer = new Timer(duration, (e) -> {
                this.dispose();
                stopTimer();
                new MainMenu().setVisible(true);
            });

            setLocationRelativeTo(null);
            timer.start();
        }

        public CinematicWindow(CombatCinematics combatCinematic, String winnerNickname) {
            
            int duration = combatCinematic.getDuration();
            initComponents();
            colocarImagen(lblVideo, combatCinematic.getGIFPath());
            lblWinner.setText(winnerNickname);
            timer = new Timer(duration, (e) -> {
                this.dispose();
                stopTimer();
                new MainMenu().setVisible(true);
            });

            setLocationRelativeTo(null);
            timer.start();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            btnSkipCinematic = new javax.swing.JButton();
            lblWinner = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            lblVideo = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            btnSkipCinematic.setBackground(new java.awt.Color(51, 51, 51));
            btnSkipCinematic.setFont(new java.awt.Font("ArcadeClassic", 0, 18)); // NOI18N
            btnSkipCinematic.setForeground(new java.awt.Color(255, 255, 255));
            btnSkipCinematic.setText("Saltar");
            btnSkipCinematic.setBorderPainted(false);
            btnSkipCinematic.setFocusPainted(false);
            btnSkipCinematic.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSkipCinematicActionPerformed(evt);
                }
            });
            jPanel1.add(btnSkipCinematic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

            lblWinner.setFont(new java.awt.Font("ArcadeClassic", 0, 36)); // NOI18N
            lblWinner.setForeground(new java.awt.Color(51, 153, 0));
            lblWinner.setText("ESTEBAN");
            jPanel1.add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

            jLabel1.setFont(new java.awt.Font("ArcadeClassic", 0, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(51, 153, 0));
            jLabel1.setText("GANADOR");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));
            jPanel1.add(lblVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

            pack();
        }// </editor-fold>
        
        private void stopTimer() {
            timer.stop();
        }
        
        private void btnSkipCinematicActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            this.dispose();
            stopTimer();
            new MainMenu().setVisible(true);
        }

        private void colocarImagen(JLabel lbl, String ruta) {
            ImageIcon image = new ImageIcon(ruta);
            Icon icono = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(icono);
            this.repaint();
        }

        private javax.swing.JButton btnSkipCinematic;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lblVideo;
        private javax.swing.JLabel lblWinner;
    }
    
}
