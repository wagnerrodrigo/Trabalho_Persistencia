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
public class Principal extends javax.swing.JInternalFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Cadas = new javax.swing.JMenu();
        btn_Cadas_Trem = new javax.swing.JMenuItem();
        btn_Cadas_Vagao = new javax.swing.JMenuItem();
        jm_Consulta = new javax.swing.JMenu();

        setTitle("Sistema Transporte Ferroviario");

        jm_Cadas.setText("Cadastrar");

        btn_Cadas_Trem.setText("Trem");
        btn_Cadas_Trem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadas_TremActionPerformed(evt);
            }
        });
        jm_Cadas.add(btn_Cadas_Trem);

        btn_Cadas_Vagao.setText("Vagão");
        jm_Cadas.add(btn_Cadas_Vagao);

        jMenuBar1.add(jm_Cadas);

        jm_Consulta.setText("Consultar");
        jMenuBar1.add(jm_Consulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cadas_TremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadas_TremActionPerformed
        // TODO add your handling code here:
        new Trem().setVisible(true);
    }//GEN-LAST:event_btn_Cadas_TremActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_Cadas_Trem;
    private javax.swing.JMenuItem btn_Cadas_Vagao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jm_Cadas;
    private javax.swing.JMenu jm_Consulta;
    // End of variables declaration//GEN-END:variables
}
