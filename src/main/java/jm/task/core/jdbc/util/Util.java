package jm.task.core.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getConnection(){
        Connection connection;
        final String URL = "jdbc:mysql://localhost:3306/newtable";
        final String USERNAME = "root";
        final String PASSWORD = "root";
        try{
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if(connection != null){
                System.out.println("Correct");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
