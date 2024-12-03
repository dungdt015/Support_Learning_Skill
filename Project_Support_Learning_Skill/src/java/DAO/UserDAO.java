/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import DataConnector.DatabaseUtil;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author admin
 */
public class UserDAO {

    public static boolean verifyAccount(int uid, String email) {
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("UPDATE [User] SET [isValidate] = 1, [email] = ? WHERE [UserID] = ?");
            ps.setString(1, email);
            ps.setInt(2, uid);
            int k = ps.executeUpdate();
            dbo.commit();
            dbo.close();
            if (k > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbo.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public static int mentorCount() throws SQLException {
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("SELECT COUNT([UserID]) From [User] \n"
                    + "WHERE [RoleID] = (SELECT [RoleID] FROM [Role] WHERE roleName = 'Mentor')");
            ResultSet rs = ps.executeQuery();
            rs.next();
            int k = rs.getInt(1);
            dbo.close();
            return k;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbo.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public static User getUser(String username, String password) throws SQLException {
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("SELECT * FROM [User] WHERE [username] = ? AND [password] = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PreparedStatement ps2 = dbo.prepareStatement("SELECT * FROM [Role] WHERE [RoleID] = ?");
                ps2.setInt(1, rs.getInt("RoleID"));
                ResultSet rs2 = ps2.executeQuery();
                rs2.next();
                User u = new User(username, password, rs.getString("email"), rs.getString("phoneNumber"), rs.getString("address"), rs2.getString("roleName"), rs.getDate("dob"), rs.getInt("wallet"), rs.getInt("UserID"), rs.getInt("activeStatus") == 1 ? true : false, rs.getInt("sex") == 1 ? true : false);
                u.setFullname(rs.getString("fullname"));
                u.setAvatar(rs.getString("Avatar"));
                if (rs.getInt("isValidate") != 0) {
                    u.setValidate(true);
                }
                return u;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbo.close();
        }
        return null;
    }

    public static User register(String username, String password, String email, String phone, String address, String role, String gender, String fullname, String dob) throws SQLException {
        Connection dbo = DatabaseUtil.getConn();
        try {
            if (address == null) {
                address = "";
            }
            PreparedStatement ps = dbo.prepareStatement("SELECT * FROM [User]\n"
                    + "WHERE [username] = ? OR [email] = ?");
            ps.setString(1, username);
            ps.setString(2, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps = dbo.prepareStatement("INSERT INTO [User] ([username], [password], [email], [sex], [dob], [phoneNumber], [address], [RoleID], [wallet], [activeStatus], [fullname]) VALUES (?, ?, ?, ?, ?, ?, ?, (SELECT [RoleID] FROM [Role] WHERE [roleName] = ?), 0, 1, ?)");
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, email);
                ps.setInt(4, gender.equals("f") ? 1 : 0);
                ps.setDate(5, Date.valueOf(dob));
                ps.setString(6, phone);
                ps.setString(7, address);
                ps.setString(8, role);
                ps.setString(9, fullname);
                int k = ps.executeUpdate();
                dbo.commit();
                User u = UserDAO.getUser(username, password);
                if (role.equalsIgnoreCase("mentor")) {
                    ps = dbo.prepareStatement("INSERT INTO [Mentor] ([UserID]) VALUES (?)");
                    ps.setInt(1, u.getId());
                    ps.executeUpdate();
                    dbo.commit();
                } else {
                    ps = dbo.prepareStatement("INSERT INTO [Mentee] ([UserID]) VALUES (?)");
                    ps.setInt(1, u.getId());
                    ps.executeUpdate();
                    dbo.commit();
                }
                if (k > 0) {
                    return u;
                }
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbo.close();
        }
        return null;
    }
}
