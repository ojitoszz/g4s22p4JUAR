package g4s22p4JUAR;
public class FrmPrincipal extends javax.swing.JFrame {
    public FrmPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ISuma = new javax.swing.JMenuItem();
        IResta = new javax.swing.JMenuItem();
        IMultiplicacion = new javax.swing.JMenuItem();
        IDivicion = new javax.swing.JMenuItem();
        IRaizcuadrada = new javax.swing.JMenuItem();
        IAcerca = new javax.swing.JMenu();
        IAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpprincipal.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout dpprincipalLayout = new javax.swing.GroupLayout(dpprincipal);
        dpprincipal.setLayout(dpprincipalLayout);
        dpprincipalLayout.setHorizontalGroup(
            dpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        dpprincipalLayout.setVerticalGroup(
            dpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Operaciones ");

        ISuma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ISuma.setText("Suma");
        ISuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISumaActionPerformed(evt);
            }
        });
        jMenu1.add(ISuma);

        IResta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        IResta.setText("Resta");
        IResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRestaActionPerformed(evt);
            }
        });
        jMenu1.add(IResta);

        IMultiplicacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        IMultiplicacion.setText("Multiplicacion");
        IMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMultiplicacionActionPerformed(evt);
            }
        });
        jMenu1.add(IMultiplicacion);

        IDivicion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        IDivicion.setText("Divicion");
        IDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDivicionActionPerformed(evt);
            }
        });
        jMenu1.add(IDivicion);

        IRaizcuadrada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        IRaizcuadrada.setText("Raiz cuadrada");
        IRaizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRaizcuadradaActionPerformed(evt);
            }
        });
        jMenu1.add(IRaizcuadrada);

        jMenuBar1.add(jMenu1);

        IAcerca.setText("Acerca de");

        IAcercade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        IAcercade.setText("Desarollador");
        IAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAcercadeActionPerformed(evt);
            }
        });
        IAcerca.add(IAcercade);

        jMenuBar1.add(IAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMultiplicacionActionPerformed
         FrmMultiplicacion frmmultiplicacion =new FrmMultiplicacion();
         frmmultiplicacion.setVisible(true);
         dpprincipal.add(frmmultiplicacion);
    }//GEN-LAST:event_IMultiplicacionActionPerformed

    private void IAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IAcercadeActionPerformed
        FrmDesarrollador frmdesarrollador = new FrmDesarrollador();
        frmdesarrollador.setVisible(true);
         dpprincipal.add(frmdesarrollador);
    }//GEN-LAST:event_IAcercadeActionPerformed

    private void ISumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISumaActionPerformed
         FrmSuma frmsuma = new FrmSuma();
         frmsuma.setVisible(true);
         dpprincipal.add(frmsuma);
    }//GEN-LAST:event_ISumaActionPerformed

    private void IRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRestaActionPerformed
        FrmResta frmresta =new FrmResta();
        frmresta.setVisible(true);
         dpprincipal.add(frmresta);
    }//GEN-LAST:event_IRestaActionPerformed

    private void IDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDivicionActionPerformed
        FrmDivicion frmdicion =new FrmDivicion();
        frmdicion.setVisible(true);
         dpprincipal.add(frmdicion);
    }//GEN-LAST:event_IDivicionActionPerformed

    private void IRaizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRaizcuadradaActionPerformed
        FrmRaizcuadrada frmraizcuadrada =new FrmRaizcuadrada();
        frmraizcuadrada.setVisible(true);
         dpprincipal.add(frmraizcuadrada);
    }//GEN-LAST:event_IRaizcuadradaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu IAcerca;
    private javax.swing.JMenuItem IAcercade;
    private javax.swing.JMenuItem IDivicion;
    private javax.swing.JMenuItem IMultiplicacion;
    private javax.swing.JMenuItem IRaizcuadrada;
    private javax.swing.JMenuItem IResta;
    private javax.swing.JMenuItem ISuma;
    private javax.swing.JDesktopPane dpprincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
