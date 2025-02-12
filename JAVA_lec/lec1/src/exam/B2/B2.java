package exam.B2;
class PremiumCustomer extends Customer {
    private float discountRate;

    //생성자를Customer 클래스생성자를사용하여구현, this를사용
    
    PremiumCustomer (String cname ,String city, int age, float discountRate){
        super(cname, city, age);
        this.discountRate = discountRate;
    }
    
    
    public float getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public void show() {} // name = ***, price=*** 등으로출력
    public String toString() {
        return super.toString();
    }
}
class Electronics extends Item {
    private int warranty;

    //제품보증기간
    //생성자를Item 클래스를생성자를사용하여구현, this를사용
    Electronics(String name,double price,int stockQuantity,int warranty ){
        super(name,price,stockQuantity);
        this.warranty = warranty;
    }
    
    //@Override
    public int getWarranty() {
        // TODO Auto-generated method stub
        return this.warranty;
    }
    // public int getWarranty() {
    //     return ;
    // }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    };
    
    @Override
    public void show() {} // name = ***, price=*** 등으로출력
    
    public String toString() {
        return super.toString()+", warranty = "+warranty;
    }
    }
class Clothing extends Item {
    private String size;
    private String color;
    
//생성자를Item 클래스를생성자를사용하여구현, this를사용
    Clothing(String name,double price,int stockQuantity,String size,String color){
        super(name,price,stockQuantity);
        this.size = size;
        this.color = color;
        
    }
    
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void show() {} // name = ***, price=*** 등으로출력

    public String toString() {
        return super.toString()+", size = "+size + ", color = " + color;
    }
}

    
public class B2 {
    public static void main(String[] args) {
    // 아이템생성
    Item laptop = new Electronics("노트북",1200.00,10,2); 
    Item tshirt = new Clothing("티셔츠",20.00,50,"XL","RED"); 
    Item tshirt2 = new Clothing("티셔츠",10.00,50,"L","BLUE"); 
    // 고객생성
    Customer boy = new PremiumCustomer("홍길동","부산",21,0.2f); 
    Customer girl = new Customer("계백", "양산", 22); 
    // 주문생성
    Order order1 = new Order(boy); 
    order1.addItem(laptop, 1); 
    order1.addItem(tshirt, 2);
    order1.addItem(tshirt2, 12);
    order1.printOrderSummary();
    
    Order order2 = new Order(girl); 
    order2.addItem(laptop, 2); 
    order2.addItem(tshirt, 1);
    order2.printOrderSummary();
}
}
