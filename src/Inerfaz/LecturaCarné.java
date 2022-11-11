package Inerfaz;
import java.io.BufferedReader;
import java.io.FileReader;
public class LecturaCarné extends javax.swing.JFrame {
    
    public LecturaCarné() {
        initComponents();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolverMenu = new javax.swing.JButton();
        jButtonVerCarné = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLecturaCarné = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVolverMenu.setBackground(new java.awt.Color(15, 34, 38));
        jButtonVolverMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonVolverMenu.setForeground(new java.awt.Color(217, 189, 50));
        jButtonVolverMenu.setText("ATRAS");
        jButtonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverMenu);
        jButtonVolverMenu.setBounds(60, 530, 130, 40);

        jButtonVerCarné.setBackground(new java.awt.Color(15, 34, 38));
        jButtonVerCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonVerCarné.setForeground(new java.awt.Color(217, 189, 50));
        jButtonVerCarné.setText("VER");
        jButtonVerCarné.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCarnéActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerCarné);
        jButtonVerCarné.setBounds(490, 530, 130, 40);

        jPanel2.setBackground(new java.awt.Color(115, 2, 23));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(217, 189, 50)));
        jPanel2.setLayout(null);

        jTextAreaLecturaCarné.setColumns(20);
        jTextAreaLecturaCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jTextAreaLecturaCarné.setForeground(new java.awt.Color(15, 34, 38));
        jTextAreaLecturaCarné.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLecturaCarné);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 550, 439);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 40, 570, 460);

        jPanel1.setBackground(new java.awt.Color(90, 131, 140));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuActionPerformed
        Menú menu = new Menú();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverMenuActionPerformed

    private void jButtonVerCarnéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCarnéActionPerformed
       try{
            FileReader entrada = new FileReader("C:/Fichero/Datos.txt");
            BufferedReader Lector = new BufferedReader(entrada);
            String cadena = Lector.readLine();
            while (cadena != null){                               
            jTextAreaLecturaCarné.append(cadena + "\n");
            cadena = Lector.readLine();
            }
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButtonVerCarnéActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LecturaCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturaCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturaCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturaCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturaCarné().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerCarné;
    private javax.swing.JButton jButtonVolverMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLecturaCarné;
    // End of variables declaration//GEN-END:variables
}
