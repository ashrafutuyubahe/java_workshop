package com.jdbc.jdbc_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:postgresql://dpg-cstj4v5umphs73fpgmhg-a.oregon-postgres.render.com:5432/choir_manager";
        String username = "choir_manager_user";
        String password = "WFGsg2nn9JgruRh0efz7tTCOq8U5yiJn";

        Connection connection = null;
        Statement statement = null;

        try {

       

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(jdbcURL, username, password);

            statement = connection.createStatement();

         

            String sqlQuery = "SELECT * FROM RCA ";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            System.out.println("ID\tFirst Name\tLast Name");
            System.out.println("--------------------------------");
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println(id + "\t" + firstName + "\t" + lastName);
            }

            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

   

   
}
