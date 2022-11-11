package Inerfaz;
import java.io.BufferedReader;
import java.io.FileReader;
public class Nómina extends javax.swing.JFrame {
    public Nómina() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNomina = new javax.swing.JTextArea();
        jButtonNuevaLiquidación = new javax.swing.JButton();
        jButtonVerLiquidaciones2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextAreaNomina.setColumns(20);
        jTextAreaNomina.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextAreaNomina.setForeground(new java.awt.Color(15, 34, 38));
        jTextAreaNomina.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNomina);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 630, 350);

        jButtonNuevaLiquidación.setBackground(new java.awt.Color(115, 2, 23));
        jButtonNuevaLiquidación.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonNuevaLiquidación.setForeground(new java.awt.Color(217, 189, 50));
        jButtonNuevaLiquidación.setText("NUEVA LIQUIDACIÓN");
        jButtonNuevaLiquidación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaLiquidaciónActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaLiquidación);
        jButtonNuevaLiquidación.setBounds(440, 460, 220, 40);

        jButtonVerLiquidaciones2.setBackground(new java.awt.Color(115, 2, 23));
        jButtonVerLiquidaciones2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonVerLiquidaciones2.setForeground(new java.awt.Color(217, 189, 50));
        jButtonVerLiquidaciones2.setText("VER LIQUIDACIONES");
        jButtonVerLiquidaciones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerLiquidaciones2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerLiquidaciones2);
        jButtonVerLiquidaciones2.setBounds(40, 460, 220, 40);

        jPanel2.setBackground(new java.awt.Color(115, 2, 23));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(217, 189, 50)));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 30, 650, 370);

        jPanel1.setBackground(new java.awt.Color(90, 131, 140));
        jPanel1.setLayout(null);

        jButtonAtras.setBackground(new java.awt.Color(115, 2, 23));
        jButtonAtras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(217, 189, 50));
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras);
        jButtonAtras.setBounds(240, 540, 220, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Menú menu = new Menú();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed
    private void jButtonNuevaLiquidaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaLiquidaciónActionPerformed
         NuevaNómina ingresarliquidación = new NuevaNómina();
        ingresarliquidación.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNuevaLiquidaciónActionPerformed
    private void jButtonVerLiquidaciones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerLiquidaciones2ActionPerformed
        try{
            FileReader entrada = new FileReader("C:/Fichero/Nómina.txt");
            BufferedReader Lector = new BufferedReader(entrada);
            String cadena = Lector.readLine();
            while (cadena != null){                               
            jTextAreaNomina.append(cadena + "\n");
            cadena = Lector.readLine();
            }
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButtonVerLiquidaciones2ActionPerformed
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
            java.util.logging.Logger.getLogger(Nómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nómina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonNuevaLiquidación;
    private javax.swing.JButton jButtonVerLiquidaciones2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNomina;
    // End of variables declaration//GEN-END:variables
}
