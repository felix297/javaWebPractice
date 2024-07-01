package com.company.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.company.util.JDBCUtil;
import java.sql.Connection;

public class BaseDao {
    public static ResultSet executeQuery (Connection connection, PreparedStatement preparedStatement, ResultSet resultSet, String sql, Object[] params) {
        connection = JDBCUtil.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);

            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i + 1, params[i]);
                }
            }

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static int executeUpdate (Connection connection, PreparedStatement preparedStatement, String sql, Object[] params) {
        connection = JDBCUtil.getConnection();
        int modifyCount = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);

            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i + 1, params[i]);
                }
            }

            modifyCount = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modifyCount;
    }
}