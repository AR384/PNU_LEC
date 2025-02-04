package practice;
import java.math.*;
;
public class p4_2 {
    public static void main(String[] args) {
        int [] price = new int[5]; //정수 1차원 배열 price를 선언하고 5개 값으로 초기화
        int priceMax = price[0];
        int num=1;
        
        //* 최대값 변수를 priceMax로 선언한 후에 for 문을 사용하여 최대값을 찾는다
        System.out.print(" [");
        for (int i : price) {
            price[i] = num++;
            System.out.print(price[i]+",");
        }
        System.out.print("]");
        System.out.println(price[1]);
        for (int i : price) {
            if (priceMax>price[i]) {
                
            }
            System.out.println(price[i]);
        }
        
    }

}
