
package gym.gymmanagementsystem;
import javax.swing.*;
import database.ConnectionProvider;

import java.sql.*;
import java.util.regex.Pattern;

public class newMember extends javax.swing.JFrame {


    public newMember() {
        initComponents();
        trainer();
        fnEmpty.setVisible(false);
        lnEmpty.setVisible(false);
        addressEmpty.setVisible(false);
        phoneNumsEmpty.setVisible(false);
        trainerList.setVisible(false);
        
        try{
            int id = 1;
            String str1 = String.valueOf(id);
            memberID.setText("00"+str1);
            
            Connection connection = ConnectionProvider.getConnection();
            
            Statement memberSt = connection.createStatement();
            String sqlMember = "SELECT MAX(id) FROM member";
            ResultSet result = memberSt.executeQuery(sqlMember);
            
            while(result.next()){
                id = result.getInt(1);
                id = id +1;
                String str = String.valueOf(id);
                memberID.setText("00"+str);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNums = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        amountPay = new javax.swing.JTextField();
        memberID = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        fnEmpty = new javax.swing.JLabel();
        lnEmpty = new javax.swing.JLabel();
        addressEmpty = new javax.swing.JLabel();
        phoneNumsEmpty = new javax.swing.JLabel();
        emailEmpty = new javax.swing.JLabel();
        memberType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        trainerList = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addmembericon.png"))); // NOI18N
        jLabel1.setText("ADD MEMBER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Member ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Phone Number");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saveicon.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reseticon.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Amount Pay");

        amountPay.setText("1000");
        amountPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountPayActionPerformed(evt);
            }
        });

        memberID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberID.setForeground(new java.awt.Color(255, 0, 0));
        memberID.setText("001");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Member Type:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Register Date");

        fnEmpty.setForeground(new java.awt.Color(255, 0, 0));
        fnEmpty.setText("First name is required!");

        lnEmpty.setForeground(new java.awt.Color(255, 0, 0));
        lnEmpty.setText("Last name is required!");

        addressEmpty.setForeground(new java.awt.Color(255, 0, 0));
        addressEmpty.setText("Address is required!");

        phoneNumsEmpty.setForeground(new java.awt.Color(255, 0, 0));
        phoneNumsEmpty.setText("Phone number is required!");

        emailEmpty.setForeground(new java.awt.Color(255, 0, 0));

