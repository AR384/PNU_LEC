package My_Lab;
import java.util.Scanner;
public class test3_1 {
    public static void main(String[] args) {
        int score = (int)92.5;
        String resultPass = "pass";
        String resultFail = "Fail";
        
        
        if (score>=90) {
            System.out.println("Result"+resultPass);
            if (score>=83.5) {
                System.out.println("Result2"+resultPass);
            } else {
                System.out.println("NaN_result"+resultFail);
            }
        }
        
        switch (score) {
            case (int)92.5:
                System.out.println("case1");
    
                break;
        
            default:
                break;
        }
        /*    
        ---------------Exam1--------------
            * 택배 요금 계산 : int Price
            * 무게는 int Weight
            * 1000g 이하 = 3000원
            * 1k< w <5k 5000
            * 10kg <= 12000
            * 출력은 "택배 요름 = 000원 입니다."
        */
        String fee = "Fee is ";
        int price;
        double weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight?");
        weight =  sc.nextInt();
        
        int productNum;
        
        
        if (weight>=0) {
            System.out.println("Do you want vaverage"+ '\n' + "1.coffe" + '\n' + "2.beer" + '\n' + "3.coke" );
            productNum =  sc.nextInt();
            if (productNum >0 && productNum <4) {
                switch (productNum) {
                    case 1:
                        System.out.println("coffee is 2000won");
                    case 2:
                        System.out.println("bear is 2400won");
                    case 3:
                        System.out.println("coke is 1500won");
            }
            }
            if (weight <=1000) {
                price = 3000 ;
                System.out.println(fee+price);
            }
            if (weight>1000 && weight < 5000) {
                price = 5000 ;
                System.out.println(fee+price);
                productNum = 2;
            }
            if ((weight >=5000)) {
                price =12000 ;
                System.out.println(fee+price);
                productNum = 3;
            }
        }else{
            System.out.println("out of range Please redo");
        }
        
    }
    
    
    
}
//한줄 주석
/*
 *
 * w 
 */