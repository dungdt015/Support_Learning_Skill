/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DataConnector.DatabaseUtil;
import Service.AuthorizationService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class AuthorizeDAO {

    private AuthorizeDAO() {
    }

    ;

    public static void loadAuthorizeMap() throws SQLException {
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("SELECT * FROM [AuthorizeMap]");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AuthorizationService.gI().getMap().put(rs.getString("path"), rs.getString("user"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbo.close();
        }
    }

    public static void setAuthorize(String path, String roles) throws SQLException {
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("UPDATE [AuthorizeMap] SET [user] = ? WHERE [path] = ?");
            ps.setString(1, roles);
            ps.setString(2, path);
            ps.executeUpdate();
            dbo.commit();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbo.close();
        }
    }
}

