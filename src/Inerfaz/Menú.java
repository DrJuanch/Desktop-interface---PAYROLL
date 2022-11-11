package Inerfaz;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Menú extends javax.swing.JFrame {
    int codigo;
    public Menú() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jButtonImprimirCarne = new javax.swing.JButton();
        jButtonNómina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 131, 140));
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(90, 131, 140));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 650));
        jPanel1.setLayout(null);

        jLabelMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(15, 34, 38));
        jLabelMenu.setText("MENÚ");
        jPanel1.add(jLabelMenu);
        jLabelMenu.setBounds(280, 50, 140, 91);

        jButtonImprimirCarne.setBackground(new java.awt.Color(115, 2, 23));
        jButtonImprimirCarne.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonImprimirCarne.setForeground(new java.awt.Color(217, 189, 50));
        jButtonImprimirCarne.setText("IMPRIMIR CARNÉ");
        jButtonImprimirCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirCarneActionPerformed(evt);
            }
        });
        jButtonImprimirCarne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonImprimirCarneKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonImprimirCarne);
        jButtonImprimirCarne.setBounds(130, 200, 458, 53);

        jButtonNómina.setBackground(new java.awt.Color(115, 2, 23));
        jButtonNómina.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jButtonNómina.setForeground(new java.awt.Color(217, 189, 50));
        jButtonNómina.setText("NÓMINA");
        jButtonNómina.setPreferredSize(new java.awt.Dimension(315, 23));
        jButtonNómina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNóminaActionPerformed(evt);
            }
        });
        jButtonNómina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNóminaKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonNómina);
        jButtonNómina.setBounds(130, 330, 458, 53);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonImprimirCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirCarneActionPerformed
       JOptionPane.showMessageDialog(null, "Imprimirá su carné SENA");
       ImpresiónDeCarné impresión = new ImpresiónDeCarné();
       impresión.setVisible(true);
       codigo = impresión.codigoRandom();
       impresión.setCodigoAprendiz(codigo);
       dispose();
    }//GEN-LAST:event_jButtonImprimirCarneActionPerformed

    private void jButtonNóminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNóminaActionPerformed
        NuevaNómina nomina = new NuevaNómina();
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de liquidaciones");
        nomina.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNóminaActionPerformed

    private void jButtonImprimirCarneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonImprimirCarneKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonImprimirCarne.doClick();
        }
    }//GEN-LAST:event_jButtonImprimirCarneKeyPressed

    private void jButtonNóminaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNóminaKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonNómina.doClick();
        }
    }//GEN-LAST:event_jButtonNóminaKeyPressed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImprimirCarne;
    private javax.swing.JButton jButtonNómina;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
