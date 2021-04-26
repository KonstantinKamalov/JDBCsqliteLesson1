package org.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App01 {
    public static void main(String[] args) {
        try(Connection connection = ConnectionURL.createConnection();
            Statement statement = connection.createStatement()) {

            System.out.println(connection.getMetaData().getURL());
            System.out.println(Queries.createTable(
                    "users",
                    "\'user_id\' INTEGER PRIMARY KEY AUTOINCREMENT",
                    "\'user_login\' text NOT NULL",
                    "\'user_password\' text NOT NULL"
                    ));


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
