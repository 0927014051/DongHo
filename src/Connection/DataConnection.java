package Connection;

import Controller.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DataConnection {

    public static Connection connection;
    public static Statement statement;

    public static ResultSet retrieveData(String sqlCommand) {
        try {
            createStatement();
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void createStatement() {
        String url = "jdbc:sqlserver://DESKTOP-EBGA1UG:1433;databaseName=BanDongHoDesktop;"
                + " encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        //116.109.182.43:1433

        String user = "sa";
        String pass = "1234";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    public static void main(String[] args) {
        createStatement();

    }

    DataConnection() {

    }
}
