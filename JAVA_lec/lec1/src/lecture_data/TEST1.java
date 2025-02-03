package lecture_data;
public class TEST1 {
    public static void main(String[] args) {
        
        System.out.println("hello");
        
        int deposit; // 정수
        long d = 100000000000000000l; //  21억 넘어갈경우 long
        double balance = 0.20; //실수값 그대로 사용 가능 비트?
        float f = 0.02f; // float should be attach f 비트?
        char productId = 'a';
        String price = "price";
        String name;
        
        name = "자바";
        deposit = 500 ;
        
        System.out.println(d+"\n"+name+f);
        System.out.println(deposit);
        System.out.println(name);
        System.out.println(price+"가격"+balance+productId);
        
}
}