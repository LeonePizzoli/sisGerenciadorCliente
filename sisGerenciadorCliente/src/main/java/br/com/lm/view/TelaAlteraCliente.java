/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lm.view;

import br.com.lm.controller.ControladorCliente;
import br.com.lm.model.Cliente;
import br.com.lm.utilitarios.Mensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leone.pizzoli
 */
public class TelaAlteraCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlteraCliente
     */
    public TelaAlteraCliente() {
        super("Alterar Cadastro");
        initComponents();
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
    Cliente cliente;
    ControladorCliente ctrlCli;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jlaAltera = new javax.swing.JLabel();
        jlaConfirma = new javax.swing.JLabel();
        jbuAlterar = new javax.swing.JButton();
        jbuCancelar = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jpfConfirma = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlaCodigo.setText("Código:");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jlaNome.setText("Nome:");

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jlaLogin.setText("Login:");

        jlaAltera.setText("Senha:");

        jlaConfirma.setText("Confirma:");

        jbuAlterar.setText("Alterar");
        jbuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAlterarActionPerformed(evt);
            }
        });

        jbuCancelar.setText("Cancelar");
        jbuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuCancelarActionPerformed(evt);
            }
        });

        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        jpfConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jbuAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaAltera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpfConfirma, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfCodigo)
                    .addComponent(jlaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNome)
                    .addComponent(jlaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuAlterar)
                    .addComponent(jbuCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void preencherObjetos(){
        cliente = new Cliente();
        
        cliente.setCodigo(Long.parseLong(jtfCodigo.getText()));
        cliente.setNome(jtfNome.getText());
        cliente.setLogin(jtfLogin.getText());
        cliente.setSenha(jpfSenha.getText());
        cliente.setConfirma(jpfConfirma.getText());
               
    }
    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        jtfNome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           preencherObjetos();
            }
        });
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbuCancelarActionPerformed

    private void jbuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAlterarActionPerformed
        ctrlCli = new ControladorCliente();
        preencherObjetos();
        try{ 
            
            if (cliente.confirmaSenha() == false){
                    Mensagem.showMsg("As senhas não batem");
            }          
            
           if (cliente.validaCliente() == false) {
            Mensagem.showMsg("Não Aterado");
           }else{
                ctrlCli.alterar(cliente);
               Mensagem.showMsg("Alterado!");
           }
        }catch(NullPointerException e){
            Mensagem.showMsg("Erro: "+ e);
        }
        
    }//GEN-LAST:event_jbuAlterarActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
           jtfCodigo.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   preencherObjetos();
               }
           });
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        jpfSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherObjetos();
            }
        });
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jpfConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfConfirmaActionPerformed
            jpfConfirma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
               preencherObjetos();
                }
            });
    }//GEN-LAST:event_jpfConfirmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteraCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuAlterar;
    private javax.swing.JButton jbuCancelar;
    private javax.swing.JLabel jlaAltera;
    private javax.swing.JLabel jlaCodigo;
    private javax.swing.JLabel jlaConfirma;
    private javax.swing.JLabel jlaLogin;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JPasswordField jpfConfirma;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
