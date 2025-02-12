package exam.B2;
import java.text.SimpleDateFormat;
import java.util.*;

public class Order{
    private Customer customer; //고객명
    private Item []items  ; //주문제품들
    private int[]quantities ;//주문제품수량들
    private String []orderDates ;//주문일자들
    private int count = 0; //배열인덱스

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
    
    void printdb(){
        Date dDate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        orderDates = new String[count];
        System.out.println(customer.toString());
            for (int i = 0; i <count; i++) {
                orderDates[i]= date.format(dDate);
                items[i].reduceStock(quantities[i]);
                if (items[i] instanceof Electronics) {
                    System.out.println(((Electronics)items[i]).toString() +" , "+ "quantity = "+ quantities[i]  +
                                                    ", " +  "orderDates = "+ orderDates[i]+ ", " + "stockQuantity = "+ items[i].getStockQuantity() );
                }
                else if (items[i] instanceof Clothing) {
                    System.out.println(((Clothing)items[i]).toString() +" , "+ "quantity = "+ quantities[i]  +
                                                    ", " +  "orderDates = "+ orderDates[i]+ ", " + "stockQuantity = "+ items[i].getStockQuantity() );
                }
                else{
                    System.out.println(items[i].toString()  + ", " +"quantity = "+ quantities[i] + ", "  +
                                                    ", " +  "orderDates = "+ orderDates[i]+ ", " + "stockQuantity = "+ items[i].getStockQuantity() );
                }
            }
        }
    void printOrderSummary() {
        
        for (int i = 0; i < 120; i++) {
            System.out.print( "-");
        }
        System.out.println();
        
        if (customer!=null && customer instanceof PremiumCustomer){
            float dr = ((PremiumCustomer)customer).getDiscountRate();
            double distotal = calculateTotal()*(double)(1-dr);
            printdb();
            
            System.out.println("Total = "+ calculateTotal());
            System.out.println("      = > "+ String.format("%.2f", distotal) );
        }
        else{
            printdb();
            }

    }
            
}
    
    

