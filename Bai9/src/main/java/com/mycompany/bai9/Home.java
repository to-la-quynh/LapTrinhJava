/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai9.src.main.java.com.mycompany.bai9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author vieth
 */
public class Home extends javax.swing.JFrame {
    private List<JCheckBox> languages;
    /**
     * Creates new form Home
     */
    public Home() {
        this.setLocationRelativeTo(null);
        initComponents();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        maleRadioButton.setSelected(true);
        
        languages = new ArrayList<>(Arrays.asList(
            englishLangCheckbox,
            frenchLangCheckbox,
            chineseLangCheckbox,
            russiaLangCheckbox
    ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        languagesButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        fullnameLabel = new javax.swing.JLabel();
        fullnameTextField = new javax.swing.JTextField();
        studentIdLabel = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        ethnicLabel = new javax.swing.JLabel();
        ethnicTextField = new javax.swing.JTextField();
        foreignLanguagesLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        englishLangCheckbox = new javax.swing.JCheckBox();
        frenchLangCheckbox = new javax.swing.JCheckBox();
        russiaLangCheckbox = new javax.swing.JCheckBox();
        chineseLangCheckbox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JToggleButton();
        closeButton = new javax.swing.JToggleButton();
        importButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 530));
        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HIỂN THỊ THÔNG TIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoTextArea.setRows(5);
        jScrollPane1.setViewportView(infoTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHẬP THÔNG TIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        fullnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullnameLabel.setText("Họ và tên: ");

        fullnameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        studentIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentIdLabel.setText("Mã SV: ");

        studentIdTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dobLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dobLabel.setText("Ngày sinh: ");

        dobTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderLabel.setText("Giới tính: ");

        ethnicLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ethnicLabel.setText("Dân tộc: ");

        ethnicTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        foreignLanguagesLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        foreignLanguagesLabel.setText("Ngoại ngữ: ");

        maleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        maleRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        maleRadioButton.setText("Nam");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        femaleRadioButton.setText("Nữ");

        englishLangCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        englishLangCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        englishLangCheckbox.setText("Anh");
        englishLangCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishLangCheckboxActionPerformed(evt);
            }
        });

        frenchLangCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        frenchLangCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        frenchLangCheckbox.setText("Pháp");

        russiaLangCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        russiaLangCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        russiaLangCheckbox.setText("Nga");

        chineseLangCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        chineseLangCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chineseLangCheckbox.setText("Trung");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foreignLanguagesLabel)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(studentIdLabel)
                            .addGap(49, 49, 49)
                            .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(fullnameLabel)
                            .addGap(49, 49, 49)
                            .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ethnicLabel)
                            .addComponent(genderLabel)
                            .addComponent(dobLabel))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton))
                                    .addComponent(ethnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(englishLangCheckbox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frenchLangCheckbox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(russiaLangCheckbox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chineseLangCheckbox)))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnameLabel)
                    .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdLabel)
                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicLabel)
                    .addComponent(ethnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foreignLanguagesLabel)
                    .addComponent(englishLangCheckbox)
                    .addComponent(frenchLangCheckbox)
                    .addComponent(russiaLangCheckbox)
                    .addComponent(chineseLangCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH NHẬP HỒ SƠ SINH VIÊN 2024");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton.setText("Thêm");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closeButton.setText("Đóng");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        importButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        importButton.setText("Nhập");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(importButton)
                .addGap(96, 96, 96)
                .addComponent(addButton)
                .addGap(97, 97, 97)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(closeButton)
                    .addComponent(importButton))
                .addGap(220, 220, 220))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        infoTextArea.setText("");
        fullnameTextField.setText("");
        studentIdTextField.setText("");
        dobTextField.setText("");
        maleRadioButton.setSelected(true);
        femaleRadioButton.setSelected(false);
        ethnicTextField.setText("");
        languages.parallelStream().forEach(item -> item.setSelected(false));
        fullnameTextField.setFocusable(true);
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        StringBuilder content = new StringBuilder();
        content.append("Họ tên: ").append(fullnameTextField.getText()).append("\n");
        content.append("Mã sinh viên: ").append(studentIdTextField.getText()).append("\n");
        content.append("Ngày sinh: ").append(dobTextField.getText()).append("\n");
        content.append("Giới tính: ").append(maleRadioButton.isSelected() ? "Nam" : "Nữ").append("\n");
        content.append("Dân tộc: ").append(ethnicTextField.getText()).append("\n");
        content.append("Ngoại ngữ: ");
        languages.parallelStream().forEach(item -> {
            if (item.isSelected()) content.append(item.getText()).append(" ");
        });
        content.append("\n");
        infoTextArea.setText(content.toString());
        
    }//GEN-LAST:event_importButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void englishLangCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishLangCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_englishLangCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(() -> {
                new Home().setVisible(true);
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addButton;
    private javax.swing.JCheckBox chineseLangCheckbox;
    private javax.swing.JToggleButton closeButton;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JCheckBox englishLangCheckbox;
    private javax.swing.JLabel ethnicLabel;
    private javax.swing.JTextField ethnicTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel foreignLanguagesLabel;
    private javax.swing.JCheckBox frenchLangCheckbox;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JToggleButton importButton;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup languagesButtonGroup;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JCheckBox russiaLangCheckbox;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JTextField studentIdTextField;
    // End of variables declaration//GEN-END:variables
}
