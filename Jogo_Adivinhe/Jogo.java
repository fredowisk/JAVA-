/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

//Imports...
import java.awt.event.KeyEvent;
import java.util.Random;
/**
 *
 * @author fredaum
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
        txtChute.setEditable(false); // Deixando o textField não editavel.
    }
    Random random = new Random(); // Criando um objeto do construtor random.
    int numero, chute; //Variavel para o numero gerado, e variavel para adivinhar o numero.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMsg = new javax.swing.JLabel();
        lblIntervalo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        txtChute = new JtextFieldSomenteNumeros(3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblMsg.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N

        lblIntervalo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblIntervalo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntervalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnNovo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnNovo.setText("Novo jogo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        txtChute.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        txtChute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtChute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChuteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtChute, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtChute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(67, 67, 67))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Botao que cria um novo jogo.
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        lblMsg.setText("<html><center> Eu tenho um número entre 1 e 100, você pode adivinhá-lo?<br> Entre com seu chute.</center></html>");
        numero = random.nextInt(100); // Criando um numero randomico de 1 até 100.
        lblIntervalo.setText(""); //Apagando o resultado da label.
        txtChute.setText("");  //Apagando o textfield chute.
        txtChute.setEditable(true); // Deixando o textfield editavel.
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtChuteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChuteKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){ // Evento que verifica se o enter
               //foi pressionado.
               //Convertendo o a string em um int, usando o integer.
               chute = Integer.parseInt(txtChute.getText()); 
               //Chamando o metodo que verifica o resultado...
               Verifica();
           }
    }//GEN-LAST:event_txtChuteKeyPressed
    
    public void Verifica(){
        if (chute>100)
             lblIntervalo.setText("O numero informado é maior que 100!");
        else if(chute == numero){
            txtChute.setEditable(false); // Impedindo o textfield de ser editado!
            lblIntervalo.setText("Correto!");
        }
        else if(chute>numero){
             lblIntervalo.setText("O número é menor que " + chute);
        }
        else{
            lblIntervalo.setText("O número é maior que " + chute);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel lblIntervalo;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextField txtChute;
    // End of variables declaration//GEN-END:variables
}
