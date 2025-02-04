package My_Lab;

public class _02_test_multification_table {
    public static void main(String[] args) {
        int row = 12;
        int space = 7;
        int result = 0 ;
            
            
            for (int i = 1; i < row*3; i++) {
                System.out.print("=");
            }
            System.out.println();
            for (int j2 = 1; j2 < 10; j2++) {
                System.out.print("Muti Table"+j2+" ");
                if (j2==3||j2==6||j2==9) {
                    System.out.println();
                    for (int j3 = 1; j3 < 10; j3++) {
                        for (int j4 =  j2-2; j4 <  j2+3; j4++){
                            result = j3*j4;
                            System.out.print(j4+"*"+j3+"=" +result);
                            if (result>=10) {
                                space =6;
                                }
                            else
                            space = 7;
                            for (int s = 0; s < space; s++) {
                                System.out.print(" ");
                            }
                            if (j4==3 || j4==6 || j4==9) {
                                System.out.println();
                                break;
                            }
                        }
                    }
                    
                }
            }
            }
        
    }


