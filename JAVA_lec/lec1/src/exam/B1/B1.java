package exam.B1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class B1 {
    public static void main(String[] args) {
    // 아이템생성
    Item laptop = new Item("노트북", 1200.00, 10); 
    Item tshirt = new Item("티셔츠", 20.00, 50); 
    // 고객생성
    Customer boy = new Customer("홍길동", "부산", 21); 
    Customer girl = new Customer("계백", "양산", 22); 
    // 주문생성
    Order order1 = new Order(boy); 
    order1.addItem(laptop, 1); 
    order1.addItem(tshirt, 2);
    
    laptop.show();
    
    
    
    
}
}
