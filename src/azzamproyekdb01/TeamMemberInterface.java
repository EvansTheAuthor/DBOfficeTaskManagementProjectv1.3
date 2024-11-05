/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package azzamproyekdb01;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Guest Prodas
 */
public class TeamMemberInterface extends javax.swing.JFrame {

    /**
     * Creates new form TeamMemberInterface
     */
    private Long team_id;
    
    public TeamMemberInterface() {
        initComponents();
        loadTeamMembers();
    }
    
    public TeamMemberInterface(Long team_id){
        this.team_id=team_id;
        initComponents();
        loadTeamMembers();
    }
    
    private void openTeamMemEdit(Long team_id){
        TeamMemEdit teamMemEdit=new TeamMemEdit(team_id);
        teamMemEdit.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeamMembers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDataEdit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTeamMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Anggota", "ID Karyawan"
            }
        ));
        jScrollPane1.setViewportView(tblTeamMembers);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Daftar Anggota");

        btnDataEdit.setText("Ubah Data");
        btnDataEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataEditActionPerformed(evt);
            }
        });

        btnReturn.setText("< Kembali");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDataEdit)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataEdit)
                    .addComponent(btnReturn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        TeamInterface teamInter=new TeamInterface();
        teamInter.setVisible(true);
        TeamMemberInterface.this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnDataEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataEditActionPerformed
        // TODO add your handling code here:
         Long teamId = this.team_id; // Mengambil team_id dari instance ini
        openTeamMemEdit(teamId);
    }//GEN-LAST:event_btnDataEditActionPerformed

    void loadTeamMembers() {
        if (team_id == null) {
            JOptionPane.showMessageDialog(this, "ID Tim tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Keluar jika team_id null
        }
        DefaultTableModel tableModel = (DefaultTableModel) tblTeamMembers.getModel();
        tableModel.setRowCount(0);  // Kosongkan tabel sebelum memuat data baru

        // SQL untuk mengambil anggota tim berdasarkan team_id
        String query = "SELECT e.name, e.employee_id FROM TeamMemberList tm " +
                       "JOIN EmployeeList e ON tm.employee_id = e.employee_id " +
                       "WHERE tm.team_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setLong(1, team_id); // Set team_id dalam query
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String employeeName = rs.getString("name");
                Long employeeId = rs.getLong("employee_id");

                // Tambahkan data ke tabel
                Object[] row = { employeeId, employeeName };
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memuat anggota tim: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TeamMemberInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamMemberInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamMemberInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamMemberInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamMemberInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataEdit;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTeamMembers;
    // End of variables declaration//GEN-END:variables
}
