/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import principal.Main;
import reports.RelatoriosOs;
import reports.RelatoriosPecas;
import reports.RelatoriosUsu;
import controller.Control_Ordem_De_Serico;
import controller.Control_Pecas;
import controller.Control_Usuario;
/**
 *
 * @author Bruno
 */
public class tela_atualizar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(tela_atualizar.class.getName());

    /**
     * Creates new form tela_atualizar
     */
    public tela_atualizar() {
        initComponents();
            this.lab_pecas.setVisible(false);
            this.list_pecas.setVisible(false);
            this.jScrollPane4.setVisible(false);
            this.lab_os.setVisible(false);
            this.list_os.setVisible(false);
            this.jScrollPane2.setVisible(false); 
            this.lab_usu.setVisible(false);
            this.list_usuarios.setVisible(false);
            this.jScrollPane1.setVisible(false);
            this.colun_os.setVisible(false);
            this.colun_pecas.setVisible(false);
            this.colun_usuario.setVisible(false);
            
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        var_pecas1 = new javax.swing.JTextPane();
        label_principal = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lab_usu = new javax.swing.JLabel();
        lab_pecas = new javax.swing.JLabel();
        list_usuarios = new javax.swing.JComboBox<>();
        list_pecas = new javax.swing.JComboBox<>();
        list_os = new javax.swing.JComboBox<>();
        colun_usuario = new javax.swing.JComboBox<>();
        colun_pecas = new javax.swing.JComboBox<>();
        colun_os = new javax.swing.JComboBox<>();
        atualizar = new javax.swing.JButton();
        boxPecas = new javax.swing.JCheckBox();
        boxOs = new javax.swing.JCheckBox();
        boxUsuario = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        var_usuario = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        var_os = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        var_pecas = new javax.swing.JTextPane();
        lab_os = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jScrollPane3.setViewportView(var_pecas1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_principal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_principal.setText("ATUALIZAÇÃO");

        jButton4.setText("VOLTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lab_usu.setText("USUARIOS");

        lab_pecas.setText("PEÇAS");

        RelatoriosUsu relat = new RelatoriosUsu();
        list_usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(relat.vw_usuarios()));

        RelatoriosPecas relat1 = new RelatoriosPecas();
        list_pecas.setModel(new javax.swing.DefaultComboBoxModel<>(relat1.relat_PecasSimp()));

        RelatoriosOs relat2 = new RelatoriosOs();
        list_os.setModel(new javax.swing.DefaultComboBoxModel<>(relat2.relat_OsSimp()));

        colun_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME","CPF","TELEFONE","TIPO","MOTO_MODELO","MOTO_ANO" ,"MOTO_PLACA" }));

        colun_pecas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME","VALOR_PECAS","UNIDADE","QUANTIDADE","VALOR_UNIDADE","TIPO_ELEMENTO"
        }));

        colun_os.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STATUS","ID_FUNCIONARIO","ID_CLIENTE","CARGA_HORARIA","VALOR_PECAS","VALOR_HH","VALOR_TOTAL","OBSERVACAO" }));

        atualizar.setText("ATUALIZAR");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        boxPecas.setText("PEÇAS");
        boxPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPecasActionPerformed(evt);
            }
        });

        boxOs.setText("O.S");
        boxOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOsActionPerformed(evt);
            }
        });

        boxUsuario.setText("USUARIO");
        boxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUsuarioActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(var_usuario);

        jScrollPane2.setViewportView(var_os);

        jScrollPane4.setViewportView(var_pecas);

        lab_os.setText("OS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(boxUsuario)
                        .addGap(80, 80, 80)
                        .addComponent(boxPecas)
                        .addGap(97, 97, 97)
                        .addComponent(boxOs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lab_pecas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lab_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lab_os)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_usuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, 339, Short.MAX_VALUE)
                            .addComponent(list_os, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list_pecas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colun_os, javax.swing.GroupLayout.Alignment.TRAILING, 0, 97, Short.MAX_VALUE)
                            .addComponent(colun_pecas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colun_usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxUsuario)
                    .addComponent(boxOs)
                    .addComponent(boxPecas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_usu)
                    .addComponent(list_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colun_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_pecas)
                            .addComponent(list_pecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(colun_pecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_os, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colun_os, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_os))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(atualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       tela_main tela = new tela_main();
       tela.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boxPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPecasActionPerformed
        if(this.boxPecas.isSelected()){
            this.lab_pecas.setVisible(true);
            this.list_pecas.setVisible(true);
            this.jScrollPane4.setVisible(true);
             this.colun_pecas.setVisible(true);
        }
        if(!this.boxPecas.isSelected()){
            this.lab_pecas.setVisible(false);
            this.list_pecas.setVisible(false);
            this.jScrollPane4.setVisible(false);
             this.colun_pecas.setVisible(false);
        }
    }//GEN-LAST:event_boxPecasActionPerformed

    private void boxOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOsActionPerformed
        if(this.boxOs.isSelected()){
            this.lab_os.setVisible(true);
            this.list_os.setVisible(true);
            this.jScrollPane2.setVisible(true);
            this.colun_os.setVisible(true);
        }
        if(!this.boxOs.isSelected()){
            this.lab_os.setVisible(false);
            this.list_os.setVisible(false);
            this.jScrollPane2.setVisible(false);
            this.colun_os.setVisible(false);
        }

    }//GEN-LAST:event_boxOsActionPerformed

    private void boxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUsuarioActionPerformed
        if(this.boxUsuario.isSelected()){
            this.lab_usu.setVisible(true);
            this.list_usuarios.setVisible(true);
            this.jScrollPane1.setVisible(true);
            this.colun_usuario.setVisible(true);
        }
         if(!this.boxUsuario.isSelected()){
            this.lab_usu.setVisible(false);
            this.list_usuarios.setVisible(false);
            this.jScrollPane1.setVisible(false);
            this.colun_usuario.setVisible(false);
        }
    }//GEN-LAST:event_boxUsuarioActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        if(this.boxPecas.isSelected()){
            RelatoriosPecas relat1 = new RelatoriosPecas();
           Control_Pecas contPecas=new Control_Pecas();
           String colunaP=colun_pecas.getSelectedItem().toString();
           int id_pecas =Main.extrairID(list_pecas.getSelectedItem().toString());                 
           contPecas.atualizarpecas(id_pecas, colunaP, var_os.getText());           
           list_pecas.setModel(new javax.swing.DefaultComboBoxModel<>(relat1.relat_PecasSimp()));


        }
        
         if(this.boxUsuario.isSelected()){
            RelatoriosUsu relat = new RelatoriosUsu();
            Control_Usuario contUsu=new Control_Usuario();
            String colunaU=colun_usuario.getSelectedItem().toString();
            int id_usu =Main.extrairID(list_usuarios.getSelectedItem().toString());    
            contUsu.atuli_usu(id_usu, colunaU, var_usuario.getText());           
            list_usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(relat.vw_usuarios()));

        }
        
         if(this.boxOs.isSelected()){
          RelatoriosOs relat2 = new RelatoriosOs();
          Control_Ordem_De_Serico contOs =new Control_Ordem_De_Serico();  
          String colunaO=colun_os.getSelectedItem().toString();
          int id_os =Main.extrairID(list_os.getSelectedItem().toString());         
          contOs.atualiazarso(id_os, colunaO, var_os.getText());          
          list_os.setModel(new javax.swing.DefaultComboBoxModel<>(relat2.relat_OsSimp()));
   
        } 
         
    }//GEN-LAST:event_atualizarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new tela_atualizar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JCheckBox boxOs;
    private javax.swing.JCheckBox boxPecas;
    private javax.swing.JCheckBox boxUsuario;
    private javax.swing.JComboBox<String> colun_os;
    private javax.swing.JComboBox<String> colun_pecas;
    private javax.swing.JComboBox<String> colun_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lab_os;
    private javax.swing.JLabel lab_pecas;
    private javax.swing.JLabel lab_usu;
    private javax.swing.JLabel label_principal;
    private javax.swing.JComboBox<String> list_os;
    private javax.swing.JComboBox<String> list_pecas;
    private javax.swing.JComboBox<String> list_usuarios;
    private javax.swing.JTextPane var_os;
    private javax.swing.JTextPane var_pecas;
    private javax.swing.JTextPane var_pecas1;
    private javax.swing.JTextPane var_usuario;
    // End of variables declaration//GEN-END:variables
}
