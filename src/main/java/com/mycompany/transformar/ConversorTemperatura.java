/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.transformar;

import static com.mycompany.transformar.Conversor.conclusion;
import java.text.DecimalFormat;

public class ConversorTemperatura extends javax.swing.JFrame {

    public static String mensaje;
    public ConversorTemperatura() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Convertir = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Grados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Elige una opcion para convertir");

        Convertir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Convertir.setText("Ok");
        Convertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConvertirMouseClicked(evt);
            }
        });
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cancelar.setText("Cancel");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Grados.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Grados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "grados celsius a fahrenheit", "grados celsius a kelvin", "grados celsius a rankine", "grados kelvin a celsius", "grados kelvin a fahrenheit", "grados kelvin a rankine", "grados fahrenheit a rankine", "grados fahrenheit a kelvin", "grados fahrenheit a celsius" }));
        Grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Grados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Grados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Convertir)
                    .addComponent(Cancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertirActionPerformed

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CancelarMouseClicked

    private void GradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradosActionPerformed

    private void ConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertirMouseClicked
        /*grados celsius a fahrenheit
        grados celsius a kelvin
        grados celsius a rankine
        grados kelvin a celsius
        grados kelvin a fahrenheit
        grados fahrenheit a rankine
        grados fahrenheit a kelvin
        grados fahrenheit a celsius
        */
        
        DecimalFormat df = new DecimalFormat("#.00");
       
        String resultado = "";
    
        int cambio = Grados.getSelectedIndex();
        Temperatura recibe = new Temperatura();
        Double decimal = recibe.temperatura;
        
        if(cambio == 0){
            resultado = df.format((decimal * 9/5)+32);
            mensaje = decimal+" grados celsius son "+resultado+" fahrenheit";
        }
        else if(cambio == 1){
            resultado = df.format(decimal + 273.15);
            mensaje = decimal+" grados celsius son "+resultado+" kelvin";
        }
        else if(cambio == 2){
            resultado = df.format(decimal * 9/5 + 491.67);
            mensaje = decimal+" grados celsius son "+resultado+" rankine";;
        }
        else if(cambio == 3){
            resultado = df.format(decimal - 273.15);
            mensaje = decimal+" grados kelvin son "+resultado+" celsius";;
        }
        else if(cambio == 4){
            resultado = df.format((decimal - 273.15) * 9/5 + 32);
            mensaje = decimal+" grados kelvin son "+resultado+" fahrenheit";;
        }
        else if(cambio == 5){
            resultado = df.format(decimal*1.8);
            mensaje = decimal+" grados kelvin son "+resultado+" rankine";;
        }
        else if(cambio == 6){
            resultado = df.format(decimal + 459.67);
            mensaje = decimal+" grados fahrenheit son "+resultado+" rankine";;
        }
        else if(cambio == 7){
            resultado = df.format((decimal - 32) * 5/9 + 273.15);
            mensaje = decimal+" grados fahrenheit son "+resultado+" kelvin";;
        }
        else if(cambio == 8){
            resultado = df.format((decimal - 32) * 5/9 );
            mensaje = decimal+" grados fahrenheit son "+resultado+" celsius";;
        }
          
        ResultadoTemperatura enviar = new ResultadoTemperatura();
        enviar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConvertirMouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Convertir;
    private javax.swing.JComboBox<String> Grados;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
