package My_Lab;

public class _02_test_multification_table2 {
    public static void main(String[] args) {
        int row = 12;
        int space = 7;
        int result = 0 ;
            
            for (int i = 1; i < row*3; i++) {
                System.out.print("="); // Sectioin line generator
            }
            System.out.println();
            
            //j2 = multicarc N for table  j3 = new multicarc N for table calc sequencing j4
            for (int j2 = 1; j2 < 10; j2++) {
                System.out.print("Muti Table"+j2+" ");//Naming N of multicarc
                if (j2==3||j2==6||j2==9) { // Change line order of odd number for Name
                    System.out.println();
                    for (int j3 = 1; j3 < 10; j3++) {
                        for (int j4 =  j2-2; j4 <  j2+3; j4++){
                            result = j3*j4;
                            System.out.print(j4+"*"+j3+"=" +result);
                            if (result>=10) {//Allocate Space align num between word
                                space =6;
                                }
                            else
                            space = 7;
                            for (int s = 0; s < space; s++) {//Space align Logic
                                System.out.print(" ");
                            }
                            if (j4==3 || j4==6 || j4==9) { // Change line order of odd number for Number
                                System.out.println();
                                break;
                            }
                        }
                    }
                    
                }
            }
            }
        
    
    }


