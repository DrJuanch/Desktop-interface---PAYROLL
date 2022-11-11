
package Inerfaz;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jPasswordClave = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelClave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(90, 131, 140));
        jPanel3.setMaximumSize(new java.awt.Dimension(700, 650));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 650));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 650));
        jPanel3.setLayout(null);

        jLabelResultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(191, 38, 38));
        jPanel3.add(jLabelResultado);
        jLabelResultado.setBounds(210, 400, 340, 60);

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(15, 34, 38));
        jLabelTitulo.setText("INICIO DE SESIÓN ");
        jPanel3.add(jLabelTitulo);
        jLabelTitulo.setBounds(160, 80, 410, 76);

        jPasswordClave.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordClaveKeyTyped(evt);
            }
        });
        jPanel3.add(jPasswordClave);
        jPasswordClave.setBounds(210, 340, 351, 50);

        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(210, 230, 350, 50);

        jButtonIniciar.setBackground(new java.awt.Color(15, 34, 38));
        jButtonIniciar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonIniciar.setForeground(new java.awt.Color(217, 189, 50));
        jButtonIniciar.setText("Ingresar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        jButtonIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIniciarKeyPressed(evt);
            }
        });
        jPanel3.add(jButtonIniciar);
        jButtonIniciar.setBounds(430, 470, 130, 40);

        jPanel1.setBackground(new java.awt.Color(15, 34, 38));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel3.add(jPanel1);
        jPanel1.setBounds(200, 330, 370, 70);

        jPanel2.setBackground(new java.awt.Color(15, 34, 38));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel3.add(jPanel2);
        jPanel2.setBounds(200, 220, 370, 70);

        jPanel4.setBackground(new java.awt.Color(115, 2, 23));

        jLabelUsuario.setBackground(new java.awt.Color(90, 131, 140));
        jLabelUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(217, 189, 50));
        jLabelUsuario.setText("Usuario");
        jPanel4.add(jLabelUsuario);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(60, 230, 110, 50);

        jPanel5.setBackground(new java.awt.Color(115, 2, 23));

        jLabelClave.setBackground(new java.awt.Color(191, 38, 38));
        jLabelClave.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelClave.setForeground(new java.awt.Color(217, 189, 50));
        jLabelClave.setText("Clave");
        jPanel5.add(jLabelClave);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(70, 340, 90, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        if (jTextFieldUsuario.getText().equalsIgnoreCase("Admin")&&jPasswordClave.getText().equals("12345")){
            JOptionPane.showMessageDialog(null, "Binvenido");
            Menú menu = new Menú();
            menu.setVisible(true);
            dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Corregir datos");
            jLabelResultado.setText("INTENTE NUEVAMENTE");
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        String usuario = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonIniciar.doClick();
        }
        if (!(usuario.matches("[A-zÑ-ñ ]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jPasswordClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordClaveKeyTyped
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonIniciar.doClick();
        }
        String clave = String.valueOf(evt.getKeyChar());
        if (!(clave.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jPasswordClaveKeyTyped

    private void jButtonIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIniciarKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonIniciar.doClick();
        }
    }//GEN-LAST:event_jButtonIniciarKeyPressed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordClave;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
