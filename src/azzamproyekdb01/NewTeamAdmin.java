/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azzamproyekdb01;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Intelligent System
 */
public class NewTeamAdmin {
    private Connection conn;
    
    public NewTeamAdmin(Connection conn){
        this.conn=conn;
    }
    
     public void setNewTeam(long team_id, String team_name, long manager_id)throws SQLException{
        String sql="insert into TeamList(team_id, team_name, manager_id) values(?,?,?)";
        PreparedStatement pstmt=null;

        try{
            pstmt=conn.prepareStatement(sql);

            pstmt.setLong(1, team_id);
            pstmt.setString(2, team_name);
            pstmt.setLong(3, manager_id);

            pstmt.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException("Error saat menambahkan tim: " + ex.getMessage());
        }finally{
            if(pstmt!=null){
                pstmt.close();
            }
        }
    }
     
     public void addMember(long team_id, long employee_id) throws SQLException{
        String sql="insert into TeamMemberList (team_id, employee_id) values(?,?)";
        PreparedStatement pstmt=null;

        try{
            pstmt=conn.prepareStatement(sql);

            pstmt.setLong(1, team_id);
            pstmt.setLong(2, employee_id);

            pstmt.executeUpdate();
        }catch(SQLException ex){
            throw ex;
        }finally{
            if(pstmt!=null){
                pstmt.close();
            }
        }
    }

    //menghapus anggota tim
    public void deleteMember(long team_id, long employee_id) throws SQLException{
        String sql="delete from TeamMemberList where team_id=? and employee_id=?";
        PreparedStatement pstmt=null;

        try{
            pstmt=conn.prepareStatement(sql);

            pstmt.setLong(1, team_id);
            pstmt.setLong(2, employee_id);

            int affectedRows=pstmt.executeUpdate();
            if(affectedRows>0){
                System.out.println("Data berhasil dihapus!");
            }else{
                System.out.println("Data gagal dihapus!");
            }
        }catch(SQLException ex){
            throw ex;
        }finally{
            if(pstmt!=null){
                pstmt.close();
            }
        }
    }
    
    public void deleteAllMembers(long team_id) throws SQLException {
    // SQL untuk menghapus semua anggota tim berdasarkan team_id
    String sql = "DELETE FROM TeamMemberList WHERE team_id = ?";
    
    // Membuat PreparedStatement
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setLong(1, team_id);
        
        // Menjalankan pernyataan
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println(rowsAffected + " anggota tim dihapus.");
        } else {
            System.out.println("Tidak ada anggota tim yang dihapus.");
        }
    } catch (SQLException ex) {
        throw new SQLException("Error saat menghapus anggota tim: " + ex.getMessage(), ex);
    }
}

    public void dropTeam(long team_id) throws SQLException{
        String sql="delete from TeamList where team_id=?";
        PreparedStatement pstmt=null;

        try{
            conn=DBConnection.getConnection();
            pstmt=conn.prepareStatement(sql);

            pstmt.setLong(1, team_id);
            
            int affectedRows=pstmt.executeUpdate();
            if(affectedRows>0){
                System.out.println(affectedRows + " anggota tim dihapus.");
            }else{
                System.out.println("Tidak ada tim yang dihapus.");
            }
        }catch(SQLException ex){
            throw new SQLException("Error saat menghapus tim: " + ex.getMessage(), ex);
        }finally{
            if(pstmt!=null){
                pstmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        }
    }
}
