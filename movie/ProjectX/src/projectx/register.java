/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectx;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        this.reshape(400, 200, 640, 480);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        contactnoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        contactnoTF = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        cardIDTF = new javax.swing.JTextField();
        cardIDlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 0, 51));
        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(64, 25, 130, 29);

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(51, 0, 51));
        emailLabel.setText("Email");
        getContentPane().add(emailLabel);
        emailLabel.setBounds(64, 71, 130, 29);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 0, 51));
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(64, 109, 120, 29);

        contactnoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        contactnoLabel.setForeground(new java.awt.Color(51, 0, 51));
        contactnoLabel.setText("Contact No.");
        getContentPane().add(contactnoLabel);
        contactnoLabel.setBounds(60, 180, 150, 30);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(51, 0, 51));
        idLabel.setText("ID");
        getContentPane().add(idLabel);
        idLabel.setBounds(60, 150, 110, 20);
        getContentPane().add(emailTF);
        emailTF.setBounds(210, 70, 285, 20);
        getContentPane().add(usernameTF);
        usernameTF.setBounds(210, 30, 285, 20);
        getContentPane().add(passwordTF);
        passwordTF.setBounds(210, 110, 285, 20);
        getContentPane().add(idTF);
        idTF.setBounds(210, 150, 285, 20);
        getContentPane().add(contactnoTF);
        contactnoTF.setBounds(210, 190, 285, 20);

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton);
        registerButton.setBounds(250, 270, 150, 50);
        getContentPane().add(cardIDTF);
        cardIDTF.setBounds(210, 230, 285, 20);

        cardIDlabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cardIDlabel1.setForeground(new java.awt.Color(51, 0, 51));
        cardIDlabel1.setText("Card ID");
        getContentPane().add(cardIDlabel1);
        cardIDlabel1.setBounds(60, 230, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        
        try
        {
            
        
        String username = usernameTF.getText();
        String email= emailTF.getText();
        String password= passwordTF.getText();
        int id = Integer.parseInt(idTF.getText());
        int contact_no = Integer.parseInt(contactnoTF.getText());
        int cardId = Integer.parseInt(cardIDTF.getText());
        customer c = new customer(username,email,password,id,contact_no,cardId);
        c.register(username, email, password, id, contact_no,cardId);
        welcome w = new welcome();
        w.setVisible(true);
        }
        catch(NumberFormatException e)
                {
                      
       
           
            JOptionPane.showMessageDialog(this, "enter numbers in number fields and letters in textfields ", "error", JOptionPane.ERROR_MESSAGE);
          
       
                }
                
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardIDTF;
    private javax.swing.JLabel cardIDlabel1;
    private javax.swing.JLabel contactnoLabel;
    private javax.swing.JTextField contactnoTF;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
