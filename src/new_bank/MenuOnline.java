/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_bank;
import javax.swing.JOptionPane;

/**
 *
 * @author farhan
 */

public class MenuOnline extends javax.swing.JFrame {

    /**
     * Creates new form MenuOnline
     */
    MainMenu mainmenu = new MainMenu();
    TransaksiOnline online = new TransaksiOnline();
    public MenuOnline() {
        initComponents();
        PanelLoginOnline.setVisible(true);
        PanelMenuOnline.setVisible(false);
        PanelCekSaldoOnline.setVisible(false);
        PanelTransferOnline.setVisible(false);
        mainmenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLoginOnline = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBKembaliLoginOnline = new javax.swing.JButton();
        jBLoginOnline = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        PanelMenuOnline = new javax.swing.JPanel();
        jLNasabahOnline = new javax.swing.JLabel();
        jBMenuCekSaldoOnline = new javax.swing.JButton();
        jBTransferOnline = new javax.swing.JButton();
        jBLogoutOnline = new javax.swing.JButton();
        PanelCekSaldoOnline = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLSaldo = new javax.swing.JLabel();
        jBKembaliCekSaldoOnline = new javax.swing.JButton();
        PanelTransferOnline = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTRekTujuanOnline = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTNominalTransferOnline = new javax.swing.JTextField();
        KembaliTransfer = new javax.swing.JButton();
        jBTombolTransferOnline = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTTokenTransferOnline = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelLoginOnline.setBackground(new java.awt.Color(26, 15, 128));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN ONLINE");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Username");

        Username.setText("Username");
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Password");

