/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.is4300.appman;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;

/**
 *
 * @author quinc
 */
public class CreateNewForm extends javax.swing.JFrame {

    //Type of component being createdo
    private final ComponentType type;
    private final HashMap<String, String> settings;

    /**
     * Creates new form CreateNewForm
     *
     * @param type
     */
    public CreateNewForm(ComponentType type) {
        this.type = type;
        this.settings = new HashMap();
        if (type == ComponentType.APPLICATION) {
            initNewApp();
        } else if (type == ComponentType.INFRASTRUCTURE) {
            initNewInfra();
        }
    }

    private void initNewApp() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ToolBoxPanel = new javax.swing.JTabbedPane();
        OSTab = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LanguageTab = new javax.swing.JPanel();
        Python27Button = new javax.swing.JButton();
        Java8Button = new javax.swing.JButton();
        Java11Button = new javax.swing.JButton();
        Python3Button = new javax.swing.JButton();
        AdditionalFrameworks = new javax.swing.JPanel();
        JUnit4Button = new javax.swing.JButton();
        JUnit5Button = new javax.swing.JButton();
        BuildToolTab = new javax.swing.JPanel();
        MavenButton = new javax.swing.JButton();
        GradleButton = new javax.swing.JButton();
        AntButton = new javax.swing.JButton();
        WorkBenchWindow = new javax.swing.JSplitPane();
        WorkbenchPanel = new javax.swing.JPanel();
        SettingsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jButton1.setText("Windows10");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });

        jButton2.setText("MacOS");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
        });

        jButton3.setText("Ubuntu");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed(evt);
        });

        javax.swing.GroupLayout OSTabLayout = new javax.swing.GroupLayout(OSTab);
        OSTab.setLayout(OSTabLayout);
        OSTabLayout.setHorizontalGroup(
                OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OSTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addContainerGap())
        );
        OSTabLayout.setVerticalGroup(
                OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OSTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Operating System", OSTab);

        Python27Button.setText("Python2.7");
        Python27Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Python27ButtonActionPerformed(evt);
        });

        Java8Button.setText("Java8");
        Java8Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Java8ButtonActionPerformed(evt);
        });

        Java11Button.setText("Java11");
        Java11Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Java11ButtonActionPerformed(evt);
        });

        Python3Button.setText("Python3");
        Python3Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Python3ButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout LanguageTabLayout = new javax.swing.GroupLayout(LanguageTab);
        LanguageTab.setLayout(LanguageTabLayout);
        LanguageTabLayout.setHorizontalGroup(
                LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LanguageTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Java8Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Python27Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(Java11Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Python3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        LanguageTabLayout.setVerticalGroup(
                LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LanguageTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Python27Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Python3Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Java8Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Java11Button)
                                .addContainerGap(81, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Language", LanguageTab);

        JUnit4Button.setText("JUnit4");
        JUnit4Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            JUnit4ButtonActionPerformed(evt);
        });

        JUnit5Button.setText("JUnit5");
        JUnit5Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            JUnit5ButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout AdditionalFrameworksLayout = new javax.swing.GroupLayout(AdditionalFrameworks);
        AdditionalFrameworks.setLayout(AdditionalFrameworksLayout);
        AdditionalFrameworksLayout.setHorizontalGroup(
                AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AdditionalFrameworksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JUnit4Button)
                                .addGap(18, 18, 18)
                                .addComponent(JUnit5Button, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addContainerGap())
        );
        AdditionalFrameworksLayout.setVerticalGroup(
                AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AdditionalFrameworksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JUnit4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JUnit5Button))
                                .addContainerGap(162, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Additional Frameworks", AdditionalFrameworks);

        MavenButton.setText("Maven");
        MavenButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            MavenButtonActionPerformed(evt);
        });

        GradleButton.setText("Gradle");
        GradleButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            GradleButtonActionPerformed(evt);
        });

        AntButton.setText("Ant");
        AntButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            AntButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout BuildToolTabLayout = new javax.swing.GroupLayout(BuildToolTab);
        BuildToolTab.setLayout(BuildToolTabLayout);
        BuildToolTabLayout.setHorizontalGroup(
                BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                                .addComponent(MavenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(GradleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(AntButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        BuildToolTabLayout.setVerticalGroup(
                BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MavenButton)
                                        .addComponent(GradleButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AntButton)
                                .addContainerGap(131, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Build Tools", BuildToolTab);

        jSplitPane1.setRightComponent(ToolBoxPanel);

        WorkBenchWindow.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        WorkBenchWindow.setMinimumSize(new java.awt.Dimension(250, 250));

        WorkbenchPanel.setPreferredSize(new java.awt.Dimension(250, 350));

        javax.swing.GroupLayout WorkbenchPanelLayout = new javax.swing.GroupLayout(WorkbenchPanel);
        WorkbenchPanel.setLayout(WorkbenchPanelLayout);
        WorkbenchPanelLayout.setHorizontalGroup(
                WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkbenchPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34).addContainerGap(56, Short.MAX_VALUE))
        );
        WorkbenchPanelLayout.setVerticalGroup(
                WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkbenchPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37).addContainerGap(49, Short.MAX_VALUE))
        );

        WorkBenchWindow.setTopComponent(WorkbenchPanel);

        SettingsPanel.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel1.setText("Name:");

        jButton4.setText("Create!");
        jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton4ActionPerformed(evt);
        });

        javax.swing.GroupLayout SettingsPanelLayout = new javax.swing.GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(
                SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        SettingsPanelLayout.setVerticalGroup(
                SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addContainerGap())
        );

        WorkBenchWindow.setRightComponent(SettingsPanel);

        jSplitPane1.setLeftComponent(WorkBenchWindow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1)
        );

        pack();
    }

    private void initNewInfra() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ToolBoxPanel = new javax.swing.JTabbedPane();
        OSTab = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LanguageTab = new javax.swing.JPanel();
        Python27Button = new javax.swing.JButton();
        Java8Button = new javax.swing.JButton();
        Java11Button = new javax.swing.JButton();
        Python3Button = new javax.swing.JButton();
        AdditionalFrameworks = new javax.swing.JPanel();
        JUnit4Button = new javax.swing.JButton();
        JUnit5Button = new javax.swing.JButton();
        BuildToolTab = new javax.swing.JPanel();
        MavenButton = new javax.swing.JButton();
        GradleButton = new javax.swing.JButton();
        AntButton = new javax.swing.JButton();
        WorkBenchWindow = new javax.swing.JSplitPane();
        WorkbenchPanel = new javax.swing.JPanel();
        SettingsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jButton1.setText("Windows10");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });

        jButton2.setText("MacOS");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
        });

        jButton3.setText("Ubuntu");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed(evt);
        });

        javax.swing.GroupLayout OSTabLayout = new javax.swing.GroupLayout(OSTab);
        OSTab.setLayout(OSTabLayout);
        OSTabLayout.setHorizontalGroup(
                OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OSTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addContainerGap())
        );
        OSTabLayout.setVerticalGroup(
                OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OSTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Operating System", OSTab);

        Python27Button.setText("2GB");
        Python27Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Python27ButtonActionPerformed(evt);
        });

        Java8Button.setText("4GB");
        Java8Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Java8ButtonActionPerformed(evt);
        });

        Java11Button.setText("6GB");
        Java11Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Java11ButtonActionPerformed(evt);
        });

        Python3Button.setText("8GB");
        Python3Button.addActionListener((java.awt.event.ActionEvent evt) -> {
            Python3ButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout LanguageTabLayout = new javax.swing.GroupLayout(LanguageTab);
        LanguageTab.setLayout(LanguageTabLayout);
        LanguageTabLayout.setHorizontalGroup(
                LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LanguageTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Java8Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Python27Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(Java11Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Python3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        LanguageTabLayout.setVerticalGroup(
                LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LanguageTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Python27Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Python3Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Java8Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Java11Button)
                                .addContainerGap(81, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("RAM", LanguageTab);

        JUnit4Button.setText("Virtual Machine");

        JUnit5Button.setText("Server");

        javax.swing.GroupLayout AdditionalFrameworksLayout = new javax.swing.GroupLayout(AdditionalFrameworks);
        AdditionalFrameworks.setLayout(AdditionalFrameworksLayout);
        AdditionalFrameworksLayout.setHorizontalGroup(
                AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdditionalFrameworksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JUnit4Button, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(JUnit5Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        AdditionalFrameworksLayout.setVerticalGroup(
                AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AdditionalFrameworksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JUnit4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JUnit5Button)
                                .addContainerGap(131, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Infrastructure Type", AdditionalFrameworks);

        MavenButton.setText("10GB");

        GradleButton.setText("20GB");

        AntButton.setText("30GB");

        javax.swing.GroupLayout BuildToolTabLayout = new javax.swing.GroupLayout(BuildToolTab);
        BuildToolTab.setLayout(BuildToolTabLayout);
        BuildToolTabLayout.setHorizontalGroup(
                BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                                .addComponent(MavenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(GradleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(AntButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        BuildToolTabLayout.setVerticalGroup(
                BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuildToolTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MavenButton)
                                        .addComponent(GradleButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AntButton)
                                .addContainerGap(131, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Storage", BuildToolTab);

        jSplitPane1.setRightComponent(ToolBoxPanel);

        WorkBenchWindow.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        WorkBenchWindow.setMinimumSize(new java.awt.Dimension(250, 250));

        WorkbenchPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        javax.swing.GroupLayout WorkbenchPanelLayout = new javax.swing.GroupLayout(WorkbenchPanel);
        WorkbenchPanel.setLayout(WorkbenchPanelLayout);
        WorkbenchPanelLayout.setHorizontalGroup(
                WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkbenchPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34).addContainerGap(56, Short.MAX_VALUE))
        );
        WorkbenchPanelLayout.setVerticalGroup(
                WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkbenchPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37).addContainerGap(49, Short.MAX_VALUE))
        );

        WorkBenchWindow.setTopComponent(WorkbenchPanel);

        SettingsPanel.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel1.setText("Name:");

        jButton4.setText("Create!");
        jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton4ActionPerformed(evt);
        });

        javax.swing.GroupLayout SettingsPanelLayout = new javax.swing.GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(
                SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        SettingsPanelLayout.setVerticalGroup(
                SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SettingsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addContainerGap())
        );

        WorkBenchWindow.setRightComponent(SettingsPanel);

        jSplitPane1.setLeftComponent(WorkBenchWindow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1)
        );

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ToolBoxPanel = new javax.swing.JTabbedPane();
        OSTab = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LanguageTab = new javax.swing.JPanel();
        Python27Button = new javax.swing.JButton();
        Java8Button = new javax.swing.JButton();
        Java11Button = new javax.swing.JButton();
        Python3Button = new javax.swing.JButton();
        AdditionalFrameworks = new javax.swing.JPanel();
        JUnit4Button = new javax.swing.JButton();
        JUnit5Button = new javax.swing.JButton();
        BuildToolTab = new javax.swing.JPanel();
        MavenButton = new javax.swing.JButton();
        GradleButton = new javax.swing.JButton();
        AntButton = new javax.swing.JButton();
        WorkBenchWindow = new javax.swing.JSplitPane();
        WorkbenchPanel = new javax.swing.JPanel();
        SettingsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Windows10");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MacOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubuntu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OSTabLayout = new javax.swing.GroupLayout(OSTab);
        OSTab.setLayout(OSTabLayout);
        OSTabLayout.setHorizontalGroup(
            OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OSTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap())
        );
        OSTabLayout.setVerticalGroup(
            OSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OSTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Operating System", OSTab);

        Python27Button.setText("Python2.7");
        Python27Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Python27ButtonActionPerformed(evt);
            }
        });

        Java8Button.setText("Java8");
        Java8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Java8ButtonActionPerformed(evt);
            }
        });

        Java11Button.setText("Java11");
        Java11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Java11ButtonActionPerformed(evt);
            }
        });

        Python3Button.setText("Python3");
        Python3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Python3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LanguageTabLayout = new javax.swing.GroupLayout(LanguageTab);
        LanguageTab.setLayout(LanguageTabLayout);
        LanguageTabLayout.setHorizontalGroup(
            LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LanguageTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Java8Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Python27Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(Java11Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Python3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LanguageTabLayout.setVerticalGroup(
            LanguageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LanguageTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Python27Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Python3Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Java8Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Java11Button)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Language", LanguageTab);

        JUnit4Button.setText("JUnit4");
        JUnit4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUnit4ButtonActionPerformed(evt);
            }
        });

        JUnit5Button.setText("JUnit5");
        JUnit5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUnit5ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdditionalFrameworksLayout = new javax.swing.GroupLayout(AdditionalFrameworks);
        AdditionalFrameworks.setLayout(AdditionalFrameworksLayout);
        AdditionalFrameworksLayout.setHorizontalGroup(
            AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdditionalFrameworksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JUnit4Button)
                .addGap(18, 18, 18)
                .addComponent(JUnit5Button, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        AdditionalFrameworksLayout.setVerticalGroup(
            AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdditionalFrameworksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdditionalFrameworksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JUnit4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUnit5Button))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Additional Frameworks", AdditionalFrameworks);

        MavenButton.setText("Maven");
        MavenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MavenButtonActionPerformed(evt);
            }
        });

        GradleButton.setText("Gradle");
        GradleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradleButtonActionPerformed(evt);
            }
        });

        AntButton.setText("Ant");
        AntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuildToolTabLayout = new javax.swing.GroupLayout(BuildToolTab);
        BuildToolTab.setLayout(BuildToolTabLayout);
        BuildToolTabLayout.setHorizontalGroup(
            BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildToolTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuildToolTabLayout.createSequentialGroup()
                        .addComponent(MavenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GradleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AntButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BuildToolTabLayout.setVerticalGroup(
            BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildToolTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuildToolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MavenButton)
                    .addComponent(GradleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AntButton)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        ToolBoxPanel.addTab("Build Tools", BuildToolTab);

        jSplitPane1.setRightComponent(ToolBoxPanel);

        WorkBenchWindow.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        WorkBenchWindow.setMinimumSize(new java.awt.Dimension(250, 250));

        WorkbenchPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        javax.swing.GroupLayout WorkbenchPanelLayout = new javax.swing.GroupLayout(WorkbenchPanel);
        WorkbenchPanel.setLayout(WorkbenchPanelLayout);
        WorkbenchPanelLayout.setHorizontalGroup(
            WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        WorkbenchPanelLayout.setVerticalGroup(
            WorkbenchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        WorkBenchWindow.setTopComponent(WorkbenchPanel);

        SettingsPanel.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel1.setText("Name:");

        jButton4.setText("Create!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SettingsPanelLayout = new javax.swing.GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        SettingsPanelLayout.setVerticalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        WorkBenchWindow.setRightComponent(SettingsPanel);

        jSplitPane1.setLeftComponent(WorkBenchWindow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Python27ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Python27ButtonActionPerformed
        this.settings.put("Language", "Python2.7");
        updateWorkbench();
    }//GEN-LAST:event_Python27ButtonActionPerformed

    private void Python3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Python3ButtonActionPerformed
        this.settings.put("Language", "Python3");
        updateWorkbench();
    }//GEN-LAST:event_Python3ButtonActionPerformed

    private void Java11ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Java11ButtonActionPerformed
        this.settings.put("Language", "Java11");
        updateWorkbench();
    }//GEN-LAST:event_Java11ButtonActionPerformed

    private void Java8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Java8ButtonActionPerformed
        this.settings.put("Language", "Java8");
        updateWorkbench();
    }//GEN-LAST:event_Java8ButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.settings.put("Name", jTextField1.getText());
        this.setVisible(false);
        if (this.type == ComponentType.APPLICATION) {
            new PopUp(PopUpType.NewApp).setVisible(true);
            NewApp();
        } else if (this.type == ComponentType.INFRASTRUCTURE) {
            new PopUp(PopUpType.NewInfra).setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.settings.put("Operating System", "Windows10");
        updateWorkbench();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.settings.put("Operating System", "MacOS");
        updateWorkbench();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.settings.put("Operating System", "Ubuntu");
        updateWorkbench();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JUnit4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUnit4ButtonActionPerformed
        this.settings.put("Framework", "JUnit4");
        updateWorkbench();
    }//GEN-LAST:event_JUnit4ButtonActionPerformed

    private void JUnit5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUnit5ButtonActionPerformed
        this.settings.put("Framework", "JUnit5");
        updateWorkbench();
    }//GEN-LAST:event_JUnit5ButtonActionPerformed

    private void MavenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MavenButtonActionPerformed
        this.settings.put("Build Tool", "Maven");
        updateWorkbench();
    }//GEN-LAST:event_MavenButtonActionPerformed

    private void GradleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradleButtonActionPerformed
        this.settings.put("Build Tool", "Gradle");
        updateWorkbench();
    }//GEN-LAST:event_GradleButtonActionPerformed

    private void AntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntButtonActionPerformed
        this.settings.put("Build Tool", "Ant");
        updateWorkbench();
    }//GEN-LAST:event_AntButtonActionPerformed

    private void updateWorkbench() {
        //TODO: Create method which draws workbench based on the map
        //          this.settings
        Graphics g = WorkbenchPanel.getGraphics();
        g.drawString("Additional Frameworks:", 25, 25);
        if (this.settings.get("Framework") != null) {
            g.setColor(Color.GREEN);
            g.fillRect(25, 38, 150, 25);
            g.setColor(Color.BLACK);
            g.drawString(this.settings.get("Framework"), 75, 50);
        }
        g.drawString("Language:", 25, 75);
        if (this.settings.get("Language") != null) {
            g.setColor(Color.BLUE);
            g.fillRect(25, 88, 150, 25);
            g.setColor(Color.BLACK);
            g.drawString(this.settings.get("Language"), 75, 100);
        }
        g.drawString("Build Tool:", 25, 125);
        if (this.settings.get("Build Tool") != null) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(25, 138, 150, 25);
            g.setColor(Color.BLACK);
            g.drawString(this.settings.get("Build Tool"), 75, 150);
        }
        g.drawString("Operating System:", 25, 175);
        if (this.settings.get("Operating System") != null) {
            g.setColor(Color.MAGENTA);
            g.fillRect(25, 188, 150, 25);
            g.setColor(Color.BLACK);
            g.drawString(this.settings.get("Operating System"), 75, 200);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdditionalFrameworks;
    private javax.swing.JButton AntButton;
    private javax.swing.JPanel BuildToolTab;
    private javax.swing.JButton GradleButton;
    private javax.swing.JButton JUnit4Button;
    private javax.swing.JButton JUnit5Button;
    private javax.swing.JButton Java11Button;
    private javax.swing.JButton Java8Button;
    private javax.swing.JPanel LanguageTab;
    private javax.swing.JButton MavenButton;
    private javax.swing.JPanel OSTab;
    private javax.swing.JButton Python27Button;
    private javax.swing.JButton Python3Button;
    private javax.swing.JPanel SettingsPanel;
    private javax.swing.JTabbedPane ToolBoxPanel;
    private javax.swing.JSplitPane WorkBenchWindow;
    private javax.swing.JPanel WorkbenchPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void NewApp() {
        throw new UnsupportedOperationException("Creation of new application "
                + "is not supported yet.");
    }

}
