/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trunganh_java;

/**
 *
 * @author Admin
 */
public class May_Tinh_Bo_Tui extends javax.swing.JFrame {
    String operand1 = "";
    String operator = "";
    
    boolean isEqualPress = false;
    /**
     * Creates new form May_Tinh_Bo_Tui
     */
    public May_Tinh_Bo_Tui() {
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

        jPanel1 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnNumber1 = new javax.swing.JButton();
        BtnNumber2 = new javax.swing.JButton();
        BtnNumber3 = new javax.swing.JButton();
        BtnCong = new javax.swing.JButton();
        BtnNumber4 = new javax.swing.JButton();
        BtnNumber5 = new javax.swing.JButton();
        BtnNumber6 = new javax.swing.JButton();
        BtnTru = new javax.swing.JButton();
        BtnNumber7 = new javax.swing.JButton();
        BtnNumber8 = new javax.swing.JButton();
        BtnNumber9 = new javax.swing.JButton();
        BtnNhan = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnNumber0 = new javax.swing.JButton();
        BtnEqual = new javax.swing.JButton();
        BtnChia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        result.setFont(new java.awt.Font("UTM Helve", 1, 36)); // NOI18N
        result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 4, 5, 5));

        BtnNumber1.setText("1");
        BtnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber1);

        BtnNumber2.setText("2");
        BtnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber2);

        BtnNumber3.setText("3");
        BtnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber3);

        BtnCong.setText("+");
        BtnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCongActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCong);

        BtnNumber4.setText("4");
        BtnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber4);

        BtnNumber5.setText("5");
        BtnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber5);

        BtnNumber6.setText("6");
        BtnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber6);

        BtnTru.setText("-");
        BtnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCongActionPerformed(evt);
            }
        });
        jPanel2.add(BtnTru);

        BtnNumber7.setText("7");
        BtnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber7);

        BtnNumber8.setText("8");
        BtnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber8);

        BtnNumber9.setText("9");
        BtnNumber9.setToolTipText("");
        BtnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber9);

        BtnNhan.setText("*");
        BtnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCongActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNhan);

        BtnClear.setText("C");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(BtnClear);

        BtnNumber0.setText("0");
        BtnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumber9ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNumber0);

        BtnEqual.setText("=");
        BtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEqual);

        BtnChia.setText("/");
        BtnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCongActionPerformed(evt);
            }
        });
        jPanel2.add(BtnChia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumber1ActionPerformed
        // TODO add your handling code here:
        if(isEqualPress){
            isEqualPress = false;
            result.setText("");
        }
        String cmd = evt.getActionCommand();
        
        result.setText(result.getText() + cmd);
    }//GEN-LAST:event_BtnNumber1ActionPerformed

    private void BtnNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumber9ActionPerformed
        // TODO add your handling code here:
        String cmd = evt.getActionCommand();
        
        result.setText(result.getText() + cmd);
    }//GEN-LAST:event_BtnNumber9ActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        result.setText("");
        operand1 = "";
        operator = "";
        isEqualPress = false;
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCongActionPerformed
        // TODO add your handling code here:
        String cmd = evt.getActionCommand();
        
        operator = cmd;
        operand1 = result.getText();
        
        result.setText("");
    }//GEN-LAST:event_BtnCongActionPerformed

    private void BtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualActionPerformed
        // TODO add your handling code here:
        if(result.getText().equals("") || operand1.equals("")) {
            return;
        }
        try {
            double oprand1 = Double.parseDouble(operand1);
            double oprand2 = Double.parseDouble(result.getText());
            double result1 = 0;
            
            if(operator.equals("+")){
                result1 = oprand1 + oprand2;
            }else if(operator.equals("-")){
                result1 = oprand1 - oprand2;
            }else if(operator.equals("*")){
                result1 = oprand1 * oprand2;
            }else if(operator.equals("/")){
                result1 = oprand1 / oprand2;
            }
            
            result.setText("" + result1);
            isEqualPress = true;
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(May_Tinh_Bo_Tui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(May_Tinh_Bo_Tui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(May_Tinh_Bo_Tui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(May_Tinh_Bo_Tui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new May_Tinh_Bo_Tui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChia;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnCong;
    private javax.swing.JButton BtnEqual;
    private javax.swing.JButton BtnNhan;
    private javax.swing.JButton BtnNumber0;
    private javax.swing.JButton BtnNumber1;
    private javax.swing.JButton BtnNumber2;
    private javax.swing.JButton BtnNumber3;
    private javax.swing.JButton BtnNumber4;
    private javax.swing.JButton BtnNumber5;
    private javax.swing.JButton BtnNumber6;
    private javax.swing.JButton BtnNumber7;
    private javax.swing.JButton BtnNumber8;
    private javax.swing.JButton BtnNumber9;
    private javax.swing.JButton BtnTru;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}