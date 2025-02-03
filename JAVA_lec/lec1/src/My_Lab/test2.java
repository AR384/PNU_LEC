package My_Lab;

public class test2 {
    public static void main(String[] args) {
        int row = 12;
        int m = 7;
        int result = 0 ;
        
            for (int i = 0; i < row*3; i++) {
                System.out.print("-");
            }
            System.out.println();
            
            for (int i = 1; i < 10; i++) {
                
                System.out.print("Muti Table"+i+" ");
                if (i==3 || i==6 || i==9) {
                    System.out.println();
                    for (int k = 1; k < 10; k++) {
                        
                        for (int j = 1; j < 4; j++) {
                            
                            result = j*k;
                            System.out.print(j+"*"+k+"=" +result);
                            //들여쓰기 간격 맞추기 
                            if (result>=10) {
                                    m =6;
                            }
                            else
                                m = 7;
                            
                            for (int j2 = 0; j2 < m; j2++) {
                                System.out.print(" ");
                            }
                            //3번 출력 후 줄 바꿈꿈
                            if (j==3 || j==6 || j==9) {
                                System.out.println();
                            }
                            
                        }
                    }
                }
            }
            System.out.println();
            
            
                
        
        
            }
        
    }


