/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lm.view;

import br.com.lm.controller.ControladorAgencia;
import br.com.lm.controller.ControladorCliente;
import br.com.lm.controller.ControladorContaCorrente;
import br.com.lm.model.Agencia;
import br.com.lm.model.Cliente;
import br.com.lm.model.ContaCorrente;
import br.com.lm.utilitarios.Mensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leone.pizzoli
 */
public class TelaCadastraContaCorrente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraConta
     */
    public TelaCadastraContaCorrente() {
        super("Cadastrar Conta");
        initComponents();
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaAgencia = new javax.swing.JLabel();
        jtfAgencia = new javax.swing.JTextField();
        jlaCliente = new javax.swing.JLabel();
        jtfCliente = new javax.swing.JTextField();
        jlaSaldo = new javax.swing.JLabel();
        jtfSaldo = new javax.swing.JTextField();
        jbuCadastrar = new javax.swing.JButton();
        jbuSair = new javax.swing.JButton();
        jlaConta = new javax.swing.JLabel();
        jtfConta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlaAgencia.setText("N° Agencia:");

        jtfAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAgenciaActionPerformed(evt);
            }
        });

        jlaCliente.setText("ID Cliente:");

        jtfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteActionPerformed(evt);
            }
        });

        jlaSaldo.setText("Saldo:");

        jbuCadastrar.setText("Cadastrar");
        jbuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuCadastrarActionPerformed(evt);
            }
        });

        jbuSair.setText("Sair");
        jbuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSairActionPerformed(evt);
            }
        });

        jlaConta.setText("N° Conta");

        jtfConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContaActionPerformed(evt);
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
                        .addComponent(jbuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlaConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfConta)
                                .addComponent(jtfAgencia, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(jtfCliente)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfConta)
                    .addComponent(jlaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSaldo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuSair)
                    .addComponent(jbuCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ContaCorrente conta;
    ControladorContaCorrente ctrlConta;

    Agencia agencia;
    ControladorAgencia ctrlAgen;

    Cliente cliente;
    ControladorCliente ctrlCli;

    public void preencherObjetos() {

        conta = new ContaCorrente();
        ctrlConta = new ControladorContaCorrente();

        agencia = new Agencia();
        ctrlAgen = new ControladorAgencia();

        cliente = new Cliente();
        ctrlCli = new ControladorCliente();

        conta.setSaldo(Double.parseDouble(jtfSaldo.getText()));
       
        agencia.setCodigo(Long.parseLong(jtfAgencia.getText()));
        conta.setAgencia(ctrlAgen.pegarAgencia(agencia).getNome());

        cliente.setCodigo(Long.parseLong(jtfCliente.getText()));
        conta.setCliente(ctrlCli.pegarCliente(cliente).getNome());

    }
    private void jtfAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAgenciaActionPerformed
        jtfAgencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherObjetos();

            }
        });
    }//GEN-LAST:event_jtfAgenciaActionPerformed

    private void jbuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbuSairActionPerformed

    private void jbuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuCadastrarActionPerformed
        preencherObjetos();
        try {
            if (agencia != null) {
                ctrlConta.incluir(conta);
                Mensagem.showMsg("Incluída com sucesso! \nSeu n° de conta é: " + conta.getNroContaCorrente());
            } else {
                Mensagem.showMsg("Não pode ser incluida");
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_jbuCadastrarActionPerformed

    private void jtfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteActionPerformed
        jtfCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherObjetos();

            }
        });
    }//GEN-LAST:event_jtfClienteActionPerformed

    private void jtfContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContaActionPerformed
        jtfConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           preencherObjetos();
            }
        });
    }//GEN-LAST:event_jtfContaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastraContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastraContaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuCadastrar;
    private javax.swing.JButton jbuSair;
    private javax.swing.JLabel jlaAgencia;
    private javax.swing.JLabel jlaCliente;
    private javax.swing.JLabel jlaConta;
    private javax.swing.JLabel jlaSaldo;
    private javax.swing.JTextField jtfAgencia;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfConta;
    private javax.swing.JTextField jtfSaldo;
    // End of variables declaration//GEN-END:variables
}
