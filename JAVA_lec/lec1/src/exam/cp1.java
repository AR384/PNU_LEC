package exam;
import java.util.*;

public class cp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("name");
        String name = sc.next();
        System.out.print("suj");
        String suj = sc.next();
        System.out.print("score");
        int score = sc.nextInt();
        
        if (name != null){
            if (score>=60){
                System.out.println("이름 = "+name+","+"과목 = "+suj+","+"성적= "+score+","+"통과 = "+"pass");
            }
            else{
                System.out.println("이름 = "+name+","+"과목 = "+suj+","+"성적= "+score+","+"통과 = "+"fail");
            }
            }
        }
            
        }
