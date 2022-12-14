/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller;

import Controller.porder.porderUI;
import Dao.mms.implmms;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hijus
 */
public class logInUI extends javax.swing.JFrame {

    JFrame frame = new JFrame();
    
    
    public logInUI() {
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

        title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        login1 = new javax.swing.JButton();
        signup1 = new javax.swing.JButton();
        phone = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        phoneNumber = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        singup_area = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("微軟正黑體", 1, 40)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("VIP會員登入");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 20, 240, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/java_hw4_mms_工作區域 1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        login1.setBackground(new java.awt.Color(220, 224, 232));
        login1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        login1.setText("登入");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });
        getContentPane().add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 110, -1));

        signup1.setBackground(new java.awt.Color(220, 224, 232));
        signup1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        signup1.setText("註冊會員");
        signup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup1MouseClicked(evt);
            }
        });
        getContentPane().add(signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 110, -1));

        phone.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        phone.setText("請輸入您的手機號碼");
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, -1));

        password2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 16)); // NOI18N
        getContentPane().add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 150, -1));

        phoneNumber.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        phoneNumber.setText("帳號：");
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        password.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        password.setText("密碼：");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 333, -1, -1));

        singup_area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/java_hw4_mms_bg-02.png"))); // NOI18N
        singup_area.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(singup_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
        phone.setText(null);
    }//GEN-LAST:event_phoneMouseClicked

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
String phoneNumber=phone.getText();
        String Password=password2.getText();
        if(phone.getText().isEmpty() || password2.getText().isEmpty()) throw new RuntimeException();
        
        if(new implmms().query(phoneNumber,Password))
        {
            dispose();//真正關閉視窗
            new porderUI().setVisible(true);//到購物介面
        }
         else
       {
           JFrame jFrame = new JFrame();
        int result= JOptionPane.showConfirmDialog(jFrame, "帳號密碼輸入錯誤，請問是否註冊會員？","提示訊息",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            dispose();//真正關閉視窗
            new signup().setVisible(true);
        }
        else if(result == JOptionPane.NO_OPTION)
        {
        }
       }
    }//GEN-LAST:event_login1MouseClicked

    private void signup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup1MouseClicked
        new signup().setVisible(true);
        this.setVisible(false);//關閉現在這個視窗
    }//GEN-LAST:event_signup1MouseClicked

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
            java.util.logging.Logger.getLogger(logInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton login1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JButton signup1;
    private javax.swing.JLabel singup_area;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        public void run() {
            new logInUI().setVisible(true);
        }
    }
}
