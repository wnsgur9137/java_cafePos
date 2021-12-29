
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author junhyeok
 */
public class UserDAO {
    
    public int join(User data) { // 회원가입
        String sql = "INSERT INTO Users VALUES (users_seq.NEXTVAL, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = -1; // 회원가입 실패시 -1 반환
        try {
            User user = (User) data; // 입력받은 유저 정보 (이름, 아이디, 비밀번호, 이메일, 생성일자)
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getUserID());
            pstmt.setString(3, user.getUserPWD());
            pstmt.setString(4, user.getUserEmail());
            pstmt.setString(5, user.getUserCreated());
            
            rs = pstmt.executeQuery();
            System.out.println("회원가입 성공");
            result = 1; // 회원가입 성공시 1 반환
        } catch(Exception e) {
            System.out.println("join 실패");
            System.out.println(e.getMessage());
        } finally {
            try { // DB Close
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB close 실패 (LoginForm - btnJoinAction())");
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public int idCheck(String userID) { // 회원가입 - 아이디 중복 확인
        String sql = "SELECT * FROM Users WHERE userID = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = -1; // DB 처리 실패시 -1 반환
        try {
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                result = 0; // 중복일 경우 0 반환
            } else {
                result = 1; // 사용 가능할 경우 1 반환
            }
        } catch(Exception e) {
            System.out.println("IDCheck 실패");
            System.out.println(e.getMessage());
        } finally {
            try { // DB Close
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB close 실패 (LoginForm - btnIDCheckAction())");
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public int login(String userID, String userPWD) { // 로그인
        String sql = "SELECT * FROM Users WHERE userID = ? AND userPWD = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = -1; // DB 오류시 -1 반환
        try {
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userID);
            pstmt.setString(2, userPWD);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                result = 1; // 로그인 성공시 1 반환
            } else {
                result = 0; // 로그인 실패(정보 불일치)시 0 반환
            }
        } catch(Exception e) {
            System.out.println("Login 실패");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB Close 실패 (LoginForm - btnLoginAction)");
                System.out.println(e.getMessage());
            }
        }
        
        return result;
    }
}