        memberType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic", "Plus", "Premium" }));
        memberType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                memberTypeItemStateChanged(evt);
            }
        });
        memberType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rs");

        trainerList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Trainer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn)
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnEmpty)
                            .addComponent(jLabel4)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnEmpty)
                            .addComponent(jLabel8)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressEmpty)
                            .addComponent(jLabel7)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addGap(33, 33, 33)
                                .addComponent(resetBtn)))
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberID)
                    .addComponent(phoneNums, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumsEmpty)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(emailEmpty)
                    .addComponent(jLabel12)
                    .addComponent(memberType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(amountPay, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(trainerList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(memberID))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(memberType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(phoneNums, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(phoneNumsEmpty))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(fnEmpty)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lnEmpty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(emailEmpty)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(addressEmpty))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(amountPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(trainerList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {

        String emailRegex = "^(.+)@(.+)$";
        String fn = firstName.getText().toString();
        String ln = lastName.getText().toString();
        String phonenums = phoneNums.getText().toString();
        String em = email.getText().toString();
        String addr = address.getText().toString();
        
        
        if(fn.isEmpty()){
            fnEmpty.setVisible(true);
        }else{
            fnEmpty.setVisible(false);
        }
        
        if(ln.isEmpty()){
            lnEmpty.setVisible(true);
        }else{
            lnEmpty.setVisible(false);
        }
        
        if(phonenums.isEmpty()){
            phoneNumsEmpty.setVisible(true);
        }else{
            phoneNumsEmpty.setVisible(false);
        }
        
        if(em.isEmpty()){
            emailEmpty.setText("Email is required!");
        }else if ( !((Pattern.compile(emailRegex)).matcher(em).matches())){
            emailEmpty.setText("Email is not valid!");
        }
        else{
            emailEmpty.setText("");
        }
        
        if(addr.isEmpty()){
            addressEmpty.setVisible(true);
        }else{
            addressEmpty.setVisible(false);
        }
        
        String id = memberID.getText().toString();
        String memType = (String)memberType.getSelectedItem();
        String gen = (String)gender.getSelectedItem();
        String amount = amountPay.getText().toString();
        String trainer;
        if (memType.equals("Basic")){
            trainer = "none";
        }else{
            trainer = (String)trainerList.getSelectedItem();
        }
        java.util.Date date = jDateChooser2.getDate();
        java.sql.Date dateRegister = new java.sql.Date(date.getTime());
        
        try{
            
            Connection connection = ConnectionProvider.getConnection();
            String sql = "INSERT INTO member VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, fn);
            statement.setString(3, ln);
            statement.setString(4, gen);
            statement.setString(5, phonenums);
            statement.setString(6, em);
            statement.setString(7, addr);
            statement.setString(8, amount);
            statement.setString(9, memType);
            statement.setDate(10, dateRegister);
            statement.setString(11, trainer);
            statement.setString(12,null);
            statement.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Save member successfully!");
            setVisible(false);
            new newMember().setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error to save information","Error",JOptionPane.PLAIN_MESSAGE);
            e.printStackTrace();
        }
       
        int searchid = 0;
        
        try{
            searchid++;
            String sqlMember = "SELECT * FROM member where id='"+id+"'";
            Connection connection = ConnectionProvider.getConnection();
            Statement memberSt = connection.createStatement();
            ResultSet result = memberSt.executeQuery(sqlMember);
            
            while (result.next()){
                
                searchid = 1;
                String payID = result.getString(1);
                String payName = result.getString(2) + " " + result.getString(3);
                String payType = result.getString(9);
                Double payAmount = result.getDouble(8);
                
                String payDate = result.getString(12);
                
                
                PreparedStatement paymentSt = connection.prepareStatement("INSERT INTO payment (ID, memberName, memberType, amountPay) VALUES (?,?,?,?)");
                paymentSt.setString(1, payID);
                paymentSt.setString(2, payName);
                paymentSt.setString(3, payType);
                paymentSt.setDouble(4, payAmount);
                
                paymentSt.executeUpdate();
            }
            if(searchid == 0){
                JOptionPane.showMessageDialog(null, "Member ID does not exist!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    
    private void trainer(){
        try{
            
            Connection connection = ConnectionProvider.getConnection();
            String sql = "SELECT DISTINCT name FROM trainer";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            trainerList.removeAllItems();
            
            while (result.next()){
                trainerList.addItem(result.getString("name"));
            }
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        firstName.setText("");
        lastName.setText("");
        phoneNums.setText("");
        address.setText("");
        amountPay.setText("1000");
        email.setText("");
        memberType.setSelectedIndex(0);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int exit = JOptionPane.showConfirmDialog(null, "Exit to Dashboard?","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if (exit == 0){
            setVisible(false);
            new home().setVisible(true);
        }
    }

    private void memberTypeItemStateChanged(java.awt.event.ItemEvent evt) {
        String memType = (String)memberType.getSelectedItem();
        if (memType.equals("Basic")){
            amountPay.setText("1000");
        }else if (memType.equals("Plus")){
            amountPay.setText("2000");
        }else if (memType.equals("Premium")){
            amountPay.setText("3000");
        }
    }

    private void memberTypeActionPerformed(java.awt.event.ActionEvent evt) {
        String memType = (String)memberType.getSelectedItem();
        if (memType.equals("Basic")){
            trainerList.setVisible(false);
        }else{
            trainerList.setVisible(true);
        }
    }//GEN-LAST:event_memberTypeActionPerformed

    private void amountPayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(newMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newMember().setVisible(true);
            }
        });
    }


    private javax.swing.JTextField address;
    private javax.swing.JLabel addressEmpty;
    private javax.swing.JTextField amountPay;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailEmpty;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel fnEmpty;
    private javax.swing.JComboBox<String> gender;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lnEmpty;
    private javax.swing.JLabel memberID;
    private javax.swing.JComboBox<String> memberType;
    private javax.swing.JTextField phoneNums;
    private javax.swing.JLabel phoneNumsEmpty;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> trainerList;

}
