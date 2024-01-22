package com.nodari.rentalshop;

import java.sql.*;

public class DBConnection {

    public static void main(String [] args) {

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test_rentshop_db", "wellington", "wellington");


            String url = "jdbc:postgresql://localhost:5432/test_rentshop_db";
            String username = "wellington";
            String password = "wellington";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connection OK");
            }
            System.out.println("PostgreSQL DB connection failed!");

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
