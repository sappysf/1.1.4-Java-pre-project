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
        final String URL;
        final String USERNAME;
        final String PASSWORD;
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        try{
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(fileInputStream);
            URL = properties.getProperty("URL");
            USERNAME = properties.getProperty("USERNAME");
            PASSWORD = properties.getProperty("PASSWORD");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if(connection != null){
                System.out.println("Correct");
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
