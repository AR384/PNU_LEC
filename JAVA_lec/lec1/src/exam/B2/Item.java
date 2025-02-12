package exam.B2;

public class Item {
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
    // public int getWarranty() {
    //     return 1;
    // }

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
        System.out.println("name = " + name + " price = "+price);
        // name = ***, price=*** 등으로출력
    }
    
    public String toString(){
        return "name = " + name + ", price = " + price;
    }
    
}