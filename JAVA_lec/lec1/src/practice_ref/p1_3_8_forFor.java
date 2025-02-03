package practice_ref;

public class p1_3_8_forFor {
    
/*
 * 출력 형태를 다음과 같이 만들기 실습
 * 실습1:
 * $$$$$
 * $$$$
 * $$$
 * $$
 * $
 * 
 * 실습2: 정삼각형 형태로 출력하기
 * $$$$$$
 *  $$$
 *   $
 */
public class 실습_3장_9_forfor문 {
    public static void main(String[] args) {
        int rows =4; 

        for (int i = 0; i < rows; i++) {
        
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("$");
            }
            System.out.println(); 
        }
    }
    
}

}
