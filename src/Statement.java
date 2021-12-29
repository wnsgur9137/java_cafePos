/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author junhyeok
 */
public class Statement { // 거래 내역
    private int num;        // 거래 내역 번호
    private String item;    // 거래 상품
    private String qty;     // 상품 수량
    private String payment; // 결제 방식
    private String amount;  // 가격
    private String change;  // 거스름 돈 
    private String tax;     // 세금
    private String profit;  // 순수익
    private String created; // 거래 시간
    
    // 생성자
    public Statement() {}
    
    public Statement(String item, String qty, String payment, String amount, String change, String tax, String profit, String created) {
        this.item = item;
        this.qty = qty;
        this.payment = payment;
        this.amount = amount;
        this.change = change;
        this.tax = tax;
        this.profit = profit;
        this.created = created;
    }
    
    //게터 세터
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
    
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    
    public String getPayment() { return payment; }
    public void setPayment(String payment) { this.payment = payment; }
    
    public String getQty() { return qty; }
    public void setQty(String qty) {this.qty = qty; }
    
    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }
    
    public String getChange() { return change; }
    public void setChange(String change) { this.change = change; }
    
    public String getTax() { return tax; }
    public void setTax(String tax) { this.tax = tax; }
    
    public String getProfit() { return profit; }
    public void setProfit(String profit) { this.profit = profit; }
    
    public String getCreated() { return created; }
    public void setCreated(String created) {this.created = created; }
    
}
