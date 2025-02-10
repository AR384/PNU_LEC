package exam.B1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private Customer customer; //고객명
    private Item []items; //주문제품들
    private int[]quantities;//주문제품수량들
    private String []orderDates;//주문일자들
    private int count = 0; //배열인덱스
    
    Date dDate = new Date();
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private String strdate = date.format(dDate);
    
    
    
    public Order (Customer customer){
        this.customer = customer;
    }
    
    void addItem(Item item, int orderNumber) {
        System.out.println();
    }
    double calculateTotal() { 
        return 0.0; 
    }
    void printOrderSummary() {
        
    }
}
