/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    Cronometro o = new Cronometro();
    public String horaIngreso = "";
    public String horaSalida = "";
    public String Juego="";
    public int hora;
    public int minuto;
    public int num=1;
    public String pago="";
    DefaultTableModel tableModel;
    
    String[] cabecera={"N°","Hora de Inicio","Hora de Salida","Hora/Minutos","Pago","Juego"};
    String[][] data={};
    
    int xMouse, yMouse;
    
    public void TablaLimpia() {
        tblRegistro.getColumnModel().getColumn(0).setResizable(false);
        tblRegistro.getColumnModel().getColumn(1).setResizable(false);
        tblRegistro.getColumnModel().getColumn(2).setResizable(false);
        tblRegistro.getColumnModel().getColumn(3).setResizable(false);
        tblRegistro.getColumnModel().getColumn(4).setResizable(false);
        tblRegistro.getColumnModel().getColumn(5).setResizable(false);
        tblRegistro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblRegistro.getTableHeader().setOpaque(false);
        tblRegistro.getTableHeader().setBackground(new Color(0, 51, 51));
        tblRegistro.getTableHeader().setForeground(Color.WHITE);
        tblRegistro.setRowHeight(25);
    }
    
    public void Tabla(){
        tblRegistro.getTableHeader().setForeground(Color.WHITE);
        tblRegistro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblRegistro.getColumnModel().getColumn(0).setResizable(false);
        tblRegistro.getColumnModel().getColumn(1).setResizable(false);
        tblRegistro.getColumnModel().getColumn(2).setResizable(false);
        tblRegistro.getColumnModel().getColumn(3).setResizable(false);
        tblRegistro.getColumnModel().getColumn(4).setResizable(false);
        tblRegistro.getColumnModel().getColumn(5).setResizable(false);
    }

    public Inicio() {
        initComponents();
        tableModel = new DefaultTableModel(data, cabecera);
        tblRegistro.setModel(tableModel);
        Tabla();
        this.setLocationRelativeTo(null);
        this.setTitle("TubyPLAY");
        ImageIcon icono = new ImageIcon("src/img/Trans.png");
        setIconImage(icono.getImage());
    }

    

    public void Hora() {
        horaIngreso = txtInicio.getText();
        horaSalida = txtSalida.getText();
        Juego = cbxJuego.getSelectedItem().toString();

        try {
            DateFormat format = new SimpleDateFormat("HH:mm");
            Date fechaIngreso = format.parse(horaIngreso);
            Date fechaSalida = format.parse(horaSalida);

            long diferenciaMilisegundos = fechaSalida.getTime() - fechaIngreso.getTime();
            int horas = (int) (diferenciaMilisegundos / (1000 * 60 * 60));
            int minutos = (int) ((diferenciaMilisegundos / (1000 * 60)) % 60);
                      
            hora = horas;
            minuto = minutos;
           
            if (hora == 1) {
                pago = "S/8.00";
            }
            if (hora == 2) {
                pago = "S/16.00";
            }
            if (hora == 3) {
                pago = "S/18.00";
            }
            if (minuto == 30) {
                pago = "S/4.00";
            }

            if (hora == 1 && minuto == 30) {
                pago = "12.00";
            }

            if (hora == 2 && minuto == 30) {
                pago = "20.00";
            }

            Object[] rowData = {num, horaIngreso, horaSalida, hora + ":" + minutos, pago, Juego};
            tableModel.addRow(rowData);
            num++;

            
        } catch (ParseException e) {
            e.printStackTrace();
        }

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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        cbxJuego = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTROL DE PLAY ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo de Inicio:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiempo de Salida:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Juego:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        txtInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtInicio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 18, 135, -1));

        txtSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtSalida.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 48, 135, -1));

        cbxJuego.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxJuego.setForeground(new java.awt.Color(255, 255, 255));
        cbxJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONAR--", "FIFA", "PESP", "MK", "COD" }));
        jPanel3.add(cbxJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 85, 132, -1));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 14, 155, -1));

        tblRegistro = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        tblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        tblRegistro.setForeground(new java.awt.Color(0, 0, 0));
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Hora de Inicio", "Hora de Salida", "Hora/Minutos", "Pago", "Juego"
            }
        ));
        tblRegistro.setFocusable(false);
        tblRegistro.setRowHeight(25);
        tblRegistro.setRowMargin(0);
        tblRegistro.setSelectionBackground(new java.awt.Color(0, 0, 51));
        tblRegistro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRegistro);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 820, 260));

        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 50, 155, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRO DEL DIA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 187, 36));

        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MINIMIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 85, 155, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Hora();
        o.h = hora;
        o.m = minuto;
        o.setVisible(true);
        o.t.start();
        o.btnStart.setEnabled(false);
        o.btnPause.setEnabled(true);
        o.btnStop.setEnabled(true);
        txtInicio.setText(null);
        txtSalida.setText(null);
        cbxJuego.setSelectedIndex(0);
        TablaLimpia();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                    UIManager.put("nimbusBlueGrey", new Color(0, 51, 51));
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxJuego;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/tubynet.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}