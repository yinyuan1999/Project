package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

    private static String url = "jdbc:mysql://localhost:3306/cls2";

    private static String username = "root";

    private static String password = "wuhanquan";

    public static void loadDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("加载驱动失败");
            e.printStackTrace();
        }
    }

    public static Connection connect(){

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            System.out.println("连接数据库失败");
            e.printStackTrace();
        }
        return conn;
    }

}
