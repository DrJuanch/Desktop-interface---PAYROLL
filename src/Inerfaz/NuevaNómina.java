package Inerfaz;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class NuevaNómina extends javax.swing.JFrame {    
    int salarioint;
    int devengado;
    int total_devengado;
    int transporte;
    int salud;
    int pago_total;
    int pension;
    int diasint;
    public NuevaNómina() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldDíasTrabajados = new javax.swing.JTextField();
        jTextFieldIdentificación = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonlLiquidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(115, 2, 23));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 189, 50));
        jLabel1.setText("Nombres ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 50, 120, 62);

        jLabel2.setBackground(new java.awt.Color(217, 189, 50));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 189, 50));
        jLabel2.setText("Apellidos ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 110, 62);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 189, 50));
        jLabel3.setText("Salario ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 110, 58);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 189, 50));
        jLabel5.setText("Identificación");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 410, 140, 53);

        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(15, 34, 38));
        jTextFieldNombres.setMinimumSize(new java.awt.Dimension(5, 25));
        jTextFieldNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombresKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNombres);
        jTextFieldNombres.setBounds(200, 50, 440, 50);

        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(15, 34, 38));
        jTextFieldApellidos.setMinimumSize(new java.awt.Dimension(5, 25));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(5, 25));
        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldApellidos);
        jTextFieldApellidos.setBounds(200, 140, 440, 50);

        jTextFieldDíasTrabajados.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldDíasTrabajados.setForeground(new java.awt.Color(15, 34, 38));
        jTextFieldDíasTrabajados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDíasTrabajadosKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDíasTrabajados);
        jTextFieldDíasTrabajados.setBounds(200, 320, 440, 50);

        jTextFieldIdentificación.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldIdentificación.setForeground(new java.awt.Color(15, 34, 38));
        jTextFieldIdentificación.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdentificaciónKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdentificación);
        jTextFieldIdentificación.setBounds(200, 410, 440, 50);

        jTextFieldSalario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldSalario.setForeground(new java.awt.Color(15, 34, 38));
        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldSalario);
        jTextFieldSalario.setBounds(200, 230, 440, 50);

        jPanel2.setBackground(new java.awt.Color(115, 2, 23));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 70, 100, 30);

        jPanel1.setBackground(new java.awt.Color(90, 131, 140));
        jPanel1.setLayout(null);

        jButtonAtras.setBackground(new java.awt.Color(15, 34, 38));
        jButtonAtras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(217, 189, 50));
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras);
        jButtonAtras.setBounds(30, 510, 120, 40);

        jPanel6.setBackground(new java.awt.Color(15, 34, 38));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6);
        jPanel6.setBounds(190, 130, 460, 70);

        jPanel5.setBackground(new java.awt.Color(15, 34, 38));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel5.setLayout(null);
        jPanel1.add(jPanel5);
        jPanel5.setBounds(190, 40, 460, 70);

        jPanel7.setBackground(new java.awt.Color(15, 34, 38));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel7.setForeground(new java.awt.Color(15, 34, 38));
        jPanel7.setLayout(null);
        jPanel1.add(jPanel7);
        jPanel7.setBounds(190, 310, 460, 70);

        jPanel8.setBackground(new java.awt.Color(15, 34, 38));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel8.setLayout(null);
        jPanel1.add(jPanel8);
        jPanel8.setBounds(190, 400, 460, 70);

        jPanel9.setBackground(new java.awt.Color(15, 34, 38));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(191, 38, 38)));
        jPanel9.setLayout(null);
        jPanel1.add(jPanel9);
        jPanel9.setBounds(190, 220, 460, 70);

        jPanel3.setBackground(new java.awt.Color(115, 2, 23));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 150, 100, 30);

        jPanel4.setBackground(new java.awt.Color(115, 2, 23));
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 230, 80, 40);

        jPanel11.setBackground(new java.awt.Color(115, 2, 23));
        jPanel11.setLayout(null);
        jPanel1.add(jPanel11);
        jPanel11.setBounds(40, 420, 130, 40);

        jPanel10.setBackground(new java.awt.Color(115, 2, 23));
        jPanel10.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(217, 189, 50));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 189, 50));
        jLabel6.setText("Días Trabajados");
        jPanel10.add(jLabel6);
        jLabel6.setBounds(0, 10, 140, 30);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(40, 320, 140, 50);

        jButtonlLiquidar.setBackground(new java.awt.Color(15, 34, 38));
        jButtonlLiquidar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonlLiquidar.setForeground(new java.awt.Color(217, 189, 50));
        jButtonlLiquidar.setText("LIQUIDAR");
        jButtonlLiquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlLiquidarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonlLiquidar);
        jButtonlLiquidar.setBounds(530, 510, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
       Nómina nomina = new Nómina();
       nomina.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed
    private void jButtonlLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlLiquidarActionPerformed
        NuevaNómina nomina2 = new NuevaNómina();
        if (jTextFieldNombres.getText().isEmpty()||jTextFieldApellidos.getText().isEmpty()||jTextFieldSalario.getText().isEmpty()||jTextFieldDíasTrabajados.getText().isEmpty()||jTextFieldIdentificación.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Porfavor complete todos los espacios");
        }else{
            try {
                File fichero = new File("c:/Fichero");
                if (!fichero.exists()){
                    fichero.mkdirs();
                }
                String salida = ("C:/Fichero/Nómina.txt");
                FileWriter fw = new FileWriter(salida,true);
                fw.write("---------------------------------------------------------\n");
                fw.write("Nombres del empleado: "+jTextFieldNombres.getText()+"\n");
                fw.write("Apellidos del empleado: "+jTextFieldApellidos.getText()+"\n");
                fw.write("Identificación del empleado: "+jTextFieldIdentificación.getText()+"\n");
                salarioint = Integer.parseInt(jTextFieldSalario.getText());
                diasint = Integer.parseInt(jTextFieldDíasTrabajados.getText());
                if (salarioint <= 2000000){
                    devengado = ((salarioint/30)*(diasint));
                    transporte = ((117172/30)*(diasint));
                    total_devengado = ((devengado)+(transporte));
                    salud = (int) (total_devengado*0.04);
                    pension = (int) (total_devengado*0.04);
                    pago_total = ((total_devengado)-(salud+pension));
                    fw.write("devengado: "+total_devengado+"\n"+"pago total: "+pago_total+"\n");
                    fw.write("---------------------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Empleado Liquidado");
                    nomina2.setVisible(true);
                    fw.close();
                    dispose();
                }else {
                    devengado = ((salarioint / 30) * (diasint));
                    salud =  (int) (0.1*devengado);
                    pension = (int) (devengado*0.1);
                    pago_total = ((devengado) - (salud+pension));
                    fw.write("devengado: "+devengado+"\n"+"pago total: "+pago_total+"\n");
                    fw.write("---------------------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Empleado Liquidado");
                    nomina2.setVisible(true);
                    fw.close();
                    dispose();
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonlLiquidarActionPerformed
    private void jTextFieldNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyTyped
        String nombre = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonlLiquidar.doClick();
        }
        if(!(nombre.matches("[A-zÑ-ñ ]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldNombresKeyTyped
    private void jTextFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyTyped
        String apellido = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonlLiquidar.doClick();
        }
        if(!(apellido.matches("[A-zÑ-ñ ]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldApellidosKeyTyped
    private void jTextFieldSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyTyped
        String salario = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonlLiquidar.doClick();
        }
        if(!(salario.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldSalarioKeyTyped
    private void jTextFieldDíasTrabajadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDíasTrabajadosKeyTyped
        String nombre = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonlLiquidar.doClick();
        }
        if(!(nombre.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldDíasTrabajadosKeyTyped
    private void jTextFieldIdentificaciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdentificaciónKeyTyped
        String nombre = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonlLiquidar.doClick();
        }
        if(!(nombre.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldIdentificaciónKeyTyped
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
            java.util.logging.Logger.getLogger(NuevaNómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaNómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaNómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaNómina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaNómina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonlLiquidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDíasTrabajados;
    private javax.swing.JTextField jTextFieldIdentificación;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
