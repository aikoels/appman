/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.is4300.appman;

/**
 *
 * @author quinc
 */
public class Main extends javax.swing.JFrame {

    //Used for tutorials
    private boolean firstApp;
    private boolean firstInfra;
    
    /**
     * Creates new form Main
     */
    public Main() {
        this.firstApp = true;
        this.firstInfra = true;
        this.user = new User();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        DashTab = new javax.swing.JPanel();
        NewInfraButton1 = new javax.swing.JButton();
        NewAppButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NewAppButton6 = new javax.swing.JButton();
        NewAppButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AppTab = new javax.swing.JPanel();
        NewAppButton = new javax.swing.JButton();
        NewAppButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewAppButton2 = new javax.swing.JButton();
        InfraTab = new javax.swing.JPanel();
        NewInfraButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NewAppButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NewAppButton3 = new javax.swing.JButton();
        SettingTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppMan");
        setBackground(new java.awt.Color(179, 217, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(250, 250));

        jTabbedPane1.setBackground(new java.awt.Color(179, 217, 255));

        DashTab.setBackground(new java.awt.Color(179, 217, 255));

        NewInfraButton1.setText("Create New Infrastructure!");
        NewInfraButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInfraButton1ActionPerformed(evt);
            }
        });

        NewAppButton5.setText("Create New Application!");
        NewAppButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Alerts:");

        NewAppButton6.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton6.setText("Error: App1");
        NewAppButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton6ActionPerformed(evt);
            }
        });

        NewAppButton7.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton7.setText("Error: Server1");
        NewAppButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This is a work in progress. \nIt will show application and server statistics");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DashTabLayout = new javax.swing.GroupLayout(DashTab);
        DashTab.setLayout(DashTabLayout);
        DashTabLayout.setHorizontalGroup(
            DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashTabLayout.createSequentialGroup()
                .addGroup(DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashTabLayout.createSequentialGroup()
                        .addGroup(DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DashTabLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashTabLayout.createSequentialGroup()
                                        .addComponent(NewAppButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NewAppButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DashTabLayout.createSequentialGroup()
                                        .addComponent(NewInfraButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NewAppButton5)))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(DashTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DashTabLayout.setVerticalGroup(
            DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewInfraButton1)
                    .addComponent(NewAppButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAppButton6)
                    .addComponent(NewAppButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dashboard", DashTab);

        AppTab.setBackground(new java.awt.Color(179, 217, 255));

        NewAppButton.setText("Create New Application!");
        NewAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButtonActionPerformed(evt);
            }
        });

        NewAppButton1.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton1.setText("App1");
        NewAppButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Alerts:");

        jLabel2.setText("My Applications:");

        NewAppButton2.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton2.setText("Error: App1");
        NewAppButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppTabLayout = new javax.swing.GroupLayout(AppTab);
        AppTab.setLayout(AppTabLayout);
        AppTabLayout.setHorizontalGroup(
            AppTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(NewAppButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(AppTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppTabLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewAppButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NewAppButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AppTabLayout.setVerticalGroup(
            AppTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewAppButton)
                .addGap(23, 23, 23)
                .addGroup(AppTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAppButton2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(AppTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAppButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Applications", AppTab);

        InfraTab.setBackground(new java.awt.Color(179, 217, 255));

        NewInfraButton.setText("Create New Infrastructure!");
        NewInfraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInfraButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("My Infrastructure:");

        NewAppButton4.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton4.setText("Error: Server1");
        NewAppButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Alerts:");

        NewAppButton3.setBackground(new java.awt.Color(240, 20, 20));
        NewAppButton3.setText("Server1");
        NewAppButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfraTabLayout = new javax.swing.GroupLayout(InfraTab);
        InfraTab.setLayout(InfraTabLayout);
        InfraTabLayout.setHorizontalGroup(
            InfraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfraTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfraTabLayout.createSequentialGroup()
                        .addComponent(NewInfraButton)
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addGroup(InfraTabLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewAppButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfraTabLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(NewAppButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InfraTabLayout.setVerticalGroup(
            InfraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfraTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewInfraButton)
                .addGap(32, 32, 32)
                .addGroup(InfraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAppButton4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(InfraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAppButton3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insfrastructure", InfraTab);

        SettingTab.setBackground(new java.awt.Color(179, 217, 255));

        jLabel5.setText("Name:");

        jTextField1.setPreferredSize(new java.awt.Dimension(10, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Name:");

        jLabel9.setText("Email:");

        jTextField3.setMaximumSize(new java.awt.Dimension(15, 20));
        jTextField3.setMinimumSize(new java.awt.Dimension(15, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(15, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Email:");

        jButton2.setText("Save!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SettingTabLayout = new javax.swing.GroupLayout(SettingTab);
        SettingTab.setLayout(SettingTabLayout);
        SettingTabLayout.setHorizontalGroup(
            SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingTabLayout.createSequentialGroup()
                .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SettingTabLayout.createSequentialGroup()
                        .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SettingTabLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51))
                            .addGroup(SettingTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SettingTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(SettingTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingTabLayout.setVerticalGroup(
            SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingTabLayout.createSequentialGroup()
                .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SettingTabLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SettingTabLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SettingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SettingTabLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(SettingTabLayout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Settings", SettingTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewAppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButtonActionPerformed

        new CreateNewForm(ComponentType.APPLICATION).setVisible(true);
        if (this.firstApp) {
            new PopUp(PopUpType.AppTutorial).setVisible(true);
            this.firstApp = false;
        }
    }//GEN-LAST:event_NewAppButtonActionPerformed

    private void NewInfraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInfraButtonActionPerformed

        new CreateNewForm(ComponentType.INFRASTRUCTURE).setVisible(true);
        if (this.firstInfra) {
            new PopUp(PopUpType.InfraTutorial).setVisible(true);
            this.firstApp = false;
        }
    }//GEN-LAST:event_NewInfraButtonActionPerformed

    private void NewAppButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton1ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorApp).setVisible(true);
    }//GEN-LAST:event_NewAppButton1ActionPerformed

    private void NewAppButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton2ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorApp).setVisible(true);
    }//GEN-LAST:event_NewAppButton2ActionPerformed

    private void NewAppButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton3ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorApp).setVisible(true);
    }//GEN-LAST:event_NewAppButton3ActionPerformed

    private void NewAppButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton4ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorApp).setVisible(true);
    }//GEN-LAST:event_NewAppButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.user.setEmail(jTextField3.getText());
        this.user.setName(jTextField1.getText());
        jLabel6.setText(this.user.getEmail());
        jLabel8.setText(this.user.getName());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NewInfraButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInfraButton1ActionPerformed
        // TODO add your handling code here:
        new CreateNewForm(ComponentType.INFRASTRUCTURE).setVisible(true);
    }//GEN-LAST:event_NewInfraButton1ActionPerformed

    private void NewAppButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton5ActionPerformed
        // TODO add your handling code here:
        new CreateNewForm(ComponentType.APPLICATION).setVisible(true);
    }//GEN-LAST:event_NewAppButton5ActionPerformed

    private void NewAppButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton6ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorApp).setVisible(true);
    }//GEN-LAST:event_NewAppButton6ActionPerformed

    private void NewAppButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppButton7ActionPerformed
        // TODO add your handling code here:
        new PopUp(PopUpType.ErrorInfra).setVisible(true);
    }//GEN-LAST:event_NewAppButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private User user;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppTab;
    private javax.swing.JPanel DashTab;
    private javax.swing.JPanel InfraTab;
    private javax.swing.JButton NewAppButton;
    private javax.swing.JButton NewAppButton1;
    private javax.swing.JButton NewAppButton2;
    private javax.swing.JButton NewAppButton3;
    private javax.swing.JButton NewAppButton4;
    private javax.swing.JButton NewAppButton5;
    private javax.swing.JButton NewAppButton6;
    private javax.swing.JButton NewAppButton7;
    private javax.swing.JButton NewInfraButton;
    private javax.swing.JButton NewInfraButton1;
    private javax.swing.JPanel SettingTab;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
