
package gym.gymmanagementsystem;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class payment extends javax.swing.JFrame {


    private void initTable(){
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        
        ID.setText("");
        name.setText("");
        type.setText("");
        pay.setText("");
        date.setText("");
        due.setText("");
        dRemaining.setText("");
        status.setText("");
        
        String id = null;
        String memberName=null;
        String memberType=null;
        String paymentDate = null;
        String due = null;
        double amountPay=0.0;
        String strStatus = null;
        String dayRemaining = null;
        
        
        try{
            int checkid = 0;
                    
            Connection connection = ConnectionProvider.getConnection();
            Statement paymentSt=connection.createStatement();
            String sqlPayment = "SELECT * FROM payment";
            ResultSet result=paymentSt.executeQuery(sqlPayment);
            
            while (result.next()){
                checkid = 1;
                id = result.getString(1);
                memberName = result.getString(2);
                memberType = result.getString(3);
                amountPay = result.getDouble(4);
                paymentDate = result.getString(5);
                due = result.getString(6);
                dayRemaining = result.getString(7);
                strStatus = result.getString(8);
                int dayDiff = 0;
                
                if (due == null){
                    due = "null";
                }else{
                    java.util.Date dDue = new SimpleDateFormat("yyyy-MM-dd").parse(due);
                    java.util.Date currDate = new java.util.Date();
                    
                    long diff = dDue.getTime() - currDate.getTime();
                    long diffDays = diff / (24*60*60*1000) +60;
                    dayDiff = (int)diffDays;
                }
                
                if (paymentDate == null){
                    strStatus = "Not Paid";
                    paymentDate = "null";
                    due = "null";
                    dayRemaining = "null";
                }
                
                                
                model.addRow(new Object[]{id,memberName,memberType,amountPay,paymentDate, due, dayDiff + " Days", strStatus });
                
                sqlPayment = "UPDATE payment SET dayRemaining=?, status=?  WHERE id=?";
            
                Connection connection1 = ConnectionProvider.getConnection();
                PreparedStatement paymentStUpdate=connection.prepareStatement(sqlPayment);
                paymentStUpdate.setString(1,String.valueOf(dayDiff) + " Days");
                paymentStUpdate.setString(2,strStatus);
                paymentStUpdate.setString(3,id);
                
                
                paymentStUpdate.executeUpdate();
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public payment() {
        initComponents();
        
        java.util.Date getToday = new java.util.Date();
        String strToday = new SimpleDateFormat("yyyy-MM-dd").format(getToday);
        today.setText(strToday);
        
        initTable();
        
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dRemaining = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paymentsicon.png"))); // NOI18N
        jLabel1.setText("PAYMENT");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Type", "Amount Pay", "Payment Date", "Due Date", "Days Remaining", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(60);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter the valid ID to get the information");

        jLabel3.setText("Member ID:");

        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn))
                    .addComponent(jLabel2))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Member Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Member ID:");

        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 0, 0));
        ID.setText("ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Member Type:");

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Amount Pay:");

        pay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Payment Date:");

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Due Date:");

        due.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Days Remaining:");

        dRemaining.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dRemaining.setForeground(new java.awt.Color(255, 0, 51));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reseticon.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Today:");

        today.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        today.setForeground(new java.awt.Color(255, 0, 0));
        today.setText("today");

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Status:");

        payBtn.setBackground(new java.awt.Color(153, 152, 0));
        payBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payicon.png"))); // NOI18N
        payBtn.setText("Pay");
        payBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payBtnMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitBtn)
                        .addGap(463, 463, 463)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(249, 249, 249)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(376, 376, 376)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ID)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(today)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(type)
                                            .addComponent(name)
                                            .addComponent(pay)
                                            .addComponent(date)
                                            .addComponent(due)
                                            .addComponent(dRemaining)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(status))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resetBtn)
                                        .addGap(30, 30, 30)
                                        .addComponent(payBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ID)
                    .addComponent(jLabel13)
                    .addComponent(today))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(type))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pay))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(date))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(due))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(dRemaining))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(status))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetBtn)
                            .addComponent(payBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {
        int searchid = 0;
        String id = searchField.getText();
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        try{
            String sqlPayment = "SELECT * FROM payment WHERE id='"+id+"'";
            Connection connection = ConnectionProvider.getConnection();
            Statement paymentSt = connection.createStatement();
            ResultSet result = paymentSt.executeQuery(sqlPayment);

            while (result.next()){
                searchid = 1;
                model.setRowCount(0);
                
                ID.setText("00"+result.getString(1));
                name.setText(result.getString(2));
                type.setText(result.getString(3));
                pay.setText(result.getString(4));
                
                String pDate = result.getString(5); 
                if (pDate == null){
                    pDate = "null";
                }
                String pDue = result.getString(6);
                if(pDue == null){
                    pDue = "null";
                }
                String pDRemaining = result.getString(7);
                if(pDRemaining == null){
                    pDRemaining = "null";
                }
                String pStatus = result.getString(8);
                if (pStatus == null){
                    pStatus = "null";
                }
                
                date.setText(pDate);
                due.setText(pDue);
                dRemaining.setText(pDRemaining);
                status.setText(pStatus);
                
                model.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(3), result.getString(4), pDate, pDue, pDRemaining, pStatus});
            }
            if(searchid == 0){
                JOptionPane.showMessageDialog(null, "Member ID does not exist!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        ID.setText("");
        name.setText("");
        type.setText("");
        pay.setText("");
        date.setText("");
        due.setText("");
        dRemaining.setText("");
        status.setText("");
         
        try{
            String sqlPayment = "SELECT * FROM payment";
            Connection connection = ConnectionProvider.getConnection();
            Statement paymentSt = connection.createStatement();
            ResultSet result= paymentSt.executeQuery(sqlPayment);
            
            while (result.next()){
                String pDate = result.getString(5); 
                if (pDate == null){
                    pDate = "null";
                }
                String pDue = result.getString(6);
                if(pDue == null){
                    pDue = "null";
                }
                String pDRemaining = result.getString(7);
                if(pDRemaining == null){
                    pDRemaining = "null";
                }
                String pStatus = result.getString(8);
                if (pStatus == null){
                    pStatus = "null";
                }
                model.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(3), result.getString(4), pDate, pDue, pDRemaining , pStatus});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void payBtnMouseClicked(java.awt.event.MouseEvent evt) {
        String id = ID.getText();
        String payDate = today.getText();
        
        int newMonth = Integer.parseInt(payDate.substring(6,7)) + 10;
        String dueDate = payDate.substring(0,4) + "-0" + Integer.toString(newMonth) + "-" + payDate.substring(8,10);
        
        String status = "Paid";
        
        try{
            
            java.util.Date dDue = new SimpleDateFormat("yyyy-MM-dd").parse(dueDate);
            java.util.Date currDate = new java.util.Date();
            int dayDiff = 0;
            long diff = dDue.getTime() - currDate.getTime();
            long diffDays = diff / (24*60*60*1000) -60;
            dayDiff = (int)diffDays;
                
            String daysRemaining = String.valueOf(dayDiff);
            
            String sqlMember = "UPDATE member SET payDate=? WHERE id=?;";
            String sqlPayment = "UPDATE payment SET paymentDate=?, dueDate=?, dayRemaining=?, status=? WHERE id=?";
            
            Connection connection = ConnectionProvider.getConnection();
            
            PreparedStatement memberSt=connection.prepareStatement(sqlMember);
            PreparedStatement paymentSt=connection.prepareStatement(sqlPayment);
            
            memberSt.setString(1,payDate);
            memberSt.setString(2,id);
            
            paymentSt.setString(1,payDate);
            paymentSt.setString(2,dueDate);
            paymentSt.setString(3, daysRemaining + " Days");
            paymentSt.setString(4,status);
            paymentSt.setString(5, id);
            
            memberSt.executeUpdate();
            paymentSt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully Paid!");
            setVisible(false);
            new payment().setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int exit = JOptionPane.showConfirmDialog(null, "Exit to Dashboard?","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if (exit == 0){
            setVisible(false);
            new home().setVisible(true);
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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel ID;
    private javax.swing.JLabel dRemaining;
    private javax.swing.JLabel date;
    private javax.swing.JLabel due;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pay;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel status;
    private javax.swing.JLabel today;
    private javax.swing.JLabel type;

}
