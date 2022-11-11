package Inerfaz;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ImpresiónDeCarné extends javax.swing.JFrame {
    PrintWriter salida = null;//Imprime en archivo externo
    int codigoAprendiz;
    public ImpresiónDeCarné(String nombre, String apellido, int edad) {
    }
    public int getCodigoAprendiz() {
        return codigoAprendiz;
    }
    public void setCodigoAprendiz(int codigoAprendiz) {
        this.codigoAprendiz = codigoAprendiz;
    }
    public ImpresiónDeCarné() {
        initComponents();
    }
    int codigoRandom() {
        int codigo = (int) (Math.random() * 999999999);
        return codigo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldEdadImpresiónCarné = new javax.swing.JTextField();
        jButtonGenerarCarné = new javax.swing.JButton();
        jLabelTituloImpresiónCarné = new javax.swing.JLabel();
        jLabelNombresImpresiónCarné = new javax.swing.JLabel();
        jLabelApellidosImpresiónCarné = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNombresImpresiónCarné = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldApellidosImpresiónCarné = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(90, 131, 140));
        jPanel1.setLayout(null);

        jTextFieldEdadImpresiónCarné.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEdadImpresiónCarnéKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldEdadImpresiónCarné);
        jTextFieldEdadImpresiónCarné.setBounds(280, 400, 320, 50);

        jButtonGenerarCarné.setBackground(new java.awt.Color(15, 34, 38));
        jButtonGenerarCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonGenerarCarné.setForeground(new java.awt.Color(217, 189, 50));
        jButtonGenerarCarné.setText("GENERAR");
        jButtonGenerarCarné.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarCarnéActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGenerarCarné);
        jButtonGenerarCarné.setBounds(470, 520, 130, 40);

        jLabelTituloImpresiónCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelTituloImpresiónCarné.setForeground(new java.awt.Color(15, 34, 38));
        jLabelTituloImpresiónCarné.setText("IMPRESIÓN DE CARNE");
        jPanel1.add(jLabelTituloImpresiónCarné);
        jLabelTituloImpresiónCarné.setBounds(160, 40, 381, 92);

        jLabelNombresImpresiónCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelNombresImpresiónCarné.setForeground(new java.awt.Color(217, 189, 50));
        jLabelNombresImpresiónCarné.setText("NOMBRES");
        jPanel1.add(jLabelNombresImpresiónCarné);
        jLabelNombresImpresiónCarné.setBounds(110, 180, 134, 59);

        jLabelApellidosImpresiónCarné.setBackground(new java.awt.Color(217, 189, 50));
        jLabelApellidosImpresiónCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelApellidosImpresiónCarné.setForeground(new java.awt.Color(217, 189, 50));
        jLabelApellidosImpresiónCarné.setText("APELLIDOS");
        jPanel1.add(jLabelApellidosImpresiónCarné);
        jLabelApellidosImpresiónCarné.setBounds(100, 290, 134, 59);

        jLabelEdad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(217, 189, 50));
        jLabelEdad.setText("EDAD");
        jPanel1.add(jLabelEdad);
        jLabelEdad.setBounds(120, 390, 78, 57);

        jPanel2.setBackground(new java.awt.Color(15, 34, 38));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(270, 390, 340, 70);

        jPanel3.setBackground(new java.awt.Color(15, 34, 38));
        jPanel3.setLayout(null);

        jTextFieldNombresImpresiónCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jTextFieldNombresImpresiónCarné.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombresImpresiónCarnéKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldNombresImpresiónCarné);
        jTextFieldNombresImpresiónCarné.setBounds(10, 10, 320, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(270, 170, 340, 70);

        jPanel4.setBackground(new java.awt.Color(15, 34, 38));
        jPanel4.setLayout(null);

        jTextFieldApellidosImpresiónCarné.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jTextFieldApellidosImpresiónCarné.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosImpresiónCarnéKeyTyped(evt);
            }
        });
        jPanel4.add(jTextFieldApellidosImpresiónCarné);
        jTextFieldApellidosImpresiónCarné.setBounds(10, 10, 320, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(270, 280, 340, 70);

        jPanel5.setBackground(new java.awt.Color(115, 2, 23));
        jPanel1.add(jPanel5);
        jPanel5.setBounds(100, 190, 130, 40);

        jPanel6.setBackground(new java.awt.Color(115, 2, 23));
        jPanel1.add(jPanel6);
        jPanel6.setBounds(90, 300, 140, 40);

        jPanel7.setBackground(new java.awt.Color(115, 2, 23));
        jPanel1.add(jPanel7);
        jPanel7.setBounds(110, 400, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonGenerarCarnéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarCarnéActionPerformed
        if (jTextFieldApellidosImpresiónCarné.getText().isEmpty()||jTextFieldNombresImpresiónCarné.getText().isEmpty()||jTextFieldEdadImpresiónCarné.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor complete todos los espacios");
        }else{
            JOptionPane.showMessageDialog(null, "Ha impreso el carné en un archivo txt");
            String Opción = JOptionPane.showInputDialog("¿Desea ver el carné? Ingrese SI O NO", null);
            if ("SI".equalsIgnoreCase(Opción)){
                LecturaCarné lecturacarné = new LecturaCarné();
                lecturacarné.setVisible(true);
                dispose();
                }else{
                    Menú menú = new Menú();
                    menú.setVisible(true);
                    dispose();
                }
        }
        try {
            File fichero = new File ("c:/Fichero");
            if (!fichero.exists()){
                fichero.mkdirs();
            }
            salida = new PrintWriter("C:/Fichero/Datos.txt");//objeto creado (Abierto) crea el archivo txt, necesita una ruta de acceso como parametro
            salida.println("_________________________SENA_______________________");
            salida.println("Nombre del aprendiz :" + jTextFieldNombresImpresiónCarné.getText());
            salida.println("Apellidos: " + jTextFieldApellidosImpresiónCarné.getText());
            salida.println("Código del Aprendiz: " + getCodigoAprendiz());
            salida.println("Edad: " + jTextFieldEdadImpresiónCarné.getText());
            salida.println("_________________________2022_______________________");
            salida.flush();
            salida.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonGenerarCarnéActionPerformed
    private void jTextFieldNombresImpresiónCarnéKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresImpresiónCarnéKeyTyped
        String nombre = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonGenerarCarné.doClick();
        }
        if(!(nombre.matches("[A-zÑ-ñ ]"))){
            evt.consume();
            getToolkit().beep();
        }
            
    }//GEN-LAST:event_jTextFieldNombresImpresiónCarnéKeyTyped
    private void jTextFieldApellidosImpresiónCarnéKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosImpresiónCarnéKeyTyped
        String apellido = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonGenerarCarné.doClick();
        }
        if(!(apellido.matches("[A-zÑ-ñ ]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldApellidosImpresiónCarnéKeyTyped
    private void jTextFieldEdadImpresiónCarnéKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEdadImpresiónCarnéKeyTyped
        String edad = String.valueOf(evt.getKeyChar());
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            jButtonGenerarCarné.doClick();
        }
        if(!(edad.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldEdadImpresiónCarnéKeyTyped
    public static void main(String args[]) {      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImpresiónDeCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpresiónDeCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpresiónDeCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpresiónDeCarné.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpresiónDeCarné().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerarCarné;
    private javax.swing.JLabel jLabelApellidosImpresiónCarné;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombresImpresiónCarné;
    private javax.swing.JLabel jLabelTituloImpresiónCarné;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextFieldApellidosImpresiónCarné;
    private javax.swing.JTextField jTextFieldEdadImpresiónCarné;
    private javax.swing.JTextField jTextFieldNombresImpresiónCarné;
    // End of variables declaration//GEN-END:variables

}
