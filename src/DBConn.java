/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junhyeok
 */

import java.sql.*;
import java.io.*;
import java.util.*;

public class DBConn {
    public static Connection dbConnect;
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String strDriver = "oracle.jdbc.driver.OracleDriver";   // OracleDriver (ojdbc6.jar)
            String strURL = "jdbc:oracle:thin:@localhost:1521"; // localhost:1521
            String strUser = "javaProject"; // 유저 이름
            String strPWD = "javaproject";  // 유저 비밀번호

            Class.forName(strDriver);
            conn = DriverManager.getConnection(strURL, strUser, strPWD);
            System.out.println("DB 연결 성공");
        } catch(ClassNotFoundException cnfe) {
            System.out.println("DB 드라이버 로딩 실패 : " + cnfe.getMessage());
        } catch(SQLException sqle) {
            System.out.println("DB 접속 실패 : " + sqle.getMessage());
        } catch(Exception e) {
            System.out.println("DB 연결 에러 : " + e.getMessage());
        }
        return conn;
    }
    
    
    
}