        jBKembaliLoginOnline.setBackground(new java.awt.Color(206, 30, 5));
        jBKembaliLoginOnline.setForeground(new java.awt.Color(254, 254, 254));
        jBKembaliLoginOnline.setText("Kembali");
        jBKembaliLoginOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBKembaliLoginOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembaliLoginOnlineActionPerformed(evt);
            }
        });

        jBLoginOnline.setBackground(new java.awt.Color(244, 227, 29));
        jBLoginOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBLoginOnline.setText("Login");
        jBLoginOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLoginOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginOnlineActionPerformed(evt);
            }
        });

        Password.setText("jPasswordField1");

        javax.swing.GroupLayout PanelLoginOnlineLayout = new javax.swing.GroupLayout(PanelLoginOnline);
        PanelLoginOnline.setLayout(PanelLoginOnlineLayout);
        PanelLoginOnlineLayout.setHorizontalGroup(
            PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                        .addComponent(jBKembaliLoginOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jBLoginOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                        .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Password))
                                .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        PanelLoginOnlineLayout.setVerticalGroup(
            PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginOnlineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PanelLoginOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLoginOnline)
                    .addComponent(jBKembaliLoginOnline))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PanelMenuOnline.setBackground(new java.awt.Color(26, 15, 128));

        jLNasabahOnline.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLNasabahOnline.setForeground(new java.awt.Color(254, 254, 254));
        jLNasabahOnline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNasabahOnline.setText("WELCOME USER");

        jBMenuCekSaldoOnline.setBackground(new java.awt.Color(244, 227, 29));
        jBMenuCekSaldoOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBMenuCekSaldoOnline.setText("Cek Saldo");
        jBMenuCekSaldoOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBMenuCekSaldoOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuCekSaldoOnlineActionPerformed(evt);
            }
        });

        jBTransferOnline.setBackground(new java.awt.Color(244, 227, 29));
        jBTransferOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBTransferOnline.setText("Transfer");
        jBTransferOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTransferOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTransferOnlineActionPerformed(evt);
            }
        });

        jBLogoutOnline.setBackground(new java.awt.Color(206, 30, 5));
        jBLogoutOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBLogoutOnline.setForeground(new java.awt.Color(254, 254, 254));
        jBLogoutOnline.setText("Logout");
        jBLogoutOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLogoutOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutOnlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuOnlineLayout = new javax.swing.GroupLayout(PanelMenuOnline);
        PanelMenuOnline.setLayout(PanelMenuOnlineLayout);
        PanelMenuOnlineLayout.setHorizontalGroup(
            PanelMenuOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuOnlineLayout.createSequentialGroup()
                .addGroup(PanelMenuOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuOnlineLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNasabahOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuOnlineLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(PanelMenuOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMenuCekSaldoOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLogoutOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelMenuOnlineLayout.setVerticalGroup(
            PanelMenuOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuOnlineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNasabahOnline)
                .addGap(18, 18, 18)
                .addComponent(jBMenuCekSaldoOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTransferOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLogoutOnline)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelCekSaldoOnline.setBackground(new java.awt.Color(26, 15, 128));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CEK SALDO");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Saldo Anda  :");

        jLSaldo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLSaldo.setForeground(new java.awt.Color(254, 254, 254));
        jLSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSaldo.setText("100000");

        jBKembaliCekSaldoOnline.setBackground(new java.awt.Color(206, 30, 5));
        jBKembaliCekSaldoOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBKembaliCekSaldoOnline.setForeground(new java.awt.Color(254, 254, 254));
        jBKembaliCekSaldoOnline.setText("Kembali");
        jBKembaliCekSaldoOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBKembaliCekSaldoOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembaliCekSaldoOnlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCekSaldoOnlineLayout = new javax.swing.GroupLayout(PanelCekSaldoOnline);
        PanelCekSaldoOnline.setLayout(PanelCekSaldoOnlineLayout);
        PanelCekSaldoOnlineLayout.setHorizontalGroup(
            PanelCekSaldoOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                .addGroup(PanelCekSaldoOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel6))
                    .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jBKembaliCekSaldoOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCekSaldoOnlineLayout.setVerticalGroup(
            PanelCekSaldoOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCekSaldoOnlineLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBKembaliCekSaldoOnline)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PanelTransferOnline.setBackground(new java.awt.Color(26, 15, 128));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TRANSFER");

        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Rekening Tujuan  :");

        jTRekTujuanOnline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTRekTujuanOnline.setText("1001");
        jTRekTujuanOnline.setCaretColor(new java.awt.Color(1, 1, 1));
        jTRekTujuanOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRekTujuanOnlineActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Nominal  :");

        jTNominalTransferOnline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNominalTransferOnline.setText("50000");
        jTNominalTransferOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNominalTransferOnlineActionPerformed(evt);
            }
        });

        KembaliTransfer.setBackground(new java.awt.Color(206, 30, 5));
        KembaliTransfer.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        KembaliTransfer.setForeground(new java.awt.Color(254, 254, 254));
        KembaliTransfer.setText("Kembali");
        KembaliTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KembaliTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliTransferActionPerformed(evt);
            }
        });

        jBTombolTransferOnline.setBackground(new java.awt.Color(244, 227, 29));
        jBTombolTransferOnline.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jBTombolTransferOnline.setText("Transfer");
        jBTombolTransferOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTombolTransferOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTombolTransferOnlineActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Token  :");

        jTTokenTransferOnline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTokenTransferOnline.setText("xxxx");
        jTTokenTransferOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTokenTransferOnlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTransferOnlineLayout = new javax.swing.GroupLayout(PanelTransferOnline);
        PanelTransferOnline.setLayout(PanelTransferOnlineLayout);
        PanelTransferOnlineLayout.setHorizontalGroup(
            PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransferOnlineLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(KembaliTransfer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBTombolTransferOnline)
                .addGap(42, 42, 42))
            .addGroup(PanelTransferOnlineLayout.createSequentialGroup()
                .addGroup(PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTransferOnlineLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)))
                    .addGroup(PanelTransferOnlineLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTransferOnlineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTransferOnlineLayout.createSequentialGroup()
                        .addGroup(PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTNominalTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTRekTujuanOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTTokenTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTransferOnlineLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(161, 161, 161))))
        );
        PanelTransferOnlineLayout.setVerticalGroup(
            PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransferOnlineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTRekTujuanOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNominalTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTTokenTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTransferOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTombolTransferOnline)
                    .addComponent(KembaliTransfer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelTransferOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCekSaldoOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMenuOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLoginOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelLoginOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelMenuOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelCekSaldoOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTransferOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void jBLoginOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginOnlineActionPerformed
        // TODO add your handling code here:
        String user = Username.getText();
        int pass = Integer.parseInt(Password.getText());

        if(online.login(user,pass)){
            jLNasabahOnline.setText("WELCOME " + user);
            PanelLoginOnline.setVisible(false);
            PanelMenuOnline.setVisible(true);
            PanelCekSaldoOnline.setVisible(false);
            PanelTransferOnline.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Account tidak ditemukan!!!");
        }
        
    }//GEN-LAST:event_jBLoginOnlineActionPerformed

    private void jBMenuCekSaldoOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuCekSaldoOnlineActionPerformed
        // TODO add your handling code here:
        PanelMenuOnline.setVisible(false);
        PanelCekSaldoOnline.setVisible(true);
        jLSaldo.setText(online.cekSaldo());
    }//GEN-LAST:event_jBMenuCekSaldoOnlineActionPerformed

    private void jBTransferOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTransferOnlineActionPerformed
        // TODO add your handling code here:
        PanelMenuOnline.setVisible(false);
        PanelTransferOnline.setVisible(true);

    }//GEN-LAST:event_jBTransferOnlineActionPerformed

    private void jBLogoutOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutOnlineActionPerformed
        // TODO add your handling code here:
        PanelMenuOnline.setVisible(false);
        PanelLoginOnline.setVisible(true);
    }//GEN-LAST:event_jBLogoutOnlineActionPerformed

    private void jBKembaliCekSaldoOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembaliCekSaldoOnlineActionPerformed
        // TODO add your handling code here:
        PanelMenuOnline.setVisible(true);
        PanelCekSaldoOnline.setVisible(false);
    }//GEN-LAST:event_jBKembaliCekSaldoOnlineActionPerformed

    private void jTRekTujuanOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRekTujuanOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRekTujuanOnlineActionPerformed

    private void jTNominalTransferOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNominalTransferOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNominalTransferOnlineActionPerformed

    private void jBTombolTransferOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTombolTransferOnlineActionPerformed
        // TODO add your handling code here:
        long rekening = Long.parseLong(jTRekTujuanOnline.getText());
        long nominal = Long.parseLong(jTNominalTransferOnline.getText());
        int token = Integer.parseInt(jTTokenTransferOnline.getText());
        if(online.transfer(nominal, rekening, token)){
            JOptionPane.showMessageDialog(null,"Berhasil Ditransfer!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Rekening tidak Ditemukan/Saldo tidak cukup!!");
        }
        PanelMenuOnline.setVisible(true);
        PanelTransferOnline.setVisible(false);
    }//GEN-LAST:event_jBTombolTransferOnlineActionPerformed

    private void jBKembaliLoginOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembaliLoginOnlineActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainmenu.setVisible(true);
    }//GEN-LAST:event_jBKembaliLoginOnlineActionPerformed

    private void KembaliTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliTransferActionPerformed
        // TODO add your handling code here:
        PanelMenuOnline.setVisible(true);
        PanelTransferOnline.setVisible(false);
    }//GEN-LAST:event_KembaliTransferActionPerformed

    private void jTTokenTransferOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTokenTransferOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTokenTransferOnlineActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOnline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliTransfer;
    private javax.swing.JPanel PanelCekSaldoOnline;
    private javax.swing.JPanel PanelLoginOnline;
    private javax.swing.JPanel PanelMenuOnline;
    private javax.swing.JPanel PanelTransferOnline;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jBKembaliCekSaldoOnline;
    private javax.swing.JButton jBKembaliLoginOnline;
    private javax.swing.JButton jBLoginOnline;
    private javax.swing.JButton jBLogoutOnline;
    private javax.swing.JButton jBMenuCekSaldoOnline;
    private javax.swing.JButton jBTombolTransferOnline;
    private javax.swing.JButton jBTransferOnline;
    private javax.swing.JLabel jLNasabahOnline;
    private javax.swing.JLabel jLSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTNominalTransferOnline;
    private javax.swing.JTextField jTRekTujuanOnline;
    private javax.swing.JTextField jTTokenTransferOnline;
    // End of variables declaration//GEN-END:variables
}