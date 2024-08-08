package PRINCIPAL;
import javax.swing.JLabel;
public class CARRIL_ANÁLOGO extends javax.swing.JFrame {
    public CARRIL_ANÁLOGO() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public JLabel getPrimerauto(){
        return primer_auto;
    }
    public JLabel getSegundoauto(){
        return segundo_auto;
    }
    public JLabel getextremo(){
        return extremo;
    }
    public static int vf1;
    public static int vf2;
    public static double tiemp1;
    public static String tchoque;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        primer_auto = new javax.swing.JLabel();
        segundo_auto = new javax.swing.JLabel();
        extremo = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        btn_retroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        primer_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/carro 1 (1).png"))); // NOI18N

        segundo_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/carro 1 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(primer_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(segundo_auto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addComponent(extremo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(extremo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(segundo_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primer_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        btn_iniciar.setText("INICIAR");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_retroceder.setText("RETROCEDER");
        btn_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrocederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
    SIMULACION s = new SIMULACION();
    vf1 = (int)(s.vo1 + s.acel1*(s.temp));
    vf2 = (int)(s.vo2 + s.acel2*(s.temp));
    tiemp1 = ((-(vf1-vf2)+Math.sqrt(Math.pow((vf1-vf2),2)-2*(s.acel1-s.acel2)*(-s.dist)))/(s.acel1-s.acel2));
    int vfo1 =(int)(vf1+tiemp1*s.acel1);
    int vfo2 =(int)(vf2+tiemp1*s.acel2);
    int v_choquef1 = (int)(((s.masa1-s.masa2)/(s.masa1+s.masa2))*(vfo1));
    int v_choquef2 = (int)((2*s.masa1/(s.masa1+s.masa2))*(vfo2));
    int e = (v_choquef1-v_choquef2)/(vfo1-vfo2);
    if(0<e && e<1){
    tchoque = "un choque inelástico";
    }else if(e==0){
    tchoque = "un choque completamente inelástico";
    }else{
    tchoque = "un choque elástico";
    }
    primer_auto.setLocation(2,primer_auto.getLocation().y);
    segundo_auto.setLocation(373,segundo_auto.getLocation().y);
    analogo1 auto1 = new analogo1(primer_auto,this);
    analogo2 auto2 = new analogo2(segundo_auto,this);
    auto1.start();
    auto2.start();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retrocederActionPerformed
    MENU r = new MENU();
    r.setVisible(true);
    dispose();
    }//GEN-LAST:event_btn_retrocederActionPerformed

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
            java.util.logging.Logger.getLogger(CARRIL_ANÁLOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARRIL_ANÁLOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARRIL_ANÁLOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARRIL_ANÁLOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARRIL_ANÁLOGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_retroceder;
    private javax.swing.JLabel extremo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel primer_auto;
    private javax.swing.JLabel segundo_auto;
    // End of variables declaration//GEN-END:variables
}
