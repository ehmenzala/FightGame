package com.ehmenzala.app;

import com.ehmenzala.enums.GameMode;
import com.ehmenzala.classes.Fighter;
import com.ehmenzala.classes.Question;
import com.ehmenzala.classes.QuestionPool;
import com.ehmenzala.enums.MainSkill;
import java.util.ArrayList;
import javax.swing.Timer;

public class FightGame {

    private static Fighter playerOne = new Fighter();
    private static Fighter playerTwo = new Fighter();
    private GameMode mode;

    public static class TriviaGame extends javax.swing.JFrame {

        private int correctAnswers = 0;
        private int seconds = 25;
        Question randomQuestion;

        Timer timer = new Timer(1000, (e) -> {
            if (seconds < 0) {
                System.out.println("Kabooooom");
                
                // TIENE QUE TOCARLE AL SIGUIENTE JUGADOR
                // LUEGO SE RESETEA EL CONTADOR
                seconds = 25;
            }
            this.lblTimer.setText(String.valueOf(seconds));
            seconds--;
        });

        public TriviaGame() {
            initComponents();
            setLocationRelativeTo(null);
            timer.start();
            lblPlayerName.setText("Eltetusedemisimasaun");
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
            
            nextQuestion();
        }// </editor-fold>                        

        public void optionsActionPerformed(java.awt.event.ActionEvent evt) {
            
            int answerIndex = randomQuestion.getAnswer(); // Índice de la rpta original en el arr de preguntas
            int currentIndex = optionBtns.indexOf((javax.swing.JButton) evt.getSource());

            if (answerIndex == currentIndex) {
                lblAnswerCounter.setText(String.valueOf(++correctAnswers));
                //playerX.addPoint();
                playerOne.addPoint();
                System.out.println(playerOne.getCorrectQuestions());
                
            }

            nextQuestion();
        }

        public void nextQuestion() {
            randomQuestion = QuestionPool.getRandomQuestion();
            txtAreaQuestion.setText(randomQuestion.getQuestion());
            lblCathegory.setText(randomQuestion.getCategory());
            btnOptOne.setText(randomQuestion.getOptions()[0]);
            btnOptTwo.setText(randomQuestion.getOptions()[1]);
            btnOptThree.setText(randomQuestion.getOptions()[2]);
        }

        // <editor-fold desc="Variables">
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

    public static void findMainSkillWinner(Fighter f1, Fighter f2) {
        String resultado;
        // Fighter mainWinner;
        // Fighter secondaryWinner;

        MainSkill fighterOneMainSkill = f1.getMainSkill();
        MainSkill fighterTwoMainSkill = f2.getMainSkill();

        /* Verificar habilidades principales */
        if (fighterOneMainSkill == fighterTwoMainSkill) {
            resultado = "Empate";
        } else if (fighterOneMainSkill == fighterTwoMainSkill.getWeakness()) {
            resultado = "Gana f1";
        } else {
            resultado = "Gana f2";
        }

        System.out.println(resultado);
    }
}
