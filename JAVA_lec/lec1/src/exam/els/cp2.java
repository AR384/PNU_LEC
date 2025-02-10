package exam.els;

import java.lang.reflect.Array;
import java.util.*;


public class cp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = 5;
        int sub_scr = 3;
        String [] name = new String[person];
        String [] suj = {"국어","영어","수학"};
        int [] score = new int[sub_scr];
        
        for (int i = 0; i < name.length; i++) {
            System.out.print("name : ");
            name[i] = sc.next();
            for (String j : suj) {
                System.out.print(j+": ");
                score[Arrays.asList(suj).indexOf(j)] = sc.nextInt();
            }
            System.out.print("이름 = "+name[i]+",");
            for (int j = 0; j < score.length; j++) {
                System.out.print("과목 = "+suj[j]+":"+score[j]+",");
            }
            if (score[i]>=60){
                System.out.println("통과 = pass");
            }
            else{
                System.out.println( "통과 = fail");
            }
        }
        
    }

}
