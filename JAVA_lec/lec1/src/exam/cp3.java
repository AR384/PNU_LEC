package exam;
import java.util.*;

import My_Lab.forinjava;
public class cp3 {
    public static void main(String[] args) {
        String[] names = { "홍길동", "김유신", "계백", "강감찬", "을지문덕" };
        String[] subjs = { "수학", "국어", "영어", "과학", "역사" };
        int[][] scores = { 
            { 85, 90, 78, 88, 92 }, 
            {75, 80, 85, 90, 95}, 
            {65, 70, 75, 80, 85}, 
            {95, 92, 88, 84, 91}, 
            {88, 76, 85, 79, 90 } };
        String title = ">>>학생별,과목별 점수,통과여부 출력";
        
        //학생별,과목별 점수,통과여부 출력
        System.out.println(title);
        
        for (int i = 0; i < title.length()*1.7; i++) {
            System.out.print("=");
        }
        
        System.out.println();
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("["+names[i]+"]");
            
            for (int j = 0; j < subjs.length; j++) {
                for (int s = 0; s < 8; s++) {
                    System.out.print(" ");
                }
                System.out.print(subjs[j]+" : ");
                for (int js : scores[j]) {
                    System.out.print(js);
                    String result = js>70 ? "=>통과" : "=>과락";
                    System.out.println(result);
                    };
                    break;
                }
            }
        }
        //end title1
        }



