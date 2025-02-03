package My_Lab;
import java.util.*;
public class forinjava {
    public static void main(String[] args) {
        /* for (int i = 1; i <=10; i++) {
            System.out.println(i);            
        } */
        
        /*
         * 1~100 수열의 합 구하는 for문 작성
         * int sum =0;
         * for (;;){
         * sum +=i}
         */
        /*  int sum = 0 ;
        for(int i = 1;  i<=100; i++){
            sum +=i;
        }
        System.out.println("Sum = " + sum);
         */
        /*
         * Multification table
         */ 
        int result = 0; 
        //int multiplicationTableNum = 0;
        // int row = 10;
        // int colum = 8;
        // Scanner sc = new Scanner(System.in);
        // multiplicationTableNum = sc.nextInt();
        
        for (int i = 1; i <=9;  i++) {
            System.out.println("multiplication table" + i);
            for (int j = 1; j <=9; j++) {
                result = i*j;
                System.out.print(i+"*"+j +  "=" + result );
                
                System.out.print("   |");
                for (int j2 = 0; j2 < 5; j2++) {
                    
                }
            }
            System.out.println(); 
        }
    }
}
