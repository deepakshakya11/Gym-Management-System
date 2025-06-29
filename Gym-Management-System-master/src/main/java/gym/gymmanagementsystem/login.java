package gym.gymmanagementsystem;
import javax.swing.*;


public class login extends javax.swing.JFrame {

  
    public login() {
        initComponents();
        incorrectusernameView.setVisible(false);
        incorrectPassView.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginView = new javax.swing.JLabel();
        incorrectPassView = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        showpasswordCheckBox = new javax.swing.JCheckBox();
        exitBtn = new javax.swing.JButton();
        incorrectusernameView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In ");
        setLocation(new java.awt.Point(0, 0));

        loginView.setBackground(new java.awt.Color(204, 204, 204));
        loginView.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        loginView.setText("LOG IN");

        incorrectPassView.setBackground(new java.awt.Color(255, 255, 255));
        incorrectPassView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incorrectPassView.setForeground(new java.awt.Color(255, 0, 0));
        incorrectPassView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecticon.png"))); // NOI18N
        incorrectPassView.setText("Incorrect Password");

        userNameTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameTxtField.setText("Enter username!");
        userNameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTxtFieldFocusLost(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordField.setText("Enter password!");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loginicon.png"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        showpasswordCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showpasswordCheckBox.setText("Show passwords");
        showpasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCheckBoxActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exiticon.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        incorrectusernameView.setBackground(new java.awt.Color(255, 255, 255));
        incorrectusernameView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incorrectusernameView.setForeground(new java.awt.Color(255, 0, 0));
        incorrectusernameView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecticon.png"))); // NOI18N
        incorrectusernameView.setText("Incorrect Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(loginView, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(incorrectusernameView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(incorrectPassView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(showpasswordCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(loginBtn)
                        .addGap(95, 95, 95)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(loginView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(incorrectusernameView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(incorrectPassView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(showpasswordCheckBox)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn)
                    .addComponent(exitBtn))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void showpasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (showpasswordCheckBox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (userNameTxtField.getText().equals("Enter username!") && passwordField.getText().equals("Enter password!")){
            JOptionPane.showMessageDialog(null,"Required username and password!","Error",JOptionPane.PLAIN_MESSAGE);
        }else{
            if(userNameTxtField.getText().equals("Deepak shakya") && passwordField.getText().equals("Shakya@2004")){
                setVisible(false);
                new home().setVisible(true);
            }else if (!userNameTxtField.getText().equals("Deepak shakya") && passwordField.getText().equals("Shakya@2004")){
                incorrectPassView.setVisible(false);
                incorrectusernameView.setVisible(true);
            }else if (userNameTxtField.getText().equals("Deepak shakya") && !passwordField.getText().equals("Shakya@2004")){
                incorrectusernameView.setVisible(false);
                incorrectPassView.setVisible(true);
            }else{
                incorrectusernameView.setVisible(true);
                incorrectPassView.setVisible(true);
            }
        }
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit!","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if (exit == 0){
            System.exit(0);
        }
    }

    private void userNameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {
        
        if (userNameTxtField.getText().equals("Enter username!")){
            userNameTxtField.setText("");
        }
    }

    private void userNameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {
        
        if (userNameTxtField.getText().equals("")){
            userNameTxtField.setText("Enter username!");
        }
    }

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {
        
        if (passwordField.getText().equals("Enter password!")){
            passwordField.setText("");
        }
    }

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {
        
        if (passwordField.getText().equals("")){
            passwordField.setText("Enter password!");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }


    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel incorrectPassView;
    private javax.swing.JLabel incorrectusernameView;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginView;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showpasswordCheckBox;
    private javax.swing.JTextField userNameTxtField;

}
