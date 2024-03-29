/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author wagner
 */
public class Prin extends javax.swing.JFrame {

    /**
     * Creates new form Prin
     */
    public Prin() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Cadas = new javax.swing.JMenu();
        btn_Cadas_Trem = new javax.swing.JMenuItem();
        btn_Cadas_Vagao = new javax.swing.JMenuItem();
        btn_Sair_Sistema = new javax.swing.JMenuItem();
        jm_Consulta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Transporte Ferroviario");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/transporte-ferroviario-setor-debate-inov_7403.jpg"))); // NOI18N

        jm_Cadas.setText("Cadastrar");

        btn_Cadas_Trem.setText("Trem");
        btn_Cadas_Trem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadas_TremActionPerformed(evt);
            }
        });
        jm_Cadas.add(btn_Cadas_Trem);

        btn_Cadas_Vagao.setText("Vagão");
        btn_Cadas_Vagao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadas_VagaoActionPerformed(evt);
            }
        });
        jm_Cadas.add(btn_Cadas_Vagao);

        btn_Sair_Sistema.setText("Sair do Sistema");
        btn_Sair_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sair_SistemaActionPerformed(evt);
            }
        });
        jm_Cadas.add(btn_Sair_Sistema);

        jMenuBar1.add(jm_Cadas);

        jm_Consulta.setText("Informações");

        jMenuItem1.setText("Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_Consulta.add(jMenuItem1);

        jMenuBar1.add(jm_Consulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cadas_TremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadas_TremActionPerformed
        // TODO add your handling code here:
        new Trem().setVisible(true);
    }//GEN-LAST:event_btn_Cadas_TremActionPerformed

    private void btn_Cadas_VagaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadas_VagaoActionPerformed
        // TODO add your handling code here:
        new Vagao().setVisible(true);
    }//GEN-LAST:event_btn_Cadas_VagaoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Consulta().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_Sair_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sair_SistemaActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btn_Sair_SistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_Cadas_Trem;
    private javax.swing.JMenuItem btn_Cadas_Vagao;
    private javax.swing.JMenuItem btn_Sair_Sistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jm_Cadas;
    private javax.swing.JMenu jm_Consulta;
    // End of variables declaration//GEN-END:variables
}
