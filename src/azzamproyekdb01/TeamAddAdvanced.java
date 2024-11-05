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
import javax.swing.DefaultListModel;

/**
 *
 * @author GUEST DB
 */
public class TeamAddAdvanced extends javax.swing.JFrame {

    /**
     * Creates new form TeamAddAvanced
     */
    TransactionManager transMan=new TransactionManager();
    Connection conn;
    public TeamAddAdvanced() {
        initComponents();
        loadManagersIntoComboBox();
        try{
            conn=DBConnection.getConnection();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Terjadi error saat memulai koneksi! "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTeamId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTeamName = new javax.swing.JTextField();
        btnAddTeam = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbManager = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdded = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Catatan Pengembang:");

        jLabel3.setText("Fitur ini masih berada dalam tahap pengembangan. Jika Anda menemui kekurangan atau galat,");

        jLabel4.setText("harap  hubungi tim pengembang agar segera mendapat perbaikan. ");

        jLabel5.setText("ID Tim");

        jLabel6.setText("Nama Tim");

        jLabel7.setText("Penanggung Jawab");

        btnAddTeam.setText("Buat Tim");
        btnAddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeamActionPerformed(evt);
            }
        });

        btnReturn.setText("< Kembali");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel8.setText("Anggota Yang Telah Ditambahkan");

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Karyawan", "Nama Karyawan"
            }
        ));
        jScrollPane3.setViewportView(tblEmployee);

        btnAdd.setText("Tambahkan");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Buat Tim Yang Kamu Inginkan Dengan Lebih Mudah Di Sini!");

        cbManager.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCancel.setText("Batal Buat Tim");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnCreate.setText("Buat Tim Ini!");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        tblAdded.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID Karyawan Anggota", "Nama Anggota"
            }
        ));
        jScrollPane1.setViewportView(tblAdded);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTeamId, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(txtTeamName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddTeam)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbManager, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTeam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel)
                            .addComponent(btnCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(0, 161, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        try{
        TeamAddAdvanced.this.setVisible(false);
        TeamAdd add=new TeamAdd();
        add.setVisible(true);
        conn.close();
        }catch(SQLException ex){
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAddTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeamActionPerformed
        // TODO add your handling code here:
        String teamId=txtTeamId.getText();
        String tName=txtTeamName.getText();
        String selectedManager=cbManager.getSelectedItem().toString();
        
        int startIdx = selectedManager.indexOf("(ID:") + 5;
        int endIdx = selectedManager.indexOf(")", startIdx);
        String managerIdStr = selectedManager.substring(startIdx, endIdx);
        
        try{
            long team_id=Long.parseLong(teamId);
            long tManager=Long.parseLong(managerIdStr);
            
            NewTeamAdmin newTeam=new NewTeamAdmin(conn);
            newTeam.setNewTeam(team_id, tName, tManager);
            loadEmployeeTable();
            JOptionPane.showMessageDialog(this, "Berhasil membuat tim!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Error saat membuat tim! "+ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddTeamActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployee.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil employee_id
        long employee_id = Long.parseLong(tblEmployee.getValueAt(selectedRow, 0).toString());
        
        // Tambahkan ke tblAdded
        DefaultTableModel addedModel = (DefaultTableModel) tblAdded.getModel();
        Object[] rowData = { employee_id, tblEmployee.getValueAt(selectedRow, 1) }; // Mengambil nama karyawan dari tblEmployee
        
        // Periksa apakah baris yang ingin ditambahkan tidak kosong
        if (rowData[0] != null && rowData[1] != null) {
            addedModel.addRow(rowData);
            
            // Hapus dari tblEmployee
            DefaultTableModel employeeModel = (DefaultTableModel) tblEmployee.getModel();
            employeeModel.removeRow(selectedRow);
            
            // Hapus baris kosong dari tblEmployee jika ada
            removeEmptyRows(employeeModel);
            
            JOptionPane.showMessageDialog(this, "Berhasil menambah anggota tim!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Data karyawan tidak valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih karyawan yang ingin ditambahkan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdded.getSelectedRow();
    if (selectedRow != -1) {
        long employee_id = (Long) tblAdded.getValueAt(selectedRow, 0);
        
        // Kembali ke tblEmployee
        DefaultTableModel employeeModel = (DefaultTableModel) tblEmployee.getModel();
        Object[] rowData = { employee_id, tblAdded.getValueAt(selectedRow, 1) }; // Mengambil nama dari tblAdded
        employeeModel.addRow(rowData);
        
        // Hapus dari tblAdded
        DefaultTableModel addedModel = (DefaultTableModel) tblAdded.getModel();
        addedModel.removeRow(selectedRow);

        JOptionPane.showMessageDialog(this, "Anggota berhasil dihapus!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        
    } else {
        JOptionPane.showMessageDialog(this, "Pilih anggota yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin membuat tim ini?", "Yakin nggak nih?", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Memulai transaksi
            conn.setAutoCommit(false); // Pastikan autocommit dimatikan
            transMan.begin(); // Mulai transaksi jika menggunakan TransMan
            
            // Memasukkan data anggota tim dari tblAdded ke database
            DefaultTableModel addedModel = (DefaultTableModel) tblAdded.getModel();
            String teamId = txtTeamId.getText(); // Ambil ID tim dari text field
            long team_id = Long.parseLong(teamId);
        
            // Siapkan query untuk memasukkan anggota ke dalam database
            String insertQuery = "INSERT INTO TeamMemberList (team_id, employee_id) VALUES (?, ?)"; // Ganti dengan nama tabel dan kolom yang sesuai
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                for (int i = 0; i < addedModel.getRowCount(); i++) {
                    long employee_id = (Long) addedModel.getValueAt(i, 0); // Ambil employee_id dari tblAdded
                    pstmt.setLong(1, team_id);
                    pstmt.setLong(2, employee_id);
                    pstmt.addBatch(); // Tambahkan ke batch
                }
                pstmt.executeBatch(); // Eksekusi batch untuk memasukkan data
            }

            transMan.commit(); // Commit transaksi setelah semua data berhasil ditambahkan
            JOptionPane.showMessageDialog(this, "Tim berhasil dibuat!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            TeamAddAdvanced.this.setVisible(false);
            TeamAdd add = new TeamAdd();
            add.setVisible(true);
        } catch (SQLException ex) {
            try {
                if (transMan != null) {
                    transMan.rollback(); // Rollback jika terjadi kesalahan
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
                JOptionPane.showMessageDialog(this, "Rollback gagal: " + rollbackEx.getMessage(), "Gagal Rollback", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat pembuatan tim! " + ex.getMessage(), "Gagal Membuat Tim", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Kembalikan autocommit ke true
                    conn.close(); // Tutup koneksi
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pengeditan dibatalkan. Silakan lanjutkan pengeditan.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        // Menghapus semua anggota tim dari tabel tblAdded
        DefaultTableModel addedModel = (DefaultTableModel) tblAdded.getModel();
        addedModel.setRowCount(0); // Kosongkan tabel anggota yang ditambahkan
    
        // Mengambil ID tim dari text field
        String teamId = txtTeamId.getText();
        long team_id = Long.parseLong(teamId);

        try {
            // Menghapus tim dari database
            TeamAdmin team = new TeamAdmin();
            team.dropTeam(team_id); // Pastikan metode ini sesuai untuk menghapus tim
        
            JOptionPane.showMessageDialog(this, "Pengeditan dibatalkan. Semua anggota tim dihapus dan tim juga dihapus.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus tim! " + ex.getMessage(), "Gagal Menghapus Tim", JOptionPane.ERROR_MESSAGE);
        }finally{
            if (conn != null) {
            try {
                conn.close(); // Tutup koneksi
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
        }

        // Menutup tampilan saat ini dan kembali ke tampilan sebelumnya
        TeamAddAdvanced.this.setVisible(false);
        TeamAdd t = new TeamAdd();
        t.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    void loadManagersIntoComboBox() {
    // Kosongkan ComboBox sebelum menambahkan data baru
        cbManager.removeAllItems();

        String query = "SELECT m.manager_id, e.name "
                 + "FROM ManagerList m "
                 + "JOIN EmployeeList e ON m.employee_id = e.employee_id";

        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                long manager_id = rs.getLong("manager_id");
                String employee_name = rs.getString("name");

                // Gabungkan nama manajer dan ID untuk dimasukkan ke dalam ComboBox
                String managerItem = employee_name + " (ID: " + manager_id + ")";
                cbManager.addItem(managerItem);  // Tambahkan ke ComboBox
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error saat memuat data manajer: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void removeEmptyRows(DefaultTableModel model) {
    for (int i = model.getRowCount() - 1; i >= 0; i--) {
        // Cek apakah baris kosong
        if (model.getValueAt(i, 0) == null || model.getValueAt(i, 1) == null) {
            model.removeRow(i);
        }
    }
    }
    
    private void loadEmployeeTable() {
    String sql = "SELECT employee_id, name FROM EmployeeList"; // Sesuaikan dengan nama tabel dan kolom yang ada di database
    DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
    model.setRowCount(0); // Kosongkan tabel sebelum mengisi ulang

    try (Connection conn = DBConnection.getConnection(); // Dapatkan koneksi
         PreparedStatement pstmt = conn.prepareStatement(sql); // Siapkan query
         ResultSet rs = pstmt.executeQuery()) { // Eksekusi query

        // Iterasi hasil query dan tambahkan ke model tabel
        while (rs.next()) {
            Object[] rowData = {
                rs.getLong("employee_id"), // Ambil employee_id
                rs.getString("name") // Ambil nama karyawan
            };
            model.addRow(rowData); // Tambahkan data ke tabel
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memuat data karyawan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TeamAddAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamAddAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamAddAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamAddAdvanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamAddAdvanced().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTeam;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cbManager;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAdded;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtTeamId;
    private javax.swing.JTextField txtTeamName;
    // End of variables declaration//GEN-END:variables
}