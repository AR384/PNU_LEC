package exam.B1;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.text.SimpleDateFormat;

class Customer{
    private String cname;
    private String city;
    private int age;

    public Customer (String cname, String city, int age){
        this.cname = cname;
        this.city = city;
        this.age = age;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return "name" + cname + "city" + city + "age" + age;
    }
    
}

class Item {
    private String name;
    private double price;
    private int stockQuantity;
    
    Item(String name,double price,int stockQuantity){
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        
        return this.stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    
    void reduceStock(int quantity) {
            stockQuantity = stockQuantity-quantity;
        //판매시재고감소메소드
    }
    
    void increaseStock(int quantity) {
    }
    public void show() {
    // name = ***, price=*** 등으로출력
    }
}

class Order{
    private Customer customer; //고객명
    private Item []items  ; //주문제품들
    private int[]quantities ;//주문제품수량들
    private String []orderDates ;//주문일자들
    private int count = 0; //배열인덱스
    // private Item []items1;

    Order (Customer c){
        this.customer = c;
    }
    
void addItem(Item item, int orderNumber){
    if (items==null) {
        count++;
        items = new Item[count];
        quantities = new int[count];
        items[count-1] =item;
        quantities[count-1] = orderNumber;
        
    }
    else {
        //----------items have sized resize arr
        count++;
        Item []items1 = new Item[count] ;
        int quantities1 [] = new int[count];
        //--------existing value transition
        for (int i = 0; i < count-1; i++) {
            items1[i] = items[i];
            quantities1[i] = quantities[i];
        }
        //enter new item
        items1[count-1]= item;
        items = items1;
        quantities1[count-1] = orderNumber;
        quantities = quantities1;
        
    }
}
    
    int[] getQuantities(){
            return quantities;
    }

    double calculateTotal() { 
        double a = 0.0;
        for (int i = 0; i <count; i++){
            a += items[i].getPrice()*(double)quantities[i];
        }
        return a;
        
    }
    
    void printOrderSummary() {
        Date dDate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        orderDates = new String[count];

        System.out.println( "name = " + customer.getCname()  + ", " + "city = " + customer.getCity() +", "  +"age = "+ customer.getAge());
        for (int i = 0; i <count; i++) {
            orderDates[i]= date.format(dDate);
            items[i].reduceStock(quantities[i]);
            System.out.println("name = " + items[i].getName()  + ", " +"quantity = "+ quantities[i] + ", " + "price = "+ items[i].getPrice()  + ", " +  "orderDates = "+ orderDates[i]+ ", " + "stockQuantity = "+","+ items[i].getStockQuantity() );
        }
        System.out.println("Total = " +calculateTotal());
    }
    
    }

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
    order1.addItem(laptop, 2); 
    order1.addItem(tshirt, 3);

    order1.printOrderSummary();
    
    Order order2 = new Order(girl); 
    order2.addItem(laptop, 2); 
    order2.addItem(tshirt, 1);
    
    
    order2.printOrderSummary();
}
}
