/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Model.Employee;
import Model.EmployeeHistory;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91983
 */
public class Readjpanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadjPanel
     */
    
    EmployeeHistory history;
    public Readjpanel(EmployeeHistory history) {
        initComponents();
        this.history= history;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();
        txtdate = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbl_age = new javax.swing.JLabel();
        txte_id = new javax.swing.JTextField();
        lble_id = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtposition = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        txtteam_info = new javax.swing.JTextField();
        lblteam_info1 = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        lbl_level = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        lblteam_info = new javax.swing.JLabel();
        btnshow = new javax.swing.JToggleButton();
        btndelete = new javax.swing.JToggleButton();
        btnupdate = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnupdateimage = new javax.swing.JToggleButton();
        lblphoto = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employees");

        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee_id", "Age", "Gender", "Start Date", "Level", "Team_info", "Position_Title", "Contact_NO", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblemployee);

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        lblname.setText("Name");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        lbl_age.setText("Age");

        txte_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txte_idActionPerformed(evt);
            }
        });

        lble_id.setText("Employee Id");

        lbl_gender.setText("Gender");

        lbl_date.setText("Start Date ");

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });

        txtposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositionActionPerformed(evt);
            }
        });

        lblcontact.setText("Contact_NO");

        txtteam_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteam_infoActionPerformed(evt);
            }
        });

        lblteam_info1.setText("Position Title");

        lblemail.setText("Email");

        txtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlevelActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        lbl_level.setText("Level");

        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });

        lblteam_info.setText("Team Info");

        btnshow.setText("View");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Photo");

        btnupdateimage.setText("Update Photo");
        btnupdateimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateimageActionPerformed(evt);
            }
        });

        lblphoto.setBackground(new java.awt.Color(5, 5, 5));
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 1, 1)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_age, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_gender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lble_id))
                            .addComponent(lbl_date, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txte_id, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtteam_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(222, 222, 222)
                                        .addComponent(txtposition, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                                .addGap(129, 129, 129))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnupdateimage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(307, 307, 307))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnupdate)
                                                .addGap(52, 52, 52)
                                                .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblcontact)
                                                    .addComponent(lblteam_info1)
                                                    .addComponent(lblteam_info)
                                                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_level))))
                                        .addGap(38, 38, 38))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(353, 353, 353))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(321, 321, 321))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshow)
                    .addComponent(btndelete)
                    .addComponent(btnupdate))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_level, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteam_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txte_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lble_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_age))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtteam_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteam_info, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_date))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdateimage)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txte_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txte_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txte_idActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositionActionPerformed

    private void txtteam_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteam_infoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteam_infoActionPerformed

    private void txtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlevelActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = tblemployee.getSelectedRow();
       if(selectedRowIndex<0){
          JOptionPane.showMessageDialog(this, "Please select a row to delete.");
          return;
           
        }
         DefaultTableModel model = (DefaultTableModel) tblemployee.getModel();
         Employee selectedEmployees =(Employee) model.getValueAt(selectedRowIndex , 0);
         
         txtname.setText(selectedEmployees.getName());
         txte_id.setText(String.valueOf(selectedEmployees.getEmployee_id()));
         txtage.setText(String.valueOf(selectedEmployees.getAge()));
         txtgender.setText(selectedEmployees.getGender());
         txtdate.setText(selectedEmployees.getDate());
         txtlevel.setText(String.valueOf(selectedEmployees.getLevel()));
         txtteam_info.setText(selectedEmployees.getTeam_info());
         txtposition.setText(selectedEmployees.getPosition_title());
         txtcontact.setText(selectedEmployees.getCell_no());
         txtemail.setText(selectedEmployees.getEmail());
         lblphoto.setIcon(selectedEmployees.getPhoto(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH));
       

         
        
        
    }//GEN-LAST:event_btnshowActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemployee.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
           
        }
         DefaultTableModel model = (DefaultTableModel) tblemployee.getModel();
         Employee selectedEmployees =(Employee) model.getValueAt(selectedRowIndex , 0);
         history.deleteEmployees(selectedEmployees);
         JOptionPane.showMessageDialog(this, "Employee deleted.");
         
         populateTable();
         
        txtname.setText("");
        txte_id.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtdate.setText("");
        txtlevel.setText("");
        txtteam_info.setText("");
        txtposition.setText("");
        txtcontact.setText("");
        txtemail.setText("");
        lblphoto.setIcon(null);
       


    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblemployee.getModel();
        if(tblemployee.getSelectedRowCount()==1){
        String name =txtname.getText();
        String employee_id = txte_id.getText();
        String age =txtage.getText();
        String gender =txtgender.getText();
        String date =txtdate.getText();
        String level =txtlevel.getText();
        String team_info =txtteam_info.getText();
        String position =txtposition.getText();
        String cell_no =txtcontact.getText();
        String email =txtemail.getText();
        Icon photo = lblphoto.getIcon();
        
          if( name.isEmpty() && employee_id.isEmpty() 
               || age.isEmpty() || gender.isEmpty()
               || date.isEmpty() || level.isEmpty()
               || team_info.isEmpty() || position.isEmpty() 
               || cell_no.isEmpty() || email.isEmpty()){
        txtname.setText("");
        txte_id.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtdate.setText("");
        txtlevel.setText("");
        txtteam_info.setText("");
        txtposition.setText("");
        txtcontact.setText("");
        txtemail.setText("");
        lblphoto.setIcon(null);
 
       
                   JOptionPane.showMessageDialog(this, "No Fields should be Empty.");
       }
       else if(Integer.parseInt(age)<18){
                   JOptionPane.showMessageDialog(this, "Age should be above 18","Error",JOptionPane.ERROR_MESSAGE);
                   txtage.setText("");
       }
        else if(!gender.equalsIgnoreCase("Male") || !gender.equalsIgnoreCase("Female") || !gender.equalsIgnoreCase("Others")){
                   JOptionPane.showMessageDialog(this, "Gender can only be 'Male','Female' and 'Others' ","Error",JOptionPane.ERROR_MESSAGE);
                   txtgender.setText("");
       }
       else if(cell_no.length()<10){
                    JOptionPane.showMessageDialog(this, "Length of contact should be 10 ","Error",JOptionPane.ERROR_MESSAGE);
                    txtcontact.setText("");       
       }
        else if(cell_no.length()>10){
                    JOptionPane.showMessageDialog(this, "Length of contact should be 10 ","Error",JOptionPane.ERROR_MESSAGE);
                    txtcontact.setText("");       
       }
       else if(!cell_no.matches("[0-9]+") ){
                    JOptionPane.showMessageDialog(this, "Contact must only contain numeric value ","Error",JOptionPane.ERROR_MESSAGE);
                    txtcontact.setText("");       
       }
       else if(!(email.contains("@") && email.contains("."))){
                    JOptionPane.showMessageDialog(this, "Email address must conati '@' & '.' ","Error",JOptionPane.ERROR_MESSAGE);
                    txtemail.setText("");
       }
       
       else{
        model.setValueAt(name, tblemployee.getSelectedRow(), 0);
        model.setValueAt(employee_id, tblemployee.getSelectedRow(), 1);
        model.setValueAt(age, tblemployee.getSelectedRow(), 2);
        model.setValueAt(gender, tblemployee.getSelectedRow(), 3);
        model.setValueAt(date, tblemployee.getSelectedRow(), 4);
        model.setValueAt(level, tblemployee.getSelectedRow(), 5);
        model.setValueAt(team_info, tblemployee.getSelectedRow(), 6);
        model.setValueAt(position, tblemployee.getSelectedRow(), 7);
        model.setValueAt(cell_no, tblemployee.getSelectedRow(), 8);
        model.setValueAt(email, tblemployee.getSelectedRow(), 9);
       
        JOptionPane.showMessageDialog(this, "Selected row was updated successfully.");
        }
        }else{
            if(tblemployee.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table ss empty.");
            }else{
            JOptionPane.showMessageDialog(this, "Please select a row to update.");

            }
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnupdateimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateimageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Images","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialog = browseImageFile.showOpenDialog(null);
        if(showOpenDialog == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null,"Image is Uploaded");
            
            ImageIcon ii=new ImageIcon(selectedImagePath);
            Image ei = (ii).getImage().getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
            ii = new ImageIcon(ei);
            lblphoto.setIcon(ii);
        }
        
    }//GEN-LAST:event_btnupdateimageActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btndelete;
    private javax.swing.JToggleButton btnshow;
    private javax.swing.JToggleButton btnupdate;
    private javax.swing.JToggleButton btnupdateimage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_level;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lble_id;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblteam_info;
    private javax.swing.JLabel lblteam_info1;
    private javax.swing.JTable tblemployee;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txte_id;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtposition;
    private javax.swing.JTextField txtteam_info;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblemployee.getModel();
        model.setRowCount(0);
        for(Employee emp : history.getHistory()){
            Object[] row =  new Object[10];
            row[0] = emp;
            row[1] = emp.getEmployee_id();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getDate();
            row[5] = emp.getLevel();
            row[6] = emp.getTeam_info();
            row[7] = emp.getPosition_title();
            row[8] = emp.getCell_no();
            row[9] = emp.getEmail();
            
            model.addRow(row);
            
            
        }

    }

    
}
