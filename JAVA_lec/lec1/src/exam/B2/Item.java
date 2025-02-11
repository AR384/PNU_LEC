package exam.B1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Item {
    
     //제품
    private String name; // 제품명
    private double price;//제품가격
    private int stockQuantity; //재고량
    Date sc = new Date();
    

    public Item (String name, double price, int stockQuantity){
        this.name = name;
        this.price  = price;
        this.stockQuantity = stockQuantity;
    }
    
    void reduceStock(int quantity) {
        this.stockQuantity = quantity;
        this.stockQuantity = stockQuantity;
    }
    void increaseStock(int quantity) {
        
    }
    public void show() {
    // name = ***, price=*** 등으로출력
        System.out.println( "Name = " + name +" Price = " + price + " stockQuantity = " + stockQuantity);
    }
    public String toString() {
        return "name = " + name;
    }

}
