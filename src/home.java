import java.sql.*;
import javax.swing.JFrame;

public class home extends javax.swing.JFrame {
        public home() {
        initComponents();
           }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\member-add-on-300x300.png")); // NOI18N
        jButton1.setText("Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\New book.png")); // NOI18N
        jButton2.setText("New Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 6, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\issue.png")); // NOI18N
        jButton3.setText("issue book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 6, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\return-book-1-560407.png")); // NOI18N
        jButton4.setText("Return Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 6, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\exit.png")); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\chait\\OneDrive\\Desktop\\Icon 1\\Statics.png")); // NOI18N
        jButton6.setText("Statics");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library-background-hd-1366x768-74756.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    setExtendedState(JFrame.MAXIMIZED_BOTH);
                 setVisible(false);
         new login().setVisible(true);
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Student().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               new newBook().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               new returnBook().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                setVisible(false);
            new login().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new issueBook().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               new statistics().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

      public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
