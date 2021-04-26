package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionURL {

    public static final String URL = "jdbc:sqlite:database/test.db";

    static {
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
