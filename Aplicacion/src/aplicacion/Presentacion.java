/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Presentacion extends javax.swing.JFrame {
    Calculadora miCalGra;

    /**
     * Creates new form Presentacion
     */
    public Presentacion() {
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

        jTextField1 = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        numer = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        divi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        sec = new javax.swing.JButton();
        csc = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        asin = new javax.swing.JButton();
        acos = new javax.swing.JButton();
        atan = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numero.setText("Número 1");

        numer.setText("Número 2");

        suma.setText("+");
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumaMouseClicked(evt);
            }
        });
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaMouseClicked(evt);
            }
        });
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multi.setText("*");
        multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiMouseClicked(evt);
            }
        });
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        divi.setText("/");
        divi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diviMouseClicked(evt);
            }
        });
        divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diviActionPerformed(evt);
            }
        });

        jLabel1.setText("RESULTADO");

        sin.setText("Seno");
        sin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinMouseClicked(evt);
            }
        });

        cos.setText("Coseno");
        cos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cosMouseClicked(evt);
            }
        });
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setText("Tangente");
        tan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tanMouseClicked(evt);
            }
        });

        sec.setText("Secante");
        sec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secMouseClicked(evt);
            }
        });

        csc.setText("Cosecante");
        csc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cscMouseClicked(evt);
            }
        });

        cot.setText("Cotangente");
        cot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cotMouseClicked(evt);
            }
        });

        asin.setText("arcoSeno");
        asin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asinMouseClicked(evt);
            }
        });

        acos.setText("arcoCoseno");
        acos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acosMouseClicked(evt);
            }
        });
        acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosActionPerformed(evt);
            }
        });

        atan.setText("arcoTangente");
        atan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numer)
                            .addComponent(numero)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suma)
                            .addComponent(sin))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cos)
                                .addGap(18, 18, 18)
                                .addComponent(tan)
                                .addGap(26, 26, 26)
                                .addComponent(sec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(csc)
                                .addGap(18, 18, 18)
                                .addComponent(cot)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asin)
                                .addGap(86, 86, 86)
                                .addComponent(acos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(resta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multi)
                                .addGap(88, 88, 88)
                                .addComponent(divi)))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numer)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cot)
                    .addComponent(csc)
                    .addComponent(sec)
                    .addComponent(tan)
                    .addComponent(sin)
                    .addComponent(cos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asin)
                    .addComponent(acos)
                    .addComponent(atan))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suma)
                            .addComponent(resta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divi)
                            .addComponent(multi))
                        .addGap(36, 36, 36)
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiActionPerformed

    private void diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diviActionPerformed

    private void sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMouseClicked
        String x= n1.getText();
        double x1=Double.parseDouble(x);
        String y= n2.getText();
        double y1=Double.parseDouble(y);
        res.setText(String.valueOf(miCalGra.suma(x1, y1)));        // TODO add your handling code here:
    }//GEN-LAST:event_sumaMouseClicked

    private void diviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diviMouseClicked
        String x= n1.getText();
        double x1=Double.parseDouble(x);
        String y= n2.getText();
        double y1=Double.parseDouble(y);
        res.setText(String.valueOf(miCalGra.division(x1, y1)));           // TODO add your handling code here:
    }//GEN-LAST:event_diviMouseClicked

    private void multiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiMouseClicked
        String x= n1.getText();
        double x1=Double.parseDouble(x);
        String y= n2.getText();
        double y1=Double.parseDouble(y);
        res.setText(String.valueOf(miCalGra.multiplicacion(x1, y1)));         // TODO add your handling code here:
    }//GEN-LAST:event_multiMouseClicked

    private void restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseClicked
        String x= n1.getText();
        double x1=Double.parseDouble(x);
        String y= n2.getText();
        double y1=Double.parseDouble(y);
        res.setText(String.valueOf(miCalGra.resta(x1, y1)));          // TODO add your handling code here:
    }//GEN-LAST:event_restaMouseClicked

    private void sinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinMouseClicked
        String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.seno(x1))); 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_sinMouseClicked

    private void cosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cosMouseClicked
       String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.coseno(x1)));  // TODO add your handling code here:
    }//GEN-LAST:event_cosMouseClicked

    private void tanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanMouseClicked
         String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.tangente(x1)));// TODO add your handling code here:
    }//GEN-LAST:event_tanMouseClicked

    private void secMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secMouseClicked
       String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.secante(x1))); // TODO add your handling code here:
    }//GEN-LAST:event_secMouseClicked

    private void cscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cscMouseClicked
        String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.cosecante(x1)));// TODO add your handling code here:
    }//GEN-LAST:event_cscMouseClicked

    private void cotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cotMouseClicked
        String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.cotangente(x1)));// TODO add your handling code here:
    }//GEN-LAST:event_cotMouseClicked

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosActionPerformed

    private void asinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asinMouseClicked
      String x = n1.getText();
        double x1=Double.parseDouble(x);
              if(x1>1 ||x1<-1){
            JOptionPane.showMessageDialog(null, "error, numero 1 no válido debe estar entre 1 y -1");
        }else{
        res.setText(String.valueOf(miCalGra.arcoseno(x1)));
              }// TODO add your handling code here:
    }//GEN-LAST:event_asinMouseClicked

    private void acosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acosMouseClicked
       String x = n1.getText();
        double x1=Double.parseDouble(x);
        if(x1>1 ||x1<-1){
            JOptionPane.showMessageDialog(null, "error, numero 1 no válido debe estar entre 1 y -1");
        }else{
        res.setText(String.valueOf(miCalGra.arcocoseno(x1)));
        }// TODO add your handling code here:
    }//GEN-LAST:event_acosMouseClicked

    private void acosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acosActionPerformed

    private void atanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atanMouseClicked
       String x = n1.getText();
        double x1=Double.parseDouble(x);
        res.setText(String.valueOf(miCalGra.arcotangente(x1))); // TODO add your handling code here:
    }//GEN-LAST:event_atanMouseClicked

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
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acos;
    private javax.swing.JButton asin;
    private javax.swing.JButton atan;
    private javax.swing.JButton cos;
    private javax.swing.JButton cot;
    private javax.swing.JButton csc;
    private javax.swing.JButton divi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multi;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JLabel numer;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel res;
    private javax.swing.JButton resta;
    private javax.swing.JButton sec;
    private javax.swing.JButton sin;
    private javax.swing.JButton suma;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables

    private void JoptionPane(String error_numero_1_no_válido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
