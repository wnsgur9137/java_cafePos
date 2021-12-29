
import java.sql.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author junhyeok
 */
public class StatementDAO {
    public int save(Statement data) { // 거래내역 추가
        String sql = "INSERT INTO Statements VALUES (states_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        int result = 0; // 거래내역 등록 실패시 0 반환
        try {
            Statement stat = (Statement) data;
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, stat.getItem());
            pstmt.setString(2, stat.getQty());
            pstmt.setString(3, stat.getPayment());
            pstmt.setString(4, stat.getAmount());
            pstmt.setString(5, stat.getChange());
            pstmt.setString(6, stat.getTax());
            pstmt.setString(7, stat.getProfit());
            pstmt.setString(8, stat.getCreated());
            
            rs = pstmt.executeQuery();
            System.out.println("DB 등록 성공");
            result = 1; // 거래내역 등록 성공시 1 반환
        } catch(Exception e) {
            System.out.println("save 실패");
            System.out.println(e.getMessage());
        } finally {
            try { // DB Close
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB close 실패 (StatementDAO - save())");
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public ArrayList<Statement> getList() { // 거래 내역 리스트
        // ArrayList를 이용하여 거래 내역들을 저장
        ArrayList<Statement> list = new ArrayList<Statement>();
        String sql = "SELECT * FROM statements";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBConn.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {  // 리스트가 존재할 경우 반복
                System.out.println("list 추가 시작"); // 안내문
                Statement stat = new Statement();
                //세터를 사용하여 각각의 정보를 입력
                stat.setNum(rs.getInt("NUM"));
                stat.setItem(rs.getString("ITEM"));
                stat.setQty(rs.getString("QTY"));
                stat.setPayment(rs.getString("PAYMENT"));
                stat.setAmount(rs.getString("AMOUNT"));
                stat.setChange(rs.getString("CHANGE"));
                stat.setTax(rs.getString("TAX"));
                stat.setProfit(rs.getString("PROFIT"));
                stat.setCreated(rs.getString("CREATED"));
                list.add(stat); // 입력한 값을 배열리스트에 추가
                System.out.println("list 추가 완료"); // 안내문
            }
        } catch(Exception e) {
            System.out.println("getList 실패");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                System.out.println("DB close 실패 (StatementDAO - getList())");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}
