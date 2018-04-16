package test;

import org.junit.Test;
import util.Jdbc;

import java.sql.*;

public class Execute {

    @Test
    public void insert(){
        Jdbc.loadDriver();
        Connection conn = Jdbc.connect();
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement("INSERT INTO USER(name,password) VALUES('szx','123456') ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select(){
        Jdbc.loadDriver();
        Connection conn = Jdbc.connect();
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement("SELECT * FROM USER");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = pstm.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                String password = rs.getString("password");
                System.out.println("用户名:"+name+" 密码:"+password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update(){
        Jdbc.loadDriver();
        Connection conn = Jdbc.connect();
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement("UPDATE USER SET name='tsw' WHERE id=1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete(){
        Jdbc.loadDriver();
        Connection conn = Jdbc.connect();
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement("DELETE FROM USER WHERE id=1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
