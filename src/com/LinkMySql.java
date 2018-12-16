package com.stu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LinkMySql {
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/wnmc2";
    String user = "root";
    String password = "8178288235";
    String driver = "com.mysql.cj.jdbc.Driver";


        try {
            Class.forName(driver);
            System.out.println("数据库驱动加载成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con=DriverManager.getConnection(url, user, password);
            System.out.println("connect Succeed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }




}
