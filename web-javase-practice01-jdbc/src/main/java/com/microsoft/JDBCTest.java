package com.microsoft;

import java.util.Properties;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import org.junit.jupiter.api.Test;

public class JDBCTest {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet result;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static Properties properties = new Properties();

    static {
        try {
            InputStream input = ClassLoader.getSystemResourceAsStream("com/microsoft/db.properties");
            properties.load(input);
            URL = properties.getProperty("URL");
            USERNAME = properties.getProperty("USERNAME");
            PASSWORD = properties.getProperty("PASSWORD");

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectAll1 () throws ClassNotFoundException {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            String sql = "select * from stu_score;";
            ResultSet res =statement.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String name = res.getString(2);
                float score = res.getFloat(3);
                System.out.println("id=" + id + "; name=" + name + "; score=" + score);
            }
            connection.close();
            statement.close();
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void closeAll (Connection connection, Statement statement) {
        try {
            if (connection != null) {
                connection.close();
            }

            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void closeAll (Connection connection, Statement statement, ResultSet result) {
        try {
            closeAll(connection, statement);
            if (result != null) {
                result.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insert () {
        String sql = "insert into stu_score value (3, 'tom', 59);";

        try {
            int updateCount = statement.executeUpdate(sql);
            if (updateCount > 0) {
                System.out.println("Insert successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(connection, statement, result);
        }
    }

    @Test
    public void selectAll2 () {
        String sql = "select * from stu_score;";

        try {
            result = statement.executeQuery(sql);
            while(result.next()) {
                int id = result.getInt(1);
                String name = result.getString(2);
                int score = result.getInt(3);
                System.out.println("id="+id+", name="+name+", score="+score);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(connection, statement, result);
        }
    }
}