/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DatabaseUtil {

    static String dtbName = "PRJ_Project";
    static String username = "sa";
    static String password = "123456";

    public static Connection getConn() {
        Connection conn = null;
        try {
            if (conn == null || conn.isClosed()) {
                String connectionString = "jdbc:sqlserver://localhost;databaseName=" + dtbName + ";encrypt=true;trustServerCertificate=true";
                String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(dtbName);
                conn = DriverManager.getConnection(connectionString, username, password);
                conn.setAutoCommit(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

}
