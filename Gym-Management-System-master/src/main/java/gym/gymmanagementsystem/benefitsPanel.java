
package gym.gymmanagementsystem;

import database.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class benefitsPanel extends javax.swing.JPanel {

    public benefitsPanel() {
        initComponents();
        
        basic1.setSelected(false);
        basic2.setSelected(false);
        plus1.setSelected(false);
        plus2.setSelected(false);
        plus3.setSelected(false);
        premium1.setSelected(false);
        premium2.setSelected(false);
        premium3.setSelected(false);
        premium4.setSelected(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        plus1 = new javax.swing.JCheckBox();
        basic1 = new javax.swing.JCheckBox();
        basic2 = new javax.swing.JCheckBox();
        plus2 = new javax.swing.JCheckBox();
        plus3 = new javax.swing.JCheckBox();
        premium1 = new javax.swing.JCheckBox();
        premium2 = new javax.swing.JCheckBox();
        premium3 = new javax.swing.JCheckBox();
        premium4 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(451, 571));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/benefiticon.png"))); // NOI18N
        jLabel1.setText("BENEFITS");

        plus1.setBackground(new java.awt.Color(204, 204, 204));
        plus1.setText("ALL GROUP EXERCISE CLASSES");

        basic1.setBackground(new java.awt.Color(204, 204, 204));
        basic1.setText("USE OF ALL STRENGTH EQUIPMENT");

        basic2.setBackground(new java.awt.Color(204, 204, 204));
        basic2.setText("USE OF ALL CARDIO EQUIPMENT");

        plus2.setBackground(new java.awt.Color(204, 204, 204));
        plus2.setText("1 PERSONAL TRAINING SESSION");

        plus3.setBackground(new java.awt.Color(204, 204, 204));
        plus3.setText("1 GROUP TRAINING SESSION");

        premium1.setBackground(new java.awt.Color(204, 204, 204));
        premium1.setText("USE OF BASKETBALL COURTS");

        premium2.setBackground(new java.awt.Color(204, 204, 204));
        premium2.setText("USE OF RACQUETBALL COURTS");

        premium3.setBackground(new java.awt.Color(204, 204, 204));
        premium3.setText("UNLIMITED STUDIO CYCLING");

        premium4.setBackground(new java.awt.Color(204, 204, 204));
        premium4.setText("UP TO TWO GUESTS PER VISIT");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic", "Plus", "Premium" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(basic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(basic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(premium1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(premium2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(premium3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(premium4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(basic1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basic2)
                .addGap(18, 18, 18)
                .addComponent(plus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plus3)
                .addGap(18, 18, 18)
                .addComponent(premium1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(premium2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(premium3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(premium4)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        String type = (String)jComboBox1.getSelectedItem();
        
        if (type.equals("Basic")){
            basic1.setSelected(true);
            basic2.setSelected(true);
            
            
            plus1.setSelected(false);
            plus1.setEnabled(false);
            
            plus2.setSelected(false);
            plus2.setEnabled(false);
            
            plus3.setSelected(false);
            plus3.setEnabled(false);
            
            premium1.setSelected(false);
            premium1.setEnabled(false);
            
            premium2.setSelected(false);
            premium2.setEnabled(false);
            
            premium3.setSelected(false);
            premium3.setEnabled(false);
            
            premium4.setSelected(false);
            premium4.setEnabled(false);
            
        }else if (type.equals("Plus")){
            basic1.setSelected(true);
            basic2.setSelected(true);
            
            
            plus1.setSelected(true);
            plus1.setEnabled(true);
            
            plus2.setSelected(true);
            plus2.setEnabled(true);
            
            plus3.setSelected(true);
            plus3.setEnabled(true);
            
            premium1.setSelected(false);
            premium1.setEnabled(false);
            
            premium2.setSelected(false);
            premium2.setEnabled(false);
            
            premium3.setSelected(false);
            premium3.setEnabled(false);
            
            premium4.setSelected(false);
            premium4.setEnabled(false);
        }else if (type.equals("Premium")){
            basic1.setSelected(true);
            basic2.setSelected(true);
            
            
            plus1.setSelected(true);
            plus1.setEnabled(true);
            
            plus2.setSelected(true);
            plus2.setEnabled(true);
            
            plus3.setSelected(true);
            plus3.setEnabled(true);
            
            premium1.setSelected(true);
            premium1.setEnabled(true);
            
            premium2.setSelected(true);
            premium2.setEnabled(true);
            
            premium3.setSelected(true);
            premium3.setEnabled(true);
            
            premium4.setSelected(true);
            premium4.setEnabled(true);
            
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox basic1;
    private javax.swing.JCheckBox basic2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox plus1;
    private javax.swing.JCheckBox plus2;
    private javax.swing.JCheckBox plus3;
    private javax.swing.JCheckBox premium1;
    private javax.swing.JCheckBox premium2;
    private javax.swing.JCheckBox premium3;
    private javax.swing.JCheckBox premium4;
    // End of variables declaration//GEN-END:variables
}
