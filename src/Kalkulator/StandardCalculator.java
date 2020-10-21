
package Kalkulator;

import javax.swing.JFrame;

public class StandardCalculator extends javax.swing.JFrame {

    double ans,num, num2;
    int i = 0;
    int calculation;
    
    
    public StandardCalculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jRadioButton1.setEnabled(false);
    }
    
    public void artithmetic_operation()
    {
        switch(calculation)
        {
            case 1:
                num2 = Double.parseDouble(jtxtDisplay.getText());
                ans = num + num2;
                jtxtDisplay.setText(Double.toString(ans));
                jButtonZnakRownaSie.setEnabled(false);
                break;
            case 2:
                ans = num - Double.parseDouble(jtxtDisplay.getText());
                jtxtDisplay.setText(Double.toString(ans));
                jButtonZnakRownaSie.setEnabled(false);
                break;
            case 3:
                ans = num * Double.parseDouble(jtxtDisplay.getText());
                jtxtDisplay.setText(Double.toString(ans));
                jButtonZnakRownaSie.setEnabled(false);
                break;
            case 4:
                ans = num / Double.parseDouble(jtxtDisplay.getText());
                jtxtDisplay.setText(Double.toString(ans));
                jButtonZnakRownaSie.setEnabled(false);
                break;
            
        }
        
    }
    


    public void enable()
    {
        jtxtDisplay.setEnabled(true);
        
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);  
        
        jButton0.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButtonZnakDzielenia.setEnabled(true);
        jButtonZnakOdejmowania.setEnabled(true);
        jButtonDodawania.setEnabled(true);
        jButtonZnakRownaSie.setEnabled(true);
        jButtonZnakMnożenia.setEnabled(true);
        jButtonKasowanie.setEnabled(true);
        jButtonPlusLubMinus.setEnabled(true);
        jButtonC.setEnabled(true);
        jButtonKropka.setEnabled(true);
    }
    
    public void disable()
    {
        jtxtDisplay.setEnabled(false);
        
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);  
        
        jButton0.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButtonZnakDzielenia.setEnabled(false);
        jButtonZnakOdejmowania.setEnabled(false);
        jButtonDodawania.setEnabled(false);
        jButtonZnakRownaSie.setEnabled(false);
        jButtonZnakMnożenia.setEnabled(false);
        jButtonKasowanie.setEnabled(false);
        jButtonPlusLubMinus.setEnabled(false);
        jButtonC.setEnabled(false);
        jButtonKropka.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton40 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonZnakDzielenia = new javax.swing.JButton();
        jButtonZnakOdejmowania = new javax.swing.JButton();
        jButtonDodawania = new javax.swing.JButton();
        jButtonZnakRownaSie = new javax.swing.JButton();
        jButtonZnakMnożenia = new javax.swing.JButton();
        jButtonKasowanie = new javax.swing.JButton();
        jButtonPlusLubMinus = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonKropka = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton40.setBackground(new java.awt.Color(0, 0, 0));
        jButton40.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 0));
        jButton40.setText("Standard");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setBackground(new java.awt.Color(36, 37, 42));
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 37, 42));
        jPanel1.setForeground(new java.awt.Color(36, 37, 42));

        jtxtDisplay.setEditable(false);
        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonZnakDzielenia.setBackground(new java.awt.Color(189, 195, 199));
        jButtonZnakDzielenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonZnakDzielenia.setText("/");
        buttonGroup2.add(jButtonZnakDzielenia);
        jButtonZnakDzielenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZnakDzieleniaActionPerformed(evt);
            }
        });

        jButtonZnakOdejmowania.setBackground(new java.awt.Color(189, 195, 199));
        jButtonZnakOdejmowania.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonZnakOdejmowania.setText("-");
        buttonGroup2.add(jButtonZnakOdejmowania);
        jButtonZnakOdejmowania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZnakOdejmowaniaActionPerformed(evt);
            }
        });

        jButtonDodawania.setBackground(new java.awt.Color(189, 195, 199));
        jButtonDodawania.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDodawania.setText("+");
        buttonGroup2.add(jButtonDodawania);
        jButtonDodawania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodawaniaActionPerformed(evt);
            }
        });

        jButtonZnakRownaSie.setBackground(new java.awt.Color(189, 195, 199));
        jButtonZnakRownaSie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonZnakRownaSie.setText("=");
        jButtonZnakRownaSie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonZnakRownaSieFocusLost(evt);
            }
        });
        jButtonZnakRownaSie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZnakRownaSieMouseClicked(evt);
            }
        });
        jButtonZnakRownaSie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZnakRownaSieActionPerformed(evt);
            }
        });

        jButtonZnakMnożenia.setBackground(new java.awt.Color(189, 195, 199));
        jButtonZnakMnożenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonZnakMnożenia.setText("*");
        buttonGroup2.add(jButtonZnakMnożenia);
        jButtonZnakMnożenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZnakMnożeniaActionPerformed(evt);
            }
        });

        jButtonKasowanie.setBackground(new java.awt.Color(189, 195, 199));
        jButtonKasowanie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonKasowanie.setText("<--");
        jButtonKasowanie.setActionCommand(" ");
        jButtonKasowanie.setPreferredSize(new java.awt.Dimension(55, 31));
        jButtonKasowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKasowanieActionPerformed(evt);
            }
        });

        jButtonPlusLubMinus.setBackground(new java.awt.Color(189, 195, 199));
        jButtonPlusLubMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPlusLubMinus.setText("%");
        jButtonPlusLubMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusLubMinusActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(204, 255, 255));
        jButton0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonC.setBackground(new java.awt.Color(189, 195, 199));
        jButtonC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonKropka.setBackground(new java.awt.Color(204, 255, 255));
        jButtonKropka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonKropka.setText(".");
        jButtonKropka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKropkaActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(36, 37, 42));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 153, 0));
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(36, 37, 42));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 0));
        jButton11.setText("EXITE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jRadioButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonKropka, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonZnakRownaSie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonZnakMnożenia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonKasowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPlusLubMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonZnakDzielenia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonZnakOdejmowania, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDodawania, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(10, 10, 10)
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZnakDzielenia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKasowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlusLubMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZnakMnożenia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZnakOdejmowania, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDodawania, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZnakRownaSie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKropka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jMenuBar2.setBackground(new java.awt.Color(36, 37, 42));

        jMenu3.setText("File");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Scientific Calculator");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Clock");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Conventer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       System.exit(0);
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        disable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButtonKropkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKropkaActionPerformed

        int length = jtxtDisplay.getText().length();
        if(!jtxtDisplay.getText().contains(".") && length >0)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + ".");
        }
        else if(!jtxtDisplay.getText().contains(".") && length ==0)
        jtxtDisplay.setText(jtxtDisplay.getText() + "0.");
        //
        ////        double liczba = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ////
        ////
        ////        if(length > 0)
        ////            jtxtDisplay.setText(jtxtDisplay.getText() + ".");
        ////
        ////        else if(length ==0)
        ////            jtxtDisplay.setText(jtxtDisplay.getText() + "0.");
    }//GEN-LAST:event_jButtonKropkaActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        String EnterNumer = jtxtDisplay.getText() + jButtonC.getText();
        jtxtDisplay.setText("");
        jLabel2.setText("");
        
        
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("6");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "6");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "6");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("5");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "5");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "5");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("4");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "4");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "4");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("3");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "3");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "3");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("2");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "2");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "2");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("1");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "1");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(!jtxtDisplay.getText().contains("0") && length <= 1 && !jtxtDisplay.getText().contains("-"))
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "0");
        }
        else if( length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "0");
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPlusLubMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusLubMinusActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length > 1)
        {
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
            ops = ops/100;
            jtxtDisplay.setText(String.valueOf(ops));
        }
        else if(!jtxtDisplay.getText().contains("0"))
        {
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
            ops = ops/100;
            jtxtDisplay.setText(String.valueOf(ops));
        }

    }//GEN-LAST:event_jButtonPlusLubMinusActionPerformed

    private void jButtonKasowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKasowanieActionPerformed

        int length = jtxtDisplay.getText().length();
        int number = jtxtDisplay.getText().length() -1;
        String store;

        if(length >0)
        {
            StringBuilder back = new StringBuilder(jtxtDisplay.getText());
            back.deleteCharAt(number);
            store=back.toString();
            jtxtDisplay.setText(store);
        }
    }//GEN-LAST:event_jButtonKasowanieActionPerformed

    private void jButtonZnakMnożeniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZnakMnożeniaActionPerformed
        jButtonZnakRownaSie.setEnabled(true);
        
        num = Double.parseDouble(jtxtDisplay.getText());
        calculation = 3;
        jtxtDisplay.setText("");
        jLabel2.setText(num + "*");
    }//GEN-LAST:event_jButtonZnakMnożeniaActionPerformed

    private void jButtonZnakRownaSieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZnakRownaSieActionPerformed

        artithmetic_operation();
        jLabel2.setText("");

    }//GEN-LAST:event_jButtonZnakRownaSieActionPerformed

    private void jButtonZnakRownaSieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZnakRownaSieMouseClicked

    }//GEN-LAST:event_jButtonZnakRownaSieMouseClicked

    private void jButtonZnakRownaSieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonZnakRownaSieFocusLost

    }//GEN-LAST:event_jButtonZnakRownaSieFocusLost

    private void jButtonDodawaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodawaniaActionPerformed

        jButtonZnakRownaSie.setEnabled(true);
        
        num = Double.parseDouble(jtxtDisplay.getText());
        calculation = 1;
        jtxtDisplay.setText("");
        jLabel2.setText(num + "+");
    }//GEN-LAST:event_jButtonDodawaniaActionPerformed

    private void jButtonZnakOdejmowaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZnakOdejmowaniaActionPerformed
        
        jButtonZnakRownaSie.setEnabled(true);
        
        int length = jtxtDisplay.getText().length();
        if(length < 1)
        {
            jtxtDisplay.setText("-");
        }
        if(length >= 1)
        {
            num = Double.parseDouble(jtxtDisplay.getText());
            calculation = 2;
            jtxtDisplay.setText("");
            jLabel2.setText(num + "-");
        }
    }//GEN-LAST:event_jButtonZnakOdejmowaniaActionPerformed

    private void jButtonZnakDzieleniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZnakDzieleniaActionPerformed
       
        jButtonZnakRownaSie.setEnabled(true);
        
        num = Double.parseDouble(jtxtDisplay.getText());
        calculation = 4;
        jtxtDisplay.setText("");
        jLabel2.setText(num + "/");
    }//GEN-LAST:event_jButtonZnakDzieleniaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("9");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "9");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "9");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("8");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "8");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "8");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int length = jtxtDisplay.getText().length();
        if(jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText("7");
        }
        else if(!jtxtDisplay.getText().contains("0") && length <= 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "7");
        }
        else if(length > 1)
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + "7");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
       
//       char c = evt.getKeyChar();
//       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))
//       {
//           getToolkit().beep();
//           evt.consume();
//       }
         
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
       char c = evt.getKeyChar();
       jtxtDisplay.setText(jtxtDisplay.getText() + c);
    }//GEN-LAST:event_jButton1KeyTyped

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Clock rgf = new Clock();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // zamyka otwartą ramkę 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CurrencyConverter rgf = new CurrencyConverter();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ScientificCalculator rgf = new ScientificCalculator();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(StandardCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StandardCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDodawania;
    private javax.swing.JButton jButtonKasowanie;
    private javax.swing.JButton jButtonKropka;
    private javax.swing.JButton jButtonPlusLubMinus;
    private javax.swing.JButton jButtonZnakDzielenia;
    private javax.swing.JButton jButtonZnakMnożenia;
    private javax.swing.JButton jButtonZnakOdejmowania;
    private javax.swing.JButton jButtonZnakRownaSie;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
