/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author junhyeok
 */
public class User { // POS 사용자
    private Integer userKey;    // 사용자 번호
    private String userName;    // 사용자 이름 
    private String userID;      // 사용자 아이디
    private String userPWD;     // 사용자 비밀번호
    private String userEmail;   // 사용자 이메일
    private String userCreated; // 사용자 생성 시간
    
    // 생성자
    public User() {}
    
    public User(Integer userKey, String userName, String userID, String userPWD, String userEmail, String userCreated) {
        this.userKey = userKey;
        this.userName = userName;
        this.userID = userID;
        this.userPWD = userPWD;
        this.userEmail = userEmail;
        this.userCreated = userCreated;
    }
    
    // 게터 세터
    public Integer getUserKey() { return userKey; }
    public void setUserKey(Integer userKey) { this.userKey = userKey; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }
    
    public String getUserPWD() { return userPWD; }
    public void setUserPWD(String userPWD) { this.userPWD = userPWD; }
    
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    
    public String getUserCreated() { return userCreated; }
    public void setUserCreated(String userCreated) { this.userCreated = userCreated; }
    
    
}
