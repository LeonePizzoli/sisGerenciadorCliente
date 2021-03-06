/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lm.view;

/**
 *
 * @author leone.pizzoli
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        super("Client Manager");
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

        jmbSisGerenciadorCliente = new javax.swing.JMenuBar();
        jmeCliente = new javax.swing.JMenu();
        jmiCadastrar = new javax.swing.JMenuItem();
        jmiPesquisar = new javax.swing.JMenuItem();
        jmiAlterar = new javax.swing.JMenuItem();
        jmiExcluir = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();
        jmeAgencia = new javax.swing.JMenu();
        jmiIncluir = new javax.swing.JMenuItem();
        jmiBuscar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiDeletar = new javax.swing.JMenuItem();
        jmiListar = new javax.swing.JMenuItem();
        jmeContaCorrente = new javax.swing.JMenu();
        jmiCadastrarConta = new javax.swing.JMenuItem();
        jmiBuscaConta = new javax.swing.JMenuItem();
        jmiAlterarConta = new javax.swing.JMenuItem();
        jmiExcluirConta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmeCliente.setText("Cliente");

        jmiCadastrar.setText("Cadastrar");
        jmiCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarActionPerformed(evt);
            }
        });
        jmeCliente.add(jmiCadastrar);

        jmiPesquisar.setText("Pesquisar");
        jmiPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesquisarActionPerformed(evt);
            }
        });
        jmeCliente.add(jmiPesquisar);

        jmiAlterar.setText("Alterar");
        jmiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarActionPerformed(evt);
            }
        });
        jmeCliente.add(jmiAlterar);

        jmiExcluir.setText("Excluir");
        jmiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirActionPerformed(evt);
            }
        });
        jmeCliente.add(jmiExcluir);

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jmeCliente.add(jmiConsultar);

        jmbSisGerenciadorCliente.add(jmeCliente);

        jmeAgencia.setText("Agencia");

        jmiIncluir.setText("Cadastrar");
        jmiIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIncluirActionPerformed(evt);
            }
        });
        jmeAgencia.add(jmiIncluir);

        jmiBuscar.setText("Pesquisar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jmeAgencia.add(jmiBuscar);

        jmiModificar.setText("Alterar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jmeAgencia.add(jmiModificar);

        jmiDeletar.setText("Excluir");
        jmiDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarActionPerformed(evt);
            }
        });
        jmeAgencia.add(jmiDeletar);

        jmiListar.setText("Consultar");
        jmiListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarActionPerformed(evt);
            }
        });
        jmeAgencia.add(jmiListar);

        jmbSisGerenciadorCliente.add(jmeAgencia);

        jmeContaCorrente.setText("Conta Corrente");

        jmiCadastrarConta.setText("Cadastrar");
        jmiCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarContaActionPerformed(evt);
            }
        });
        jmeContaCorrente.add(jmiCadastrarConta);

        jmiBuscaConta.setText("Pesquisar");
        jmiBuscaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscaContaActionPerformed(evt);
            }
        });
        jmeContaCorrente.add(jmiBuscaConta);

        jmiAlterarConta.setText("Alterar");
        jmiAlterarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarContaActionPerformed(evt);
            }
        });
        jmeContaCorrente.add(jmiAlterarConta);

        jmiExcluirConta.setText("Excluir");
        jmiExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirContaActionPerformed(evt);
            }
        });
        jmeContaCorrente.add(jmiExcluirConta);

        jmbSisGerenciadorCliente.add(jmeContaCorrente);

        setJMenuBar(jmbSisGerenciadorCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jmiCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarActionPerformed
        TelaCadastraCliente telaAddCli = new TelaCadastraCliente();
        telaAddCli.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_jmiCadastrarActionPerformed

    private void jmiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirActionPerformed
        TelaValida telaValida = new TelaValida();
        telaValida.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_jmiExcluirActionPerformed

    private void jmiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarActionPerformed
        TelaAlteraCliente telaAlteraCli = new TelaAlteraCliente();
        telaAlteraCli.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiAlterarActionPerformed

    private void jmiPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesquisarActionPerformed
        TelaBuscaCliente telaPesq = new TelaBuscaCliente();
        telaPesq.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiPesquisarActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        TelaListarClientes viewList = new TelaListarClientes();
        viewList.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIncluirActionPerformed
        TelaCadastraAgencia viewAddAgencia = new TelaCadastraAgencia();
        viewAddAgencia.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiIncluirActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        TelaAlterarAgencia telaAlteraAgencia = new TelaAlterarAgencia();
        telaAlteraAgencia.setVisible(rootPaneCheckingEnabled);   
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarActionPerformed
        TelaExcluirAgencia telaDelAgency = new TelaExcluirAgencia();
        telaDelAgency.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiDeletarActionPerformed

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        TelaBuscarAgencia telaBuscaAgency = new TelaBuscarAgencia();
        telaBuscaAgency.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiBuscarActionPerformed

    private void jmiListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarActionPerformed
        TelaListarAgencias telaListAgencias = new TelaListarAgencias();
        telaListAgencias.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiListarActionPerformed

    private void jmiCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarContaActionPerformed
        TelaCadastraContaCorrente telaAddConta = new TelaCadastraContaCorrente();
        telaAddConta.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiCadastrarContaActionPerformed

    private void jmiAlterarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarContaActionPerformed
        TelaAlteraContaCorrente telaAlteraConta = new TelaAlteraContaCorrente();
        telaAlteraConta.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiAlterarContaActionPerformed

    private void jmiBuscaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscaContaActionPerformed
        TelaBuscaContaCorrente telaBuscaConta = new TelaBuscaContaCorrente();
        telaBuscaConta.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiBuscaContaActionPerformed

    private void jmiExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirContaActionPerformed
        TelaExcluiContaCorrente telaDelConta = new TelaExcluiContaCorrente();
        telaDelConta.setVisible(rootPaneCheckingEnabled);
                
    }//GEN-LAST:event_jmiExcluirContaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jmbSisGerenciadorCliente;
    private javax.swing.JMenu jmeAgencia;
    private javax.swing.JMenu jmeCliente;
    private javax.swing.JMenu jmeContaCorrente;
    private javax.swing.JMenuItem jmiAlterar;
    private javax.swing.JMenuItem jmiAlterarConta;
    private javax.swing.JMenuItem jmiBuscaConta;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiCadastrar;
    private javax.swing.JMenuItem jmiCadastrarConta;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiDeletar;
    private javax.swing.JMenuItem jmiExcluir;
    private javax.swing.JMenuItem jmiExcluirConta;
    private javax.swing.JMenuItem jmiIncluir;
    private javax.swing.JMenuItem jmiListar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiPesquisar;
    // End of variables declaration//GEN-END:variables
}
